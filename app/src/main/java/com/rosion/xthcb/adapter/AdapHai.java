package com.rosion.xthcb.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rosion.xthcb.MyData;
import com.rosion.xthcb.R;

import com.rosion.xthcb.hai;
import com.rosion.xthcb.ketqua;

import static android.content.Context.MODE_PRIVATE;

public class AdapHai extends RecyclerView.Adapter<AdapHai.ViewHolder> {

    MyData[] myData;
    Context context;

    public AdapHai(MyData[] myData, hai activity) {
        this.myData = myData;
        this.context = activity;
    }

    @NonNull
    @Override
    public AdapHai.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_hai, parent, false);
        AdapHai.ViewHolder viewHolder = new AdapHai.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapHai.ViewHolder holder, int position) {
        final MyData myDataList = myData[position];
        holder.textViewDate.setText(myDataList.getName());
    }

    @Override
    public int getItemCount() {
        return myData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        EditText editText5, editText11, editText17, editText23, editText29, editText35,
                editText41, editText47, editText53, editText55;
        Button butnam, butnam2, xoahet, savedata;
        TextView textViewDate;
        private int n = 0;

        public static final String TEXT5 = "text";
        public static final String TEXT11 = "text";
        public static final String TEXT17 = "text";
        public static final String TEXT23 = "text";
        public static final String TEXT29 = "text";
        public static final String TEXT35 = "text";
        public static final String TEXT41 = "text";
        public static final String TEXT47 = "text";
        public static final String TEXT53 = "text";
        private String text5,text11,text17,text23,
                text29,text35,text41,text47,text53;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDate = itemView.findViewById(R.id.namedate);

            editText5 = (EditText) itemView.findViewById(R.id.edit5);

            editText11 = (EditText) itemView.findViewById(R.id.edit11);


            editText17 = (EditText) itemView.findViewById(R.id.edit17);

            editText23 = (EditText) itemView.findViewById(R.id.edit23);

            editText29 = (EditText) itemView.findViewById(R.id.edit29);

            editText35 = (EditText) itemView.findViewById(R.id.edit35);

            editText41 = (EditText) itemView.findViewById(R.id.edit41);

            editText47 = (EditText) itemView.findViewById(R.id.edit47);

            editText53 = (EditText) itemView.findViewById(R.id.edit53);

            editText55 = (EditText) itemView.findViewById(R.id.edit55);

            editText5.addTextChangedListener(myTextWatcher);

            editText11.addTextChangedListener(myTextWatcher);

            editText17.addTextChangedListener(myTextWatcher);

            editText23.addTextChangedListener(myTextWatcher);

            editText29.addTextChangedListener(myTextWatcher);

            editText35.addTextChangedListener(myTextWatcher);

            editText41.addTextChangedListener(myTextWatcher);

            editText47.addTextChangedListener(myTextWatcher);

            editText53.addTextChangedListener(myTextWatcher);

            butnam = itemView.findViewById(R.id.butnam);
            butnam2 = itemView.findViewById(R.id.butnam2);
            xoahet = itemView.findViewById(R.id.xoahet);
            savedata = itemView.findViewById(R.id.savedata);

            loadData();
            updateViews();

            /*MobileAds.initialize(context,
                    "ca-app-pub-3940256099942544~3347511713");

            mInterstitialAd = new InterstitialAd(context);
            mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.

                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    if (editText5.getText().toString().length() == 0) {
                        editText5.setText("11");
                    }


                    if (editText11.getText().toString().length() == 0) {
                        editText11.setText("11");
                    }


                    if (editText17.getText().toString().length() == 0) {
                        editText17.setText("11");
                    }


                    if (editText23.getText().toString().length() == 0) {
                        editText23.setText("11");
                    }


                    if (editText29.getText().toString().length() == 0) {
                        editText29.setText("11");
                    }


                    if (editText35.getText().toString().length() == 0) {
                        editText35.setText("11");
                    }


                    if (editText41.getText().toString().length() == 0) {
                        editText41.setText("11");
                    }


                    if (editText47.getText().toString().length() == 0) {
                        editText47.setText("11");
                    }


                    if (editText53.getText().toString().length() == 0) {
                        editText53.setText("11");
                    }



                    if (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".")) {
                        editText5.setText("12");
                    }


                    if (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".")) {
                        editText11.setText("12");
                    }


                    if (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".")) {
                        editText17.setText("12");
                    }


                    if (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".")) {
                        editText23.setText("12");
                    }


                    if (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".")) {
                        editText29.setText("12");
                    }


                    if (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".")) {
                        editText35.setText("12");
                    }


                    if (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".")) {
                        editText41.setText("12");
                    }


                    if (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".")) {
                        editText47.setText("12");
                    }


                    if (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".")) {
                        editText53.setText("12");
                    }


                    float no5 = Float.valueOf(editText5.getText().toString());

                    float no11 = Float.valueOf(editText11.getText().toString());


                    float no17 = Float.valueOf(editText17.getText().toString());


                    float no23 = Float.valueOf(editText23.getText().toString());

                    float no29 = Float.valueOf(editText29.getText().toString());


                    float no35 = Float.valueOf(editText35.getText().toString());


                    float no41 = Float.valueOf(editText41.getText().toString());


                    float no47 = Float.valueOf(editText47.getText().toString());


                    float no53 = Float.valueOf(editText53.getText().toString());




                    if (no5 == 11) {
                        editText5.setText("");
                    }


                    if (no11 == 11) {
                        editText11.setText("");
                    }


                    if (no17 == 11) {
                        editText17.setText("");
                    }


                    if (no23 == 11) {
                        editText23.setText("");
                    }

                    if (no29 == 11) {
                        editText29.setText("");
                    }


                    if (no35 == 11) {
                        editText35.setText("");
                    }

                    if (no41 == 11) {
                        editText41.setText("");
                    }


                    if (no47 == 11) {
                        editText47.setText("");
                    }


                    if (no53 == 11) {
                        editText53.setText("");
                    }


                    if (no5 == 12) {
                        editText5.setText(".");
                    }


                    if (no11 == 12) {
                        editText11.setText(".");
                    }

                    if (no17 == 12) {
                        editText17.setText(".");
                    }


                    if (no23 == 12) {
                        editText23.setText(".");
                    }


                    if (no29 == 12) {
                        editText29.setText(".");
                    }


                    if (no35 == 12) {
                        editText35.setText(".");
                    }


                    if (no41 == 12) {
                        editText41.setText(".");
                    }


                    if (no47 == 12) {
                        editText47.setText(".");
                    }


                    if (no53 == 12) {
                        editText53.setText(".");
                    }


                    float a0 = no5 + no11 + no17;
                    float a1 = no5 + no11 + no23;
                    float b0 = no35 + no5 + no17;
                    float c0 = no29 + no41 + no47;
                    float c1 = no5 + no11 + no29;
                    float d1 = no29 + no5 + no23;
                    float d7 = no17 + no5 + no23;
                    float d14 = no29 + no41 + no23;
                    float d15 = no29 + no47 + no23;
                    float b8 = no35 + no5 + no23;
                    float c19 = no29 + no41 + no53;


                    if ((
                            (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() == 0 || no5 > 10))
                            && ( editText5.getText().toString().length() > 0)) {

                        if (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() == 0 || no5 > 10) {
                            editText5.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".") || editText11.getText().toString().length() == 0 || no11 > 10))
                            && ( editText11.getText().toString().length() > 0)) {

                        if (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".") || editText11.getText().toString().length() == 0 || no11 > 10) {
                            editText11.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".") || editText17.getText().toString().length() == 0 || no17 > 10))
                            && ( editText17.getText().toString().length() > 0)) {

                        if (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".") || editText17.getText().toString().length() == 0 || no17 > 10) {
                            editText17.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".") || editText23.getText().toString().length() == 0 || no23 > 10))
                            && (editText23.getText().toString().length() > 0)) {

                        if (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".") || editText23.getText().toString().length() == 0 || no23 > 10) {
                            editText23.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".") || editText29.getText().toString().length() == 0 || no29 > 10))
                            && (  editText29.getText().toString().length() > 0)) {

                        if (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".") || editText29.getText().toString().length() == 0 || no29 > 10) {
                            editText29.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".") || editText35.getText().toString().length() == 0 || no35 > 10))
                            && ( editText35.getText().toString().length() > 0)) {

                        if (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".") || editText35.getText().toString().length() == 0 || no35 > 10) {
                            editText35.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".") || editText41.getText().toString().length() == 0 || no41 > 10))
                            && ( editText41.getText().toString().length() > 0)) {

                        if (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".") || editText41.getText().toString().length() == 0 || no41 > 10) {
                            editText41.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".") || editText47.getText().toString().length() == 0 || no47 > 10))
                            && (editText47.getText().toString().length() > 0)) {

                        if (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".") || editText47.getText().toString().length() == 0 || no47 > 10) {
                            editText47.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".") || editText53.getText().toString().length() == 0 || no53 > 10))
                            && ( editText53.getText().toString().length() > 0)) {

                        if (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".") || editText53.getText().toString().length() == 0 || no53 > 10) {
                            editText53.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((( editText5.getText().toString().length() == 0) || (  no5 <= 10))
                            && ( editText11.getText().toString().length() == 0) || ( no11 <= 10)
                            && (( editText17.getText().toString().length() == 0) || (no17 <= 10))
                            && (( editText23.getText().toString().length() == 0) || (no23 <= 10))
                            && (( editText29.getText().toString().length() == 0) || ( no29 <= 10))
                            && ((  editText35.getText().toString().length() == 0) || (  no35 <= 10))
                            && (( editText41.getText().toString().length() == 0) || (  no41 <= 10))
                            && ((  editText47.getText().toString().length() == 0) || ( no47 <= 10))
                            && (( editText53.getText().toString().length() == 0) || (no53 <= 10))

                    ) {
                        Intent intent = new Intent(context, ketqua.class);
                        intent.putExtra("a0", a0);
                        intent.putExtra("a1", a1);
                        intent.putExtra("b0", b0);
                        intent.putExtra("c0", c0);
                        intent.putExtra("c1", c1);
                        intent.putExtra("d1", d1);
                        intent.putExtra("d7", d7);
                        intent.putExtra("d15", d15);
                        intent.putExtra("d14", d14);
                        intent.putExtra("b8", b8);
                        intent.putExtra("c19", c19);

                        intent.putExtra("no5", no5);

                        intent.putExtra("no11", no11);

                        intent.putExtra("no17", no17);

                        intent.putExtra("no23", no23);

                        intent.putExtra("no29", no29);

                        intent.putExtra("no35", no35);

                        intent.putExtra("no41", no41);

                        intent.putExtra("no47", no47);

                        intent.putExtra("no53", no53);

                        context.startActivity(intent);
                    }
                    //editText43.setText("123");
                }
            });*/
            savedata.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    saveData();
                    Toast.makeText(context, "Đã lưu", Toast.LENGTH_SHORT).show();
                }
            }));
            xoahet.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText5.setText("");
                    editText11.setText("");
                    editText17.setText("");
                    editText23.setText("");
                    editText29.setText("");
                    editText35.setText("");
                    editText41.setText("");
                    editText47.setText("");
                    editText53.setText("");
                    saveData();
                }
            }));
            butnam.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (editText5.getText().toString().length() == 0) {
                        editText5.setText("11");
                    }


                    if (editText11.getText().toString().length() == 0) {
                        editText11.setText("11");
                    }


                    if (editText17.getText().toString().length() == 0) {
                        editText17.setText("11");
                    }


                    if (editText23.getText().toString().length() == 0) {
                        editText23.setText("11");
                    }


                    if (editText29.getText().toString().length() == 0) {
                        editText29.setText("11");
                    }


                    if (editText35.getText().toString().length() == 0) {
                        editText35.setText("11");
                    }


                    if (editText41.getText().toString().length() == 0) {
                        editText41.setText("11");
                    }


                    if (editText47.getText().toString().length() == 0) {
                        editText47.setText("11");
                    }


                    if (editText53.getText().toString().length() == 0) {
                        editText53.setText("11");
                    }



                    if (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".")) {
                        editText5.setText("12");
                    }


                    if (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".")) {
                        editText11.setText("12");
                    }


                    if (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".")) {
                        editText17.setText("12");
                    }


                    if (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".")) {
                        editText23.setText("12");
                    }


                    if (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".")) {
                        editText29.setText("12");
                    }


                    if (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".")) {
                        editText35.setText("12");
                    }


                    if (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".")) {
                        editText41.setText("12");
                    }


                    if (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".")) {
                        editText47.setText("12");
                    }


                    if (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".")) {
                        editText53.setText("12");
                    }


                    float no5 = Float.valueOf(editText5.getText().toString());

                    float no11 = Float.valueOf(editText11.getText().toString());


                    float no17 = Float.valueOf(editText17.getText().toString());


                    float no23 = Float.valueOf(editText23.getText().toString());

                    float no29 = Float.valueOf(editText29.getText().toString());


                    float no35 = Float.valueOf(editText35.getText().toString());


                    float no41 = Float.valueOf(editText41.getText().toString());


                    float no47 = Float.valueOf(editText47.getText().toString());


                    float no53 = Float.valueOf(editText53.getText().toString());




                    if (no5 == 11) {
                        editText5.setText("");
                    }


                    if (no11 == 11) {
                        editText11.setText("");
                    }


                    if (no17 == 11) {
                        editText17.setText("");
                    }


                    if (no23 == 11) {
                        editText23.setText("");
                    }

                    if (no29 == 11) {
                        editText29.setText("");
                    }


                    if (no35 == 11) {
                        editText35.setText("");
                    }

                    if (no41 == 11) {
                        editText41.setText("");
                    }


                    if (no47 == 11) {
                        editText47.setText("");
                    }


                    if (no53 == 11) {
                        editText53.setText("");
                    }


                    if (no5 == 12) {
                        editText5.setText(".");
                    }


                    if (no11 == 12) {
                        editText11.setText(".");
                    }

                    if (no17 == 12) {
                        editText17.setText(".");
                    }


                    if (no23 == 12) {
                        editText23.setText(".");
                    }


                    if (no29 == 12) {
                        editText29.setText(".");
                    }


                    if (no35 == 12) {
                        editText35.setText(".");
                    }


                    if (no41 == 12) {
                        editText41.setText(".");
                    }


                    if (no47 == 12) {
                        editText47.setText(".");
                    }


                    if (no53 == 12) {
                        editText53.setText(".");
                    }


                    float a0 = no5 + no11 + no17;
                    float a1 = no5 + no11 + no23;
                    float b0 = no35 + no5 + no17;
                    float c0 = no29 + no41 + no47;
                    float c1 = no5 + no11 + no29;
                    float d1 = no29 + no5 + no23;
                    float d7 = no17 + no5 + no23;
                    float d14 = no29 + no41 + no23;
                    float d15 = no29 + no47 + no23;
                    float b8 = no35 + no5 + no23;
                    float c19 = no29 + no41 + no53;


                    if ((
                            (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() == 0 || no5 > 10))
                            && ( editText5.getText().toString().length() > 0)) {

                        if (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() == 0 || no5 > 10) {
                            editText5.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".") || editText11.getText().toString().length() == 0 || no11 > 10))
                            && ( editText11.getText().toString().length() > 0)) {

                        if (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".") || editText11.getText().toString().length() == 0 || no11 > 10) {
                            editText11.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".") || editText17.getText().toString().length() == 0 || no17 > 10))
                            && ( editText17.getText().toString().length() > 0)) {

                        if (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".") || editText17.getText().toString().length() == 0 || no17 > 10) {
                            editText17.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".") || editText23.getText().toString().length() == 0 || no23 > 10))
                            && (editText23.getText().toString().length() > 0)) {

                        if (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".") || editText23.getText().toString().length() == 0 || no23 > 10) {
                            editText23.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".") || editText29.getText().toString().length() == 0 || no29 > 10))
                            && (  editText29.getText().toString().length() > 0)) {

                        if (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".") || editText29.getText().toString().length() == 0 || no29 > 10) {
                            editText29.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".") || editText35.getText().toString().length() == 0 || no35 > 10))
                            && ( editText35.getText().toString().length() > 0)) {

                        if (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".") || editText35.getText().toString().length() == 0 || no35 > 10) {
                            editText35.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".") || editText41.getText().toString().length() == 0 || no41 > 10))
                            && ( editText41.getText().toString().length() > 0)) {

                        if (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".") || editText41.getText().toString().length() == 0 || no41 > 10) {
                            editText41.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".") || editText47.getText().toString().length() == 0 || no47 > 10))
                            && (editText47.getText().toString().length() > 0)) {

                        if (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".") || editText47.getText().toString().length() == 0 || no47 > 10) {
                            editText47.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((
                            (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".") || editText53.getText().toString().length() == 0 || no53 > 10))
                            && ( editText53.getText().toString().length() > 0)) {

                        if (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".") || editText53.getText().toString().length() == 0 || no53 > 10) {
                            editText53.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if ((( editText5.getText().toString().length() == 0) || (  no5 <= 10))
                            && ( editText11.getText().toString().length() == 0) || ( no11 <= 10)
                            && (( editText17.getText().toString().length() == 0) || (no17 <= 10))
                            && (( editText23.getText().toString().length() == 0) || (no23 <= 10))
                            && (( editText29.getText().toString().length() == 0) || ( no29 <= 10))
                            && ((  editText35.getText().toString().length() == 0) || (  no35 <= 10))
                            && (( editText41.getText().toString().length() == 0) || (  no41 <= 10))
                            && ((  editText47.getText().toString().length() == 0) || ( no47 <= 10))
                            && (( editText53.getText().toString().length() == 0) || (no53 <= 10))

                    ) {
                        /*if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        } else {*/
                            Intent intent = new Intent(context, ketqua.class);
                            intent.putExtra("a0", a0);
                            intent.putExtra("a1", a1);
                            intent.putExtra("b0", b0);
                            intent.putExtra("c0", c0);
                            intent.putExtra("c1", c1);
                            intent.putExtra("d1", d1);
                            intent.putExtra("d7", d7);
                            intent.putExtra("d15", d15);
                            intent.putExtra("d14", d14);
                            intent.putExtra("b8", b8);
                            intent.putExtra("c19", c19);

                            intent.putExtra("no5", no5);

                            intent.putExtra("no11", no11);

                            intent.putExtra("no17", no17);

                            intent.putExtra("no23", no23);

                            intent.putExtra("no29", no29);

                            intent.putExtra("no35", no35);

                            intent.putExtra("no41", no41);

                            intent.putExtra("no47", no47);

                            intent.putExtra("no53", no53);

                            v.getContext().startActivity(intent);
                    }
                }
            });
        }

        public void saveData() {
            //editor.putBoolean(SWITCH1, switch1.isChecked());
            //Toast.makeText(this, "MeData saved", Toast.LENGTH_SHORT).show();
            SharedPreferences sharedPreferences5 = context.getSharedPreferences("haiedit5", MODE_PRIVATE);
            SharedPreferences.Editor editor5 = sharedPreferences5.edit();
            editor5.putString(TEXT5, editText5.getText().toString());
            editor5.apply();
            SharedPreferences sharedPreferences11 = context.getSharedPreferences("haiedit11", MODE_PRIVATE);
            SharedPreferences.Editor editor11 = sharedPreferences11.edit();
            editor11.putString(TEXT11, editText11.getText().toString());
            editor11.apply();
            SharedPreferences sharedPreferences17 = context.getSharedPreferences("haiedit17", MODE_PRIVATE);
            SharedPreferences.Editor editor17 = sharedPreferences17.edit();
            editor17.putString(TEXT17, editText17.getText().toString());
            editor17.apply();
            SharedPreferences sharedPreferences23 = context.getSharedPreferences("haiedit23", MODE_PRIVATE);
            SharedPreferences.Editor editor23 = sharedPreferences23.edit();
            editor23.putString(TEXT23, editText23.getText().toString());
            editor23.apply();
            SharedPreferences sharedPreferences29 = context.getSharedPreferences("haiedit29", MODE_PRIVATE);
            SharedPreferences.Editor editor29 = sharedPreferences29.edit();
            editor29.putString(TEXT29, editText29.getText().toString());
            editor29.apply();
            SharedPreferences sharedPreferences35 = context.getSharedPreferences("haiedit35", MODE_PRIVATE);
            SharedPreferences.Editor editor35 = sharedPreferences35.edit();
            editor35.putString(TEXT35, editText35.getText().toString());
            editor35.apply();
            SharedPreferences sharedPreferences41 = context.getSharedPreferences("haiedit41", MODE_PRIVATE);
            SharedPreferences.Editor editor41 = sharedPreferences41.edit();
            editor41.putString(TEXT41, editText41.getText().toString());
            editor41.apply();
            SharedPreferences sharedPreferences47 = context.getSharedPreferences("haiedit47", MODE_PRIVATE);
            SharedPreferences.Editor editor47 = sharedPreferences47.edit();
            editor47.putString(TEXT47, editText47.getText().toString());
            editor47.apply();
            SharedPreferences sharedPreferences53 = context.getSharedPreferences("haiedit53", MODE_PRIVATE);
            SharedPreferences.Editor editor53 = sharedPreferences53.edit();
            editor53.putString(TEXT53, editText53.getText().toString());
            editor53.apply();
        }

        public void loadData() {

            SharedPreferences sharedPreferences5 = context.getSharedPreferences("haiedit5", MODE_PRIVATE);
            text5 = sharedPreferences5.getString(TEXT5, "");
            SharedPreferences sharedPreferences11 = context.getSharedPreferences("haiedit11", MODE_PRIVATE);
            text11 = sharedPreferences11.getString(TEXT11, "");
            SharedPreferences sharedPreferences17 = context.getSharedPreferences("haiedit17", MODE_PRIVATE);
            text17 = sharedPreferences17.getString(TEXT17, "");
            SharedPreferences sharedPreferences23 = context.getSharedPreferences("haiedit23", MODE_PRIVATE);
            text23 = sharedPreferences23.getString(TEXT23, "");
            SharedPreferences sharedPreferences29 = context.getSharedPreferences("haiedit29", MODE_PRIVATE);
            text29 = sharedPreferences29.getString(TEXT29, "");
            SharedPreferences sharedPreferences35 = context.getSharedPreferences("haiedit35", MODE_PRIVATE);
            text35 = sharedPreferences35.getString(TEXT35, "");
            SharedPreferences sharedPreferences41 = context.getSharedPreferences("haiedit41", MODE_PRIVATE);
            text41 = sharedPreferences41.getString(TEXT41, "");
            SharedPreferences sharedPreferences47 = context.getSharedPreferences("haiedit47", MODE_PRIVATE);
            text47 = sharedPreferences47.getString(TEXT47, "");
            SharedPreferences sharedPreferences53 = context.getSharedPreferences("haiedit53", MODE_PRIVATE);
            text53 = sharedPreferences53.getString(TEXT53, "");
            //switchOnOff = sharedPreferences.getBoolean(SWITCH1, false);
        }

        public void updateViews() {
            editText5.setText(text5);
            editText11.setText(text11);
            editText17.setText(text17);
            editText23.setText(text23);
            editText29.setText(text29);
            editText35.setText(text35);
            editText41.setText(text41);
            editText47.setText(text47);
            editText53.setText(text53);
            //switch1.setChecked(switchOnOff);
        }
        TextWatcher myTextWatcher = new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence,
                                          int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence,
                                      int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable view) {



                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText5.getText().toString().length() == 0) {
                            editText5.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no5 = Float.valueOf(editText5.getText().toString());
                        if (editText5.getText().toString().length() > 0 && no5 <= 10) {
                            editText5.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no5 > 10) {
                            editText5.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText5.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }


                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (  editText11.getText().toString().length() == 0) {
                            editText11.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no11 = Float.valueOf(editText11.getText().toString());
                        if (editText11.getText().toString().length() > 0 && no11 <= 10) {
                            editText11.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no11 > 10) {
                            editText11.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText11.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }


                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText17.getText().toString().length() == 0) {
                            editText17.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no17 = Float.valueOf(editText17.getText().toString());
                        if (editText17.getText().toString().length() > 0 && no17 <= 10) {
                            editText17.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no17 > 10) {
                            editText17.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText17.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }


                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (  editText23.getText().toString().length() == 0) {
                            editText23.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no23 = Float.valueOf(editText23.getText().toString());
                        if (editText23.getText().toString().length() > 0 && no23 <= 10) {
                            editText23.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no23 > 10) {
                            editText23.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText23.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }


                try {
                    if (editText55.getText().toString().length() == 0) {
                        if ( editText29.getText().toString().length() == 0) {
                            editText29.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no29 = Float.valueOf(editText29.getText().toString());
                        if (editText29.getText().toString().length() > 0 && no29 <= 10) {
                            editText29.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no29 > 10) {
                            editText29.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText29.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }


                try {
                    if (editText55.getText().toString().length() == 0) {
                        if ( editText35.getText().toString().length() == 0) {
                            editText35.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no35 = Float.valueOf(editText35.getText().toString());
                        if (editText35.getText().toString().length() > 0 && no35 <= 10) {
                            editText35.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no35 > 10) {
                            editText35.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText35.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }


                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (  editText41.getText().toString().length() == 0) {
                            editText41.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no41 = Float.valueOf(editText41.getText().toString());
                        if (editText41.getText().toString().length() > 0 && no41 <= 10) {
                            editText41.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no41 > 10) {
                            editText41.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText41.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }


                try {
                    if (editText55.getText().toString().length() == 0) {
                        if ( editText47.getText().toString().length() == 0) {
                            editText47.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no47 = Float.valueOf(editText47.getText().toString());
                        if (editText47.getText().toString().length() > 0 && no47 <= 10) {
                            editText47.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no47 > 10) {
                            editText47.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText47.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }



                try {
                    if (editText55.getText().toString().length() == 0) {
                        if ( editText53.getText().toString().length() == 0) {
                            editText53.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no53 = Float.valueOf(editText53.getText().toString());
                        if (editText53.getText().toString().length() > 0 && no53 <= 10) {
                            editText53.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no53 > 10) {
                            editText53.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText53.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
            }
        };
    }
}
