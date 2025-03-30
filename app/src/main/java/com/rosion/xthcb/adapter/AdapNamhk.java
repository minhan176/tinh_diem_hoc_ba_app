package com.rosion.xthcb.adapter;

import android.app.Activity;
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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.rosion.xthcb.CustomBackground;
import com.rosion.xthcb.MyData;
import com.rosion.xthcb.R;

import com.rosion.xthcb.activity_mon;
import com.rosion.xthcb.ketqua;
import com.rosion.xthcb.namhocki;

import static android.content.Context.MODE_PRIVATE;

public class AdapNamhk extends RecyclerView.Adapter<AdapNamhk.ViewHolder> {

    MyData[] myData;
    Context context;

    public AdapNamhk(MyData[] myData, namhocki activity) {
        this.myData = myData;
        this.context = activity;
    }

    @NonNull
    @Override
    public AdapNamhk.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycle_namhk, parent, false);
        AdapNamhk.ViewHolder viewHolder = new AdapNamhk.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapNamhk.ViewHolder holder, int position) {
        final MyData myDataList = myData[position];
        holder.textViewDate.setText(myDataList.getName());
    }

    @Override
    public int getItemCount() {
        return myData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private InterstitialAd mInterstitialAd;

        EditText editText1, editText2, editText3, editText4, editText5, editText7, editText8, editText9, editText10, editText11, editText13, editText14, editText15, editText16, editText17, editText19,
                editText20, editText21, editText22, editText23, editText25, editText26, editText27, editText28, editText29, editText31, editText32, editText33, editText34, editText35, editText37, editText38,
                editText39, editText40, editText41, editText43, editText44, editText45, editText46, editText47,
                editText49, editText50, editText51, editText52, editText53, editText55;
        Button butnam, butnam2, xoahet, savedata;
        TextView textViewDate;
        //private int n = 0;

        public static final String TEXT1 = "text";public static final String TEXT2 = "text";public static final String TEXT3 = "text";public static final String TEXT4 = "text";public static final String TEXT5 = "text";
        public static final String TEXT7 = "text";public static final String TEXT8 = "text";public static final String TEXT9 = "text";public static final String TEXT10 = "text";public static final String TEXT11 = "text";
        public static final String TEXT13 = "text";public static final String TEXT14 = "text";public static final String TEXT15 = "text";public static final String TEXT16 = "text";public static final String TEXT17 = "text";
        public static final String TEXT19 = "text";public static final String TEXT20 = "text";public static final String TEXT21 = "text";public static final String TEXT22 = "text";public static final String TEXT23 = "text";
        public static final String TEXT25 = "text";public static final String TEXT26 = "text";public static final String TEXT27 = "text";public static final String TEXT28 = "text"; public static final String TEXT29 = "text";
        public static final String TEXT31 = "text";public static final String TEXT32 = "text";public static final String TEXT33 = "text";public static final String TEXT34 = "text";public static final String TEXT35 = "text";
        public static final String TEXT37 = "text";public static final String TEXT38 = "text";public static final String TEXT39 = "text";public static final String TEXT40 = "text";public static final String TEXT41 = "text";
        public static final String TEXT43 = "text";public static final String TEXT44 = "text";public static final String TEXT45 = "text";public static final String TEXT46 = "text"; public static final String TEXT47 = "text";
        public static final String TEXT49 = "text";public static final String TEXT50 = "text";public static final String TEXT51 = "text";public static final String TEXT52 = "text";public static final String TEXT53 = "text";
        private String text1,text2,text3,text4,text5,text7,text8,text9,text10,text11,text13,text14,text15,text16,text17,text19,text20,text21,text22,text23,text25,text26,text27,
                text28,text29,text31,text32,text33,text34,text35,text37,text38,text39,text40,text41,text43,text44,text45,text46,text47,text49,text50,text51,text52,text53;

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
                                    if (editText1.getText().toString().length() == 0) {
                                        editText1.setText("11");
                                    }
                                    if (editText2.getText().toString().length() == 0) {
                                        editText2.setText("11");
                                    }
                                    if (editText3.getText().toString().length() == 0) {
                                        editText3.setText("11");
                                    }
                                    if (editText4.getText().toString().length() == 0) {
                                        editText4.setText("11");
                                    }
                                    if (editText5.getText().toString().length() == 0) {
                                        editText5.setText("11");
                                    }
                                    if (editText7.getText().toString().length() == 0) {
                                        editText7.setText("11");
                                    }
                                    if (editText8.getText().toString().length() == 0) {
                                        editText8.setText("11");
                                    }
                                    if (editText9.getText().toString().length() == 0) {
                                        editText9.setText("11");
                                    }
                                    if (editText10.getText().toString().length() == 0) {
                                        editText10.setText("11");
                                    }
                                    if (editText11.getText().toString().length() == 0) {
                                        editText11.setText("11");
                                    }
                                    if (editText13.getText().toString().length() == 0) {
                                        editText13.setText("11");
                                    }
                                    if (editText14.getText().toString().length() == 0) {
                                        editText14.setText("11");
                                    }
                                    if (editText15.getText().toString().length() == 0) {
                                        editText15.setText("11");
                                    }
                                    if (editText16.getText().toString().length() == 0) {
                                        editText16.setText("11");
                                    }
                                    if (editText17.getText().toString().length() == 0) {
                                        editText17.setText("11");
                                    }
                                    if (editText19.getText().toString().length() == 0) {
                                        editText19.setText("11");
                                    }
                                    if (editText20.getText().toString().length() == 0) {
                                        editText20.setText("11");
                                    }
                                    if (editText21.getText().toString().length() == 0) {
                                        editText21.setText("11");
                                    }
                                    if (editText22.getText().toString().length() == 0) {
                                        editText22.setText("11");
                                    }
                                    if (editText23.getText().toString().length() == 0) {
                                        editText23.setText("11");
                                    }
                                    if (editText25.getText().toString().length() == 0) {
                                        editText25.setText("11");
                                    }
                                    if (editText26.getText().toString().length() == 0) {
                                        editText26.setText("11");
                                    }
                                    if (editText27.getText().toString().length() == 0) {
                                        editText27.setText("11");
                                    }
                                    if (editText28.getText().toString().length() == 0) {
                                        editText28.setText("11");
                                    }
                                    if (editText29.getText().toString().length() == 0) {
                                        editText29.setText("11");
                                    }
                                    if (editText31.getText().toString().length() == 0) {
                                        editText31.setText("11");
                                    }
                                    if (editText32.getText().toString().length() == 0) {
                                        editText32.setText("11");
                                    }
                                    if (editText33.getText().toString().length() == 0) {
                                        editText33.setText("11");
                                    }
                                    if (editText34.getText().toString().length() == 0) {
                                        editText34.setText("11");
                                    }
                                    if (editText35.getText().toString().length() == 0) {
                                        editText35.setText("11");
                                    }
                                    if (editText37.getText().toString().length() == 0) {
                                        editText37.setText("11");
                                    }
                                    if (editText38.getText().toString().length() == 0) {
                                        editText38.setText("11");
                                    }
                                    if (editText39.getText().toString().length() == 0) {
                                        editText39.setText("11");
                                    }
                                    if (editText40.getText().toString().length() == 0) {
                                        editText40.setText("11");
                                    }
                                    if (editText41.getText().toString().length() == 0) {
                                        editText41.setText("11");
                                    }
                                    if (editText43.getText().toString().length() == 0) {
                                        editText43.setText("11");
                                    }
                                    if (editText44.getText().toString().length() == 0) {
                                        editText44.setText("11");
                                    }
                                    if (editText45.getText().toString().length() == 0) {
                                        editText45.setText("11");
                                    }
                                    if (editText46.getText().toString().length() == 0) {
                                        editText46.setText("11");
                                    }
                                    if (editText47.getText().toString().length() == 0) {
                                        editText47.setText("11");
                                    }
                                    if (editText49.getText().toString().length() == 0) {
                                        editText49.setText("11");
                                    }
                                    if (editText50.getText().toString().length() == 0) {
                                        editText50.setText("11");
                                    }
                                    if (editText51.getText().toString().length() == 0) {
                                        editText51.setText("11");
                                    }
                                    if (editText52.getText().toString().length() == 0) {
                                        editText52.setText("11");
                                    }
                                    if (editText53.getText().toString().length() == 0) {
                                        editText53.setText("11");
                                    }

                                    if (editText1.getText().toString().length() == 1 && editText1.getText().toString().contains(".")) {
                                        editText1.setText("12");
                                    }
                                    if (editText2.getText().toString().length() == 1 && editText2.getText().toString().contains(".")) {
                                        editText2.setText("12");
                                    }
                                    if (editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".")) {
                                        editText3.setText("12");
                                    }
                                    if (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".")) {
                                        editText4.setText("12");
                                    }
                                    if (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".")) {
                                        editText5.setText("12");
                                    }
                                    if (editText7.getText().toString().length() == 1 && editText7.getText().toString().contains(".")) {
                                        editText7.setText("12");
                                    }
                                    if (editText8.getText().toString().length() == 1 && editText8.getText().toString().contains(".")) {
                                        editText8.setText("12");
                                    }
                                    if (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".")) {
                                        editText9.setText("12");
                                    }
                                    if (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".")) {
                                        editText10.setText("12");
                                    }
                                    if (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".")) {
                                        editText11.setText("12");
                                    }
                                    if (editText13.getText().toString().length() == 1 && editText13.getText().toString().contains(".")) {
                                        editText13.setText("12");
                                    }
                                    if (editText14.getText().toString().length() == 1 && editText14.getText().toString().contains(".")) {
                                        editText14.setText("12");
                                    }
                                    if (editText15.getText().toString().length() == 1 && editText15.getText().toString().contains(".")) {
                                        editText15.setText("12");
                                    }
                                    if (editText16.getText().toString().length() == 1 && editText16.getText().toString().contains(".")) {
                                        editText16.setText("12");
                                    }
                                    if (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".")) {
                                        editText17.setText("12");
                                    }
                                    if (editText19.getText().toString().length() == 1 && editText19.getText().toString().contains(".")) {
                                        editText19.setText("12");
                                    }
                                    if (editText20.getText().toString().length() == 1 && editText20.getText().toString().contains(".")) {
                                        editText20.setText("12");
                                    }
                                    if (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".")) {
                                        editText21.setText("12");
                                    }
                                    if (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".")) {
                                        editText22.setText("12");
                                    }
                                    if (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".")) {
                                        editText23.setText("12");
                                    }
                                    if (editText25.getText().toString().length() == 1 && editText25.getText().toString().contains(".")) {
                                        editText25.setText("12");
                                    }
                                    if (editText26.getText().toString().length() == 1 && editText26.getText().toString().contains(".")) {
                                        editText26.setText("12");
                                    }
                                    if (editText27.getText().toString().length() == 1 && editText27.getText().toString().contains(".")) {
                                        editText27.setText("12");
                                    }
                                    if (editText28.getText().toString().length() == 1 && editText28.getText().toString().contains(".")) {
                                        editText28.setText("12");
                                    }
                                    if (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".")) {
                                        editText29.setText("12");
                                    }
                                    if (editText31.getText().toString().length() == 1 && editText31.getText().toString().contains(".")) {
                                        editText31.setText("12");
                                    }
                                    if (editText32.getText().toString().length() == 1 && editText32.getText().toString().contains(".")) {
                                        editText32.setText("12");
                                    }
                                    if (editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".")) {
                                        editText33.setText("12");
                                    }
                                    if (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".")) {
                                        editText34.setText("12");
                                    }
                                    if (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".")) {
                                        editText35.setText("12");
                                    }
                                    if (editText37.getText().toString().length() == 1 && editText37.getText().toString().contains(".")) {
                                        editText37.setText("12");
                                    }
                                    if (editText38.getText().toString().length() == 1 && editText38.getText().toString().contains(".")) {
                                        editText38.setText("12");
                                    }
                                    if (editText39.getText().toString().length() == 1 && editText39.getText().toString().contains(".")) {
                                        editText39.setText("12");
                                    }
                                    if (editText40.getText().toString().length() == 1 && editText40.getText().toString().contains(".")) {
                                        editText40.setText("12");
                                    }
                                    if (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".")) {
                                        editText41.setText("12");
                                    }
                                    if (editText43.getText().toString().length() == 1 && editText43.getText().toString().contains(".")) {
                                        editText43.setText("12");
                                    }
                                    if (editText44.getText().toString().length() == 1 && editText44.getText().toString().contains(".")) {
                                        editText44.setText("12");
                                    }
                                    if (editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".")) {
                                        editText45.setText("12");
                                    }
                                    if (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".")) {
                                        editText46.setText("12");
                                    }
                                    if (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".")) {
                                        editText47.setText("12");
                                    }
                                    if (editText49.getText().toString().length() == 1 && editText49.getText().toString().contains(".")) {
                                        editText49.setText("12");
                                    }
                                    if (editText50.getText().toString().length() == 1 && editText50.getText().toString().contains(".")) {
                                        editText50.setText("12");
                                    }
                                    if (editText51.getText().toString().length() == 1 && editText51.getText().toString().contains(".")) {
                                        editText51.setText("12");
                                    }
                                    if (editText52.getText().toString().length() == 1 && editText52.getText().toString().contains(".")) {
                                        editText52.setText("12");
                                    }
                                    if (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".")) {
                                        editText53.setText("12");
                                    }

                                    float no1 = Float.valueOf(editText1.getText().toString());
                                    float no2 = Float.valueOf(editText2.getText().toString());
                                    float no3 = Float.valueOf(editText3.getText().toString());
                                    float no4 = Float.valueOf(editText4.getText().toString());
                                    float no5 = Float.valueOf(editText5.getText().toString());

                                    float no7 = Float.valueOf(editText7.getText().toString());
                                    float no8 = Float.valueOf(editText8.getText().toString());
                                    float no9 = Float.valueOf(editText9.getText().toString());
                                    float no10 = Float.valueOf(editText10.getText().toString());
                                    float no11 = Float.valueOf(editText11.getText().toString());

                                    float no13 = Float.valueOf(editText13.getText().toString());
                                    float no14 = Float.valueOf(editText14.getText().toString());
                                    float no15 = Float.valueOf(editText15.getText().toString());
                                    float no16 = Float.valueOf(editText16.getText().toString());
                                    float no17 = Float.valueOf(editText17.getText().toString());

                                    float no19 = Float.valueOf(editText19.getText().toString());
                                    float no20 = Float.valueOf(editText20.getText().toString());
                                    float no21 = Float.valueOf(editText21.getText().toString());
                                    float no22 = Float.valueOf(editText22.getText().toString());
                                    float no23 = Float.valueOf(editText23.getText().toString());

                                    float no25 = Float.valueOf(editText25.getText().toString());
                                    float no26 = Float.valueOf(editText26.getText().toString());
                                    float no27 = Float.valueOf(editText27.getText().toString());
                                    float no28 = Float.valueOf(editText28.getText().toString());
                                    float no29 = Float.valueOf(editText29.getText().toString());

                                    float no31 = Float.valueOf(editText31.getText().toString());
                                    float no32 = Float.valueOf(editText32.getText().toString());
                                    float no33 = Float.valueOf(editText33.getText().toString());
                                    float no34 = Float.valueOf(editText34.getText().toString());
                                    float no35 = Float.valueOf(editText35.getText().toString());

                                    float no37 = Float.valueOf(editText37.getText().toString());
                                    float no38 = Float.valueOf(editText38.getText().toString());
                                    float no39 = Float.valueOf(editText39.getText().toString());
                                    float no40 = Float.valueOf(editText40.getText().toString());
                                    float no41 = Float.valueOf(editText41.getText().toString());

                                    float no43 = Float.valueOf(editText43.getText().toString());
                                    float no44 = Float.valueOf(editText44.getText().toString());
                                    float no45 = Float.valueOf(editText45.getText().toString());
                                    float no46 = Float.valueOf(editText46.getText().toString());
                                    float no47 = Float.valueOf(editText47.getText().toString());

                                    float no49 = Float.valueOf(editText49.getText().toString());
                                    float no50 = Float.valueOf(editText50.getText().toString());
                                    float no51 = Float.valueOf(editText51.getText().toString());
                                    float no52 = Float.valueOf(editText52.getText().toString());
                                    float no53 = Float.valueOf(editText53.getText().toString());


                                    if (no1 == 11) {
                                        editText1.setText("");
                                    }
                                    if (no2 == 11) {
                                        editText2.setText("");
                                    }
                                    if (no3 == 11) {
                                        editText3.setText("");
                                    }
                                    if (no4 == 11) {
                                        editText4.setText("");
                                    }
                                    if (no5 == 11) {
                                        editText5.setText("");
                                    }
                                    if (no7 == 11) {
                                        editText7.setText("");
                                    }
                                    if (no8 == 11) {
                                        editText8.setText("");
                                    }
                                    if (no9 == 11) {
                                        editText9.setText("");
                                    }
                                    if (no10 == 11) {
                                        editText10.setText("");
                                    }
                                    if (no11 == 11) {
                                        editText11.setText("");
                                    }
                                    if (no13 == 11) {
                                        editText13.setText("");
                                    }
                                    if (no14 == 11) {
                                        editText14.setText("");
                                    }
                                    if (no15 == 11) {
                                        editText15.setText("");
                                    }
                                    if (no16 == 11) {
                                        editText16.setText("");
                                    }
                                    if (no17 == 11) {
                                        editText17.setText("");
                                    }
                                    if (no19 == 11) {
                                        editText19.setText("");
                                    }
                                    if (no20 == 11) {
                                        editText20.setText("");
                                    }
                                    if (no21 == 11) {
                                        editText21.setText("");
                                    }
                                    if (no22 == 11) {
                                        editText22.setText("");
                                    }
                                    if (no23 == 11) {
                                        editText23.setText("");
                                    }
                                    if (no25 == 11) {
                                        editText25.setText("");
                                    }
                                    if (no26 == 11) {
                                        editText26.setText("");
                                    }
                                    if (no27 == 11) {
                                        editText27.setText("");
                                    }
                                    if (no28 == 11) {
                                        editText28.setText("");
                                    }
                                    if (no29 == 11) {
                                        editText29.setText("");
                                    }
                                    if (no31 == 11) {
                                        editText31.setText("");
                                    }
                                    if (no32 == 11) {
                                        editText32.setText("");
                                    }
                                    if (no33 == 11) {
                                        editText33.setText("");
                                    }
                                    if (no34 == 11) {
                                        editText34.setText("");
                                    }
                                    if (no35 == 11) {
                                        editText35.setText("");
                                    }
                                    if (no37 == 11) {
                                        editText37.setText("");
                                    }
                                    if (no38 == 11) {
                                        editText38.setText("");
                                    }
                                    if (no39 == 11) {
                                        editText39.setText("");
                                    }
                                    if (no40 == 11) {
                                        editText40.setText("");
                                    }
                                    if (no41 == 11) {
                                        editText41.setText("");
                                    }
                                    if (no43 == 11) {
                                        editText43.setText("");
                                    }
                                    if (no44 == 11) {
                                        editText44.setText("");
                                    }
                                    if (no45 == 11) {
                                        editText45.setText("");
                                    }
                                    if (no46 == 11) {
                                        editText46.setText("");
                                    }
                                    if (no47 == 11) {
                                        editText47.setText("");
                                    }
                                    if (no49 == 11) {
                                        editText49.setText("");
                                    }
                                    if (no50 == 11) {
                                        editText50.setText("");
                                    }
                                    if (no51 == 11) {
                                        editText51.setText("");
                                    }
                                    if (no52 == 11) {
                                        editText52.setText("");
                                    }
                                    if (no53 == 11) {
                                        editText53.setText("");
                                    }

                                    if (no1 == 12) {
                                        editText1.setText(".");
                                    }
                                    if (no2 == 12) {
                                        editText2.setText(".");
                                    }
                                    if (no3 == 12) {
                                        editText3.setText(".");
                                    }
                                    if (no4 == 12) {
                                        editText4.setText(".");
                                    }
                                    if (no5 == 12) {
                                        editText5.setText(".");
                                    }
                                    if (no7 == 12) {
                                        editText7.setText(".");
                                    }
                                    if (no8 == 12) {
                                        editText8.setText(".");
                                    }
                                    if (no9 == 12) {
                                        editText9.setText(".");
                                    }
                                    if (no10 == 12) {
                                        editText10.setText(".");
                                    }
                                    if (no11 == 12) {
                                        editText11.setText(".");
                                    }
                                    if (no13 == 12) {
                                        editText13.setText(".");
                                    }
                                    if (no14 == 12) {
                                        editText14.setText(".");
                                    }
                                    if (no15 == 12) {
                                        editText15.setText(".");
                                    }
                                    if (no16 == 12) {
                                        editText16.setText(".");
                                    }
                                    if (no17 == 12) {
                                        editText17.setText(".");
                                    }
                                    if (no19 == 12) {
                                        editText19.setText(".");
                                    }
                                    if (no20 == 12) {
                                        editText20.setText(".");
                                    }
                                    if (no21 == 12) {
                                        editText21.setText(".");
                                    }
                                    if (no22 == 12) {
                                        editText22.setText(".");
                                    }
                                    if (no23 == 12) {
                                        editText23.setText(".");
                                    }
                                    if (no25 == 12) {
                                        editText25.setText(".");
                                    }
                                    if (no26 == 12) {
                                        editText26.setText(".");
                                    }
                                    if (no27 == 12) {
                                        editText27.setText(".");
                                    }
                                    if (no28 == 12) {
                                        editText28.setText(".");
                                    }
                                    if (no29 == 12) {
                                        editText29.setText(".");
                                    }
                                    if (no31 == 12) {
                                        editText31.setText(".");
                                    }
                                    if (no32 == 12) {
                                        editText32.setText(".");
                                    }
                                    if (no33 == 12) {
                                        editText33.setText(".");
                                    }
                                    if (no34 == 12) {
                                        editText34.setText(".");
                                    }
                                    if (no35 == 12) {
                                        editText35.setText(".");
                                    }
                                    if (no37 == 12) {
                                        editText37.setText(".");
                                    }
                                    if (no38 == 12) {
                                        editText38.setText(".");
                                    }
                                    if (no39 == 12) {
                                        editText39.setText(".");
                                    }
                                    if (no40 == 12) {
                                        editText40.setText(".");
                                    }
                                    if (no41 == 12) {
                                        editText41.setText(".");
                                    }
                                    if (no43 == 12) {
                                        editText43.setText(".");
                                    }
                                    if (no44 == 12) {
                                        editText44.setText(".");
                                    }
                                    if (no45 == 12) {
                                        editText45.setText(".");
                                    }
                                    if (no46 == 12) {
                                        editText46.setText(".");
                                    }
                                    if (no47 == 12) {
                                        editText47.setText(".");
                                    }
                                    if (no49 == 12) {
                                        editText49.setText(".");
                                    }
                                    if (no50 == 12) {
                                        editText50.setText(".");
                                    }
                                    if (no51 == 12) {
                                        editText51.setText(".");
                                    }
                                    if (no52 == 12) {
                                        editText52.setText(".");
                                    }
                                    if (no53 == 12) {
                                        editText53.setText(".");
                                    }

                                    float a0t = (no1 + no2 + no3 + no4 + no5) / 5 * 100;
                                    int roa0t = Math.round(a0t);
                                    Float a0t2 = Float.valueOf(roa0t) / 100;

                                    float a0l = (no7 + no8 + no9 + no10 + no11) / 5 * 100;
                                    int roa0l = Math.round(a0l);
                                    Float a0l2 = Float.valueOf(roa0l) / 100;

                                    float a0h = (no13 + no14 + no15 + no16 + no17) / 5 * 100;
                                    int roa0h = Math.round(a0h);
                                    Float a0h2 = Float.valueOf(roa0h) / 100;

                                    float a1a = (no19 + no20 + no21 + no22 + no23) / 5 * 100;
                                    int roa1a = Math.round(a1a);
                                    Float a1a2 = Float.valueOf(roa1a) / 100;

                                    float c0v = (no25 + no26 + no27 + no28 + no29) / 5 * 100;
                                    int roc0v = Math.round(c0v);
                                    Float c0v2 = Float.valueOf(roc0v) / 100;

                                    float b0s = (no31 + no32 + no33 + no34 + no35) / 5 * 100;
                                    int rob0s = Math.round(b0s);
                                    Float b0s2 = Float.valueOf(rob0s) / 100;

                                    float c0su = (no37 + no38 + no39 + no40 + no41) / 5 * 100;
                                    int roc0su = Math.round(c0su);
                                    Float c0su2 = Float.valueOf(roc0su) / 100;

                                    float c0d = (no43 + no44 + no45 + no46 + no47) / 5 * 100;
                                    int roc0d = Math.round(c0d);
                                    Float c0d2 = Float.valueOf(roc0d) / 100;

                                    float c19gd = (no49 + no50 + no51 + no52 + no53) / 5 * 100;
