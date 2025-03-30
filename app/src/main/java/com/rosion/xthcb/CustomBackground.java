package com.rosion.xthcb;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomBackground extends Drawable {

    static public void setDecorBackground(Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.VANILLA_ICE_CREAM) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) activity
                    .findViewById(android.R.id.content)).getChildAt(0);
            //if required
            activity.getWindow().setNavigationBarContrastEnforced(false);
            //See https://developer.android.com/develop/ui/views/layout/edge-to-edge#handle-overlaps
            ViewCompat.setOnApplyWindowInsetsListener(viewGroup, (v, windowInsets) -> {
                Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setBackground(CustomBackground.instanceOf(activity, insets));
                //Required for the rest of the layout to remain aligned
                v.onApplyWindowInsets(windowInsets.toWindowInsets());
                return WindowInsetsCompat.CONSUMED;
            });
        }
    }

    //Reusing a static instance since the dimensions
    //and color don't change in my use case, with no rotation
    private static CustomBackground standardInstance;

    private static CustomBackground instanceOf(Activity activity, Insets insets) {
        if (standardInstance == null) {
            DisplayMetrics m = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(m);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                standardInstance = new CustomBackground(m.widthPixels, m.heightPixels, activity.getColor(R.color.colorPrimary), insets); // Assuming R.color.colorPrimary is the available and the intended color for the status area
            }
        } else {
            standardInstance.insets = insets;
        }
        return standardInstance;
    }


    private final int width;
    private final int height;
    private final int color;
    private Insets insets;
    private CustomBackground(int width, int height, int color, Insets insets) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.insets = insets;
    }

    @Override
    public void draw(@NonNull Canvas canvas) {

        Paint paint = new Paint();
        paint.setColor(color);


        if (insets.top>0) {
            canvas.drawRect(0, 0, width, insets.top, paint);
        }

        // For additional sides
        /*if (insets.left>0) {
            canvas.drawRect(0, 0, insets.left, height, paint);
         }
        if (insets.bottom>0) {
           canvas.drawRect(0, height-insets.bottom, width, height, paint);
        }
        if (insets.right>0) {
         canvas.drawRect(width-insets.right, 0, width, height, paint);
        }*/
    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public int getIntrinsicWidth() {
        return width;
    }

    @Override
    public int getIntrinsicHeight() {
        return height;
    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}