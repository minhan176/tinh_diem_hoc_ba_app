package com.rosion.xthcb;

import android.app.Activity;
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
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
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

        private void createIntersitialAd(){
            AdRequest adRequest = new AdRequest.Builder().build();
            loadInterstitialAd(adRequest);
        }

        private void loadInterstitialAd(AdRequest adRequest) {
            InterstitialAd.load(context,context.getString(R.string.interstitial_id), adRequest,
                    new InterstitialAdLoadCallback() {
                        @Override
                        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                            mInterstitialAd = interstitialAd;
                            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){

                                @Override
                                public void onAdDismissedFullScreenContent() {
                                    createIntersitialAd();
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
                                }

                                @Override
                                public void onAdFailedToShowFullScreenContent(AdError adError) {
                                    mInterstitialAd = null;
                                }

                            });

                        }

                        @Override
                        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                            mInterstitialAd = null;
                        }
                    });
        };

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

            createIntersitialAd();

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
                    if (mInterstitialAd != null) {mInterstitialAd.show((Activity) context);} else {
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
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show((Activity) context);
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
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show((Activity) context);
                    } else {
                        Intent i = new Intent(v.getContext(), muoimothai.class);
                        v.getContext().startActivity(i);
                    }
                }
            });
        }
    }

}