//                  String c19gd3 = String.format("%.2f",c19gd);
//                  float c19gd4 = Float.valueOf(c19gd3);
                                    int roc19gd = Math.round(c19gd);
                                    Float c19gd2 = Float.valueOf(roc19gd) / 100;

                                    float a02 = (a0t2 + a0l2 + a0h2) * 100;
                                    int a01 = Math.round(a02);
                                    Float a0 = Float.valueOf(a01) / 100;

                                    float a12 = (a0t2 + a0l2 + a1a2) * 100;
                                    int a11 = Math.round(a12);
                                    Float a1 = Float.valueOf(a11) / 100;

                                    float b02 = (b0s2 + a0t2 + a0h2) * 100;
                                    int b01 = Math.round(b02);
                                    Float b0 = Float.valueOf(b01) / 100;

                                    float c02 = (c0v2 + c0su2 + c0d2) * 100;
                                    int c01 = Math.round(c02);
                                    Float c0 = Float.valueOf(c01) / 100;

                                    float c12 = (a0t2 + a0l2 + c0v2) * 100;
                                    int c11 = Math.round(c12);
                                    Float c1 = Float.valueOf(c11) / 100;

                                    float d12 = (c0v2 + a0t2 + a1a2) * 100;
                                    int d11 = Math.round(d12);
                                    Float d1 = Float.valueOf(d11) / 100;

                                    float d72 = (a0h2 + a0t2 + a1a2) * 100;
                                    int d71 = Math.round(d72);
                                    Float d7 = Float.valueOf(d71) / 100;

                                    float d142 = (c0v2 + c0su2 + a1a2) * 100;
                                    int d141 = Math.round(d142);
                                    Float d14 = Float.valueOf(d141) / 100;

                                    float d152 = (c0v2 + c0d2 + a1a2) * 100;
                                    int d151 = Math.round(d152);
                                    Float d15 = Float.valueOf(d151) / 100;

                                    float b82 = (b0s2 + a0t2 + a1a2) * 100;
                                    int b81  =Math.round(b82);
                                    Float b8 = Float.valueOf(b81) / 100;

                                    float c192 = (c0v2 + c0su2 + c19gd2) * 100;
                                    int c191 = Math.round(c192);
                                    Float c19 = Float.valueOf(c191) / 100;

                                    if (((editText1.getText().toString().length() == 1 && editText1.getText().toString().contains(".") || editText1.getText().toString().length() == 0 || no1 > 10) || (editText2.getText().toString().length() == 1 && editText2.getText().toString().contains(".") || editText2.getText().toString().length() == 0 || no2 > 10)
                                            || (editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".") || editText3.getText().toString().length() == 0 || no3 > 10) || (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".") || editText4.getText().toString().length() == 0 || no4 > 10)
                                            || (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() == 0 || no5 > 10))
                                            && (editText1.getText().toString().length() > 0 || editText2.getText().toString().length() > 0 || editText3.getText().toString().length() > 0 || editText4.getText().toString().length() > 0 || editText5.getText().toString().length() > 0)) {
                                        if (editText1.getText().toString().length() == 1 && editText1.getText().toString().contains(".") || editText1.getText().toString().length() == 0 || no1 > 10) {
                                            editText1.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText2.getText().toString().length() == 1 && editText2.getText().toString().contains(".") || editText2.getText().toString().length() == 0 || no2 > 10) {
                                            editText2.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".") || editText3.getText().toString().length() == 0 || no3 > 10) {
                                            editText3.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".") || editText4.getText().toString().length() == 0 || no4 > 10) {
                                            editText4.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() == 0 || no5 > 10) {
                                            editText5.setBackgroundResource(R.drawable.edittext_background1);
                                        }

                                    }

                                    if (((editText7.getText().toString().length() == 1 && editText7.getText().toString().contains(".") || editText7.getText().toString().length() == 0 || no7 > 10) || (editText8.getText().toString().length() == 1 && editText8.getText().toString().contains(".") || editText8.getText().toString().length() == 0 || no8 > 10)
                                            || (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".") || editText9.getText().toString().length() == 0 || no9 > 10) || (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".") || editText10.getText().toString().length() == 0 || no10 > 10)
                                            || (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".") || editText11.getText().toString().length() == 0 || no11 > 10))
                                            && (editText7.getText().toString().length() > 0 || editText8.getText().toString().length() > 0 || editText9.getText().toString().length() > 0 || editText10.getText().toString().length() > 0 || editText11.getText().toString().length() > 0)) {
                                        if (editText7.getText().toString().length() == 1 && editText7.getText().toString().contains(".") || editText7.getText().toString().length() == 0 || no7 > 10) {
                                            editText7.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText8.getText().toString().length() == 1 && editText8.getText().toString().contains(".") || editText8.getText().toString().length() == 0 || no8 > 10) {
                                            editText8.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".") || editText9.getText().toString().length() == 0 || no9 > 10) {
                                            editText9.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".") || editText10.getText().toString().length() == 0 || no10 > 10) {
                                            editText10.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".") || editText11.getText().toString().length() == 0 || no11 > 10) {
                                            editText11.setBackgroundResource(R.drawable.edittext_background1);
                                        }

                                    }

                                    if (((editText13.getText().toString().length() == 1 && editText13.getText().toString().contains(".") || editText13.getText().toString().length() == 0 || no13 > 10) || (editText14.getText().toString().length() == 1 && editText14.getText().toString().contains(".") || editText14.getText().toString().length() == 0 || no14 > 10)
                                            || (editText15.getText().toString().length() == 1 && editText15.getText().toString().contains(".") || editText15.getText().toString().length() == 0 || no15 > 10) || (editText16.getText().toString().length() == 1 && editText16.getText().toString().contains(".") || editText16.getText().toString().length() == 0 || no16 > 10)
                                            || (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".") || editText17.getText().toString().length() == 0 || no17 > 10))
                                            && (editText13.getText().toString().length() > 0 || editText14.getText().toString().length() > 0 || editText15.getText().toString().length() > 0 || editText16.getText().toString().length() > 0 || editText17.getText().toString().length() > 0)) {
                                        if (editText13.getText().toString().length() == 1 && editText13.getText().toString().contains(".") || editText13.getText().toString().length() == 0 || no13 > 10) {
                                            editText13.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText14.getText().toString().length() == 1 && editText14.getText().toString().contains(".") || editText14.getText().toString().length() == 0 || no14 > 10) {
                                            editText14.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText15.getText().toString().length() == 1 && editText15.getText().toString().contains(".") || editText15.getText().toString().length() == 0 || no15 > 10) {
                                            editText15.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText16.getText().toString().length() == 1 && editText16.getText().toString().contains(".") || editText16.getText().toString().length() == 0 || no16 > 10) {
                                            editText16.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".") || editText17.getText().toString().length() == 0 || no17 > 10) {
                                            editText17.setBackgroundResource(R.drawable.edittext_background1);
                                        }

                                    }

                                    if (((editText19.getText().toString().length() == 1 && editText19.getText().toString().contains(".") || editText19.getText().toString().length() == 0 || no19 > 10) || (editText20.getText().toString().length() == 1 && editText20.getText().toString().contains(".") || editText20.getText().toString().length() == 0 || no20 > 10)
                                            || (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".") || editText21.getText().toString().length() == 0 || no21 > 10) || (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".") || editText22.getText().toString().length() == 0 || no22 > 10)
                                            || (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".") || editText23.getText().toString().length() == 0 || no23 > 10))
                                            && (editText19.getText().toString().length() > 0 || editText20.getText().toString().length() > 0 || editText21.getText().toString().length() > 0 || editText22.getText().toString().length() > 0 || editText23.getText().toString().length() > 0)) {
                                        if (editText19.getText().toString().length() == 1 && editText19.getText().toString().contains(".") || editText19.getText().toString().length() == 0 || no19 > 10) {
                                            editText19.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText20.getText().toString().length() == 1 && editText20.getText().toString().contains(".") || editText20.getText().toString().length() == 0 || no20 > 10) {
                                            editText20.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".") || editText21.getText().toString().length() == 0 || no21 > 10) {
                                            editText21.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".") || editText22.getText().toString().length() == 0 || no22 > 10) {
                                            editText22.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".") || editText23.getText().toString().length() == 0 || no23 > 10) {
                                            editText23.setBackgroundResource(R.drawable.edittext_background1);
                                        }

                                    }

                                    if (((editText25.getText().toString().length() == 1 && editText25.getText().toString().contains(".") || editText25.getText().toString().length() == 0 || no25 > 10) || (editText26.getText().toString().length() == 1 && editText26.getText().toString().contains(".") || editText26.getText().toString().length() == 0 || no26 > 10)
                                            || (editText27.getText().toString().length() == 1 && editText27.getText().toString().contains(".") || editText27.getText().toString().length() == 0 || no27 > 10) || (editText28.getText().toString().length() == 1 && editText28.getText().toString().contains(".") || editText28.getText().toString().length() == 0 || no28 > 10)
                                            || (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".") || editText29.getText().toString().length() == 0 || no29 > 10))
                                            && (editText25.getText().toString().length() > 0 || editText26.getText().toString().length() > 0 || editText27.getText().toString().length() > 0 || editText28.getText().toString().length() > 0 || editText29.getText().toString().length() > 0)) {
                                        if (editText25.getText().toString().length() == 1 && editText25.getText().toString().contains(".") || editText25.getText().toString().length() == 0 || no25 > 10) {
                                            editText25.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText26.getText().toString().length() == 1 && editText26.getText().toString().contains(".") || editText26.getText().toString().length() == 0 || no26 > 10) {
                                            editText26.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText27.getText().toString().length() == 1 && editText27.getText().toString().contains(".") || editText27.getText().toString().length() == 0 || no27 > 10) {
                                            editText27.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText28.getText().toString().length() == 1 && editText28.getText().toString().contains(".") || editText28.getText().toString().length() == 0 || no28 > 10) {
                                            editText28.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".") || editText29.getText().toString().length() == 0 || no29 > 10) {
                                            editText29.setBackgroundResource(R.drawable.edittext_background1);
                                        }

                                    }

                                    if (((editText31.getText().toString().length() == 1 && editText31.getText().toString().contains(".") || editText31.getText().toString().length() == 0 || no31 > 10) || (editText32.getText().toString().length() == 1 && editText32.getText().toString().contains(".") || editText32.getText().toString().length() == 0 || no32 > 10)
                                            || (editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".") || editText33.getText().toString().length() == 0 || no33 > 10) || (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".") || editText34.getText().toString().length() == 0 || no34 > 10)
                                            || (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".") || editText35.getText().toString().length() == 0 || no35 > 10))
                                            && (editText31.getText().toString().length() > 0 || editText32.getText().toString().length() > 0 || editText33.getText().toString().length() > 0 || editText34.getText().toString().length() > 0 || editText35.getText().toString().length() > 0)) {
                                        if (editText31.getText().toString().length() == 1 && editText31.getText().toString().contains(".") || editText31.getText().toString().length() == 0 || no31 > 10) {
                                            editText31.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText32.getText().toString().length() == 1 && editText32.getText().toString().contains(".") || editText32.getText().toString().length() == 0 || no32 > 10) {
                                            editText32.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".") || editText33.getText().toString().length() == 0 || no33 > 10) {
                                            editText33.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".") || editText34.getText().toString().length() == 0 || no34 > 10) {
                                            editText34.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".") || editText35.getText().toString().length() == 0 || no35 > 10) {
                                            editText35.setBackgroundResource(R.drawable.edittext_background1);
                                        }

                                    }

                                    if (((editText37.getText().toString().length() == 1 && editText37.getText().toString().contains(".") || editText37.getText().toString().length() == 0 || no37 > 10) || (editText38.getText().toString().length() == 1 && editText38.getText().toString().contains(".") || editText38.getText().toString().length() == 0 || no38 > 10)
                                            || (editText39.getText().toString().length() == 1 && editText39.getText().toString().contains(".") || editText39.getText().toString().length() == 0 || no39 > 10) || (editText40.getText().toString().length() == 1 && editText40.getText().toString().contains(".") || editText40.getText().toString().length() == 0 || no40 > 10)
                                            || (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".") || editText41.getText().toString().length() == 0 || no41 > 10))
                                            && (editText37.getText().toString().length() > 0 || editText38.getText().toString().length() > 0 || editText39.getText().toString().length() > 0 || editText40.getText().toString().length() > 0 || editText41.getText().toString().length() > 0)) {
                                        if (editText37.getText().toString().length() == 1 && editText37.getText().toString().contains(".") || editText37.getText().toString().length() == 0 || no37 > 10) {
                                            editText37.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText38.getText().toString().length() == 1 && editText38.getText().toString().contains(".") || editText38.getText().toString().length() == 0 || no38 > 10) {
                                            editText38.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText39.getText().toString().length() == 1 && editText39.getText().toString().contains(".") || editText39.getText().toString().length() == 0 || no39 > 10) {
                                            editText39.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText40.getText().toString().length() == 1 && editText40.getText().toString().contains(".") || editText40.getText().toString().length() == 0 || no40 > 10) {
                                            editText40.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".") || editText41.getText().toString().length() == 0 || no41 > 10) {
                                            editText41.setBackgroundResource(R.drawable.edittext_background1);
                                        }

                                    }

                                    if (((editText43.getText().toString().length() == 1 && editText43.getText().toString().contains(".") || editText43.getText().toString().length() == 0 || no43 > 10) || (editText44.getText().toString().length() == 1 && editText44.getText().toString().contains(".") || editText44.getText().toString().length() == 0 || no44 > 10)
                                            || (editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".") || editText45.getText().toString().length() == 0 || no45 > 10) || (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".") || editText46.getText().toString().length() == 0 || no46 > 10)
                                            || (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".") || editText47.getText().toString().length() == 0 || no47 > 10))
                                            && (editText43.getText().toString().length() > 0 || editText44.getText().toString().length() > 0 || editText45.getText().toString().length() > 0 || editText46.getText().toString().length() > 0 || editText47.getText().toString().length() > 0)) {
                                        if (editText43.getText().toString().length() == 1 && editText43.getText().toString().contains(".") || editText43.getText().toString().length() == 0 || no43 > 10) {
                                            editText43.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText44.getText().toString().length() == 1 && editText44.getText().toString().contains(".") || editText44.getText().toString().length() == 0 || no44 > 10) {
                                            editText44.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".") || editText45.getText().toString().length() == 0 || no45 > 10) {
                                            editText45.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".") || editText46.getText().toString().length() == 0 || no46 > 10) {
                                            editText46.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".") || editText47.getText().toString().length() == 0 || no47 > 10) {
                                            editText47.setBackgroundResource(R.drawable.edittext_background1);
                                        }

                                    }

                                    if (((editText49.getText().toString().length() == 1 && editText49.getText().toString().contains(".") || editText49.getText().toString().length() == 0 || no49 > 10) || (editText50.getText().toString().length() == 1 && editText50.getText().toString().contains(".") || editText50.getText().toString().length() == 0 || no50 > 10)
                                            || (editText51.getText().toString().length() == 1 && editText51.getText().toString().contains(".") || editText51.getText().toString().length() == 0 || no51 > 10) || (editText52.getText().toString().length() == 1 && editText52.getText().toString().contains(".") || editText52.getText().toString().length() == 0 || no52 > 10)
                                            || (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".") || editText53.getText().toString().length() == 0 || no53 > 10))
                                            && (editText49.getText().toString().length() > 0 || editText50.getText().toString().length() > 0 || editText51.getText().toString().length() > 0 || editText52.getText().toString().length() > 0 || editText53.getText().toString().length() > 0)) {
                                        if (editText49.getText().toString().length() == 1 && editText49.getText().toString().contains(".") || editText49.getText().toString().length() == 0 || no49 > 10) {
                                            editText49.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText50.getText().toString().length() == 1 && editText50.getText().toString().contains(".") || editText50.getText().toString().length() == 0 || no50 > 10) {
                                            editText50.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText51.getText().toString().length() == 1 && editText51.getText().toString().contains(".") || editText51.getText().toString().length() == 0 || no51 > 10) {
                                            editText51.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText52.getText().toString().length() == 1 && editText52.getText().toString().contains(".") || editText52.getText().toString().length() == 0 || no52 > 10) {
                                            editText52.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                        if (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".") || editText53.getText().toString().length() == 0 || no53 > 10) {
                                            editText53.setBackgroundResource(R.drawable.edittext_background1);
                                        }
                                    }

                                    if (((editText1.getText().toString().length() == 0 && editText2.getText().toString().length() == 0 && editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0 && editText5.getText().toString().length() == 0) || (no1 <= 10 && no2 <= 10 && no3 <= 10 && no4 <= 10 && no5 <= 10))
                                            && ((editText7.getText().toString().length() == 0 && editText8.getText().toString().length() == 0 && editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0 && editText11.getText().toString().length() == 0) || (no7 <= 10 && no8 <= 10 && no9 <= 10 && no10 <= 10 && no11 <= 10))
                                            && ((editText13.getText().toString().length() == 0 && editText14.getText().toString().length() == 0 && editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0 && editText17.getText().toString().length() == 0) || (no13 <= 10 && no14 <= 10 && no15 <= 10 && no16 <= 10 && no17 <= 10))
                                            && ((editText19.getText().toString().length() == 0 && editText20.getText().toString().length() == 0 && editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0 && editText23.getText().toString().length() == 0) || (no19 <= 10 && no20 <= 10 && no21 <= 10 && no22 <= 10 && no23 <= 10))
                                            && ((editText25.getText().toString().length() == 0 && editText26.getText().toString().length() == 0 && editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0 && editText29.getText().toString().length() == 0) || (no25 <= 10 && no26 <= 10 && no27 <= 10 && no28 <= 10 && no29 <= 10))
                                            && ((editText31.getText().toString().length() == 0 && editText32.getText().toString().length() == 0 && editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0 && editText35.getText().toString().length() == 0) || (no31 <= 10 && no32 <= 10 && no33 <= 10 && no34 <= 10 && no35 <= 10))
                                            && ((editText37.getText().toString().length() == 0 && editText38.getText().toString().length() == 0 && editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0 && editText41.getText().toString().length() == 0) || (no37 <= 10 && no38 <= 10 && no39 <= 10 && no40 <= 10 && no41 <= 10))
                                            && ((editText43.getText().toString().length() == 0 && editText44.getText().toString().length() == 0 && editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0 && editText47.getText().toString().length() == 0) || (no43 <= 10 && no44 <= 10 && no45 <= 10 && no46 <= 10 && no47 <= 10))
                                            && ((editText49.getText().toString().length() == 0 && editText50.getText().toString().length() == 0 && editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0 && editText53.getText().toString().length() == 0) || (no49 <= 10 && no50 <= 10 && no51 <= 10 && no52 <= 10 && no53 <= 10))

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

                                        intent.putExtra("no1", no1);
                                        intent.putExtra("no2", no2);
                                        intent.putExtra("no3", no3);
                                        intent.putExtra("no4", no4);
                                        intent.putExtra("no5", no5);

                                        intent.putExtra("no7", no7);
                                        intent.putExtra("no8", no8);
                                        intent.putExtra("no9", no9);
                                        intent.putExtra("no10", no10);
                                        intent.putExtra("no11", no11);

                                        intent.putExtra("no13", no13);
                                        intent.putExtra("no14", no14);
                                        intent.putExtra("no15", no15);
                                        intent.putExtra("no16", no16);
                                        intent.putExtra("no17", no17);

                                        intent.putExtra("no19", no19);
                                        intent.putExtra("no20", no20);
                                        intent.putExtra("no21", no21);
                                        intent.putExtra("no22", no22);
                                        intent.putExtra("no23", no23);

                                        intent.putExtra("no25", no25);
                                        intent.putExtra("no26", no26);
                                        intent.putExtra("no27", no27);
                                        intent.putExtra("no28", no28);
                                        intent.putExtra("no29", no29);

                                        intent.putExtra("no31", no31);
                                        intent.putExtra("no32", no32);
                                        intent.putExtra("no33", no33);
                                        intent.putExtra("no34", no34);
                                        intent.putExtra("no35", no35);

                                        intent.putExtra("no37", no37);
                                        intent.putExtra("no38", no38);
                                        intent.putExtra("no39", no39);
                                        intent.putExtra("no40", no40);
                                        intent.putExtra("no41", no41);

                                        intent.putExtra("no43", no43);
                                        intent.putExtra("no44", no44);
                                        intent.putExtra("no45", no45);
                                        intent.putExtra("no46", no46);
                                        intent.putExtra("no47", no47);

                                        intent.putExtra("no49", no49);
                                        intent.putExtra("no50", no50);
                                        intent.putExtra("no51", no51);
                                        intent.putExtra("no52", no52);
                                        intent.putExtra("no53", no53);
                                        context.startActivity(intent);
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
            CustomBackground.setDecorBackground((Activity) context);
            textViewDate = itemView.findViewById(R.id.namedate);
            editText1 = (EditText) itemView.findViewById(R.id.edit1);
            editText2 = (EditText) itemView.findViewById(R.id.edit2);
            editText3 = (EditText) itemView.findViewById(R.id.edit3);
            editText4 = (EditText) itemView.findViewById(R.id.edit4);
            editText5 = (EditText) itemView.findViewById(R.id.edit5);

            editText7 = (EditText) itemView.findViewById(R.id.edit7);
            editText8 = (EditText) itemView.findViewById(R.id.edit8);
            editText9 = (EditText) itemView.findViewById(R.id.edit9);
            editText10 = (EditText) itemView.findViewById(R.id.edit10);
            editText11 = (EditText) itemView.findViewById(R.id.edit11);

            editText13 = (EditText) itemView.findViewById(R.id.edit13);
            editText14 = (EditText) itemView.findViewById(R.id.edit14);
            editText15 = (EditText) itemView.findViewById(R.id.edit15);
            editText16 = (EditText) itemView.findViewById(R.id.edit16);
            editText17 = (EditText) itemView.findViewById(R.id.edit17);

            editText19 = (EditText) itemView.findViewById(R.id.edit19);
            editText20 = (EditText) itemView.findViewById(R.id.edit20);
            editText21 = (EditText) itemView.findViewById(R.id.edit21);
            editText22 = (EditText) itemView.findViewById(R.id.edit22);
            editText23 = (EditText) itemView.findViewById(R.id.edit23);

            editText25 = (EditText) itemView.findViewById(R.id.edit25);
            editText26 = (EditText) itemView.findViewById(R.id.edit26);
            editText27 = (EditText) itemView.findViewById(R.id.edit27);
            editText28 = (EditText) itemView.findViewById(R.id.edit28);
            editText29 = (EditText) itemView.findViewById(R.id.edit29);

            editText31 = (EditText) itemView.findViewById(R.id.edit31);
            editText32 = (EditText) itemView.findViewById(R.id.edit32);
            editText33 = (EditText) itemView.findViewById(R.id.edit33);
            editText34 = (EditText) itemView.findViewById(R.id.edit34);
            editText35 = (EditText) itemView.findViewById(R.id.edit35);

            editText37 = (EditText) itemView.findViewById(R.id.edit37);
            editText38 = (EditText) itemView.findViewById(R.id.edit38);
            editText39 = (EditText) itemView.findViewById(R.id.edit39);
            editText40 = (EditText) itemView.findViewById(R.id.edit40);
            editText41 = (EditText) itemView.findViewById(R.id.edit41);

            editText43 = (EditText) itemView.findViewById(R.id.edit43);
            editText44 = (EditText) itemView.findViewById(R.id.edit44);
            editText45 = (EditText) itemView.findViewById(R.id.edit45);
            editText46 = (EditText) itemView.findViewById(R.id.edit46);
            editText47 = (EditText) itemView.findViewById(R.id.edit47);

            editText49 = (EditText) itemView.findViewById(R.id.edit49);
            editText50 = (EditText) itemView.findViewById(R.id.edit50);
            editText51 = (EditText) itemView.findViewById(R.id.edit51);
            editText52 = (EditText) itemView.findViewById(R.id.edit52);
            editText53 = (EditText) itemView.findViewById(R.id.edit53);


            editText55 = (EditText) itemView.findViewById(R.id.edit55);

            editText1.addTextChangedListener(myTextWatcher);
            editText2.addTextChangedListener(myTextWatcher);
            editText3.addTextChangedListener(myTextWatcher);
            editText4.addTextChangedListener(myTextWatcher);
            editText5.addTextChangedListener(myTextWatcher);

            editText7.addTextChangedListener(myTextWatcher);
            editText8.addTextChangedListener(myTextWatcher);
            editText9.addTextChangedListener(myTextWatcher);
            editText10.addTextChangedListener(myTextWatcher);
            editText11.addTextChangedListener(myTextWatcher);

            editText13.addTextChangedListener(myTextWatcher);
            editText14.addTextChangedListener(myTextWatcher);
            editText15.addTextChangedListener(myTextWatcher);
            editText16.addTextChangedListener(myTextWatcher);
            editText17.addTextChangedListener(myTextWatcher);

            editText19.addTextChangedListener(myTextWatcher);
            editText20.addTextChangedListener(myTextWatcher);
            editText21.addTextChangedListener(myTextWatcher);
            editText22.addTextChangedListener(myTextWatcher);
            editText23.addTextChangedListener(myTextWatcher);

            editText25.addTextChangedListener(myTextWatcher);
            editText26.addTextChangedListener(myTextWatcher);
            editText27.addTextChangedListener(myTextWatcher);
            editText28.addTextChangedListener(myTextWatcher);
            editText29.addTextChangedListener(myTextWatcher);

            editText31.addTextChangedListener(myTextWatcher);
            editText32.addTextChangedListener(myTextWatcher);
            editText33.addTextChangedListener(myTextWatcher);
            editText34.addTextChangedListener(myTextWatcher);
            editText35.addTextChangedListener(myTextWatcher);

            editText37.addTextChangedListener(myTextWatcher);
            editText38.addTextChangedListener(myTextWatcher);
            editText39.addTextChangedListener(myTextWatcher);
            editText40.addTextChangedListener(myTextWatcher);
            editText41.addTextChangedListener(myTextWatcher);

            editText43.addTextChangedListener(myTextWatcher);
            editText44.addTextChangedListener(myTextWatcher);
            editText45.addTextChangedListener(myTextWatcher);
            editText46.addTextChangedListener(myTextWatcher);
            editText47.addTextChangedListener(myTextWatcher);

            editText49.addTextChangedListener(myTextWatcher);
            editText50.addTextChangedListener(myTextWatcher);
            editText51.addTextChangedListener(myTextWatcher);
            editText52.addTextChangedListener(myTextWatcher);
            editText53.addTextChangedListener(myTextWatcher);

            butnam = itemView.findViewById(R.id.butnam);
            butnam2 = itemView.findViewById(R.id.butnam2);
            xoahet = itemView.findViewById(R.id.xoahet);
            savedata = itemView.findViewById(R.id.savedata);

            loadData();
            updateViews();

            createIntersitialAd();

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
                    editText1.setText("");
                    editText2.setText("");
                    editText3.setText("");
                    editText4.setText("");
                    editText5.setText("");
                    editText7.setText("");
                    editText8.setText("");
                    editText9.setText("");
                    editText10.setText("");
                    editText11.setText("");
                    editText13.setText("");
                    editText14.setText("");
                    editText15.setText("");
                    editText16.setText("");
                    editText17.setText("");
                    editText19.setText("");
                    editText20.setText("");
                    editText21.setText("");
                    editText22.setText("");
                    editText23.setText("");
                    editText25.setText("");
                    editText26.setText("");
                    editText27.setText("");
                    editText28.setText("");
                    editText29.setText("");
                    editText31.setText("");
                    editText32.setText("");
                    editText33.setText("");
                    editText34.setText("");
                    editText35.setText("");
                    editText37.setText("");
                    editText38.setText("");
                    editText39.setText("");
                    editText40.setText("");
                    editText41.setText("");
                    editText43.setText("");
                    editText44.setText("");
                    editText45.setText("");
                    editText46.setText("");
                    editText47.setText("");
                    editText49.setText("");
                    editText50.setText("");
                    editText51.setText("");
                    editText52.setText("");
                    editText53.setText("");
                    saveData();
                }
            }));
            butnam.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (editText1.getText().toString().length() == 0) {
                        editText1.setText("11");
                    }
                    if (editText2.getText().toString().length() == 0) {
                        editText2.setText("11");
                    }
                    if (editText3.getText().toString().length() == 0) {
                        editText3.setText("11");
                    }
                    if (editText4.getText().toString().length() == 0) {
                        editText4.setText("11");
                    }
                    if (editText5.getText().toString().length() == 0) {
                        editText5.setText("11");
                    }
                    if (editText7.getText().toString().length() == 0) {
                        editText7.setText("11");
                    }
                    if (editText8.getText().toString().length() == 0) {
                        editText8.setText("11");
                    }
                    if (editText9.getText().toString().length() == 0) {
                        editText9.setText("11");
                    }
                    if (editText10.getText().toString().length() == 0) {
                        editText10.setText("11");
                    }
                    if (editText11.getText().toString().length() == 0) {
                        editText11.setText("11");
                    }
                    if (editText13.getText().toString().length() == 0) {
                        editText13.setText("11");
                    }
                    if (editText14.getText().toString().length() == 0) {
                        editText14.setText("11");
                    }
                    if (editText15.getText().toString().length() == 0) {
                        editText15.setText("11");
                    }
                    if (editText16.getText().toString().length() == 0) {
                        editText16.setText("11");
                    }
                    if (editText17.getText().toString().length() == 0) {
                        editText17.setText("11");
                    }
                    if (editText19.getText().toString().length() == 0) {
                        editText19.setText("11");
                    }
                    if (editText20.getText().toString().length() == 0) {
                        editText20.setText("11");
                    }
                    if (editText21.getText().toString().length() == 0) {
                        editText21.setText("11");
                    }
                    if (editText22.getText().toString().length() == 0) {
                        editText22.setText("11");
                    }
                    if (editText23.getText().toString().length() == 0) {
                        editText23.setText("11");
                    }
                    if (editText25.getText().toString().length() == 0) {
                        editText25.setText("11");
                    }
                    if (editText26.getText().toString().length() == 0) {
                        editText26.setText("11");
                    }
                    if (editText27.getText().toString().length() == 0) {
                        editText27.setText("11");
                    }
                    if (editText28.getText().toString().length() == 0) {
                        editText28.setText("11");
                    }
                    if (editText29.getText().toString().length() == 0) {
                        editText29.setText("11");
                    }
                    if (editText31.getText().toString().length() == 0) {
                        editText31.setText("11");
                    }
                    if (editText32.getText().toString().length() == 0) {
                        editText32.setText("11");
                    }
                    if (editText33.getText().toString().length() == 0) {
                        editText33.setText("11");
                    }
                    if (editText34.getText().toString().length() == 0) {
                        editText34.setText("11");
                    }
                    if (editText35.getText().toString().length() == 0) {
                        editText35.setText("11");
                    }
                    if (editText37.getText().toString().length() == 0) {
                        editText37.setText("11");
                    }
                    if (editText38.getText().toString().length() == 0) {
                        editText38.setText("11");
                    }
                    if (editText39.getText().toString().length() == 0) {
                        editText39.setText("11");
                    }
                    if (editText40.getText().toString().length() == 0) {
                        editText40.setText("11");
                    }
                    if (editText41.getText().toString().length() == 0) {
                        editText41.setText("11");
                    }
                    if (editText43.getText().toString().length() == 0) {
                        editText43.setText("11");
                    }
                    if (editText44.getText().toString().length() == 0) {
                        editText44.setText("11");
                    }
                    if (editText45.getText().toString().length() == 0) {
                        editText45.setText("11");
                    }
                    if (editText46.getText().toString().length() == 0) {
                        editText46.setText("11");
                    }
                    if (editText47.getText().toString().length() == 0) {
                        editText47.setText("11");
                    }
                    if (editText49.getText().toString().length() == 0) {
                        editText49.setText("11");
                    }
                    if (editText50.getText().toString().length() == 0) {
                        editText50.setText("11");
                    }
                    if (editText51.getText().toString().length() == 0) {
                        editText51.setText("11");
                    }
                    if (editText52.getText().toString().length() == 0) {
                        editText52.setText("11");
                    }
                    if (editText53.getText().toString().length() == 0) {
                        editText53.setText("11");
                    }

                    if (editText1.getText().toString().length() == 1 && editText1.getText().toString().contains(".")) {
                        editText1.setText("12");
                    }
                    if (editText2.getText().toString().length() == 1 && editText2.getText().toString().contains(".")) {
                        editText2.setText("12");
                    }
                    if (editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".")) {
                        editText3.setText("12");
                    }
                    if (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".")) {
                        editText4.setText("12");
                    }
                    if (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".")) {
                        editText5.setText("12");
                    }
                    if (editText7.getText().toString().length() == 1 && editText7.getText().toString().contains(".")) {
                        editText7.setText("12");
                    }
                    if (editText8.getText().toString().length() == 1 && editText8.getText().toString().contains(".")) {
                        editText8.setText("12");
                    }
                    if (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".")) {
                        editText9.setText("12");
                    }
                    if (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".")) {
                        editText10.setText("12");
                    }
                    if (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".")) {
                        editText11.setText("12");
                    }
                    if (editText13.getText().toString().length() == 1 && editText13.getText().toString().contains(".")) {
                        editText13.setText("12");
                    }
                    if (editText14.getText().toString().length() == 1 && editText14.getText().toString().contains(".")) {
                        editText14.setText("12");
                    }
                    if (editText15.getText().toString().length() == 1 && editText15.getText().toString().contains(".")) {
                        editText15.setText("12");
                    }
                    if (editText16.getText().toString().length() == 1 && editText16.getText().toString().contains(".")) {
                        editText16.setText("12");
                    }
                    if (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".")) {
                        editText17.setText("12");
                    }
                    if (editText19.getText().toString().length() == 1 && editText19.getText().toString().contains(".")) {
                        editText19.setText("12");
                    }
                    if (editText20.getText().toString().length() == 1 && editText20.getText().toString().contains(".")) {
                        editText20.setText("12");
                    }
                    if (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".")) {
                        editText21.setText("12");
                    }
                    if (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".")) {
                        editText22.setText("12");
                    }
                    if (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".")) {
                        editText23.setText("12");
                    }
                    if (editText25.getText().toString().length() == 1 && editText25.getText().toString().contains(".")) {
                        editText25.setText("12");
                    }
                    if (editText26.getText().toString().length() == 1 && editText26.getText().toString().contains(".")) {
                        editText26.setText("12");
                    }
                    if (editText27.getText().toString().length() == 1 && editText27.getText().toString().contains(".")) {
                        editText27.setText("12");
                    }
                    if (editText28.getText().toString().length() == 1 && editText28.getText().toString().contains(".")) {
                        editText28.setText("12");
                    }
                    if (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".")) {
                        editText29.setText("12");
                    }
                    if (editText31.getText().toString().length() == 1 && editText31.getText().toString().contains(".")) {
                        editText31.setText("12");
                    }
                    if (editText32.getText().toString().length() == 1 && editText32.getText().toString().contains(".")) {
                        editText32.setText("12");
                    }
                    if (editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".")) {
                        editText33.setText("12");
                    }
                    if (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".")) {
                        editText34.setText("12");
                    }
                    if (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".")) {
                        editText35.setText("12");
                    }
                    if (editText37.getText().toString().length() == 1 && editText37.getText().toString().contains(".")) {
                        editText37.setText("12");
                    }
                    if (editText38.getText().toString().length() == 1 && editText38.getText().toString().contains(".")) {
                        editText38.setText("12");
                    }
                    if (editText39.getText().toString().length() == 1 && editText39.getText().toString().contains(".")) {
                        editText39.setText("12");
                    }
                    if (editText40.getText().toString().length() == 1 && editText40.getText().toString().contains(".")) {
                        editText40.setText("12");
                    }
                    if (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".")) {
                        editText41.setText("12");
                    }
                    if (editText43.getText().toString().length() == 1 && editText43.getText().toString().contains(".")) {
                        editText43.setText("12");
                    }
                    if (editText44.getText().toString().length() == 1 && editText44.getText().toString().contains(".")) {
                        editText44.setText("12");
                    }
                    if (editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".")) {
                        editText45.setText("12");
                    }
                    if (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".")) {
                        editText46.setText("12");
                    }
                    if (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".")) {
                        editText47.setText("12");
                    }
                    if (editText49.getText().toString().length() == 1 && editText49.getText().toString().contains(".")) {
                        editText49.setText("12");
                    }
                    if (editText50.getText().toString().length() == 1 && editText50.getText().toString().contains(".")) {
                        editText50.setText("12");
                    }
                    if (editText51.getText().toString().length() == 1 && editText51.getText().toString().contains(".")) {
                        editText51.setText("12");
                    }
                    if (editText52.getText().toString().length() == 1 && editText52.getText().toString().contains(".")) {
                        editText52.setText("12");
                    }
                    if (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".")) {
                        editText53.setText("12");
                    }

                    float no1 = Float.valueOf(editText1.getText().toString());
                    float no2 = Float.valueOf(editText2.getText().toString());
                    float no3 = Float.valueOf(editText3.getText().toString());
                    float no4 = Float.valueOf(editText4.getText().toString());
                    float no5 = Float.valueOf(editText5.getText().toString());

                    float no7 = Float.valueOf(editText7.getText().toString());
                    float no8 = Float.valueOf(editText8.getText().toString());
                    float no9 = Float.valueOf(editText9.getText().toString());
                    float no10 = Float.valueOf(editText10.getText().toString());
                    float no11 = Float.valueOf(editText11.getText().toString());

                    float no13 = Float.valueOf(editText13.getText().toString());
                    float no14 = Float.valueOf(editText14.getText().toString());
                    float no15 = Float.valueOf(editText15.getText().toString());
                    float no16 = Float.valueOf(editText16.getText().toString());
                    float no17 = Float.valueOf(editText17.getText().toString());

                    float no19 = Float.valueOf(editText19.getText().toString());
                    float no20 = Float.valueOf(editText20.getText().toString());
                    float no21 = Float.valueOf(editText21.getText().toString());
                    float no22 = Float.valueOf(editText22.getText().toString());
                    float no23 = Float.valueOf(editText23.getText().toString());

                    float no25 = Float.valueOf(editText25.getText().toString());
                    float no26 = Float.valueOf(editText26.getText().toString());
                    float no27 = Float.valueOf(editText27.getText().toString());
                    float no28 = Float.valueOf(editText28.getText().toString());
                    float no29 = Float.valueOf(editText29.getText().toString());

                    float no31 = Float.valueOf(editText31.getText().toString());
                    float no32 = Float.valueOf(editText32.getText().toString());
                    float no33 = Float.valueOf(editText33.getText().toString());
                    float no34 = Float.valueOf(editText34.getText().toString());
                    float no35 = Float.valueOf(editText35.getText().toString());

                    float no37 = Float.valueOf(editText37.getText().toString());
                    float no38 = Float.valueOf(editText38.getText().toString());
                    float no39 = Float.valueOf(editText39.getText().toString());
                    float no40 = Float.valueOf(editText40.getText().toString());
                    float no41 = Float.valueOf(editText41.getText().toString());

                    float no43 = Float.valueOf(editText43.getText().toString());
                    float no44 = Float.valueOf(editText44.getText().toString());
                    float no45 = Float.valueOf(editText45.getText().toString());
                    float no46 = Float.valueOf(editText46.getText().toString());
                    float no47 = Float.valueOf(editText47.getText().toString());

                    float no49 = Float.valueOf(editText49.getText().toString());
                    float no50 = Float.valueOf(editText50.getText().toString());
                    float no51 = Float.valueOf(editText51.getText().toString());
                    float no52 = Float.valueOf(editText52.getText().toString());
                    float no53 = Float.valueOf(editText53.getText().toString());


                    if (no1 == 11) {
                        editText1.setText("");
                    }
                    if (no2 == 11) {
                        editText2.setText("");
                    }
                    if (no3 == 11) {
                        editText3.setText("");
                    }
                    if (no4 == 11) {
                        editText4.setText("");
                    }
                    if (no5 == 11) {
                        editText5.setText("");
                    }
                    if (no7 == 11) {
                        editText7.setText("");
                    }
                    if (no8 == 11) {
                        editText8.setText("");
                    }
                    if (no9 == 11) {
                        editText9.setText("");
                    }
                    if (no10 == 11) {
                        editText10.setText("");
                    }
                    if (no11 == 11) {
                        editText11.setText("");
                    }
                    if (no13 == 11) {
                        editText13.setText("");
                    }
                    if (no14 == 11) {
                        editText14.setText("");
                    }
                    if (no15 == 11) {
                        editText15.setText("");
                    }
                    if (no16 == 11) {
                        editText16.setText("");
                    }
                    if (no17 == 11) {
                        editText17.setText("");
                    }
                    if (no19 == 11) {
                        editText19.setText("");
                    }
                    if (no20 == 11) {
                        editText20.setText("");
                    }
                    if (no21 == 11) {
                        editText21.setText("");
                    }
                    if (no22 == 11) {
                        editText22.setText("");
                    }
                    if (no23 == 11) {
                        editText23.setText("");
                    }
                    if (no25 == 11) {
                        editText25.setText("");
                    }
                    if (no26 == 11) {
                        editText26.setText("");
                    }
                    if (no27 == 11) {
                        editText27.setText("");
                    }
                    if (no28 == 11) {
                        editText28.setText("");
                    }
                    if (no29 == 11) {
                        editText29.setText("");
                    }
                    if (no31 == 11) {
                        editText31.setText("");
                    }
                    if (no32 == 11) {
                        editText32.setText("");
                    }
                    if (no33 == 11) {
                        editText33.setText("");
                    }
                    if (no34 == 11) {
                        editText34.setText("");
                    }
                    if (no35 == 11) {
                        editText35.setText("");
                    }
                    if (no37 == 11) {
                        editText37.setText("");
                    }
                    if (no38 == 11) {
                        editText38.setText("");
                    }
                    if (no39 == 11) {
                        editText39.setText("");
                    }
                    if (no40 == 11) {
                        editText40.setText("");
                    }
                    if (no41 == 11) {
                        editText41.setText("");
                    }
                    if (no43 == 11) {
                        editText43.setText("");
                    }
                    if (no44 == 11) {
                        editText44.setText("");
                    }
                    if (no45 == 11) {
                        editText45.setText("");
                    }
                    if (no46 == 11) {
                        editText46.setText("");
                    }
                    if (no47 == 11) {
                        editText47.setText("");
                    }
                    if (no49 == 11) {
                        editText49.setText("");
                    }
                    if (no50 == 11) {
                        editText50.setText("");
                    }
                    if (no51 == 11) {
                        editText51.setText("");
                    }
                    if (no52 == 11) {
                        editText52.setText("");
                    }
                    if (no53 == 11) {
                        editText53.setText("");
                    }

                    if (no1 == 12) {
                        editText1.setText(".");
                    }
                    if (no2 == 12) {
                        editText2.setText(".");
                    }
                    if (no3 == 12) {
                        editText3.setText(".");
                    }
                    if (no4 == 12) {
                        editText4.setText(".");
                    }
                    if (no5 == 12) {
                        editText5.setText(".");
                    }
                    if (no7 == 12) {
                        editText7.setText(".");
                    }
                    if (no8 == 12) {
                        editText8.setText(".");
                    }
                    if (no9 == 12) {
                        editText9.setText(".");
                    }
                    if (no10 == 12) {
                        editText10.setText(".");
                    }
                    if (no11 == 12) {
                        editText11.setText(".");
                    }
                    if (no13 == 12) {
                        editText13.setText(".");
                    }
                    if (no14 == 12) {
                        editText14.setText(".");
                    }
                    if (no15 == 12) {
                        editText15.setText(".");
                    }
                    if (no16 == 12) {
                        editText16.setText(".");
                    }
                    if (no17 == 12) {
                        editText17.setText(".");
                    }
                    if (no19 == 12) {
                        editText19.setText(".");
                    }
                    if (no20 == 12) {
                        editText20.setText(".");
                    }
                    if (no21 == 12) {
                        editText21.setText(".");
                    }
                    if (no22 == 12) {
                        editText22.setText(".");
                    }
                    if (no23 == 12) {
                        editText23.setText(".");
                    }
                    if (no25 == 12) {
                        editText25.setText(".");
                    }
                    if (no26 == 12) {
                        editText26.setText(".");
                    }
                    if (no27 == 12) {
                        editText27.setText(".");
                    }
                    if (no28 == 12) {
                        editText28.setText(".");
                    }
                    if (no29 == 12) {
                        editText29.setText(".");
                    }
                    if (no31 == 12) {
                        editText31.setText(".");
                    }
                    if (no32 == 12) {
                        editText32.setText(".");
                    }
                    if (no33 == 12) {
                        editText33.setText(".");
                    }
                    if (no34 == 12) {
                        editText34.setText(".");
                    }
                    if (no35 == 12) {
                        editText35.setText(".");
                    }
                    if (no37 == 12) {
                        editText37.setText(".");
                    }
                    if (no38 == 12) {
                        editText38.setText(".");
                    }
                    if (no39 == 12) {
                        editText39.setText(".");
                    }
                    if (no40 == 12) {
                        editText40.setText(".");
                    }
                    if (no41 == 12) {
                        editText41.setText(".");
                    }
                    if (no43 == 12) {
                        editText43.setText(".");
                    }
                    if (no44 == 12) {
                        editText44.setText(".");
                    }
                    if (no45 == 12) {
                        editText45.setText(".");
                    }
                    if (no46 == 12) {
                        editText46.setText(".");
                    }
                    if (no47 == 12) {
                        editText47.setText(".");
                    }
                    if (no49 == 12) {
                        editText49.setText(".");
                    }
                    if (no50 == 12) {
                        editText50.setText(".");
                    }
                    if (no51 == 12) {
                        editText51.setText(".");
                    }
                    if (no52 == 12) {
                        editText52.setText(".");
                    }
                    if (no53 == 12) {
                        editText53.setText(".");
                    }

                    float a0t = (no1 + no2 + no3 + no4 + no5) / 5 * 100;
                    int roa0t = Math.round(a0t);
                    Float a0t2 = Float.valueOf(roa0t) / 100;

                    float a0l = (no7 + no8 + no9 + no10 + no11) / 5 * 100;
                    int roa0l = Math.round(a0l);
                    Float a0l2 = Float.valueOf(roa0l) / 100;

                    float a0h = (no13 + no14 + no15 + no16 + no17) / 5 * 100;
                    int roa0h = Math.round(a0h);
                    Float a0h2 = Float.valueOf(roa0h) / 100;

                    float a1a = (no19 + no20 + no21 + no22 + no23) / 5 * 100;
                    int roa1a = Math.round(a1a);
                    Float a1a2 = Float.valueOf(roa1a) / 100;

                    float c0v = (no25 + no26 + no27 + no28 + no29) / 5 * 100;
                    int roc0v = Math.round(c0v);
                    Float c0v2 = Float.valueOf(roc0v) / 100;

                    float b0s = (no31 + no32 + no33 + no34 + no35) / 5 * 100;
                    int rob0s = Math.round(b0s);
                    Float b0s2 = Float.valueOf(rob0s) / 100;

                    float c0su = (no37 + no38 + no39 + no40 + no41) / 5 * 100;
                    int roc0su = Math.round(c0su);
                    Float c0su2 = Float.valueOf(roc0su) / 100;

                    float c0d = (no43 + no44 + no45 + no46 + no47) / 5 * 100;
                    int roc0d = Math.round(c0d);
                    Float c0d2 = Float.valueOf(roc0d) / 100;

                    float c19gd = (no49 + no50 + no51 + no52 + no53) / 5 * 100;
                    int roc19gd = Math.round(c19gd);
                    Float c19gd2 = Float.valueOf(roc19gd) / 100;

                    float a02 = (a0t2 + a0l2 + a0h2) * 100;
                    int a01 = Math.round(a02);
                    Float a0 = Float.valueOf(a01) / 100;

                    float a12 = (a0t2 + a0l2 + a1a2) * 100;
                    int a11 = Math.round(a12);
                    Float a1 = Float.valueOf(a11) / 100;

                    float b02 = (b0s2 + a0t2 + a0h2) * 100;
                    int b01 = Math.round(b02);
                    Float b0 = Float.valueOf(b01) / 100;

                    float c02 = (c0v2 + c0su2 + c0d2) * 100;
                    int c01 = Math.round(c02);
                    Float c0 = Float.valueOf(c01) / 100;

                    float c12 = (a0t2 + a0l2 + c0v2) * 100;
                    int c11 = Math.round(c12);
                    Float c1 = Float.valueOf(c11) / 100;

                    float d12 = (c0v2 + a0t2 + a1a2) * 100;
                    int d11 = Math.round(d12);
                    Float d1 = Float.valueOf(d11) / 100;

                    float d72 = (a0h2 + a0t2 + a1a2) * 100;
                    int d71 = Math.round(d72);
                    Float d7 = Float.valueOf(d71) / 100;

                    float d142 = (c0v2 + c0su2 + a1a2) * 100;
                    int d141 = Math.round(d142);
                    Float d14 = Float.valueOf(d141) / 100;

                    float d152 = (c0v2 + c0d2 + a1a2) * 100;
                    int d151 = Math.round(d152);
                    Float d15 = Float.valueOf(d151) / 100;

                    float b82 = (b0s2 + a0t2 + a1a2) * 100;
                    int b81  =Math.round(b82);
                    Float b8 = Float.valueOf(b81) / 100;

                    float c192 = (c0v2 + c0su2 + c19gd2) * 100;
                    int c191 = Math.round(c192);
                    Float c19 = Float.valueOf(c191) / 100;

                    if (((editText1.getText().toString().length() == 1 && editText1.getText().toString().contains(".") || editText1.getText().toString().length() == 0 || no1 > 10) || (editText2.getText().toString().length() == 1 && editText2.getText().toString().contains(".") || editText2.getText().toString().length() == 0 || no2 > 10)
                            || (editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".") || editText3.getText().toString().length() == 0 || no3 > 10) || (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".") || editText4.getText().toString().length() == 0 || no4 > 10)
                            || (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() == 0 || no5 > 10))
                            && (editText1.getText().toString().length() > 0 || editText2.getText().toString().length() > 0 || editText3.getText().toString().length() > 0 || editText4.getText().toString().length() > 0 || editText5.getText().toString().length() > 0)) {
                        if (editText1.getText().toString().length() == 1 && editText1.getText().toString().contains(".") || editText1.getText().toString().length() == 0 || no1 > 10) {
                            editText1.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText2.getText().toString().length() == 1 && editText2.getText().toString().contains(".") || editText2.getText().toString().length() == 0 || no2 > 10) {
                            editText2.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".") || editText3.getText().toString().length() == 0 || no3 > 10) {
                            editText3.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".") || editText4.getText().toString().length() == 0 || no4 > 10) {
                            editText4.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() == 0 || no5 > 10) {
                            editText5.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText7.getText().toString().length() == 1 && editText7.getText().toString().contains(".") || editText7.getText().toString().length() == 0 || no7 > 10) || (editText8.getText().toString().length() == 1 && editText8.getText().toString().contains(".") || editText8.getText().toString().length() == 0 || no8 > 10)
                            || (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".") || editText9.getText().toString().length() == 0 || no9 > 10) || (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".") || editText10.getText().toString().length() == 0 || no10 > 10)
                            || (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".") || editText11.getText().toString().length() == 0 || no11 > 10))
                            && (editText7.getText().toString().length() > 0 || editText8.getText().toString().length() > 0 || editText9.getText().toString().length() > 0 || editText10.getText().toString().length() > 0 || editText11.getText().toString().length() > 0)) {
                        if (editText7.getText().toString().length() == 1 && editText7.getText().toString().contains(".") || editText7.getText().toString().length() == 0 || no7 > 10) {
                            editText7.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText8.getText().toString().length() == 1 && editText8.getText().toString().contains(".") || editText8.getText().toString().length() == 0 || no8 > 10) {
                            editText8.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".") || editText9.getText().toString().length() == 0 || no9 > 10) {
                            editText9.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".") || editText10.getText().toString().length() == 0 || no10 > 10) {
                            editText10.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".") || editText11.getText().toString().length() == 0 || no11 > 10) {
                            editText11.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText13.getText().toString().length() == 1 && editText13.getText().toString().contains(".") || editText13.getText().toString().length() == 0 || no13 > 10) || (editText14.getText().toString().length() == 1 && editText14.getText().toString().contains(".") || editText14.getText().toString().length() == 0 || no14 > 10)
                            || (editText15.getText().toString().length() == 1 && editText15.getText().toString().contains(".") || editText15.getText().toString().length() == 0 || no15 > 10) || (editText16.getText().toString().length() == 1 && editText16.getText().toString().contains(".") || editText16.getText().toString().length() == 0 || no16 > 10)
                            || (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".") || editText17.getText().toString().length() == 0 || no17 > 10))
                            && (editText13.getText().toString().length() > 0 || editText14.getText().toString().length() > 0 || editText15.getText().toString().length() > 0 || editText16.getText().toString().length() > 0 || editText17.getText().toString().length() > 0)) {
                        if (editText13.getText().toString().length() == 1 && editText13.getText().toString().contains(".") || editText13.getText().toString().length() == 0 || no13 > 10) {
                            editText13.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText14.getText().toString().length() == 1 && editText14.getText().toString().contains(".") || editText14.getText().toString().length() == 0 || no14 > 10) {
                            editText14.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText15.getText().toString().length() == 1 && editText15.getText().toString().contains(".") || editText15.getText().toString().length() == 0 || no15 > 10) {
                            editText15.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText16.getText().toString().length() == 1 && editText16.getText().toString().contains(".") || editText16.getText().toString().length() == 0 || no16 > 10) {
                            editText16.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".") || editText17.getText().toString().length() == 0 || no17 > 10) {
                            editText17.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText19.getText().toString().length() == 1 && editText19.getText().toString().contains(".") || editText19.getText().toString().length() == 0 || no19 > 10) || (editText20.getText().toString().length() == 1 && editText20.getText().toString().contains(".") || editText20.getText().toString().length() == 0 || no20 > 10)
                            || (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".") || editText21.getText().toString().length() == 0 || no21 > 10) || (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".") || editText22.getText().toString().length() == 0 || no22 > 10)
                            || (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".") || editText23.getText().toString().length() == 0 || no23 > 10))
                            && (editText19.getText().toString().length() > 0 || editText20.getText().toString().length() > 0 || editText21.getText().toString().length() > 0 || editText22.getText().toString().length() > 0 || editText23.getText().toString().length() > 0)) {
                        if (editText19.getText().toString().length() == 1 && editText19.getText().toString().contains(".") || editText19.getText().toString().length() == 0 || no19 > 10) {
                            editText19.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText20.getText().toString().length() == 1 && editText20.getText().toString().contains(".") || editText20.getText().toString().length() == 0 || no20 > 10) {
                            editText20.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".") || editText21.getText().toString().length() == 0 || no21 > 10) {
                            editText21.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".") || editText22.getText().toString().length() == 0 || no22 > 10) {
                            editText22.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".") || editText23.getText().toString().length() == 0 || no23 > 10) {
                            editText23.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText25.getText().toString().length() == 1 && editText25.getText().toString().contains(".") || editText25.getText().toString().length() == 0 || no25 > 10) || (editText26.getText().toString().length() == 1 && editText26.getText().toString().contains(".") || editText26.getText().toString().length() == 0 || no26 > 10)
                            || (editText27.getText().toString().length() == 1 && editText27.getText().toString().contains(".") || editText27.getText().toString().length() == 0 || no27 > 10) || (editText28.getText().toString().length() == 1 && editText28.getText().toString().contains(".") || editText28.getText().toString().length() == 0 || no28 > 10)
                            || (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".") || editText29.getText().toString().length() == 0 || no29 > 10))
                            && (editText25.getText().toString().length() > 0 || editText26.getText().toString().length() > 0 || editText27.getText().toString().length() > 0 || editText28.getText().toString().length() > 0 || editText29.getText().toString().length() > 0)) {
                        if (editText25.getText().toString().length() == 1 && editText25.getText().toString().contains(".") || editText25.getText().toString().length() == 0 || no25 > 10) {
                            editText25.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText26.getText().toString().length() == 1 && editText26.getText().toString().contains(".") || editText26.getText().toString().length() == 0 || no26 > 10) {
                            editText26.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText27.getText().toString().length() == 1 && editText27.getText().toString().contains(".") || editText27.getText().toString().length() == 0 || no27 > 10) {
                            editText27.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText28.getText().toString().length() == 1 && editText28.getText().toString().contains(".") || editText28.getText().toString().length() == 0 || no28 > 10) {
                            editText28.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".") || editText29.getText().toString().length() == 0 || no29 > 10) {
                            editText29.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText31.getText().toString().length() == 1 && editText31.getText().toString().contains(".") || editText31.getText().toString().length() == 0 || no31 > 10) || (editText32.getText().toString().length() == 1 && editText32.getText().toString().contains(".") || editText32.getText().toString().length() == 0 || no32 > 10)
                            || (editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".") || editText33.getText().toString().length() == 0 || no33 > 10) || (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".") || editText34.getText().toString().length() == 0 || no34 > 10)
                            || (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".") || editText35.getText().toString().length() == 0 || no35 > 10))
                            && (editText31.getText().toString().length() > 0 || editText32.getText().toString().length() > 0 || editText33.getText().toString().length() > 0 || editText34.getText().toString().length() > 0 || editText35.getText().toString().length() > 0)) {
                        if (editText31.getText().toString().length() == 1 && editText31.getText().toString().contains(".") || editText31.getText().toString().length() == 0 || no31 > 10) {
                            editText31.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText32.getText().toString().length() == 1 && editText32.getText().toString().contains(".") || editText32.getText().toString().length() == 0 || no32 > 10) {
                            editText32.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".") || editText33.getText().toString().length() == 0 || no33 > 10) {
                            editText33.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".") || editText34.getText().toString().length() == 0 || no34 > 10) {
                            editText34.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".") || editText35.getText().toString().length() == 0 || no35 > 10) {
                            editText35.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText37.getText().toString().length() == 1 && editText37.getText().toString().contains(".") || editText37.getText().toString().length() == 0 || no37 > 10) || (editText38.getText().toString().length() == 1 && editText38.getText().toString().contains(".") || editText38.getText().toString().length() == 0 || no38 > 10)
                            || (editText39.getText().toString().length() == 1 && editText39.getText().toString().contains(".") || editText39.getText().toString().length() == 0 || no39 > 10) || (editText40.getText().toString().length() == 1 && editText40.getText().toString().contains(".") || editText40.getText().toString().length() == 0 || no40 > 10)
                            || (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".") || editText41.getText().toString().length() == 0 || no41 > 10))
                            && (editText37.getText().toString().length() > 0 || editText38.getText().toString().length() > 0 || editText39.getText().toString().length() > 0 || editText40.getText().toString().length() > 0 || editText41.getText().toString().length() > 0)) {
                        if (editText37.getText().toString().length() == 1 && editText37.getText().toString().contains(".") || editText37.getText().toString().length() == 0 || no37 > 10) {
                            editText37.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText38.getText().toString().length() == 1 && editText38.getText().toString().contains(".") || editText38.getText().toString().length() == 0 || no38 > 10) {
                            editText38.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText39.getText().toString().length() == 1 && editText39.getText().toString().contains(".") || editText39.getText().toString().length() == 0 || no39 > 10) {
                            editText39.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText40.getText().toString().length() == 1 && editText40.getText().toString().contains(".") || editText40.getText().toString().length() == 0 || no40 > 10) {
                            editText40.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".") || editText41.getText().toString().length() == 0 || no41 > 10) {
                            editText41.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText43.getText().toString().length() == 1 && editText43.getText().toString().contains(".") || editText43.getText().toString().length() == 0 || no43 > 10) || (editText44.getText().toString().length() == 1 && editText44.getText().toString().contains(".") || editText44.getText().toString().length() == 0 || no44 > 10)
                            || (editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".") || editText45.getText().toString().length() == 0 || no45 > 10) || (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".") || editText46.getText().toString().length() == 0 || no46 > 10)
                            || (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".") || editText47.getText().toString().length() == 0 || no47 > 10))
                            && (editText43.getText().toString().length() > 0 || editText44.getText().toString().length() > 0 || editText45.getText().toString().length() > 0 || editText46.getText().toString().length() > 0 || editText47.getText().toString().length() > 0)) {
                        if (editText43.getText().toString().length() == 1 && editText43.getText().toString().contains(".") || editText43.getText().toString().length() == 0 || no43 > 10) {
                            editText43.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText44.getText().toString().length() == 1 && editText44.getText().toString().contains(".") || editText44.getText().toString().length() == 0 || no44 > 10) {
                            editText44.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".") || editText45.getText().toString().length() == 0 || no45 > 10) {
                            editText45.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".") || editText46.getText().toString().length() == 0 || no46 > 10) {
                            editText46.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".") || editText47.getText().toString().length() == 0 || no47 > 10) {
                            editText47.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText49.getText().toString().length() == 1 && editText49.getText().toString().contains(".") || editText49.getText().toString().length() == 0 || no49 > 10) || (editText50.getText().toString().length() == 1 && editText50.getText().toString().contains(".") || editText50.getText().toString().length() == 0 || no50 > 10)
                            || (editText51.getText().toString().length() == 1 && editText51.getText().toString().contains(".") || editText51.getText().toString().length() == 0 || no51 > 10) || (editText52.getText().toString().length() == 1 && editText52.getText().toString().contains(".") || editText52.getText().toString().length() == 0 || no52 > 10)
                            || (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".") || editText53.getText().toString().length() == 0 || no53 > 10))
                            && (editText49.getText().toString().length() > 0 || editText50.getText().toString().length() > 0 || editText51.getText().toString().length() > 0 || editText52.getText().toString().length() > 0 || editText53.getText().toString().length() > 0)) {
                        if (editText49.getText().toString().length() == 1 && editText49.getText().toString().contains(".") || editText49.getText().toString().length() == 0 || no49 > 10) {
                            editText49.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText50.getText().toString().length() == 1 && editText50.getText().toString().contains(".") || editText50.getText().toString().length() == 0 || no50 > 10) {
                            editText50.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText51.getText().toString().length() == 1 && editText51.getText().toString().contains(".") || editText51.getText().toString().length() == 0 || no51 > 10) {
                            editText51.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText52.getText().toString().length() == 1 && editText52.getText().toString().contains(".") || editText52.getText().toString().length() == 0 || no52 > 10) {
                            editText52.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".") || editText53.getText().toString().length() == 0 || no53 > 10) {
                            editText53.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText1.getText().toString().length() == 0 && editText2.getText().toString().length() == 0 && editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0 && editText5.getText().toString().length() == 0) || (no1 <= 10 && no2 <= 10 && no3 <= 10 && no4 <= 10 && no5 <= 10))
                            && ((editText7.getText().toString().length() == 0 && editText8.getText().toString().length() == 0 && editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0 && editText11.getText().toString().length() == 0) || (no7 <= 10 && no8 <= 10 && no9 <= 10 && no10 <= 10 && no11 <= 10))
                            && ((editText13.getText().toString().length() == 0 && editText14.getText().toString().length() == 0 && editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0 && editText17.getText().toString().length() == 0) || (no13 <= 10 && no14 <= 10 && no15 <= 10 && no16 <= 10 && no17 <= 10))
                            && ((editText19.getText().toString().length() == 0 && editText20.getText().toString().length() == 0 && editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0 && editText23.getText().toString().length() == 0) || (no19 <= 10 && no20 <= 10 && no21 <= 10 && no22 <= 10 && no23 <= 10))
                            && ((editText25.getText().toString().length() == 0 && editText26.getText().toString().length() == 0 && editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0 && editText29.getText().toString().length() == 0) || (no25 <= 10 && no26 <= 10 && no27 <= 10 && no28 <= 10 && no29 <= 10))
                            && ((editText31.getText().toString().length() == 0 && editText32.getText().toString().length() == 0 && editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0 && editText35.getText().toString().length() == 0) || (no31 <= 10 && no32 <= 10 && no33 <= 10 && no34 <= 10 && no35 <= 10))
                            && ((editText37.getText().toString().length() == 0 && editText38.getText().toString().length() == 0 && editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0 && editText41.getText().toString().length() == 0) || (no37 <= 10 && no38 <= 10 && no39 <= 10 && no40 <= 10 && no41 <= 10))
                            && ((editText43.getText().toString().length() == 0 && editText44.getText().toString().length() == 0 && editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0 && editText47.getText().toString().length() == 0) || (no43 <= 10 && no44 <= 10 && no45 <= 10 && no46 <= 10 && no47 <= 10))
                            && ((editText49.getText().toString().length() == 0 && editText50.getText().toString().length() == 0 && editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0 && editText53.getText().toString().length() == 0) || (no49 <= 10 && no50 <= 10 && no51 <= 10 && no52 <= 10 && no53 <= 10))

                    ) {
                        if (mInterstitialAd != null) mInterstitialAd.show((Activity) context);
                        else {
                            Intent intent = new Intent(v.getContext(), ketqua.class);
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

                            intent.putExtra("no1", no1);
                            intent.putExtra("no2", no2);
                            intent.putExtra("no3", no3);
                            intent.putExtra("no4", no4);
                            intent.putExtra("no5", no5);

                            intent.putExtra("no7", no7);
                            intent.putExtra("no8", no8);
                            intent.putExtra("no9", no9);
                            intent.putExtra("no10", no10);
                            intent.putExtra("no11", no11);

                            intent.putExtra("no13", no13);
                            intent.putExtra("no14", no14);
                            intent.putExtra("no15", no15);
                            intent.putExtra("no16", no16);
                            intent.putExtra("no17", no17);

                            intent.putExtra("no19", no19);
                            intent.putExtra("no20", no20);
                            intent.putExtra("no21", no21);
                            intent.putExtra("no22", no22);
                            intent.putExtra("no23", no23);

                            intent.putExtra("no25", no25);
                            intent.putExtra("no26", no26);
                            intent.putExtra("no27", no27);
                            intent.putExtra("no28", no28);
                            intent.putExtra("no29", no29);

                            intent.putExtra("no31", no31);
                            intent.putExtra("no32", no32);
                            intent.putExtra("no33", no33);
                            intent.putExtra("no34", no34);
                            intent.putExtra("no35", no35);

                            intent.putExtra("no37", no37);
                            intent.putExtra("no38", no38);
                            intent.putExtra("no39", no39);
                            intent.putExtra("no40", no40);
                            intent.putExtra("no41", no41);

                            intent.putExtra("no43", no43);
                            intent.putExtra("no44", no44);
                            intent.putExtra("no45", no45);
                            intent.putExtra("no46", no46);
                            intent.putExtra("no47", no47);

                            intent.putExtra("no49", no49);
                            intent.putExtra("no50", no50);
                            intent.putExtra("no51", no51);
                            intent.putExtra("no52", no52);
                            intent.putExtra("no53", no53);

                            v.getContext().startActivity(intent);
                        }
                    }
                }
            });
            butnam2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //n=2;
                    if (editText1.getText().toString().length() == 0) {
                        editText1.setText("11");
                    }
                    if (editText2.getText().toString().length() == 0) {
                        editText2.setText("11");
                    }
                    if (editText3.getText().toString().length() == 0) {
                        editText3.setText("11");
                    }
                    if (editText4.getText().toString().length() == 0) {
                        editText4.setText("11");
                    }
                    if (editText5.getText().toString().length() == 0) {
                        editText5.setText("11");
                    }
                    if (editText7.getText().toString().length() == 0) {
                        editText7.setText("11");
                    }
                    if (editText8.getText().toString().length() == 0) {
                        editText8.setText("11");
                    }
                    if (editText9.getText().toString().length() == 0) {
                        editText9.setText("11");
                    }
                    if (editText10.getText().toString().length() == 0) {
                        editText10.setText("11");
                    }
                    if (editText11.getText().toString().length() == 0) {
                        editText11.setText("11");
                    }
                    if (editText13.getText().toString().length() == 0) {
                        editText13.setText("11");
                    }
                    if (editText14.getText().toString().length() == 0) {
                        editText14.setText("11");
                    }
                    if (editText15.getText().toString().length() == 0) {
                        editText15.setText("11");
                    }
                    if (editText16.getText().toString().length() == 0) {
                        editText16.setText("11");
                    }
                    if (editText17.getText().toString().length() == 0) {
                        editText17.setText("11");
                    }
                    if (editText19.getText().toString().length() == 0) {
                        editText19.setText("11");
                    }
                    if (editText20.getText().toString().length() == 0) {
                        editText20.setText("11");
                    }
                    if (editText21.getText().toString().length() == 0) {
                        editText21.setText("11");
                    }
                    if (editText22.getText().toString().length() == 0) {
                        editText22.setText("11");
                    }
                    if (editText23.getText().toString().length() == 0) {
                        editText23.setText("11");
                    }
                    if (editText25.getText().toString().length() == 0) {
                        editText25.setText("11");
                    }
                    if (editText26.getText().toString().length() == 0) {
                        editText26.setText("11");
                    }
                    if (editText27.getText().toString().length() == 0) {
                        editText27.setText("11");
                    }
                    if (editText28.getText().toString().length() == 0) {
                        editText28.setText("11");
                    }
                    if (editText29.getText().toString().length() == 0) {
                        editText29.setText("11");
                    }
                    if (editText31.getText().toString().length() == 0) {
                        editText31.setText("11");
                    }
                    if (editText32.getText().toString().length() == 0) {
                        editText32.setText("11");
                    }
                    if (editText33.getText().toString().length() == 0) {
                        editText33.setText("11");
                    }
                    if (editText34.getText().toString().length() == 0) {
                        editText34.setText("11");
                    }
                    if (editText35.getText().toString().length() == 0) {
                        editText35.setText("11");
                    }
                    if (editText37.getText().toString().length() == 0) {
                        editText37.setText("11");
                    }
                    if (editText38.getText().toString().length() == 0) {
                        editText38.setText("11");
                    }
                    if (editText39.getText().toString().length() == 0) {
                        editText39.setText("11");
                    }
                    if (editText40.getText().toString().length() == 0) {
                        editText40.setText("11");
                    }
                    if (editText41.getText().toString().length() == 0) {
                        editText41.setText("11");
                    }
                    if (editText43.getText().toString().length() == 0) {
                        editText43.setText("11");
                    }
                    if (editText44.getText().toString().length() == 0) {
                        editText44.setText("11");
                    }
                    if (editText45.getText().toString().length() == 0) {
                        editText45.setText("11");
                    }
                    if (editText46.getText().toString().length() == 0) {
                        editText46.setText("11");
                    }
                    if (editText47.getText().toString().length() == 0) {
                        editText47.setText("11");
                    }
                    if (editText49.getText().toString().length() == 0) {
                        editText49.setText("11");
                    }
                    if (editText50.getText().toString().length() == 0) {
                        editText50.setText("11");
                    }
                    if (editText51.getText().toString().length() == 0) {
                        editText51.setText("11");
                    }
                    if (editText52.getText().toString().length() == 0) {
                        editText52.setText("11");
                    }
                    if (editText53.getText().toString().length() == 0) {
                        editText53.setText("11");
                    }

                    if (editText1.getText().toString().length() == 1 && editText1.getText().toString().contains(".")) {
                        editText1.setText("12");
                    }
                    if (editText2.getText().toString().length() == 1 && editText2.getText().toString().contains(".")) {
                        editText2.setText("12");
                    }
                    if (editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".")) {
                        editText3.setText("12");
                    }
                    if (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".")) {
                        editText4.setText("12");
                    }
                    if (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".")) {
                        editText5.setText("12");
                    }
                    if (editText7.getText().toString().length() == 1 && editText7.getText().toString().contains(".")) {
                        editText7.setText("12");
                    }
                    if (editText8.getText().toString().length() == 1 && editText8.getText().toString().contains(".")) {
                        editText8.setText("12");
                    }
                    if (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".")) {
                        editText9.setText("12");
                    }
                    if (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".")) {
                        editText10.setText("12");
                    }
                    if (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".")) {
                        editText11.setText("12");
                    }
                    if (editText13.getText().toString().length() == 1 && editText13.getText().toString().contains(".")) {
                        editText13.setText("12");
                    }
                    if (editText14.getText().toString().length() == 1 && editText14.getText().toString().contains(".")) {
                        editText14.setText("12");
                    }
                    if (editText15.getText().toString().length() == 1 && editText15.getText().toString().contains(".")) {
                        editText15.setText("12");
                    }
                    if (editText16.getText().toString().length() == 1 && editText16.getText().toString().contains(".")) {
                        editText16.setText("12");
                    }
                    if (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".")) {
                        editText17.setText("12");
                    }
                    if (editText19.getText().toString().length() == 1 && editText19.getText().toString().contains(".")) {
                        editText19.setText("12");
                    }
                    if (editText20.getText().toString().length() == 1 && editText20.getText().toString().contains(".")) {
                        editText20.setText("12");
                    }
                    if (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".")) {
                        editText21.setText("12");
                    }
                    if (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".")) {
                        editText22.setText("12");
                    }
                    if (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".")) {
                        editText23.setText("12");
                    }
                    if (editText25.getText().toString().length() == 1 && editText25.getText().toString().contains(".")) {
                        editText25.setText("12");
                    }
                    if (editText26.getText().toString().length() == 1 && editText26.getText().toString().contains(".")) {
                        editText26.setText("12");
                    }
                    if (editText27.getText().toString().length() == 1 && editText27.getText().toString().contains(".")) {
                        editText27.setText("12");
                    }
                    if (editText28.getText().toString().length() == 1 && editText28.getText().toString().contains(".")) {
                        editText28.setText("12");
                    }
                    if (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".")) {
                        editText29.setText("12");
                    }
                    if (editText31.getText().toString().length() == 1 && editText31.getText().toString().contains(".")) {
                        editText31.setText("12");
                    }
                    if (editText32.getText().toString().length() == 1 && editText32.getText().toString().contains(".")) {
                        editText32.setText("12");
                    }
                    if (editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".")) {
                        editText33.setText("12");
                    }
                    if (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".")) {
                        editText34.setText("12");
                    }
                    if (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".")) {
                        editText35.setText("12");
                    }
                    if (editText37.getText().toString().length() == 1 && editText37.getText().toString().contains(".")) {
                        editText37.setText("12");
                    }
                    if (editText38.getText().toString().length() == 1 && editText38.getText().toString().contains(".")) {
                        editText38.setText("12");
                    }
                    if (editText39.getText().toString().length() == 1 && editText39.getText().toString().contains(".")) {
                        editText39.setText("12");
                    }
                    if (editText40.getText().toString().length() == 1 && editText40.getText().toString().contains(".")) {
                        editText40.setText("12");
                    }
                    if (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".")) {
                        editText41.setText("12");
                    }
                    if (editText43.getText().toString().length() == 1 && editText43.getText().toString().contains(".")) {
                        editText43.setText("12");
                    }
                    if (editText44.getText().toString().length() == 1 && editText44.getText().toString().contains(".")) {
                        editText44.setText("12");
                    }
                    if (editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".")) {
                        editText45.setText("12");
                    }
                    if (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".")) {
                        editText46.setText("12");
                    }
                    if (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".")) {
                        editText47.setText("12");
                    }
                    if (editText49.getText().toString().length() == 1 && editText49.getText().toString().contains(".")) {
                        editText49.setText("12");
                    }
                    if (editText50.getText().toString().length() == 1 && editText50.getText().toString().contains(".")) {
                        editText50.setText("12");
                    }
                    if (editText51.getText().toString().length() == 1 && editText51.getText().toString().contains(".")) {
                        editText51.setText("12");
                    }
                    if (editText52.getText().toString().length() == 1 && editText52.getText().toString().contains(".")) {
                        editText52.setText("12");
                    }
                    if (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".")) {
                        editText53.setText("12");
                    }

                    float no1 = Float.valueOf(editText1.getText().toString());
                    float no2 = Float.valueOf(editText2.getText().toString());
                    float no3 = Float.valueOf(editText3.getText().toString());
                    float no4 = Float.valueOf(editText4.getText().toString());
                    float no5 = Float.valueOf(editText5.getText().toString());

                    float no7 = Float.valueOf(editText7.getText().toString());
                    float no8 = Float.valueOf(editText8.getText().toString());
                    float no9 = Float.valueOf(editText9.getText().toString());
                    float no10 = Float.valueOf(editText10.getText().toString());
                    float no11 = Float.valueOf(editText11.getText().toString());

                    float no13 = Float.valueOf(editText13.getText().toString());
                    float no14 = Float.valueOf(editText14.getText().toString());
                    float no15 = Float.valueOf(editText15.getText().toString());
                    float no16 = Float.valueOf(editText16.getText().toString());
                    float no17 = Float.valueOf(editText17.getText().toString());

                    float no19 = Float.valueOf(editText19.getText().toString());
                    float no20 = Float.valueOf(editText20.getText().toString());
                    float no21 = Float.valueOf(editText21.getText().toString());
                    float no22 = Float.valueOf(editText22.getText().toString());
                    float no23 = Float.valueOf(editText23.getText().toString());

                    float no25 = Float.valueOf(editText25.getText().toString());
                    float no26 = Float.valueOf(editText26.getText().toString());
                    float no27 = Float.valueOf(editText27.getText().toString());
                    float no28 = Float.valueOf(editText28.getText().toString());
                    float no29 = Float.valueOf(editText29.getText().toString());

                    float no31 = Float.valueOf(editText31.getText().toString());
                    float no32 = Float.valueOf(editText32.getText().toString());
                    float no33 = Float.valueOf(editText33.getText().toString());
                    float no34 = Float.valueOf(editText34.getText().toString());
                    float no35 = Float.valueOf(editText35.getText().toString());

                    float no37 = Float.valueOf(editText37.getText().toString());
                    float no38 = Float.valueOf(editText38.getText().toString());
                    float no39 = Float.valueOf(editText39.getText().toString());
                    float no40 = Float.valueOf(editText40.getText().toString());
                    float no41 = Float.valueOf(editText41.getText().toString());

                    float no43 = Float.valueOf(editText43.getText().toString());
                    float no44 = Float.valueOf(editText44.getText().toString());
                    float no45 = Float.valueOf(editText45.getText().toString());
                    float no46 = Float.valueOf(editText46.getText().toString());
                    float no47 = Float.valueOf(editText47.getText().toString());

                    float no49 = Float.valueOf(editText49.getText().toString());
                    float no50 = Float.valueOf(editText50.getText().toString());
                    float no51 = Float.valueOf(editText51.getText().toString());
                    float no52 = Float.valueOf(editText52.getText().toString());
                    float no53 = Float.valueOf(editText53.getText().toString());


                    if (no1 == 11) {
                        editText1.setText("");
                    }
                    if (no2 == 11) {
                        editText2.setText("");
                    }
                    if (no3 == 11) {
                        editText3.setText("");
                    }
                    if (no4 == 11) {
                        editText4.setText("");
                    }
                    if (no5 == 11) {
                        editText5.setText("");
                    }
                    if (no7 == 11) {
                        editText7.setText("");
                    }
                    if (no8 == 11) {
                        editText8.setText("");
                    }
                    if (no9 == 11) {
                        editText9.setText("");
                    }
                    if (no10 == 11) {
                        editText10.setText("");
                    }
                    if (no11 == 11) {
                        editText11.setText("");
                    }
                    if (no13 == 11) {
                        editText13.setText("");
                    }
                    if (no14 == 11) {
                        editText14.setText("");
                    }
                    if (no15 == 11) {
                        editText15.setText("");
                    }
                    if (no16 == 11) {
                        editText16.setText("");
                    }
                    if (no17 == 11) {
                        editText17.setText("");
                    }
                    if (no19 == 11) {
                        editText19.setText("");
                    }
                    if (no20 == 11) {
                        editText20.setText("");
                    }
                    if (no21 == 11) {
                        editText21.setText("");
                    }
                    if (no22 == 11) {
                        editText22.setText("");
                    }
                    if (no23 == 11) {
                        editText23.setText("");
                    }
                    if (no25 == 11) {
                        editText25.setText("");
                    }
                    if (no26 == 11) {
                        editText26.setText("");
                    }
                    if (no27 == 11) {
                        editText27.setText("");
                    }
                    if (no28 == 11) {
                        editText28.setText("");
                    }
                    if (no29 == 11) {
                        editText29.setText("");
                    }
                    if (no31 == 11) {
                        editText31.setText("");
                    }
                    if (no32 == 11) {
                        editText32.setText("");
                    }
                    if (no33 == 11) {
                        editText33.setText("");
                    }
                    if (no34 == 11) {
                        editText34.setText("");
                    }
                    if (no35 == 11) {
                        editText35.setText("");
                    }
                    if (no37 == 11) {
                        editText37.setText("");
                    }
                    if (no38 == 11) {
                        editText38.setText("");
                    }
                    if (no39 == 11) {
                        editText39.setText("");
                    }
                    if (no40 == 11) {
                        editText40.setText("");
                    }
                    if (no41 == 11) {
                        editText41.setText("");
                    }
                    if (no43 == 11) {
                        editText43.setText("");
                    }
                    if (no44 == 11) {
                        editText44.setText("");
                    }
                    if (no45 == 11) {
                        editText45.setText("");
                    }
                    if (no46 == 11) {
                        editText46.setText("");
                    }
                    if (no47 == 11) {
                        editText47.setText("");
                    }
                    if (no49 == 11) {
                        editText49.setText("");
                    }
                    if (no50 == 11) {
                        editText50.setText("");
                    }
                    if (no51 == 11) {
                        editText51.setText("");
                    }
                    if (no52 == 11) {
                        editText52.setText("");
                    }
                    if (no53 == 11) {
                        editText53.setText("");
                    }

                    if (no1 == 12) {
                        editText1.setText(".");
                    }
                    if (no2 == 12) {
                        editText2.setText(".");
                    }
                    if (no3 == 12) {
                        editText3.setText(".");
                    }
                    if (no4 == 12) {
                        editText4.setText(".");
                    }
                    if (no5 == 12) {
                        editText5.setText(".");
                    }
                    if (no7 == 12) {
                        editText7.setText(".");
                    }
                    if (no8 == 12) {
                        editText8.setText(".");
                    }
                    if (no9 == 12) {
                        editText9.setText(".");
                    }
                    if (no10 == 12) {
                        editText10.setText(".");
                    }
                    if (no11 == 12) {
                        editText11.setText(".");
                    }
                    if (no13 == 12) {
                        editText13.setText(".");
                    }
                    if (no14 == 12) {
                        editText14.setText(".");
                    }
                    if (no15 == 12) {
                        editText15.setText(".");
                    }
                    if (no16 == 12) {
                        editText16.setText(".");
                    }
                    if (no17 == 12) {
                        editText17.setText(".");
                    }
                    if (no19 == 12) {
                        editText19.setText(".");
                    }
                    if (no20 == 12) {
                        editText20.setText(".");
                    }
                    if (no21 == 12) {
                        editText21.setText(".");
                    }
                    if (no22 == 12) {
                        editText22.setText(".");
                    }
                    if (no23 == 12) {
                        editText23.setText(".");
                    }
                    if (no25 == 12) {
                        editText25.setText(".");
                    }
                    if (no26 == 12) {
                        editText26.setText(".");
                    }
                    if (no27 == 12) {
                        editText27.setText(".");
                    }
                    if (no28 == 12) {
                        editText28.setText(".");
                    }
                    if (no29 == 12) {
                        editText29.setText(".");
                    }
                    if (no31 == 12) {
                        editText31.setText(".");
                    }
                    if (no32 == 12) {
                        editText32.setText(".");
                    }
                    if (no33 == 12) {
                        editText33.setText(".");
                    }
                    if (no34 == 12) {
                        editText34.setText(".");
                    }
                    if (no35 == 12) {
                        editText35.setText(".");
                    }
                    if (no37 == 12) {
                        editText37.setText(".");
                    }
                    if (no38 == 12) {
                        editText38.setText(".");
                    }
                    if (no39 == 12) {
                        editText39.setText(".");
                    }
                    if (no40 == 12) {
                        editText40.setText(".");
                    }
                    if (no41 == 12) {
                        editText41.setText(".");
                    }
                    if (no43 == 12) {
                        editText43.setText(".");
                    }
                    if (no44 == 12) {
                        editText44.setText(".");
                    }
                    if (no45 == 12) {
                        editText45.setText(".");
                    }
                    if (no46 == 12) {
                        editText46.setText(".");
                    }
                    if (no47 == 12) {
                        editText47.setText(".");
                    }
                    if (no49 == 12) {
                        editText49.setText(".");
                    }
                    if (no50 == 12) {
                        editText50.setText(".");
                    }
                    if (no51 == 12) {
                        editText51.setText(".");
                    }
                    if (no52 == 12) {
                        editText52.setText(".");
                    }
                    if (no53 == 12) {
                        editText53.setText(".");
                    }

                    float a0t = (no1 + no2 + no3 + no4 + no5) / 5 * 100;
                    int roa0t = Math.round(a0t);
                    Float a0t2 = Float.valueOf(roa0t) / 100;

                    float a0l = (no7 + no8 + no9 + no10 + no11) / 5 * 100;
                    int roa0l = Math.round(a0l);
                    Float a0l2 = Float.valueOf(roa0l) / 100;

                    float a0h = (no13 + no14 + no15 + no16 + no17) / 5 * 100;
                    int roa0h = Math.round(a0h);
                    Float a0h2 = Float.valueOf(roa0h) / 100;

                    float a1a = (no19 + no20 + no21 + no22 + no23) / 5 * 100;
                    int roa1a = Math.round(a1a);
                    Float a1a2 = Float.valueOf(roa1a) / 100;

                    float c0v = (no25 + no26 + no27 + no28 + no29) / 5 * 100;
                    int roc0v = Math.round(c0v);
                    Float c0v2 = Float.valueOf(roc0v) / 100;

                    float b0s = (no31 + no32 + no33 + no34 + no35) / 5 * 100;
                    int rob0s = Math.round(b0s);
                    Float b0s2 = Float.valueOf(rob0s) / 100;

                    float c0su = (no37 + no38 + no39 + no40 + no41) / 5 * 100;
                    int roc0su = Math.round(c0su);
                    Float c0su2 = Float.valueOf(roc0su) / 100;

                    float c0d = (no43 + no44 + no45 + no46 + no47) / 5 * 100;
                    int roc0d = Math.round(c0d);
                    Float c0d2 = Float.valueOf(roc0d) / 100;

                    float c19gd = (no49 + no50 + no51 + no52 + no53) / 5 * 100;
                    int roc19gd = Math.round(c19gd);
                    Float c19gd2 = Float.valueOf(roc19gd) / 100;

                    float a = 2;
                    if (((editText1.getText().toString().length() == 1 && editText1.getText().toString().contains(".") || editText1.getText().toString().length() == 0 || no1 > 10) || (editText2.getText().toString().length() == 1 && editText2.getText().toString().contains(".") || editText2.getText().toString().length() == 0 || no2 > 10)
                            || (editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".") || editText3.getText().toString().length() == 0 || no3 > 10) || (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".") || editText4.getText().toString().length() == 0 || no4 > 10)
                            || (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() == 0 || no5 > 10))
                            && (editText1.getText().toString().length() > 0 || editText2.getText().toString().length() > 0 || editText3.getText().toString().length() > 0 || editText4.getText().toString().length() > 0 || editText5.getText().toString().length() > 0)) {
                        if (editText1.getText().toString().length() == 1 && editText1.getText().toString().contains(".") || editText1.getText().toString().length() == 0 || no1 > 10) {
                            editText1.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText2.getText().toString().length() == 1 && editText2.getText().toString().contains(".") || editText2.getText().toString().length() == 0 || no2 > 10) {
                            editText2.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".") || editText3.getText().toString().length() == 0 || no3 > 10) {
                            editText3.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".") || editText4.getText().toString().length() == 0 || no4 > 10) {
                            editText4.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() == 0 || no5 > 10) {
                            editText5.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText7.getText().toString().length() == 1 && editText7.getText().toString().contains(".") || editText7.getText().toString().length() == 0 || no7 > 10) || (editText8.getText().toString().length() == 1 && editText8.getText().toString().contains(".") || editText8.getText().toString().length() == 0 || no8 > 10)
                            || (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".") || editText9.getText().toString().length() == 0 || no9 > 10) || (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".") || editText10.getText().toString().length() == 0 || no10 > 10)
                            || (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".") || editText11.getText().toString().length() == 0 || no11 > 10))
                            && (editText7.getText().toString().length() > 0 || editText8.getText().toString().length() > 0 || editText9.getText().toString().length() > 0 || editText10.getText().toString().length() > 0 || editText11.getText().toString().length() > 0)) {
                        if (editText7.getText().toString().length() == 1 && editText7.getText().toString().contains(".") || editText7.getText().toString().length() == 0 || no7 > 10) {
                            editText7.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText8.getText().toString().length() == 1 && editText8.getText().toString().contains(".") || editText8.getText().toString().length() == 0 || no8 > 10) {
                            editText8.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".") || editText9.getText().toString().length() == 0 || no9 > 10) {
                            editText9.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".") || editText10.getText().toString().length() == 0 || no10 > 10) {
                            editText10.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".") || editText11.getText().toString().length() == 0 || no11 > 10) {
                            editText11.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText13.getText().toString().length() == 1 && editText13.getText().toString().contains(".") || editText13.getText().toString().length() == 0 || no13 > 10) || (editText14.getText().toString().length() == 1 && editText14.getText().toString().contains(".") || editText14.getText().toString().length() == 0 || no14 > 10)
                            || (editText15.getText().toString().length() == 1 && editText15.getText().toString().contains(".") || editText15.getText().toString().length() == 0 || no15 > 10) || (editText16.getText().toString().length() == 1 && editText16.getText().toString().contains(".") || editText16.getText().toString().length() == 0 || no16 > 10)
                            || (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".") || editText17.getText().toString().length() == 0 || no17 > 10))
                            && (editText13.getText().toString().length() > 0 || editText14.getText().toString().length() > 0 || editText15.getText().toString().length() > 0 || editText16.getText().toString().length() > 0 || editText17.getText().toString().length() > 0)) {
                        if (editText13.getText().toString().length() == 1 && editText13.getText().toString().contains(".") || editText13.getText().toString().length() == 0 || no13 > 10) {
                            editText13.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText14.getText().toString().length() == 1 && editText14.getText().toString().contains(".") || editText14.getText().toString().length() == 0 || no14 > 10) {
                            editText14.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText15.getText().toString().length() == 1 && editText15.getText().toString().contains(".") || editText15.getText().toString().length() == 0 || no15 > 10) {
                            editText15.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText16.getText().toString().length() == 1 && editText16.getText().toString().contains(".") || editText16.getText().toString().length() == 0 || no16 > 10) {
                            editText16.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".") || editText17.getText().toString().length() == 0 || no17 > 10) {
                            editText17.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText19.getText().toString().length() == 1 && editText19.getText().toString().contains(".") || editText19.getText().toString().length() == 0 || no19 > 10) || (editText20.getText().toString().length() == 1 && editText20.getText().toString().contains(".") || editText20.getText().toString().length() == 0 || no20 > 10)
                            || (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".") || editText21.getText().toString().length() == 0 || no21 > 10) || (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".") || editText22.getText().toString().length() == 0 || no22 > 10)
                            || (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".") || editText23.getText().toString().length() == 0 || no23 > 10))
                            && (editText19.getText().toString().length() > 0 || editText20.getText().toString().length() > 0 || editText21.getText().toString().length() > 0 || editText22.getText().toString().length() > 0 || editText23.getText().toString().length() > 0)) {
                        if (editText19.getText().toString().length() == 1 && editText19.getText().toString().contains(".") || editText19.getText().toString().length() == 0 || no19 > 10) {
                            editText19.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText20.getText().toString().length() == 1 && editText20.getText().toString().contains(".") || editText20.getText().toString().length() == 0 || no20 > 10) {
                            editText20.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".") || editText21.getText().toString().length() == 0 || no21 > 10) {
                            editText21.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".") || editText22.getText().toString().length() == 0 || no22 > 10) {
                            editText22.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".") || editText23.getText().toString().length() == 0 || no23 > 10) {
                            editText23.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText25.getText().toString().length() == 1 && editText25.getText().toString().contains(".") || editText25.getText().toString().length() == 0 || no25 > 10) || (editText26.getText().toString().length() == 1 && editText26.getText().toString().contains(".") || editText26.getText().toString().length() == 0 || no26 > 10)
                            || (editText27.getText().toString().length() == 1 && editText27.getText().toString().contains(".") || editText27.getText().toString().length() == 0 || no27 > 10) || (editText28.getText().toString().length() == 1 && editText28.getText().toString().contains(".") || editText28.getText().toString().length() == 0 || no28 > 10)
                            || (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".") || editText29.getText().toString().length() == 0 || no29 > 10))
                            && (editText25.getText().toString().length() > 0 || editText26.getText().toString().length() > 0 || editText27.getText().toString().length() > 0 || editText28.getText().toString().length() > 0 || editText29.getText().toString().length() > 0)) {
                        if (editText25.getText().toString().length() == 1 && editText25.getText().toString().contains(".") || editText25.getText().toString().length() == 0 || no25 > 10) {
                            editText25.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText26.getText().toString().length() == 1 && editText26.getText().toString().contains(".") || editText26.getText().toString().length() == 0 || no26 > 10) {
                            editText26.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText27.getText().toString().length() == 1 && editText27.getText().toString().contains(".") || editText27.getText().toString().length() == 0 || no27 > 10) {
                            editText27.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText28.getText().toString().length() == 1 && editText28.getText().toString().contains(".") || editText28.getText().toString().length() == 0 || no28 > 10) {
                            editText28.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".") || editText29.getText().toString().length() == 0 || no29 > 10) {
                            editText29.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText31.getText().toString().length() == 1 && editText31.getText().toString().contains(".") || editText31.getText().toString().length() == 0 || no31 > 10) || (editText32.getText().toString().length() == 1 && editText32.getText().toString().contains(".") || editText32.getText().toString().length() == 0 || no32 > 10)
                            || (editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".") || editText33.getText().toString().length() == 0 || no33 > 10) || (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".") || editText34.getText().toString().length() == 0 || no34 > 10)
                            || (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".") || editText35.getText().toString().length() == 0 || no35 > 10))
                            && (editText31.getText().toString().length() > 0 || editText32.getText().toString().length() > 0 || editText33.getText().toString().length() > 0 || editText34.getText().toString().length() > 0 || editText35.getText().toString().length() > 0)) {
                        if (editText31.getText().toString().length() == 1 && editText31.getText().toString().contains(".") || editText31.getText().toString().length() == 0 || no31 > 10) {
                            editText31.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText32.getText().toString().length() == 1 && editText32.getText().toString().contains(".") || editText32.getText().toString().length() == 0 || no32 > 10) {
                            editText32.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".") || editText33.getText().toString().length() == 0 || no33 > 10) {
                            editText33.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".") || editText34.getText().toString().length() == 0 || no34 > 10) {
                            editText34.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".") || editText35.getText().toString().length() == 0 || no35 > 10) {
                            editText35.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText37.getText().toString().length() == 1 && editText37.getText().toString().contains(".") || editText37.getText().toString().length() == 0 || no37 > 10) || (editText38.getText().toString().length() == 1 && editText38.getText().toString().contains(".") || editText38.getText().toString().length() == 0 || no38 > 10)
                            || (editText39.getText().toString().length() == 1 && editText39.getText().toString().contains(".") || editText39.getText().toString().length() == 0 || no39 > 10) || (editText40.getText().toString().length() == 1 && editText40.getText().toString().contains(".") || editText40.getText().toString().length() == 0 || no40 > 10)
                            || (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".") || editText41.getText().toString().length() == 0 || no41 > 10))
                            && (editText37.getText().toString().length() > 0 || editText38.getText().toString().length() > 0 || editText39.getText().toString().length() > 0 || editText40.getText().toString().length() > 0 || editText41.getText().toString().length() > 0)) {
                        if (editText37.getText().toString().length() == 1 && editText37.getText().toString().contains(".") || editText37.getText().toString().length() == 0 || no37 > 10) {
                            editText37.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText38.getText().toString().length() == 1 && editText38.getText().toString().contains(".") || editText38.getText().toString().length() == 0 || no38 > 10) {
                            editText38.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText39.getText().toString().length() == 1 && editText39.getText().toString().contains(".") || editText39.getText().toString().length() == 0 || no39 > 10) {
                            editText39.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText40.getText().toString().length() == 1 && editText40.getText().toString().contains(".") || editText40.getText().toString().length() == 0 || no40 > 10) {
                            editText40.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".") || editText41.getText().toString().length() == 0 || no41 > 10) {
                            editText41.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText43.getText().toString().length() == 1 && editText43.getText().toString().contains(".") || editText43.getText().toString().length() == 0 || no43 > 10) || (editText44.getText().toString().length() == 1 && editText44.getText().toString().contains(".") || editText44.getText().toString().length() == 0 || no44 > 10)
                            || (editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".") || editText45.getText().toString().length() == 0 || no45 > 10) || (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".") || editText46.getText().toString().length() == 0 || no46 > 10)
                            || (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".") || editText47.getText().toString().length() == 0 || no47 > 10))
                            && (editText43.getText().toString().length() > 0 || editText44.getText().toString().length() > 0 || editText45.getText().toString().length() > 0 || editText46.getText().toString().length() > 0 || editText47.getText().toString().length() > 0)) {
                        if (editText43.getText().toString().length() == 1 && editText43.getText().toString().contains(".") || editText43.getText().toString().length() == 0 || no43 > 10) {
                            editText43.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText44.getText().toString().length() == 1 && editText44.getText().toString().contains(".") || editText44.getText().toString().length() == 0 || no44 > 10) {
                            editText44.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".") || editText45.getText().toString().length() == 0 || no45 > 10) {
                            editText45.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".") || editText46.getText().toString().length() == 0 || no46 > 10) {
                            editText46.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".") || editText47.getText().toString().length() == 0 || no47 > 10) {
                            editText47.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText49.getText().toString().length() == 1 && editText49.getText().toString().contains(".") || editText49.getText().toString().length() == 0 || no49 > 10) || (editText50.getText().toString().length() == 1 && editText50.getText().toString().contains(".") || editText50.getText().toString().length() == 0 || no50 > 10)
                            || (editText51.getText().toString().length() == 1 && editText51.getText().toString().contains(".") || editText51.getText().toString().length() == 0 || no51 > 10) || (editText52.getText().toString().length() == 1 && editText52.getText().toString().contains(".") || editText52.getText().toString().length() == 0 || no52 > 10)
                            || (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".") || editText53.getText().toString().length() == 0 || no53 > 10))
                            && (editText49.getText().toString().length() > 0 || editText50.getText().toString().length() > 0 || editText51.getText().toString().length() > 0 || editText52.getText().toString().length() > 0 || editText53.getText().toString().length() > 0)) {
                        if (editText49.getText().toString().length() == 1 && editText49.getText().toString().contains(".") || editText49.getText().toString().length() == 0 || no49 > 10) {
                            editText49.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText50.getText().toString().length() == 1 && editText50.getText().toString().contains(".") || editText50.getText().toString().length() == 0 || no50 > 10) {
                            editText50.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText51.getText().toString().length() == 1 && editText51.getText().toString().contains(".") || editText51.getText().toString().length() == 0 || no51 > 10) {
                            editText51.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText52.getText().toString().length() == 1 && editText52.getText().toString().contains(".") || editText52.getText().toString().length() == 0 || no52 > 10) {
                            editText52.setBackgroundResource(R.drawable.edittext_background1);
                        }
                        if (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".") || editText53.getText().toString().length() == 0 || no53 > 10) {
                            editText53.setBackgroundResource(R.drawable.edittext_background1);
                        }

                    }

                    if (((editText1.getText().toString().length() == 0 && editText2.getText().toString().length() == 0 && editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0 && editText5.getText().toString().length() == 0) || (no1 <= 10 && no2 <= 10 && no3 <= 10 && no4 <= 10 && no5 <= 10))
                            && ((editText7.getText().toString().length() == 0 && editText8.getText().toString().length() == 0 && editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0 && editText11.getText().toString().length() == 0) || (no7 <= 10 && no8 <= 10 && no9 <= 10 && no10 <= 10 && no11 <= 10))
                            && ((editText13.getText().toString().length() == 0 && editText14.getText().toString().length() == 0 && editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0 && editText17.getText().toString().length() == 0) || (no13 <= 10 && no14 <= 10 && no15 <= 10 && no16 <= 10 && no17 <= 10))
                            && ((editText19.getText().toString().length() == 0 && editText20.getText().toString().length() == 0 && editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0 && editText23.getText().toString().length() == 0) || (no19 <= 10 && no20 <= 10 && no21 <= 10 && no22 <= 10 && no23 <= 10))
                            && ((editText25.getText().toString().length() == 0 && editText26.getText().toString().length() == 0 && editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0 && editText29.getText().toString().length() == 0) || (no25 <= 10 && no26 <= 10 && no27 <= 10 && no28 <= 10 && no29 <= 10))
                            && ((editText31.getText().toString().length() == 0 && editText32.getText().toString().length() == 0 && editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0 && editText35.getText().toString().length() == 0) || (no31 <= 10 && no32 <= 10 && no33 <= 10 && no34 <= 10 && no35 <= 10))
                            && ((editText37.getText().toString().length() == 0 && editText38.getText().toString().length() == 0 && editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0 && editText41.getText().toString().length() == 0) || (no37 <= 10 && no38 <= 10 && no39 <= 10 && no40 <= 10 && no41 <= 10))
                            && ((editText43.getText().toString().length() == 0 && editText44.getText().toString().length() == 0 && editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0 && editText47.getText().toString().length() == 0) || (no43 <= 10 && no44 <= 10 && no45 <= 10 && no46 <= 10 && no47 <= 10))
                            && ((editText49.getText().toString().length() == 0 && editText50.getText().toString().length() == 0 && editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0 && editText53.getText().toString().length() == 0) || (no49 <= 10 && no50 <= 10 && no51 <= 10 && no52 <= 10 && no53 <= 10))

                    ) {
                        /*if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        }
                        else {*/
                        Intent intent = new Intent(v.getContext(), activity_mon.class);
                        intent.putExtra("a0", a0t2);
                        intent.putExtra("a1", a0l2);
                        intent.putExtra("b0", a0h2);
                        intent.putExtra("c0", a1a2);
                        intent.putExtra("c1", c0v2);
                        intent.putExtra("d1", b0s2);
                        intent.putExtra("d7", c0su2);
                        intent.putExtra("d14", c0d2);
                        intent.putExtra("d15", c19gd2);
                        intent.putExtra("tieucot",a);

                        intent.putExtra("no1", no1);
                        intent.putExtra("no2", no2);
                        intent.putExtra("no3", no3);
                        intent.putExtra("no4", no4);
                        intent.putExtra("no5", no5);

                        intent.putExtra("no7", no7);
                        intent.putExtra("no8", no8);
                        intent.putExtra("no9", no9);
                        intent.putExtra("no10", no10);
                        intent.putExtra("no11", no11);

                        intent.putExtra("no13", no13);
                        intent.putExtra("no14", no14);
                        intent.putExtra("no15", no15);
                        intent.putExtra("no16", no16);
                        intent.putExtra("no17", no17);

                        intent.putExtra("no19", no19);
                        intent.putExtra("no20", no20);
                        intent.putExtra("no21", no21);
                        intent.putExtra("no22", no22);
                        intent.putExtra("no23", no23);

                        intent.putExtra("no25", no25);
                        intent.putExtra("no26", no26);
                        intent.putExtra("no27", no27);
                        intent.putExtra("no28", no28);
                        intent.putExtra("no29", no29);

                        intent.putExtra("no31", no31);
                        intent.putExtra("no32", no32);
                        intent.putExtra("no33", no33);
                        intent.putExtra("no34", no34);
                        intent.putExtra("no35", no35);

                        intent.putExtra("no37", no37);
                        intent.putExtra("no38", no38);
                        intent.putExtra("no39", no39);
                        intent.putExtra("no40", no40);
                        intent.putExtra("no41", no41);

                        intent.putExtra("no43", no43);
                        intent.putExtra("no44", no44);
                        intent.putExtra("no45", no45);
                        intent.putExtra("no46", no46);
                        intent.putExtra("no47", no47);

                        intent.putExtra("no49", no49);
                        intent.putExtra("no50", no50);
                        intent.putExtra("no51", no51);
                        intent.putExtra("no52", no52);
                        intent.putExtra("no53", no53);

                        v.getContext().startActivity(intent);
                    }
                }
            });
        }

        public void saveData() {
            //editor.putBoolean(SWITCH1, switch1.isChecked());
            //Toast.makeText(this, "MeData saved", Toast.LENGTH_SHORT).show();
            SharedPreferences sharedPreferences1 = context.getSharedPreferences("namedit1", MODE_PRIVATE);
            SharedPreferences.Editor editor1 = sharedPreferences1.edit();
            editor1.putString(TEXT1, editText1.getText().toString());
            editor1.apply();
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("namedit2", MODE_PRIVATE);
            SharedPreferences.Editor editor2 = sharedPreferences2.edit();
            editor2.putString(TEXT2, editText2.getText().toString());
            editor2.apply();
            SharedPreferences sharedPreferences3 = context.getSharedPreferences("namedit3", MODE_PRIVATE);
            SharedPreferences.Editor editor3 = sharedPreferences3.edit();
            editor3.putString(TEXT3, editText3.getText().toString());
            editor3.apply();
            SharedPreferences sharedPreferences4 = context.getSharedPreferences("namedit4", MODE_PRIVATE);
            SharedPreferences.Editor editor4 = sharedPreferences4.edit();
            editor4.putString(TEXT4, editText4.getText().toString());
            editor4.apply();
            SharedPreferences sharedPreferences5 = context.getSharedPreferences("namedit5", MODE_PRIVATE);
            SharedPreferences.Editor editor5 = sharedPreferences5.edit();
            editor5.putString(TEXT5, editText5.getText().toString());
            editor5.apply();
            SharedPreferences sharedPreferences7 = context.getSharedPreferences("namedit7", MODE_PRIVATE);
            SharedPreferences.Editor editor7 = sharedPreferences7.edit();
            editor7.putString(TEXT7, editText7.getText().toString());
            editor7.apply();
            SharedPreferences sharedPreferences8 = context.getSharedPreferences("namedit8", MODE_PRIVATE);
            SharedPreferences.Editor editor8 = sharedPreferences8.edit();
            editor8.putString(TEXT8, editText8.getText().toString());
            editor8.apply();
            SharedPreferences sharedPreferences9 = context.getSharedPreferences("namedit9", MODE_PRIVATE);
            SharedPreferences.Editor editor9 = sharedPreferences9.edit();
            editor9.putString(TEXT9, editText9.getText().toString());
            editor9.apply();
            SharedPreferences sharedPreferences10 = context.getSharedPreferences("namedit10", MODE_PRIVATE);
            SharedPreferences.Editor editor10 = sharedPreferences10.edit();
            editor10.putString(TEXT10, editText10.getText().toString());
            editor10.apply();
            SharedPreferences sharedPreferences11 = context.getSharedPreferences("namedit11", MODE_PRIVATE);
            SharedPreferences.Editor editor11 = sharedPreferences11.edit();
            editor11.putString(TEXT11, editText11.getText().toString());
            editor11.apply();
            SharedPreferences sharedPreferences13 = context.getSharedPreferences("namedit13", MODE_PRIVATE);
            SharedPreferences.Editor editor13 = sharedPreferences13.edit();
            editor13.putString(TEXT13, editText13.getText().toString());
            editor13.apply();
            SharedPreferences sharedPreferences14 = context.getSharedPreferences("namedit14", MODE_PRIVATE);
            SharedPreferences.Editor editor14 = sharedPreferences14.edit();
            editor14.putString(TEXT14, editText14.getText().toString());
            editor14.apply();
            SharedPreferences sharedPreferences15 = context.getSharedPreferences("namedit15", MODE_PRIVATE);
            SharedPreferences.Editor editor15 = sharedPreferences15.edit();
            editor15.putString(TEXT15, editText15.getText().toString());
            editor15.apply();
            SharedPreferences sharedPreferences16 = context.getSharedPreferences("namedit16", MODE_PRIVATE);
            SharedPreferences.Editor editor16 = sharedPreferences16.edit();
            editor16.putString(TEXT16, editText16.getText().toString());
            editor16.apply();
            SharedPreferences sharedPreferences17 = context.getSharedPreferences("namedit17", MODE_PRIVATE);
            SharedPreferences.Editor editor17 = sharedPreferences17.edit();
            editor17.putString(TEXT17, editText17.getText().toString());
            editor17.apply();
            SharedPreferences sharedPreferences19 = context.getSharedPreferences("namedit19", MODE_PRIVATE);
            SharedPreferences.Editor editor19 = sharedPreferences19.edit();
            editor19.putString(TEXT19, editText19.getText().toString());
            editor19.apply();
            SharedPreferences sharedPreferences20 = context.getSharedPreferences("namedit20", MODE_PRIVATE);
            SharedPreferences.Editor editor20 = sharedPreferences20.edit();
            editor20.putString(TEXT20, editText20.getText().toString());
            editor20.apply();
            SharedPreferences sharedPreferences21 = context.getSharedPreferences("namedit21", MODE_PRIVATE);
            SharedPreferences.Editor editor21 = sharedPreferences21.edit();
            editor21.putString(TEXT21, editText21.getText().toString());
            editor21.apply();
            SharedPreferences sharedPreferences22 = context.getSharedPreferences("namedit22", MODE_PRIVATE);
            SharedPreferences.Editor editor22 = sharedPreferences22.edit();
            editor22.putString(TEXT22, editText22.getText().toString());
            editor22.apply();
            SharedPreferences sharedPreferences23 = context.getSharedPreferences("namedit23", MODE_PRIVATE);
            SharedPreferences.Editor editor23 = sharedPreferences23.edit();
            editor23.putString(TEXT23, editText23.getText().toString());
            editor23.apply();
            SharedPreferences sharedPreferences25 = context.getSharedPreferences("namedit25", MODE_PRIVATE);
            SharedPreferences.Editor editor25 = sharedPreferences25.edit();
            editor25.putString(TEXT25, editText25.getText().toString());
            editor25.apply();
            SharedPreferences sharedPreferences26 = context.getSharedPreferences("namedit26", MODE_PRIVATE);
            SharedPreferences.Editor editor26 = sharedPreferences26.edit();
            editor26.putString(TEXT26, editText26.getText().toString());
            editor26.apply();
            SharedPreferences sharedPreferences27 = context.getSharedPreferences("namedit27", MODE_PRIVATE);
            SharedPreferences.Editor editor27 = sharedPreferences27.edit();
            editor27.putString(TEXT27, editText27.getText().toString());
            editor27.apply();
            SharedPreferences sharedPreferences28 = context.getSharedPreferences("namedit28", MODE_PRIVATE);
            SharedPreferences.Editor editor28 = sharedPreferences28.edit();
            editor28.putString(TEXT28, editText28.getText().toString());
            editor28.apply();
            SharedPreferences sharedPreferences29 = context.getSharedPreferences("namedit29", MODE_PRIVATE);
            SharedPreferences.Editor editor29 = sharedPreferences29.edit();
            editor29.putString(TEXT29, editText29.getText().toString());
            editor29.apply();
            SharedPreferences sharedPreferences31 = context.getSharedPreferences("namedit31", MODE_PRIVATE);
            SharedPreferences.Editor editor31 = sharedPreferences31.edit();
            editor31.putString(TEXT31, editText31.getText().toString());
            editor31.apply();
            SharedPreferences sharedPreferences32 = context.getSharedPreferences("namedit32", MODE_PRIVATE);
            SharedPreferences.Editor editor32 = sharedPreferences32.edit();
            editor32.putString(TEXT32, editText32.getText().toString());
            editor32.apply();
            SharedPreferences sharedPreferences33 = context.getSharedPreferences("namedit33", MODE_PRIVATE);
            SharedPreferences.Editor editor33 = sharedPreferences33.edit();
            editor33.putString(TEXT33, editText33.getText().toString());
            editor33.apply();
            SharedPreferences sharedPreferences34 = context.getSharedPreferences("namedit34", MODE_PRIVATE);
            SharedPreferences.Editor editor34 = sharedPreferences34.edit();
            editor34.putString(TEXT34, editText34.getText().toString());
            editor34.apply();
            SharedPreferences sharedPreferences35 = context.getSharedPreferences("namedit35", MODE_PRIVATE);
            SharedPreferences.Editor editor35 = sharedPreferences35.edit();
            editor35.putString(TEXT35, editText35.getText().toString());
            editor35.apply();
            SharedPreferences sharedPreferences37 = context.getSharedPreferences("namedit37", MODE_PRIVATE);
            SharedPreferences.Editor editor37 = sharedPreferences37.edit();
            editor37.putString(TEXT37, editText37.getText().toString());
            editor37.apply();
            SharedPreferences sharedPreferences38 = context.getSharedPreferences("namedit38", MODE_PRIVATE);
            SharedPreferences.Editor editor38 = sharedPreferences38.edit();
            editor38.putString(TEXT38, editText38.getText().toString());
            editor38.apply();
            SharedPreferences sharedPreferences39 = context.getSharedPreferences("namedit39", MODE_PRIVATE);
            SharedPreferences.Editor editor39 = sharedPreferences39.edit();
            editor39.putString(TEXT39, editText39.getText().toString());
            editor39.apply();
            SharedPreferences sharedPreferences40 = context.getSharedPreferences("namedit40", MODE_PRIVATE);
            SharedPreferences.Editor editor40 = sharedPreferences40.edit();
            editor40.putString(TEXT40, editText40.getText().toString());
            editor40.apply();
            SharedPreferences sharedPreferences41 = context.getSharedPreferences("namedit41", MODE_PRIVATE);
            SharedPreferences.Editor editor41 = sharedPreferences41.edit();
            editor41.putString(TEXT41, editText41.getText().toString());
            editor41.apply();
            SharedPreferences sharedPreferences43 = context.getSharedPreferences("namedit43", MODE_PRIVATE);
            SharedPreferences.Editor editor43 = sharedPreferences43.edit();
            editor43.putString(TEXT43, editText43.getText().toString());
            editor43.apply();
            SharedPreferences sharedPreferences44 = context.getSharedPreferences("namedit44", MODE_PRIVATE);
            SharedPreferences.Editor editor44 = sharedPreferences44.edit();
            editor44.putString(TEXT44, editText44.getText().toString());
            editor44.apply();
            SharedPreferences sharedPreferences45 = context.getSharedPreferences("namedit45", MODE_PRIVATE);
            SharedPreferences.Editor editor45 = sharedPreferences45.edit();
            editor45.putString(TEXT45, editText45.getText().toString());
            editor45.apply();
            SharedPreferences sharedPreferences46 = context.getSharedPreferences("namedit46", MODE_PRIVATE);
            SharedPreferences.Editor editor46 = sharedPreferences46.edit();
            editor46.putString(TEXT46, editText46.getText().toString());
            editor46.apply();
            SharedPreferences sharedPreferences47 = context.getSharedPreferences("namedit47", MODE_PRIVATE);
            SharedPreferences.Editor editor47 = sharedPreferences47.edit();
            editor47.putString(TEXT47, editText47.getText().toString());
            editor47.apply();
            SharedPreferences sharedPreferences49 = context.getSharedPreferences("namedit49", MODE_PRIVATE);
            SharedPreferences.Editor editor49 = sharedPreferences49.edit();
            editor49.putString(TEXT49, editText49.getText().toString());
            editor49.apply();
            SharedPreferences sharedPreferences50 = context.getSharedPreferences("namedit50", MODE_PRIVATE);
            SharedPreferences.Editor editor50 = sharedPreferences50.edit();
            editor50.putString(TEXT50, editText50.getText().toString());
            editor50.apply();
            SharedPreferences sharedPreferences51 = context.getSharedPreferences("namedit51", MODE_PRIVATE);
            SharedPreferences.Editor editor51 = sharedPreferences51.edit();
            editor51.putString(TEXT51, editText51.getText().toString());
            editor51.apply();
            SharedPreferences sharedPreferences52 = context.getSharedPreferences("namedit52", MODE_PRIVATE);
            SharedPreferences.Editor editor52 = sharedPreferences52.edit();
            editor52.putString(TEXT52, editText52.getText().toString());
            editor52.apply();
            SharedPreferences sharedPreferences53 = context.getSharedPreferences("namedit53", MODE_PRIVATE);
            SharedPreferences.Editor editor53 = sharedPreferences53.edit();
            editor53.putString(TEXT53, editText53.getText().toString());
            editor53.apply();
        }

        public void loadData() {
            SharedPreferences sharedPreferences1 = context.getSharedPreferences("namedit1", MODE_PRIVATE);
            text1 = sharedPreferences1.getString(TEXT1, "");
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("namedit2", MODE_PRIVATE);
            text2 = sharedPreferences2.getString(TEXT2, "");
            SharedPreferences sharedPreferences3 = context.getSharedPreferences("namedit3", MODE_PRIVATE);
            text3 = sharedPreferences3.getString(TEXT3, "");
            SharedPreferences sharedPreferences4 = context.getSharedPreferences("namedit4", MODE_PRIVATE);
            text4 = sharedPreferences4.getString(TEXT4, "");
            SharedPreferences sharedPreferences5 = context.getSharedPreferences("namedit5", MODE_PRIVATE);
            text5 = sharedPreferences5.getString(TEXT5, "");
            SharedPreferences sharedPreferences6 = context.getSharedPreferences("namedit7", MODE_PRIVATE);
            text7 = sharedPreferences6.getString(TEXT7, "");
            SharedPreferences sharedPreferences8 = context.getSharedPreferences("namedit8", MODE_PRIVATE);
            text8 = sharedPreferences8.getString(TEXT8, "");
            SharedPreferences sharedPreferences9 = context.getSharedPreferences("namedit9", MODE_PRIVATE);
            text9 = sharedPreferences9.getString(TEXT9, "");
            SharedPreferences sharedPreferences10 = context.getSharedPreferences("namedit10", MODE_PRIVATE);
            text10 = sharedPreferences10.getString(TEXT10, "");
            SharedPreferences sharedPreferences11 = context.getSharedPreferences("namedit11", MODE_PRIVATE);
            text11 = sharedPreferences11.getString(TEXT11, "");
            SharedPreferences sharedPreferences13 = context.getSharedPreferences("namedit13", MODE_PRIVATE);
            text13 = sharedPreferences13.getString(TEXT13, "");
            SharedPreferences sharedPreferences14 = context.getSharedPreferences("namedit14", MODE_PRIVATE);
            text14 = sharedPreferences14.getString(TEXT14, "");
            SharedPreferences sharedPreferences15 = context.getSharedPreferences("namedit15", MODE_PRIVATE);
            text15 = sharedPreferences15.getString(TEXT15, "");
            SharedPreferences sharedPreferences16 = context.getSharedPreferences("namedit16", MODE_PRIVATE);
            text16 = sharedPreferences16.getString(TEXT16, "");
            SharedPreferences sharedPreferences17 = context.getSharedPreferences("namedit17", MODE_PRIVATE);
            text17 = sharedPreferences17.getString(TEXT17, "");
            SharedPreferences sharedPreferences19 = context.getSharedPreferences("namedit19", MODE_PRIVATE);
            text19 = sharedPreferences19.getString(TEXT19, "");
            SharedPreferences sharedPreferences20 = context.getSharedPreferences("namedit20", MODE_PRIVATE);
            text20 = sharedPreferences20.getString(TEXT20, "");
            SharedPreferences sharedPreferences21 = context.getSharedPreferences("namedit21", MODE_PRIVATE);
            text21 = sharedPreferences21.getString(TEXT21, "");
            SharedPreferences sharedPreferences22 = context.getSharedPreferences("namedit22", MODE_PRIVATE);
            text22 = sharedPreferences22.getString(TEXT22, "");
            SharedPreferences sharedPreferences23 = context.getSharedPreferences("namedit23", MODE_PRIVATE);
            text23 = sharedPreferences23.getString(TEXT23, "");
            SharedPreferences sharedPreferences25 = context.getSharedPreferences("namedit25", MODE_PRIVATE);
            text25 = sharedPreferences25.getString(TEXT25, "");
            SharedPreferences sharedPreferences26 = context.getSharedPreferences("namedit26", MODE_PRIVATE);
            text26 = sharedPreferences26.getString(TEXT26, "");
            SharedPreferences sharedPreferences27 = context.getSharedPreferences("namedit27", MODE_PRIVATE);
            text27 = sharedPreferences27.getString(TEXT27, "");
            SharedPreferences sharedPreferences28 = context.getSharedPreferences("namedit28", MODE_PRIVATE);
            text28 = sharedPreferences28.getString(TEXT28, "");
            SharedPreferences sharedPreferences29 = context.getSharedPreferences("namedit29", MODE_PRIVATE);
            text29 = sharedPreferences29.getString(TEXT29, "");
            SharedPreferences sharedPreferences31 = context.getSharedPreferences("namedit31", MODE_PRIVATE);
            text31 = sharedPreferences31.getString(TEXT31, "");
            SharedPreferences sharedPreferences32 = context.getSharedPreferences("namedit32", MODE_PRIVATE);
            text32 = sharedPreferences32.getString(TEXT32, "");
            SharedPreferences sharedPreferences33 = context.getSharedPreferences("namedit33", MODE_PRIVATE);
            text33 = sharedPreferences33.getString(TEXT33, "");
            SharedPreferences sharedPreferences34 = context.getSharedPreferences("namedit34", MODE_PRIVATE);
            text34 = sharedPreferences34.getString(TEXT34, "");
            SharedPreferences sharedPreferences35 = context.getSharedPreferences("namedit35", MODE_PRIVATE);
            text35 = sharedPreferences35.getString(TEXT35, "");
            SharedPreferences sharedPreferences37 = context.getSharedPreferences("namedit37", MODE_PRIVATE);
            text37 = sharedPreferences37.getString(TEXT37, "");
            SharedPreferences sharedPreferences38 = context.getSharedPreferences("namedit38", MODE_PRIVATE);
            text38 = sharedPreferences38.getString(TEXT38, "");
            SharedPreferences sharedPreferences39 = context.getSharedPreferences("namedit39", MODE_PRIVATE);
            text39 = sharedPreferences39.getString(TEXT39, "");
            SharedPreferences sharedPreferences40 = context.getSharedPreferences("namedit40", MODE_PRIVATE);
            text40 = sharedPreferences40.getString(TEXT40, "");
            SharedPreferences sharedPreferences41 = context.getSharedPreferences("namedit41", MODE_PRIVATE);
            text41 = sharedPreferences41.getString(TEXT41, "");
            SharedPreferences sharedPreferences43 = context.getSharedPreferences("namedit43", MODE_PRIVATE);
            text43 = sharedPreferences43.getString(TEXT43, "");
            SharedPreferences sharedPreferences44 = context.getSharedPreferences("namedit44", MODE_PRIVATE);
            text44 = sharedPreferences44.getString(TEXT44, "");
            SharedPreferences sharedPreferences45 = context.getSharedPreferences("namedit45", MODE_PRIVATE);
            text45 = sharedPreferences45.getString(TEXT45, "");
            SharedPreferences sharedPreferences46 = context.getSharedPreferences("namedit46", MODE_PRIVATE);
            text46 = sharedPreferences46.getString(TEXT46, "");
            SharedPreferences sharedPreferences47 = context.getSharedPreferences("namedit47", MODE_PRIVATE);
            text47 = sharedPreferences47.getString(TEXT47, "");
            SharedPreferences sharedPreferences49 = context.getSharedPreferences("namedit49", MODE_PRIVATE);
            text49 = sharedPreferences49.getString(TEXT49, "");
            SharedPreferences sharedPreferences50 = context.getSharedPreferences("namedit50", MODE_PRIVATE);
            text50 = sharedPreferences50.getString(TEXT50, "");
            SharedPreferences sharedPreferences51 = context.getSharedPreferences("namedit51", MODE_PRIVATE);
            text51 = sharedPreferences51.getString(TEXT51, "");
            SharedPreferences sharedPreferences52 = context.getSharedPreferences("namedit52", MODE_PRIVATE);
            text52 = sharedPreferences52.getString(TEXT52, "");
            SharedPreferences sharedPreferences53 = context.getSharedPreferences("namedit53", MODE_PRIVATE);
            text53 = sharedPreferences53.getString(TEXT53, "");
            //switchOnOff = sharedPreferences.getBoolean(SWITCH1, false);
        }

        public void updateViews() {
            editText1.setText(text1);
            editText2.setText(text2);
            editText3.setText(text3);
            editText4.setText(text4);
            editText5.setText(text5);
            editText7.setText(text7);
            editText8.setText(text8);
            editText9.setText(text9);
            editText10.setText(text10);
            editText11.setText(text11);
            editText13.setText(text13);
            editText14.setText(text14);
            editText15.setText(text15);
            editText16.setText(text16);
            editText17.setText(text17);
            editText19.setText(text19);
            editText20.setText(text20);
            editText21.setText(text21);
            editText22.setText(text22);
            editText23.setText(text23);
            editText25.setText(text25);
            editText26.setText(text26);
            editText27.setText(text27);
            editText28.setText(text28);
            editText29.setText(text29);
            editText31.setText(text31);
            editText32.setText(text32);
            editText33.setText(text33);
            editText34.setText(text34);
            editText35.setText(text35);
            editText37.setText(text37);
            editText38.setText(text38);
            editText39.setText(text39);
            editText40.setText(text40);
            editText41.setText(text41);
            editText43.setText(text43);
            editText44.setText(text44);
            editText45.setText(text45);
            editText46.setText(text46);
            editText47.setText(text47);
            editText49.setText(text49);
            editText50.setText(text50);
            editText51.setText(text51);
            editText52.setText(text52);
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
                        if (editText1.getText().toString().length() == 0 && editText2.getText().toString().length() == 0 && editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0
                                && editText5.getText().toString().length() == 0) {
                            editText1.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (editText1.getText().toString().contains(".") && editText1.getText().toString().length() == 1) {
                            editText1.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText1.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                        float no = Float.valueOf(editText1.getText().toString());

                        if (editText1.getText().toString().length() > 0 && no <= 10) {
                            editText1.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no > 10) {
                            editText1.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText1.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }

                try {

                    if (editText55.getText().toString().length() == 0) {
                        if (editText1.getText().toString().length() == 0 && editText2.getText().toString().length() == 0 && editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0
                                && editText5.getText().toString().length() == 0) {
                            editText2.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no2 = Float.valueOf(editText2.getText().toString());
                        if (editText2.getText().toString().length() > 0 && no2 <= 10) {
                            editText2.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no2 > 10) {
                            editText2.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText2.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }

                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText1.getText().toString().length() == 0 && editText2.getText().toString().length() == 0 && editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0
                                && editText5.getText().toString().length() == 0) {
                            editText3.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no3 = Float.valueOf(editText3.getText().toString());
                        if (editText3.getText().toString().length() > 0 && no3 <= 10) {
                            editText3.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no3 > 10) {
                            editText3.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText3.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText1.getText().toString().length() == 0 && editText2.getText().toString().length() == 0 && editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0
                                && editText5.getText().toString().length() == 0) {
                            editText4.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no4 = Float.valueOf(editText4.getText().toString());
                        if (editText4.getText().toString().length() > 0 && no4 <= 10) {
                            editText4.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no4 > 10) {
                            editText4.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText4.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText1.getText().toString().length() == 0 && editText2.getText().toString().length() == 0 && editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0
                                && editText5.getText().toString().length() == 0) {
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
                        if (editText7.getText().toString().length() == 0 && editText8.getText().toString().length() == 0 && editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0
                                && editText11.getText().toString().length() == 0) {
                            editText7.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no7 = Float.valueOf(editText7.getText().toString());
                        if (editText7.getText().toString().length() > 0 && no7 <= 10) {
                            editText7.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no7 > 10) {
                            editText7.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText7.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText7.getText().toString().length() == 0 && editText8.getText().toString().length() == 0 && editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0
                                && editText11.getText().toString().length() == 0) {
                            editText8.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no8 = Float.valueOf(editText8.getText().toString());
                        if (editText8.getText().toString().length() > 0 && no8 <= 10) {
                            editText8.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no8 > 10) {
                            editText8.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText8.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText7.getText().toString().length() == 0 && editText8.getText().toString().length() == 0 && editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0
                                && editText11.getText().toString().length() == 0) {
                            editText9.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no9 = Float.valueOf(editText9.getText().toString());
                        if (editText9.getText().toString().length() > 0 && no9 <= 10) {
                            editText9.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no9 > 10) {
                            editText9.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText9.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText7.getText().toString().length() == 0 && editText8.getText().toString().length() == 0 && editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0
                                && editText11.getText().toString().length() == 0) {
                            editText10.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no10 = Float.valueOf(editText10.getText().toString());
                        if (editText10.getText().toString().length() > 0 && no10 <= 10) {
                            editText10.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no10 > 10) {
                            editText10.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText10.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText7.getText().toString().length() == 0 && editText8.getText().toString().length() == 0 && editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0
                                && editText11.getText().toString().length() == 0) {
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
                        if (editText13.getText().toString().length() == 0 && editText14.getText().toString().length() == 0 && editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0
                                && editText17.getText().toString().length() == 0) {
                            editText13.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no13 = Float.valueOf(editText13.getText().toString());
                        if (editText13.getText().toString().length() > 0 && no13 <= 10) {
                            editText13.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no13 > 10) {
                            editText13.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText13.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText13.getText().toString().length() == 0 && editText14.getText().toString().length() == 0 && editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0
                                && editText17.getText().toString().length() == 0) {
                            editText14.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no14 = Float.valueOf(editText14.getText().toString());
                        if (editText14.getText().toString().length() > 0 && no14 <= 10) {
                            editText14.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no14 > 10) {
                            editText14.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText14.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText13.getText().toString().length() == 0 && editText14.getText().toString().length() == 0 && editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0
                                && editText17.getText().toString().length() == 0) {
                            editText15.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no15 = Float.valueOf(editText15.getText().toString());
                        if (editText15.getText().toString().length() > 0 && no15 <= 10) {
                            editText15.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no15 > 10) {
                            editText15.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText15.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText13.getText().toString().length() == 0 && editText14.getText().toString().length() == 0 && editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0
                                && editText17.getText().toString().length() == 0) {
                            editText16.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no16 = Float.valueOf(editText16.getText().toString());
                        if (editText16.getText().toString().length() > 0 && no16 <= 10) {
                            editText16.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no16 > 10) {
                            editText16.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText16.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText13.getText().toString().length() == 0 && editText14.getText().toString().length() == 0 && editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0
                                && editText17.getText().toString().length() == 0) {
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
                        if (editText19.getText().toString().length() == 0 && editText20.getText().toString().length() == 0 && editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0
                                && editText23.getText().toString().length() == 0) {
                            editText19.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no19 = Float.valueOf(editText19.getText().toString());
                        if (editText19.getText().toString().length() > 0 && no19 <= 10) {
                            editText19.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no19 > 10) {
                            editText19.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText19.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText19.getText().toString().length() == 0 && editText20.getText().toString().length() == 0 && editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0
                                && editText23.getText().toString().length() == 0) {
                            editText20.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no20 = Float.valueOf(editText20.getText().toString());
                        if (editText20.getText().toString().length() > 0 && no20 <= 10) {
                            editText20.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no20 > 10) {
                            editText20.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText20.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText19.getText().toString().length() == 0 && editText20.getText().toString().length() == 0 && editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0
                                && editText23.getText().toString().length() == 0) {
                            editText21.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no21 = Float.valueOf(editText21.getText().toString());
                        if (editText21.getText().toString().length() > 0 && no21 <= 10) {
                            editText21.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no21 > 10) {
                            editText21.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText21.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText19.getText().toString().length() == 0 && editText20.getText().toString().length() == 0 && editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0
                                && editText23.getText().toString().length() == 0) {
                            editText22.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no22 = Float.valueOf(editText22.getText().toString());
                        if (editText22.getText().toString().length() > 0 && no22 <= 10) {
                            editText22.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no22 > 10) {
                            editText22.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText22.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText19.getText().toString().length() == 0 && editText20.getText().toString().length() == 0 && editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0
                                && editText23.getText().toString().length() == 0) {
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
                        if (editText25.getText().toString().length() == 0 && editText26.getText().toString().length() == 0 && editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0
                                && editText29.getText().toString().length() == 0) {
                            editText25.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no25 = Float.valueOf(editText25.getText().toString());
                        if (editText25.getText().toString().length() > 0 && no25 <= 10) {
                            editText25.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no25 > 10) {
                            editText25.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText25.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText25.getText().toString().length() == 0 && editText26.getText().toString().length() == 0 && editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0
                                && editText29.getText().toString().length() == 0) {
                            editText26.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no26 = Float.valueOf(editText26.getText().toString());
                        if (editText26.getText().toString().length() > 0 && no26 <= 10) {
                            editText26.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no26 > 10) {
                            editText26.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText26.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText25.getText().toString().length() == 0 && editText26.getText().toString().length() == 0 && editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0
                                && editText29.getText().toString().length() == 0) {
                            editText27.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no27 = Float.valueOf(editText27.getText().toString());
                        if (editText27.getText().toString().length() > 0 && no27 <= 10) {
                            editText27.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no27 > 10) {
                            editText27.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText27.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText25.getText().toString().length() == 0 && editText26.getText().toString().length() == 0 && editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0
                                && editText29.getText().toString().length() == 0) {
                            editText28.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no28 = Float.valueOf(editText28.getText().toString());
                        if (editText28.getText().toString().length() > 0 && no28 <= 10) {
                            editText28.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no28 > 10) {
                            editText28.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText28.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText25.getText().toString().length() == 0 && editText26.getText().toString().length() == 0 && editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0
                                && editText29.getText().toString().length() == 0) {
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
                        if (editText31.getText().toString().length() == 0 && editText32.getText().toString().length() == 0 && editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0
                                && editText35.getText().toString().length() == 0) {
                            editText31.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no31 = Float.valueOf(editText31.getText().toString());
                        if (editText31.getText().toString().length() > 0 && no31 <= 10) {
                            editText31.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no31 > 10) {
                            editText31.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText31.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText31.getText().toString().length() == 0 && editText32.getText().toString().length() == 0 && editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0
                                && editText35.getText().toString().length() == 0) {
                            editText32.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no32 = Float.valueOf(editText32.getText().toString());
                        if (editText32.getText().toString().length() > 0 && no32 <= 10) {
                            editText32.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no32 > 10) {
                            editText32.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText32.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText31.getText().toString().length() == 0 && editText32.getText().toString().length() == 0 && editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0
                                && editText35.getText().toString().length() == 0) {
                            editText33.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no33 = Float.valueOf(editText33.getText().toString());
                        if (editText33.getText().toString().length() > 0 && no33 <= 10) {
                            editText33.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no33 > 10) {
                            editText33.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText33.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText31.getText().toString().length() == 0 && editText32.getText().toString().length() == 0 && editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0
                                && editText35.getText().toString().length() == 0) {
                            editText34.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no34 = Float.valueOf(editText34.getText().toString());
                        if (editText34.getText().toString().length() > 0 && no34 <= 10) {
                            editText34.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no34 > 10) {
                            editText34.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText34.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText31.getText().toString().length() == 0 && editText32.getText().toString().length() == 0 && editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0
                                && editText35.getText().toString().length() == 0) {
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
                        if (editText37.getText().toString().length() == 0 && editText38.getText().toString().length() == 0 && editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0
                                && editText41.getText().toString().length() == 0) {
                            editText37.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no37 = Float.valueOf(editText37.getText().toString());
                        if (editText37.getText().toString().length() > 0 && no37 <= 10) {
                            editText37.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no37 > 10) {
                            editText37.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText37.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText37.getText().toString().length() == 0 && editText38.getText().toString().length() == 0 && editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0
                                && editText41.getText().toString().length() == 0) {
                            editText38.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no38 = Float.valueOf(editText38.getText().toString());
                        if (editText38.getText().toString().length() > 0 && no38 <= 10) {
                            editText38.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no38 > 10) {
                            editText38.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText38.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText37.getText().toString().length() == 0 && editText38.getText().toString().length() == 0 && editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0
                                && editText41.getText().toString().length() == 0) {
                            editText39.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no39 = Float.valueOf(editText39.getText().toString());
                        if (editText39.getText().toString().length() > 0 && no39 <= 10) {
                            editText39.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no39 > 10) {
                            editText39.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText39.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText37.getText().toString().length() == 0 && editText38.getText().toString().length() == 0 && editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0
                                && editText41.getText().toString().length() == 0) {
                            editText40.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no40 = Float.valueOf(editText40.getText().toString());
                        if (editText40.getText().toString().length() > 0 && no40 <= 10) {
                            editText40.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no40 > 10) {
                            editText40.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText40.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText37.getText().toString().length() == 0 && editText38.getText().toString().length() == 0 && editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0
                                && editText41.getText().toString().length() == 0) {
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
                        if (editText43.getText().toString().length() == 0 && editText44.getText().toString().length() == 0 && editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0
                                && editText47.getText().toString().length() == 0) {
                            editText43.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no43 = Float.valueOf(editText43.getText().toString());
                        if (editText43.getText().toString().length() > 0 && no43 <= 10) {
                            editText43.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no43 > 10) {
                            editText43.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText43.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText43.getText().toString().length() == 0 && editText44.getText().toString().length() == 0 && editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0
                                && editText47.getText().toString().length() == 0) {
                            editText44.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no44 = Float.valueOf(editText44.getText().toString());
                        if (editText44.getText().toString().length() > 0 && no44 <= 10) {
                            editText44.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no44 > 10) {
                            editText44.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText44.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText43.getText().toString().length() == 0 && editText44.getText().toString().length() == 0 && editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0
                                && editText47.getText().toString().length() == 0) {
                            editText45.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no45 = Float.valueOf(editText45.getText().toString());
                        if (editText45.getText().toString().length() > 0 && no45 <= 10) {
                            editText45.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no45 > 10) {
                            editText45.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText45.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText43.getText().toString().length() == 0 && editText44.getText().toString().length() == 0 && editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0
                                && editText47.getText().toString().length() == 0) {
                            editText46.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no46 = Float.valueOf(editText46.getText().toString());
                        if (editText46.getText().toString().length() > 0 && no46 <= 10) {
                            editText46.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no46 > 10) {
                            editText46.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText46.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText43.getText().toString().length() == 0 && editText44.getText().toString().length() == 0 && editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0
                                && editText47.getText().toString().length() == 0) {
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
                        if (editText49.getText().toString().length() == 0 && editText50.getText().toString().length() == 0 && editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0
                                && editText53.getText().toString().length() == 0) {
                            editText49.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no49 = Float.valueOf(editText49.getText().toString());
                        if (editText49.getText().toString().length() > 0 && no49 <= 10) {
                            editText49.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no49 > 10) {
                            editText49.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText49.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText49.getText().toString().length() == 0 && editText50.getText().toString().length() == 0 && editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0
                                && editText53.getText().toString().length() == 0) {
                            editText50.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no50 = Float.valueOf(editText50.getText().toString());
                        if (editText50.getText().toString().length() > 0 && no50 <= 10) {
                            editText50.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no50 > 10) {
                            editText50.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText50.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText49.getText().toString().length() == 0 && editText50.getText().toString().length() == 0 && editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0
                                && editText53.getText().toString().length() == 0) {
                            editText51.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no51 = Float.valueOf(editText51.getText().toString());
                        if (editText51.getText().toString().length() > 0 && no51 <= 10) {
                            editText51.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no51 > 10) {
                            editText51.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText51.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }
                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText49.getText().toString().length() == 0 && editText50.getText().toString().length() == 0 && editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0
                                && editText53.getText().toString().length() == 0) {
                            editText52.setBackgroundResource(R.drawable.edittext_background);
                        }
                        float no52 = Float.valueOf(editText52.getText().toString());
                        if (editText52.getText().toString().length() > 0 && no52 <= 10) {
                            editText52.setBackgroundResource(R.drawable.edittext_background);
                        }
                        if (no52 > 10) {
                            editText52.setTextColor(Color.parseColor("#FF0000"));
                        } else {
                            editText52.setTextColor(Color.parseColor("#FF0A9C10"));
                        }
                    }
                } catch
                (NumberFormatException e) {
                }

                try {
                    if (editText55.getText().toString().length() == 0) {
                        if (editText49.getText().toString().length() == 0 && editText50.getText().toString().length() == 0 && editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0
                                && editText53.getText().toString().length() == 0) {
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
