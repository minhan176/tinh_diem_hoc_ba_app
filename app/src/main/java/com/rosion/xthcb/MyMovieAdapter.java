package com.rosion.xthcb;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MyMovieAdapter extends RecyclerView.Adapter<MyMovieAdapter.ViewHolder> {

    MyMovieData[] myMovieData;
    Context context;

    public MyMovieAdapter(MyMovieData[] myMovieData, HomeActivity activity) {
        this.myMovieData = myMovieData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.movie_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyMovieData myMovieDataList = myMovieData[position];
        holder.textViewName.setText(myMovieDataList.getMovieName());
        holder.textViewDate.setText(myMovieDataList.getMovieDate());


    }

    @Override
    public int getItemCount() {
        return myMovieData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewName;
        TextView textViewDate;
        ImageView movieImage;
        Button button,button1,button2,button3,button4,button5;
        int id_interstitial = 0;
        private InterstitialAd mInterstitialAd;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textName2);
            textViewDate = itemView.findViewById(R.id.textdate2);
            button = itemView.findViewById(R.id.button);
            button1 = itemView.findViewById(R.id.button1);
            button2= itemView.findViewById(R.id.button2);
            button3 = itemView.findViewById(R.id.button3);
            button4 = itemView.findViewById(R.id.button4);
            button5 = itemView.findViewById(R.id.button5);

            MobileAds.initialize(context,
                    "ca-app-pub-9002559574859995~9859723704");

            mInterstitialAd = new InterstitialAd(context);
            mInterstitialAd.setAdUnitId("ca-app-pub-9002559574859995/8527147460");
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    if( id_interstitial == 2) {
                        Intent i = new Intent(context, bahocki.class);
                        context.startActivity(i);
                    }
                    if( id_interstitial == 5) {
                        Intent i = new Intent(context, mothai.class);
                        context.startActivity(i);
                    }
                    if( id_interstitial == 6) {
                        Intent i = new Intent(context, muoimothai.class);
                        context.startActivity(i);
                    }
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                }
            });

            itemView.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), namhocki.class);
                    v.getContext().startActivity(i);
                }
            });
            itemView.findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    id_interstitial=2;
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent i = new Intent(v.getContext(), bahocki.class);
                        v.getContext().startActivity(i);
                    }
                }
            });
            itemView.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), hai.class);
                    v.getContext().startActivity(i);
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), sauhocki.class);
                    v.getContext().startActivity(i);
                }
            });

            itemView.findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    id_interstitial=5;
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent i = new Intent(v.getContext(), mothai.class);
                        v.getContext().startActivity(i);
                    }
                }
            });
            itemView.findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    id_interstitial=6;
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent i = new Intent(v.getContext(), muoimothai.class);
                        v.getContext().startActivity(i);
                    }
                }
            });
        }
    }

}