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

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.rosion.xthcb.MyData;
import com.rosion.xthcb.R;

import com.rosion.xthcb.activity_mon;
import com.rosion.xthcb.bahocki;
import com.rosion.xthcb.ketqua;
import com.rosion.xthcb.muoimothai;
import com.rosion.xthcb.namhocki;

import static android.content.Context.MODE_PRIVATE;

public class AdapMuoimothai extends RecyclerView.Adapter<AdapMuoimothai.ViewHolder> {

    MyData[] myData;
    Context context;

    public AdapMuoimothai(MyData[] myData, muoimothai activity) {
        this.myData = myData;
        this.context = activity;
    }

    @NonNull
    @Override
    public AdapMuoimothai.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_motmuoihai, parent, false);
        AdapMuoimothai.ViewHolder viewHolder = new AdapMuoimothai.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapMuoimothai.ViewHolder holder, int position) {
        final MyData myDataList = myData[position];
        holder.textViewDate.setText(myDataList.getName());
    }

    @Override
    public int getItemCount() {
        return myData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private InterstitialAd mInterstitialAd;
        EditText editText3, editText4, editText5, editText9, editText10, editText11, editText15, editText16, editText17, editText21, editText22, editText23, editText27, editText28, editText29, editText33, editText34, editText35,
                editText39, editText40, editText41, editText45, editText46, editText47,
                editText51, editText52, editText53, editText55;
        Button butnam, butnam2, xoahet, savedata;
        TextView textViewDate;
        private int n = 0;

        public static final String TEXT3 = "text";public static final String TEXT4 = "text";public static final String TEXT5 = "text";
        public static final String TEXT9 = "text";public static final String TEXT10 = "text";public static final String TEXT11 = "text";
        public static final String TEXT15 = "text";public static final String TEXT16 = "text";public static final String TEXT17 = "text";
        public static final String TEXT21 = "text";public static final String TEXT22 = "text";public static final String TEXT23 = "text";
        public static final String TEXT27 = "text";public static final String TEXT28 = "text"; public static final String TEXT29 = "text";
        public static final String TEXT33 = "text";public static final String TEXT34 = "text";public static final String TEXT35 = "text";
        public static final String TEXT39 = "text";public static final String TEXT40 = "text";public static final String TEXT41 = "text";
        public static final String TEXT45 = "text";public static final String TEXT46 = "text"; public static final String TEXT47 = "text";
        public static final String TEXT51 = "text";public static final String TEXT52 = "text";public static final String TEXT53 = "text";
        private String text3,text4,text5,text9,text10,text11,text15,text16,text17,text21,text22,text23,text27,
                text28,text29,text33,text34,text35,text39,text40,text41,text45,text46,text47,text51,text52,text53;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDate = itemView.findViewById(R.id.namedate);

            editText3 = (EditText) itemView.findViewById(R.id.edit3);
            editText4 = (EditText) itemView.findViewById(R.id.edit4);
            editText5 = (EditText) itemView.findViewById(R.id.edit5);

            editText9 = (EditText) itemView.findViewById(R.id.edit9);
            editText10 = (EditText) itemView.findViewById(R.id.edit10);
            editText11 = (EditText) itemView.findViewById(R.id.edit11);

            editText15 = (EditText) itemView.findViewById(R.id.edit15);
            editText16 = (EditText) itemView.findViewById(R.id.edit16);
            editText17 = (EditText) itemView.findViewById(R.id.edit17);

            editText21 = (EditText) itemView.findViewById(R.id.edit21);
            editText22 = (EditText) itemView.findViewById(R.id.edit22);
            editText23 = (EditText) itemView.findViewById(R.id.edit23);

            editText27 = (EditText) itemView.findViewById(R.id.edit27);
            editText28 = (EditText) itemView.findViewById(R.id.edit28);
            editText29 = (EditText) itemView.findViewById(R.id.edit29);

            editText33 = (EditText) itemView.findViewById(R.id.edit33);
            editText34 = (EditText) itemView.findViewById(R.id.edit34);
            editText35 = (EditText) itemView.findViewById(R.id.edit35);

            editText39 = (EditText) itemView.findViewById(R.id.edit39);
            editText40 = (EditText) itemView.findViewById(R.id.edit40);
            editText41 = (EditText) itemView.findViewById(R.id.edit41);

            editText45 = (EditText) itemView.findViewById(R.id.edit45);
            editText46 = (EditText) itemView.findViewById(R.id.edit46);
            editText47 = (EditText) itemView.findViewById(R.id.edit47);

            editText51 = (EditText) itemView.findViewById(R.id.edit51);
            editText52 = (EditText) itemView.findViewById(R.id.edit52);
            editText53 = (EditText) itemView.findViewById(R.id.edit53);


            editText55 = (EditText) itemView.findViewById(R.id.edit55);

            editText3.addTextChangedListener(myTextWatcher);
            editText4.addTextChangedListener(myTextWatcher);
            editText5.addTextChangedListener(myTextWatcher);

            editText9.addTextChangedListener(myTextWatcher);
            editText10.addTextChangedListener(myTextWatcher);
            editText11.addTextChangedListener(myTextWatcher);

            editText15.addTextChangedListener(myTextWatcher);
            editText16.addTextChangedListener(myTextWatcher);
            editText17.addTextChangedListener(myTextWatcher);

            editText21.addTextChangedListener(myTextWatcher);
            editText22.addTextChangedListener(myTextWatcher);
            editText23.addTextChangedListener(myTextWatcher);

            editText27.addTextChangedListener(myTextWatcher);
            editText28.addTextChangedListener(myTextWatcher);
            editText29.addTextChangedListener(myTextWatcher);

            editText33.addTextChangedListener(myTextWatcher);
            editText34.addTextChangedListener(myTextWatcher);
            editText35.addTextChangedListener(myTextWatcher);

            editText39.addTextChangedListener(myTextWatcher);
            editText40.addTextChangedListener(myTextWatcher);
            editText41.addTextChangedListener(myTextWatcher);

            editText45.addTextChangedListener(myTextWatcher);
            editText46.addTextChangedListener(myTextWatcher);
            editText47.addTextChangedListener(myTextWatcher);

            editText51.addTextChangedListener(myTextWatcher);
            editText52.addTextChangedListener(myTextWatcher);
            editText53.addTextChangedListener(myTextWatcher);

            butnam = itemView.findViewById(R.id.butnam);
            butnam2 = itemView.findViewById(R.id.butnam2);
            xoahet = itemView.findViewById(R.id.xoahet);
            savedata = itemView.findViewById(R.id.savedata);

            loadData();
            updateViews();

            MobileAds.initialize(context,
                    "ca-app-pub-9002559574859995~9859723704");

            mInterstitialAd = new InterstitialAd(context);
            mInterstitialAd.setAdUnitId("ca-app-pub-9002559574859995/8527147460");
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.

                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    if (editText3.getText().toString().length() == 0) {
                        editText3.setText("11");
                    }
                    if (editText4.getText().toString().length() == 0) {
                        editText4.setText("11");
                    }
                    if (editText5.getText().toString().length() == 0) {
                        editText5.setText("11");
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
                    if (editText15.getText().toString().length() == 0) {
                        editText15.setText("11");
                    }
                    if (editText16.getText().toString().length() == 0) {
                        editText16.setText("11");
                    }
                    if (editText17.getText().toString().length() == 0) {
                        editText17.setText("11");
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
                    if (editText27.getText().toString().length() == 0) {
                        editText27.setText("11");
                    }
                    if (editText28.getText().toString().length() == 0) {
                        editText28.setText("11");
                    }
                    if (editText29.getText().toString().length() == 0) {
                        editText29.setText("11");
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
                    if (editText39.getText().toString().length() == 0) {
                        editText39.setText("11");
                    }
                    if (editText40.getText().toString().length() == 0) {
                        editText40.setText("11");
                    }
                    if (editText41.getText().toString().length() == 0) {
                        editText41.setText("11");
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
                    if (editText51.getText().toString().length() == 0) {
                        editText51.setText("11");
                    }
                    if (editText52.getText().toString().length() == 0) {
                        editText52.setText("11");
                    }
                    if (editText53.getText().toString().length() == 0) {
                        editText53.setText("11");
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
                    if (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".")) {
                        editText9.setText("12");
                    }
                    if (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".")) {
                        editText10.setText("12");
                    }
                    if (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".")) {
                        editText11.setText("12");
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
                    if (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".")) {
                        editText21.setText("12");
                    }
                    if (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".")) {
                        editText22.setText("12");
                    }
                    if (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".")) {
                        editText23.setText("12");
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
                    if (editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".")) {
                        editText33.setText("12");
                    }
                    if (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".")) {
                        editText34.setText("12");
                    }
                    if (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".")) {
                        editText35.setText("12");
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
                    if (editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".")) {
                        editText45.setText("12");
                    }
                    if (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".")) {
                        editText46.setText("12");
                    }
                    if (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".")) {
                        editText47.setText("12");
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


                    float no3 = Float.valueOf(editText3.getText().toString());
                    float no4 = Float.valueOf(editText4.getText().toString());
                    float no5 = Float.valueOf(editText5.getText().toString());


                    float no9 = Float.valueOf(editText9.getText().toString());
                    float no10 = Float.valueOf(editText10.getText().toString());
                    float no11 = Float.valueOf(editText11.getText().toString());


                    float no15 = Float.valueOf(editText15.getText().toString());
                    float no16 = Float.valueOf(editText16.getText().toString());
                    float no17 = Float.valueOf(editText17.getText().toString());


                    float no21 = Float.valueOf(editText21.getText().toString());
                    float no22 = Float.valueOf(editText22.getText().toString());
                    float no23 = Float.valueOf(editText23.getText().toString());


                    float no27 = Float.valueOf(editText27.getText().toString());
                    float no28 = Float.valueOf(editText28.getText().toString());
                    float no29 = Float.valueOf(editText29.getText().toString());


                    float no33 = Float.valueOf(editText33.getText().toString());
                    float no34 = Float.valueOf(editText34.getText().toString());
                    float no35 = Float.valueOf(editText35.getText().toString());


                    float no39 = Float.valueOf(editText39.getText().toString());
                    float no40 = Float.valueOf(editText40.getText().toString());
                    float no41 = Float.valueOf(editText41.getText().toString());


                    float no45 = Float.valueOf(editText45.getText().toString());
                    float no46 = Float.valueOf(editText46.getText().toString());
                    float no47 = Float.valueOf(editText47.getText().toString());


                    float no51 = Float.valueOf(editText51.getText().toString());
                    float no52 = Float.valueOf(editText52.getText().toString());
                    float no53 = Float.valueOf(editText53.getText().toString());


                    if (no3 == 11) {
                        editText3.setText("");
                    }
                    if (no4 == 11) {
                        editText4.setText("");
                    }
                    if (no5 == 11) {
                        editText5.setText("");
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
                    if (no15 == 11) {
                        editText15.setText("");
                    }
                    if (no16 == 11) {
                        editText16.setText("");
                    }
                    if (no17 == 11) {
                        editText17.setText("");
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
                    if (no27 == 11) {
                        editText27.setText("");
                    }
                    if (no28 == 11) {
                        editText28.setText("");
                    }
                    if (no29 == 11) {
                        editText29.setText("");
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
                    if (no39 == 11) {
                        editText39.setText("");
                    }
                    if (no40 == 11) {
                        editText40.setText("");
                    }
                    if (no41 == 11) {
                        editText41.setText("");
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
                    if (no51 == 11) {
                        editText51.setText("");
                    }
                    if (no52 == 11) {
                        editText52.setText("");
                    }
                    if (no53 == 11) {
                        editText53.setText("");
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
                    if (no9 == 12) {
                        editText9.setText(".");
                    }
                    if (no10 == 12) {
                        editText10.setText(".");
                    }
                    if (no11 == 12) {
                        editText11.setText(".");
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
                    if (no21 == 12) {
                        editText21.setText(".");
                    }
                    if (no22 == 12) {
                        editText22.setText(".");
                    }
                    if (no23 == 12) {
                        editText23.setText(".");
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
                    if (no33 == 12) {
                        editText33.setText(".");
                    }
                    if (no34 == 12) {
                        editText34.setText(".");
                    }
                    if (no35 == 12) {
                        editText35.setText(".");
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
                    if (no45 == 12) {
                        editText45.setText(".");
                    }
                    if (no46 == 12) {
                        editText46.setText(".");
                    }
                    if (no47 == 12) {
                        editText47.setText(".");
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

                    float a0t = (no3 + no4 + no5) / 3 * 100;
                    int roa0t = Math.round(a0t);
                    Float a0t2 = Float.valueOf(roa0t) / 100;

                    float a0l = (no9 + no10 + no11) / 3 * 100;
                    int roa0l = Math.round(a0l);
                    Float a0l2 = Float.valueOf(roa0l) / 100;

                    float a0h = (no15 + no16 + no17) / 3 * 100;
                    int roa0h = Math.round(a0h);
                    Float a0h2 = Float.valueOf(roa0h) / 100;

                    float a1a = (no21 + no22 + no23) / 3 * 100;
                    int roa1a = Math.round(a1a);
                    Float a1a2 = Float.valueOf(roa1a) / 100;

                    float c0v = (no27 + no28 + no29) / 3 * 100;
                    int roc0v = Math.round(c0v);
                    Float c0v2 = Float.valueOf(roc0v) / 100;

                    float b0s = (no33 + no34 + no35) / 3 * 100;
                    int rob0s = Math.round(b0s);
                    Float b0s2 = Float.valueOf(rob0s) / 100;

                    float c0su = (no39 + no40 + no41) / 3 * 100;
                    int roc0su = Math.round(c0su);
                    Float c0su2 = Float.valueOf(roc0su) / 100;

                    float c0d = (no45 + no46 + no47) / 3 * 100;
                    int roc0d = Math.round(c0d);
                    Float c0d2 = Float.valueOf(roc0d) / 100;

                    float c19gd = (no51 + no52 + no53) / 3 * 100;
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

                    float a =5;

                    if (((editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".") || editText3.getText().toString().length() == 0 || no3 > 10) || (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".") || editText4.getText().toString().length() == 0 || no4 > 10)
                            || (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() == 0 || no5 > 10))
                            && (editText3.getText().toString().length() > 0 || editText4.getText().toString().length() > 0 || editText5.getText().toString().length() > 0)) {

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

                    if (((editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".") || editText9.getText().toString().length() == 0 || no9 > 10) || (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".") || editText10.getText().toString().length() == 0 || no10 > 10)
                            || (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".") || editText11.getText().toString().length() == 0 || no11 > 10))
                            && (editText9.getText().toString().length() > 0 || editText10.getText().toString().length() > 0 || editText11.getText().toString().length() > 0)) {

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

                    if ((
                            (editText15.getText().toString().length() == 1 && editText15.getText().toString().contains(".") || editText15.getText().toString().length() == 0 || no15 > 10) || (editText16.getText().toString().length() == 1 && editText16.getText().toString().contains(".") || editText16.getText().toString().length() == 0 || no16 > 10)
                                    || (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".") || editText17.getText().toString().length() == 0 || no17 > 10))
                            && (editText15.getText().toString().length() > 0 || editText16.getText().toString().length() > 0 || editText17.getText().toString().length() > 0)) {

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

                    if ((
                            (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".") || editText21.getText().toString().length() == 0 || no21 > 10) || (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".") || editText22.getText().toString().length() == 0 || no22 > 10)
                                    || (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".") || editText23.getText().toString().length() == 0 || no23 > 10))
                            && (editText21.getText().toString().length() > 0 || editText22.getText().toString().length() > 0 || editText23.getText().toString().length() > 0)) {

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

                    if ((
                            (editText27.getText().toString().length() == 1 && editText27.getText().toString().contains(".") || editText27.getText().toString().length() == 0 || no27 > 10) || (editText28.getText().toString().length() == 1 && editText28.getText().toString().contains(".") || editText28.getText().toString().length() == 0 || no28 > 10)
                                    || (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".") || editText29.getText().toString().length() == 0 || no29 > 10))
                            && (editText27.getText().toString().length() > 0 || editText28.getText().toString().length() > 0 || editText29.getText().toString().length() > 0)) {

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

                    if (((editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".") || editText33.getText().toString().length() == 0 || no33 > 10) || (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".") || editText34.getText().toString().length() == 0 || no34 > 10)
                            || (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".") || editText35.getText().toString().length() == 0 || no35 > 10))
                            && (editText33.getText().toString().length() > 0 || editText34.getText().toString().length() > 0 || editText35.getText().toString().length() > 0)) {

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

                    if (((editText39.getText().toString().length() == 1 && editText39.getText().toString().contains(".") || editText39.getText().toString().length() == 0 || no39 > 10) || (editText40.getText().toString().length() == 1 && editText40.getText().toString().contains(".") || editText40.getText().toString().length() == 0 || no40 > 10)
                            || (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".") || editText41.getText().toString().length() == 0 || no41 > 10))
                            && (editText39.getText().toString().length() > 0 || editText40.getText().toString().length() > 0 || editText41.getText().toString().length() > 0)) {

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

                    if (((editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".") || editText45.getText().toString().length() == 0 || no45 > 10) || (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".") || editText46.getText().toString().length() == 0 || no46 > 10)
                            || (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".") || editText47.getText().toString().length() == 0 || no47 > 10))
                            && (editText45.getText().toString().length() > 0 || editText46.getText().toString().length() > 0 || editText47.getText().toString().length() > 0)) {

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

                    if (((editText51.getText().toString().length() == 1 && editText51.getText().toString().contains(".") || editText51.getText().toString().length() == 0 || no51 > 10) || (editText52.getText().toString().length() == 1 && editText52.getText().toString().contains(".") || editText52.getText().toString().length() == 0 || no52 > 10)
                            || (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".") || editText53.getText().toString().length() == 0 || no53 > 10))
                            && (editText51.getText().toString().length() > 0 || editText52.getText().toString().length() > 0 || editText53.getText().toString().length() > 0)) {

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

                    if (((editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0 && editText5.getText().toString().length() == 0) || (no3 <= 10 && no4 <= 10 && no5 <= 10))
                            && (editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0 && editText11.getText().toString().length() == 0) || (no9 <= 10 && no10 <= 10 && no11 <= 10)
                            && ((editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0 && editText17.getText().toString().length() == 0) || (no15 <= 10 && no16 <= 10 && no17 <= 10))
                            && ((editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0 && editText23.getText().toString().length() == 0) || (no21 <= 10 && no22 <= 10 && no23 <= 10))
                            && ((editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0 && editText29.getText().toString().length() == 0) || (no27 <= 10 && no28 <= 10 && no29 <= 10))
                            && ((editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0 && editText35.getText().toString().length() == 0) || (no33 <= 10 && no34 <= 10 && no35 <= 10))
                            && ((editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0 && editText41.getText().toString().length() == 0) || (no39 <= 10 && no40 <= 10 && no41 <= 10))
                            && ((editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0 && editText47.getText().toString().length() == 0) || (no45 <= 10 && no46 <= 10 && no47 <= 10))
                            && ((editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0 && editText53.getText().toString().length() == 0) || (no51 <= 10 && no52 <= 10 && no53 <= 10))

                    ) {
                        if(n==1) {
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

                            intent.putExtra("no3", no3);
                            intent.putExtra("no4", no4);
                            intent.putExtra("no5", no5);


                            intent.putExtra("no9", no9);
                            intent.putExtra("no10", no10);
                            intent.putExtra("no11", no11);


                            intent.putExtra("no15", no15);
                            intent.putExtra("no16", no16);
                            intent.putExtra("no17", no17);


                            intent.putExtra("no21", no21);
                            intent.putExtra("no22", no22);
                            intent.putExtra("no23", no23);


                            intent.putExtra("no27", no27);
                            intent.putExtra("no28", no28);
                            intent.putExtra("no29", no29);


                            intent.putExtra("no33", no33);
                            intent.putExtra("no34", no34);
                            intent.putExtra("no35", no35);


                            intent.putExtra("no39", no39);
                            intent.putExtra("no40", no40);
                            intent.putExtra("no41", no41);


                            intent.putExtra("no45", no45);
                            intent.putExtra("no46", no46);
                            intent.putExtra("no47", no47);

                            intent.putExtra("no51", no51);
                            intent.putExtra("no52", no52);
                            intent.putExtra("no53", no53);
                            context.startActivity(intent);
                        }
                        if(n==2) {
                            Intent intent = new Intent(context, activity_mon.class);
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

                            intent.putExtra("no3", no3);
                            intent.putExtra("no4", no4);
                            intent.putExtra("no5", no5);


                            intent.putExtra("no9", no9);
                            intent.putExtra("no10", no10);
                            intent.putExtra("no11", no11);


                            intent.putExtra("no15", no15);
                            intent.putExtra("no16", no16);
                            intent.putExtra("no17", no17);


                            intent.putExtra("no21", no21);
                            intent.putExtra("no22", no22);
                            intent.putExtra("no23", no23);


                            intent.putExtra("no27", no27);
                            intent.putExtra("no28", no28);
                            intent.putExtra("no29", no29);


                            intent.putExtra("no33", no33);
                            intent.putExtra("no34", no34);
                            intent.putExtra("no35", no35);


                            intent.putExtra("no39", no39);
                            intent.putExtra("no40", no40);
                            intent.putExtra("no41", no41);


                            intent.putExtra("no45", no45);
                            intent.putExtra("no46", no46);
                            intent.putExtra("no47", no47);

                            intent.putExtra("no51", no51);
                            intent.putExtra("no52", no52);
                            intent.putExtra("no53", no53);
                            context.startActivity(intent);
                        }
                    }
                    //editText43.setText("123");
                }
            });
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
                    editText3.setText("");
                    editText4.setText("");
                    editText5.setText("");
                    editText9.setText("");
                    editText10.setText("");
                    editText11.setText("");
                    editText15.setText("");
                    editText16.setText("");
                    editText17.setText("");
                    editText21.setText("");
                    editText22.setText("");
                    editText23.setText("");
                    editText27.setText("");
                    editText28.setText("");
                    editText29.setText("");
                    editText33.setText("");
                    editText34.setText("");
                    editText35.setText("");
                    editText39.setText("");
                    editText40.setText("");
                    editText41.setText("");
                    editText45.setText("");
                    editText46.setText("");
                    editText47.setText("");
                    editText51.setText("");
                    editText52.setText("");
                    editText53.setText("");
                    saveData();
                }
            }));
            butnam.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    n=1;
                    if (editText3.getText().toString().length() == 0) {
                        editText3.setText("11");
                    }
                    if (editText4.getText().toString().length() == 0) {
                        editText4.setText("11");
                    }
                    if (editText5.getText().toString().length() == 0) {
                        editText5.setText("11");
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
                    if (editText15.getText().toString().length() == 0) {
                        editText15.setText("11");
                    }
                    if (editText16.getText().toString().length() == 0) {
                        editText16.setText("11");
                    }
                    if (editText17.getText().toString().length() == 0) {
                        editText17.setText("11");
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
                    if (editText27.getText().toString().length() == 0) {
                        editText27.setText("11");
                    }
                    if (editText28.getText().toString().length() == 0) {
                        editText28.setText("11");
                    }
                    if (editText29.getText().toString().length() == 0) {
                        editText29.setText("11");
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
                    if (editText39.getText().toString().length() == 0) {
                        editText39.setText("11");
                    }
                    if (editText40.getText().toString().length() == 0) {
                        editText40.setText("11");
                    }
                    if (editText41.getText().toString().length() == 0) {
                        editText41.setText("11");
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
                    if (editText51.getText().toString().length() == 0) {
                        editText51.setText("11");
                    }
                    if (editText52.getText().toString().length() == 0) {
                        editText52.setText("11");
                    }
                    if (editText53.getText().toString().length() == 0) {
                        editText53.setText("11");
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
                    if (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".")) {
                        editText9.setText("12");
                    }
                    if (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".")) {
                        editText10.setText("12");
                    }
                    if (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".")) {
                        editText11.setText("12");
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
                    if (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".")) {
                        editText21.setText("12");
                    }
                    if (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".")) {
                        editText22.setText("12");
                    }
                    if (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".")) {
                        editText23.setText("12");
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
                    if (editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".")) {
                        editText33.setText("12");
                    }
                    if (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".")) {
                        editText34.setText("12");
                    }
                    if (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".")) {
                        editText35.setText("12");
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
                    if (editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".")) {
                        editText45.setText("12");
                    }
                    if (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".")) {
                        editText46.setText("12");
                    }
                    if (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".")) {
                        editText47.setText("12");
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


                    float no3 = Float.valueOf(editText3.getText().toString());
                    float no4 = Float.valueOf(editText4.getText().toString());
                    float no5 = Float.valueOf(editText5.getText().toString());


                    float no9 = Float.valueOf(editText9.getText().toString());
                    float no10 = Float.valueOf(editText10.getText().toString());
                    float no11 = Float.valueOf(editText11.getText().toString());


                    float no15 = Float.valueOf(editText15.getText().toString());
                    float no16 = Float.valueOf(editText16.getText().toString());
                    float no17 = Float.valueOf(editText17.getText().toString());


                    float no21 = Float.valueOf(editText21.getText().toString());
                    float no22 = Float.valueOf(editText22.getText().toString());
                    float no23 = Float.valueOf(editText23.getText().toString());


                    float no27 = Float.valueOf(editText27.getText().toString());
                    float no28 = Float.valueOf(editText28.getText().toString());
                    float no29 = Float.valueOf(editText29.getText().toString());


                    float no33 = Float.valueOf(editText33.getText().toString());
                    float no34 = Float.valueOf(editText34.getText().toString());
                    float no35 = Float.valueOf(editText35.getText().toString());


                    float no39 = Float.valueOf(editText39.getText().toString());
                    float no40 = Float.valueOf(editText40.getText().toString());
                    float no41 = Float.valueOf(editText41.getText().toString());


                    float no45 = Float.valueOf(editText45.getText().toString());
                    float no46 = Float.valueOf(editText46.getText().toString());
                    float no47 = Float.valueOf(editText47.getText().toString());


                    float no51 = Float.valueOf(editText51.getText().toString());
                    float no52 = Float.valueOf(editText52.getText().toString());
                    float no53 = Float.valueOf(editText53.getText().toString());


                    if (no3 == 11) {
                        editText3.setText("");
                    }
                    if (no4 == 11) {
                        editText4.setText("");
                    }
                    if (no5 == 11) {
                        editText5.setText("");
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
                    if (no15 == 11) {
                        editText15.setText("");
                    }
                    if (no16 == 11) {
                        editText16.setText("");
                    }
                    if (no17 == 11) {
                        editText17.setText("");
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
                    if (no27 == 11) {
                        editText27.setText("");
                    }
                    if (no28 == 11) {
                        editText28.setText("");
                    }
                    if (no29 == 11) {
                        editText29.setText("");
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
                    if (no39 == 11) {
                        editText39.setText("");
                    }
                    if (no40 == 11) {
                        editText40.setText("");
                    }
                    if (no41 == 11) {
                        editText41.setText("");
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
                    if (no51 == 11) {
                        editText51.setText("");
                    }
                    if (no52 == 11) {
                        editText52.setText("");
                    }
                    if (no53 == 11) {
                        editText53.setText("");
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
                    if (no9 == 12) {
                        editText9.setText(".");
                    }
                    if (no10 == 12) {
                        editText10.setText(".");
                    }
                    if (no11 == 12) {
                        editText11.setText(".");
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
                    if (no21 == 12) {
                        editText21.setText(".");
                    }
                    if (no22 == 12) {
                        editText22.setText(".");
                    }
                    if (no23 == 12) {
                        editText23.setText(".");
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
                    if (no33 == 12) {
                        editText33.setText(".");
                    }
                    if (no34 == 12) {
                        editText34.setText(".");
                    }
                    if (no35 == 12) {
                        editText35.setText(".");
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
                    if (no45 == 12) {
                        editText45.setText(".");
                    }
                    if (no46 == 12) {
                        editText46.setText(".");
                    }
                    if (no47 == 12) {
                        editText47.setText(".");
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

                    float a0t = (no3 + no4 + no5) / 3 * 100;
                    int roa0t = Math.round(a0t);
                    Float a0t2 = Float.valueOf(roa0t) / 100;

                    float a0l = (no9 + no10 + no11) / 3 * 100;
                    int roa0l = Math.round(a0l);
                    Float a0l2 = Float.valueOf(roa0l) / 100;

                    float a0h = (no15 + no16 + no17) / 3 * 100;
                    int roa0h = Math.round(a0h);
                    Float a0h2 = Float.valueOf(roa0h) / 100;

                    float a1a = (no21 + no22 + no23) / 3 * 100;
                    int roa1a = Math.round(a1a);
                    Float a1a2 = Float.valueOf(roa1a) / 100;

                    float c0v = (no27 + no28 + no29) / 3 * 100;
                    int roc0v = Math.round(c0v);
                    Float c0v2 = Float.valueOf(roc0v) / 100;

                    float b0s = (no33 + no34 + no35) / 3 * 100;
                    int rob0s = Math.round(b0s);
                    Float b0s2 = Float.valueOf(rob0s) / 100;

                    float c0su = (no39 + no40 + no41) / 3 * 100;
                    int roc0su = Math.round(c0su);
                    Float c0su2 = Float.valueOf(roc0su) / 100;

                    float c0d = (no45 + no46 + no47) / 3 * 100;
                    int roc0d = Math.round(c0d);
                    Float c0d2 = Float.valueOf(roc0d) / 100;

                    float c19gd = (no51 + no52 + no53) / 3 * 100;
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


                    if (((editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".") || editText3.getText().toString().length() == 0 || no3 > 10) || (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".") || editText4.getText().toString().length() == 0 || no4 > 10)
                            || (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() == 0 || no5 > 10))
                            && (editText3.getText().toString().length() > 0 || editText4.getText().toString().length() > 0 || editText5.getText().toString().length() > 0)) {

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

                    if (((editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".") || editText9.getText().toString().length() == 0 || no9 > 10) || (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".") || editText10.getText().toString().length() == 0 || no10 > 10)
                            || (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".") || editText11.getText().toString().length() == 0 || no11 > 10))
                            && (editText9.getText().toString().length() > 0 || editText10.getText().toString().length() > 0 || editText11.getText().toString().length() > 0)) {

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

                    if ((
                            (editText15.getText().toString().length() == 1 && editText15.getText().toString().contains(".") || editText15.getText().toString().length() == 0 || no15 > 10) || (editText16.getText().toString().length() == 1 && editText16.getText().toString().contains(".") || editText16.getText().toString().length() == 0 || no16 > 10)
                                    || (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".") || editText17.getText().toString().length() == 0 || no17 > 10))
                            && (editText15.getText().toString().length() > 0 || editText16.getText().toString().length() > 0 || editText17.getText().toString().length() > 0)) {

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

                    if ((
                            (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".") || editText21.getText().toString().length() == 0 || no21 > 10) || (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".") || editText22.getText().toString().length() == 0 || no22 > 10)
                                    || (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".") || editText23.getText().toString().length() == 0 || no23 > 10))
                            && (editText21.getText().toString().length() > 0 || editText22.getText().toString().length() > 0 || editText23.getText().toString().length() > 0)) {

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

                    if ((
                            (editText27.getText().toString().length() == 1 && editText27.getText().toString().contains(".") || editText27.getText().toString().length() == 0 || no27 > 10) || (editText28.getText().toString().length() == 1 && editText28.getText().toString().contains(".") || editText28.getText().toString().length() == 0 || no28 > 10)
                                    || (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".") || editText29.getText().toString().length() == 0 || no29 > 10))
                            && (editText27.getText().toString().length() > 0 || editText28.getText().toString().length() > 0 || editText29.getText().toString().length() > 0)) {

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

                    if (((editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".") || editText33.getText().toString().length() == 0 || no33 > 10) || (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".") || editText34.getText().toString().length() == 0 || no34 > 10)
                            || (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".") || editText35.getText().toString().length() == 0 || no35 > 10))
                            && (editText33.getText().toString().length() > 0 || editText34.getText().toString().length() > 0 || editText35.getText().toString().length() > 0)) {

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

                    if (((editText39.getText().toString().length() == 1 && editText39.getText().toString().contains(".") || editText39.getText().toString().length() == 0 || no39 > 10) || (editText40.getText().toString().length() == 1 && editText40.getText().toString().contains(".") || editText40.getText().toString().length() == 0 || no40 > 10)
                            || (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".") || editText41.getText().toString().length() == 0 || no41 > 10))
                            && (editText39.getText().toString().length() > 0 || editText40.getText().toString().length() > 0 || editText41.getText().toString().length() > 0)) {

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

                    if (((editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".") || editText45.getText().toString().length() == 0 || no45 > 10) || (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".") || editText46.getText().toString().length() == 0 || no46 > 10)
                            || (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".") || editText47.getText().toString().length() == 0 || no47 > 10))
                            && (editText45.getText().toString().length() > 0 || editText46.getText().toString().length() > 0 || editText47.getText().toString().length() > 0)) {

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

                    if (((editText51.getText().toString().length() == 1 && editText51.getText().toString().contains(".") || editText51.getText().toString().length() == 0 || no51 > 10) || (editText52.getText().toString().length() == 1 && editText52.getText().toString().contains(".") || editText52.getText().toString().length() == 0 || no52 > 10)
                            || (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".") || editText53.getText().toString().length() == 0 || no53 > 10))
                            && (editText51.getText().toString().length() > 0 || editText52.getText().toString().length() > 0 || editText53.getText().toString().length() > 0)) {

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

                    if (((editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0 && editText5.getText().toString().length() == 0) || (no3 <= 10 && no4 <= 10 && no5 <= 10))
                            && (editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0 && editText11.getText().toString().length() == 0) || (no9 <= 10 && no10 <= 10 && no11 <= 10)
                            && ((editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0 && editText17.getText().toString().length() == 0) || (no15 <= 10 && no16 <= 10 && no17 <= 10))
                            && ((editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0 && editText23.getText().toString().length() == 0) || (no21 <= 10 && no22 <= 10 && no23 <= 10))
                            && ((editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0 && editText29.getText().toString().length() == 0) || (no27 <= 10 && no28 <= 10 && no29 <= 10))
                            && ((editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0 && editText35.getText().toString().length() == 0) || (no33 <= 10 && no34 <= 10 && no35 <= 10))
                            && ((editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0 && editText41.getText().toString().length() == 0) || (no39 <= 10 && no40 <= 10 && no41 <= 10))
                            && ((editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0 && editText47.getText().toString().length() == 0) || (no45 <= 10 && no46 <= 10 && no47 <= 10))
                            && ((editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0 && editText53.getText().toString().length() == 0) || (no51 <= 10 && no52 <= 10 && no53 <= 10))

                    ) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        }
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

                            intent.putExtra("no3", no3);
                            intent.putExtra("no4", no4);
                            intent.putExtra("no5", no5);
                            intent.putExtra("no9", no9);
                            intent.putExtra("no10", no10);
                            intent.putExtra("no11", no11);

                            intent.putExtra("no15", no15);
                            intent.putExtra("no16", no16);
                            intent.putExtra("no17", no17);

                            intent.putExtra("no21", no21);
                            intent.putExtra("no22", no22);
                            intent.putExtra("no23", no23);

                            intent.putExtra("no27", no27);
                            intent.putExtra("no28", no28);
                            intent.putExtra("no29", no29);

                            intent.putExtra("no33", no33);
                            intent.putExtra("no34", no34);
                            intent.putExtra("no35", no35);

                            intent.putExtra("no39", no39);
                            intent.putExtra("no40", no40);
                            intent.putExtra("no41", no41);

                            intent.putExtra("no45", no45);
                            intent.putExtra("no46", no46);
                            intent.putExtra("no47", no47);

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
                    n=2;
                    if (editText3.getText().toString().length() == 0) {
                        editText3.setText("11");
                    }
                    if (editText4.getText().toString().length() == 0) {
                        editText4.setText("11");
                    }
                    if (editText5.getText().toString().length() == 0) {
                        editText5.setText("11");
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
                    if (editText15.getText().toString().length() == 0) {
                        editText15.setText("11");
                    }
                    if (editText16.getText().toString().length() == 0) {
                        editText16.setText("11");
                    }
                    if (editText17.getText().toString().length() == 0) {
                        editText17.setText("11");
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
                    if (editText27.getText().toString().length() == 0) {
                        editText27.setText("11");
                    }
                    if (editText28.getText().toString().length() == 0) {
                        editText28.setText("11");
                    }
                    if (editText29.getText().toString().length() == 0) {
                        editText29.setText("11");
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
                    if (editText39.getText().toString().length() == 0) {
                        editText39.setText("11");
                    }
                    if (editText40.getText().toString().length() == 0) {
                        editText40.setText("11");
                    }
                    if (editText41.getText().toString().length() == 0) {
                        editText41.setText("11");
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
                    if (editText51.getText().toString().length() == 0) {
                        editText51.setText("11");
                    }
                    if (editText52.getText().toString().length() == 0) {
                        editText52.setText("11");
                    }
                    if (editText53.getText().toString().length() == 0) {
                        editText53.setText("11");
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
                    if (editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".")) {
                        editText9.setText("12");
                    }
                    if (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".")) {
                        editText10.setText("12");
                    }
                    if (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".")) {
                        editText11.setText("12");
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
                    if (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".")) {
                        editText21.setText("12");
                    }
                    if (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".")) {
                        editText22.setText("12");
                    }
                    if (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".")) {
                        editText23.setText("12");
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
                    if (editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".")) {
                        editText33.setText("12");
                    }
                    if (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".")) {
                        editText34.setText("12");
                    }
                    if (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".")) {
                        editText35.setText("12");
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
                    if (editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".")) {
                        editText45.setText("12");
                    }
                    if (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".")) {
                        editText46.setText("12");
                    }
                    if (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".")) {
                        editText47.setText("12");
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


                    float no3 = Float.valueOf(editText3.getText().toString());
                    float no4 = Float.valueOf(editText4.getText().toString());
                    float no5 = Float.valueOf(editText5.getText().toString());


                    float no9 = Float.valueOf(editText9.getText().toString());
                    float no10 = Float.valueOf(editText10.getText().toString());
                    float no11 = Float.valueOf(editText11.getText().toString());


                    float no15 = Float.valueOf(editText15.getText().toString());
                    float no16 = Float.valueOf(editText16.getText().toString());
                    float no17 = Float.valueOf(editText17.getText().toString());


                    float no21 = Float.valueOf(editText21.getText().toString());
                    float no22 = Float.valueOf(editText22.getText().toString());
                    float no23 = Float.valueOf(editText23.getText().toString());


                    float no27 = Float.valueOf(editText27.getText().toString());
                    float no28 = Float.valueOf(editText28.getText().toString());
                    float no29 = Float.valueOf(editText29.getText().toString());


                    float no33 = Float.valueOf(editText33.getText().toString());
                    float no34 = Float.valueOf(editText34.getText().toString());
                    float no35 = Float.valueOf(editText35.getText().toString());


                    float no39 = Float.valueOf(editText39.getText().toString());
                    float no40 = Float.valueOf(editText40.getText().toString());
                    float no41 = Float.valueOf(editText41.getText().toString());


                    float no45 = Float.valueOf(editText45.getText().toString());
                    float no46 = Float.valueOf(editText46.getText().toString());
                    float no47 = Float.valueOf(editText47.getText().toString());


                    float no51 = Float.valueOf(editText51.getText().toString());
                    float no52 = Float.valueOf(editText52.getText().toString());
                    float no53 = Float.valueOf(editText53.getText().toString());


                    if (no3 == 11) {
                        editText3.setText("");
                    }
                    if (no4 == 11) {
                        editText4.setText("");
                    }
                    if (no5 == 11) {
                        editText5.setText("");
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
                    if (no15 == 11) {
                        editText15.setText("");
                    }
                    if (no16 == 11) {
                        editText16.setText("");
                    }
                    if (no17 == 11) {
                        editText17.setText("");
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
                    if (no27 == 11) {
                        editText27.setText("");
                    }
                    if (no28 == 11) {
                        editText28.setText("");
                    }
                    if (no29 == 11) {
                        editText29.setText("");
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
                    if (no39 == 11) {
                        editText39.setText("");
                    }
                    if (no40 == 11) {
                        editText40.setText("");
                    }
                    if (no41 == 11) {
                        editText41.setText("");
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
                    if (no51 == 11) {
                        editText51.setText("");
                    }
                    if (no52 == 11) {
                        editText52.setText("");
                    }
                    if (no53 == 11) {
                        editText53.setText("");
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
                    if (no9 == 12) {
                        editText9.setText(".");
                    }
                    if (no10 == 12) {
                        editText10.setText(".");
                    }
                    if (no11 == 12) {
                        editText11.setText(".");
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
                    if (no21 == 12) {
                        editText21.setText(".");
                    }
                    if (no22 == 12) {
                        editText22.setText(".");
                    }
                    if (no23 == 12) {
                        editText23.setText(".");
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
                    if (no33 == 12) {
                        editText33.setText(".");
                    }
                    if (no34 == 12) {
                        editText34.setText(".");
                    }
                    if (no35 == 12) {
                        editText35.setText(".");
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
                    if (no45 == 12) {
                        editText45.setText(".");
                    }
                    if (no46 == 12) {
                        editText46.setText(".");
                    }
                    if (no47 == 12) {
                        editText47.setText(".");
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

                    float a0t = (no3 + no4 + no5) / 3 * 100;
                    int roa0t = Math.round(a0t);
                    Float a0t2 = Float.valueOf(roa0t) / 100;

                    float a0l = (no9 + no10 + no11) / 3 * 100;
                    int roa0l = Math.round(a0l);
                    Float a0l2 = Float.valueOf(roa0l) / 100;

                    float a0h = (no15 + no16 + no17) / 3 * 100;
                    int roa0h = Math.round(a0h);
                    Float a0h2 = Float.valueOf(roa0h) / 100;

                    float a1a = (no21 + no22 + no23) / 3 * 100;
                    int roa1a = Math.round(a1a);
                    Float a1a2 = Float.valueOf(roa1a) / 100;

                    float c0v = (no27 + no28 + no29) / 3 * 100;
                    int roc0v = Math.round(c0v);
                    Float c0v2 = Float.valueOf(roc0v) / 100;

                    float b0s = (no33 + no34 + no35) / 3 * 100;
                    int rob0s = Math.round(b0s);
                    Float b0s2 = Float.valueOf(rob0s) / 100;

                    float c0su = (no39 + no40 + no41) / 3 * 100;
                    int roc0su = Math.round(c0su);
                    Float c0su2 = Float.valueOf(roc0su) / 100;

                    float c0d = (no45 + no46 + no47) / 3 * 100;
                    int roc0d = Math.round(c0d);
                    Float c0d2 = Float.valueOf(roc0d) / 100;

                    float c19gd = (no51 + no52 + no53) / 3 * 100;
                    int roc19gd = Math.round(c19gd);
                    Float c19gd2 = Float.valueOf(roc19gd) / 100;

                    float a = 5;

                    if (((editText3.getText().toString().length() == 1 && editText3.getText().toString().contains(".") || editText3.getText().toString().length() == 0 || no3 > 10) || (editText4.getText().toString().length() == 1 && editText4.getText().toString().contains(".") || editText4.getText().toString().length() == 0 || no4 > 10)
                            || (editText5.getText().toString().length() == 1 && editText5.getText().toString().contains(".") || editText5.getText().toString().length() == 0 || no5 > 10))
                            && (editText3.getText().toString().length() > 0 || editText4.getText().toString().length() > 0 || editText5.getText().toString().length() > 0)) {

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

                    if (((editText9.getText().toString().length() == 1 && editText9.getText().toString().contains(".") || editText9.getText().toString().length() == 0 || no9 > 10) || (editText10.getText().toString().length() == 1 && editText10.getText().toString().contains(".") || editText10.getText().toString().length() == 0 || no10 > 10)
                            || (editText11.getText().toString().length() == 1 && editText11.getText().toString().contains(".") || editText11.getText().toString().length() == 0 || no11 > 10))
                            && (editText9.getText().toString().length() > 0 || editText10.getText().toString().length() > 0 || editText11.getText().toString().length() > 0)) {

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

                    if ((
                            (editText15.getText().toString().length() == 1 && editText15.getText().toString().contains(".") || editText15.getText().toString().length() == 0 || no15 > 10) || (editText16.getText().toString().length() == 1 && editText16.getText().toString().contains(".") || editText16.getText().toString().length() == 0 || no16 > 10)
                                    || (editText17.getText().toString().length() == 1 && editText17.getText().toString().contains(".") || editText17.getText().toString().length() == 0 || no17 > 10))
                            && (editText15.getText().toString().length() > 0 || editText16.getText().toString().length() > 0 || editText17.getText().toString().length() > 0)) {

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

                    if ((
                            (editText21.getText().toString().length() == 1 && editText21.getText().toString().contains(".") || editText21.getText().toString().length() == 0 || no21 > 10) || (editText22.getText().toString().length() == 1 && editText22.getText().toString().contains(".") || editText22.getText().toString().length() == 0 || no22 > 10)
                                    || (editText23.getText().toString().length() == 1 && editText23.getText().toString().contains(".") || editText23.getText().toString().length() == 0 || no23 > 10))
                            && (editText21.getText().toString().length() > 0 || editText22.getText().toString().length() > 0 || editText23.getText().toString().length() > 0)) {

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

                    if ((
                            (editText27.getText().toString().length() == 1 && editText27.getText().toString().contains(".") || editText27.getText().toString().length() == 0 || no27 > 10) || (editText28.getText().toString().length() == 1 && editText28.getText().toString().contains(".") || editText28.getText().toString().length() == 0 || no28 > 10)
                                    || (editText29.getText().toString().length() == 1 && editText29.getText().toString().contains(".") || editText29.getText().toString().length() == 0 || no29 > 10))
                            && (editText27.getText().toString().length() > 0 || editText28.getText().toString().length() > 0 || editText29.getText().toString().length() > 0)) {

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

                    if (((editText33.getText().toString().length() == 1 && editText33.getText().toString().contains(".") || editText33.getText().toString().length() == 0 || no33 > 10) || (editText34.getText().toString().length() == 1 && editText34.getText().toString().contains(".") || editText34.getText().toString().length() == 0 || no34 > 10)
                            || (editText35.getText().toString().length() == 1 && editText35.getText().toString().contains(".") || editText35.getText().toString().length() == 0 || no35 > 10))
                            && (editText33.getText().toString().length() > 0 || editText34.getText().toString().length() > 0 || editText35.getText().toString().length() > 0)) {

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

                    if (((editText39.getText().toString().length() == 1 && editText39.getText().toString().contains(".") || editText39.getText().toString().length() == 0 || no39 > 10) || (editText40.getText().toString().length() == 1 && editText40.getText().toString().contains(".") || editText40.getText().toString().length() == 0 || no40 > 10)
                            || (editText41.getText().toString().length() == 1 && editText41.getText().toString().contains(".") || editText41.getText().toString().length() == 0 || no41 > 10))
                            && (editText39.getText().toString().length() > 0 || editText40.getText().toString().length() > 0 || editText41.getText().toString().length() > 0)) {

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

                    if (((editText45.getText().toString().length() == 1 && editText45.getText().toString().contains(".") || editText45.getText().toString().length() == 0 || no45 > 10) || (editText46.getText().toString().length() == 1 && editText46.getText().toString().contains(".") || editText46.getText().toString().length() == 0 || no46 > 10)
                            || (editText47.getText().toString().length() == 1 && editText47.getText().toString().contains(".") || editText47.getText().toString().length() == 0 || no47 > 10))
                            && (editText45.getText().toString().length() > 0 || editText46.getText().toString().length() > 0 || editText47.getText().toString().length() > 0)) {

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

                    if (((editText51.getText().toString().length() == 1 && editText51.getText().toString().contains(".") || editText51.getText().toString().length() == 0 || no51 > 10) || (editText52.getText().toString().length() == 1 && editText52.getText().toString().contains(".") || editText52.getText().toString().length() == 0 || no52 > 10)
                            || (editText53.getText().toString().length() == 1 && editText53.getText().toString().contains(".") || editText53.getText().toString().length() == 0 || no53 > 10))
                            && (editText51.getText().toString().length() > 0 || editText52.getText().toString().length() > 0 || editText53.getText().toString().length() > 0)) {

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

                    if (((editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0 && editText5.getText().toString().length() == 0) || (no3 <= 10 && no4 <= 10 && no5 <= 10))
                            && (editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0 && editText11.getText().toString().length() == 0) || (no9 <= 10 && no10 <= 10 && no11 <= 10)
                            && ((editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0 && editText17.getText().toString().length() == 0) || (no15 <= 10 && no16 <= 10 && no17 <= 10))
                            && ((editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0 && editText23.getText().toString().length() == 0) || (no21 <= 10 && no22 <= 10 && no23 <= 10))
                            && ((editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0 && editText29.getText().toString().length() == 0) || (no27 <= 10 && no28 <= 10 && no29 <= 10))
                            && ((editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0 && editText35.getText().toString().length() == 0) || (no33 <= 10 && no34 <= 10 && no35 <= 10))
                            && ((editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0 && editText41.getText().toString().length() == 0) || (no39 <= 10 && no40 <= 10 && no41 <= 10))
                            && ((editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0 && editText47.getText().toString().length() == 0) || (no45 <= 10 && no46 <= 10 && no47 <= 10))
                            && ((editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0 && editText53.getText().toString().length() == 0) || (no51 <= 10 && no52 <= 10 && no53 <= 10))

                    ) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        }
                        else {
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

                            intent.putExtra("no3", no3);
                            intent.putExtra("no4", no4);
                            intent.putExtra("no5", no5);


                            intent.putExtra("no9", no9);
                            intent.putExtra("no10", no10);
                            intent.putExtra("no11", no11);


                            intent.putExtra("no15", no15);
                            intent.putExtra("no16", no16);
                            intent.putExtra("no17", no17);


                            intent.putExtra("no21", no21);
                            intent.putExtra("no22", no22);
                            intent.putExtra("no23", no23);


                            intent.putExtra("no27", no27);
                            intent.putExtra("no28", no28);
                            intent.putExtra("no29", no29);


                            intent.putExtra("no33", no33);
                            intent.putExtra("no34", no34);
                            intent.putExtra("no35", no35);


                            intent.putExtra("no39", no39);
                            intent.putExtra("no40", no40);
                            intent.putExtra("no41", no41);


                            intent.putExtra("no45", no45);
                            intent.putExtra("no46", no46);
                            intent.putExtra("no47", no47);

                            intent.putExtra("no51", no51);
                            intent.putExtra("no52", no52);
                            intent.putExtra("no53", no53);

                            v.getContext().startActivity(intent);
                        }
                    }
                }
            });
        }

        public void saveData() {
            //editor.putBoolean(SWITCH1, switch1.isChecked());
            //Toast.makeText(this, "MeData saved", Toast.LENGTH_SHORT).show();
            SharedPreferences sharedPreferences3 = context.getSharedPreferences("bahiedit3", MODE_PRIVATE);
            SharedPreferences.Editor editor3 = sharedPreferences3.edit();
            editor3.putString(TEXT3, editText3.getText().toString());
            editor3.apply();
            SharedPreferences sharedPreferences4 = context.getSharedPreferences("bahiedit4", MODE_PRIVATE);
            SharedPreferences.Editor editor4 = sharedPreferences4.edit();
            editor4.putString(TEXT4, editText4.getText().toString());
            editor4.apply();
            SharedPreferences sharedPreferences5 = context.getSharedPreferences("bahiedit5", MODE_PRIVATE);
            SharedPreferences.Editor editor5 = sharedPreferences5.edit();
            editor5.putString(TEXT5, editText5.getText().toString());
            editor5.apply();
            SharedPreferences sharedPreferences9 = context.getSharedPreferences("bahiedit9", MODE_PRIVATE);
            SharedPreferences.Editor editor9 = sharedPreferences9.edit();
            editor9.putString(TEXT9, editText9.getText().toString());
            editor9.apply();
            SharedPreferences sharedPreferences10 = context.getSharedPreferences("bahiedit10", MODE_PRIVATE);
            SharedPreferences.Editor editor10 = sharedPreferences10.edit();
            editor10.putString(TEXT10, editText10.getText().toString());
            editor10.apply();
            SharedPreferences sharedPreferences11 = context.getSharedPreferences("bahiedit11", MODE_PRIVATE);
            SharedPreferences.Editor editor11 = sharedPreferences11.edit();
            editor11.putString(TEXT11, editText11.getText().toString());
            editor11.apply();
            SharedPreferences sharedPreferences15 = context.getSharedPreferences("bahiedit15", MODE_PRIVATE);
            SharedPreferences.Editor editor15 = sharedPreferences15.edit();
            editor15.putString(TEXT15, editText15.getText().toString());
            editor15.apply();
            SharedPreferences sharedPreferences16 = context.getSharedPreferences("bahiedit16", MODE_PRIVATE);
            SharedPreferences.Editor editor16 = sharedPreferences16.edit();
            editor16.putString(TEXT16, editText16.getText().toString());
            editor16.apply();
            SharedPreferences sharedPreferences17 = context.getSharedPreferences("bahiedit17", MODE_PRIVATE);
            SharedPreferences.Editor editor17 = sharedPreferences17.edit();
            editor17.putString(TEXT17, editText17.getText().toString());
            editor17.apply();
            SharedPreferences sharedPreferences21 = context.getSharedPreferences("bahiedit21", MODE_PRIVATE);
            SharedPreferences.Editor editor21 = sharedPreferences21.edit();
            editor21.putString(TEXT21, editText21.getText().toString());
            editor21.apply();
            SharedPreferences sharedPreferences22 = context.getSharedPreferences("bahiedit22", MODE_PRIVATE);
            SharedPreferences.Editor editor22 = sharedPreferences22.edit();
            editor22.putString(TEXT22, editText22.getText().toString());
            editor22.apply();
            SharedPreferences sharedPreferences23 = context.getSharedPreferences("bahiedit23", MODE_PRIVATE);
            SharedPreferences.Editor editor23 = sharedPreferences23.edit();
            editor23.putString(TEXT23, editText23.getText().toString());
            editor23.apply();
            SharedPreferences sharedPreferences27 = context.getSharedPreferences("bahiedit27", MODE_PRIVATE);
            SharedPreferences.Editor editor27 = sharedPreferences27.edit();
            editor27.putString(TEXT27, editText27.getText().toString());
            editor27.apply();
            SharedPreferences sharedPreferences28 = context.getSharedPreferences("bahiedit28", MODE_PRIVATE);
            SharedPreferences.Editor editor28 = sharedPreferences28.edit();
            editor28.putString(TEXT28, editText28.getText().toString());
            editor28.apply();
            SharedPreferences sharedPreferences29 = context.getSharedPreferences("bahiedit29", MODE_PRIVATE);
            SharedPreferences.Editor editor29 = sharedPreferences29.edit();
            editor29.putString(TEXT29, editText29.getText().toString());
            editor29.apply();
            SharedPreferences sharedPreferences33 = context.getSharedPreferences("bahiedit33", MODE_PRIVATE);
            SharedPreferences.Editor editor33 = sharedPreferences33.edit();
            editor33.putString(TEXT33, editText33.getText().toString());
            editor33.apply();
            SharedPreferences sharedPreferences34 = context.getSharedPreferences("bahiedit34", MODE_PRIVATE);
            SharedPreferences.Editor editor34 = sharedPreferences34.edit();
            editor34.putString(TEXT34, editText34.getText().toString());
            editor34.apply();
            SharedPreferences sharedPreferences35 = context.getSharedPreferences("bahiedit35", MODE_PRIVATE);
            SharedPreferences.Editor editor35 = sharedPreferences35.edit();
            editor35.putString(TEXT35, editText35.getText().toString());
            editor35.apply();
            SharedPreferences sharedPreferences39 = context.getSharedPreferences("bahiedit39", MODE_PRIVATE);
            SharedPreferences.Editor editor39 = sharedPreferences39.edit();
            editor39.putString(TEXT39, editText39.getText().toString());
            editor39.apply();
            SharedPreferences sharedPreferences40 = context.getSharedPreferences("bahiedit40", MODE_PRIVATE);
            SharedPreferences.Editor editor40 = sharedPreferences40.edit();
            editor40.putString(TEXT40, editText40.getText().toString());
            editor40.apply();
            SharedPreferences sharedPreferences41 = context.getSharedPreferences("bahiedit41", MODE_PRIVATE);
            SharedPreferences.Editor editor41 = sharedPreferences41.edit();
            editor41.putString(TEXT41, editText41.getText().toString());
            editor41.apply();
            SharedPreferences sharedPreferences45 = context.getSharedPreferences("bahiedit45", MODE_PRIVATE);
            SharedPreferences.Editor editor45 = sharedPreferences45.edit();
            editor45.putString(TEXT45, editText45.getText().toString());
            editor45.apply();
            SharedPreferences sharedPreferences46 = context.getSharedPreferences("bahiedit46", MODE_PRIVATE);
            SharedPreferences.Editor editor46 = sharedPreferences46.edit();
            editor46.putString(TEXT46, editText46.getText().toString());
            editor46.apply();
            SharedPreferences sharedPreferences47 = context.getSharedPreferences("bahiedit47", MODE_PRIVATE);
            SharedPreferences.Editor editor47 = sharedPreferences47.edit();
            editor47.putString(TEXT47, editText47.getText().toString());
            editor47.apply();
            SharedPreferences sharedPreferences51 = context.getSharedPreferences("bahiedit51", MODE_PRIVATE);
            SharedPreferences.Editor editor51 = sharedPreferences51.edit();
            editor51.putString(TEXT51, editText51.getText().toString());
            editor51.apply();
            SharedPreferences sharedPreferences52 = context.getSharedPreferences("bahiedit52", MODE_PRIVATE);
            SharedPreferences.Editor editor52 = sharedPreferences52.edit();
            editor52.putString(TEXT52, editText52.getText().toString());
            editor52.apply();
            SharedPreferences sharedPreferences53 = context.getSharedPreferences("bahiedit53", MODE_PRIVATE);
            SharedPreferences.Editor editor53 = sharedPreferences53.edit();
            editor53.putString(TEXT53, editText53.getText().toString());
            editor53.apply();
        }

        public void loadData() {
            SharedPreferences sharedPreferences3 = context.getSharedPreferences("bahiedit3", MODE_PRIVATE);
            text3 = sharedPreferences3.getString(TEXT3, "");
            SharedPreferences sharedPreferences4 = context.getSharedPreferences("bahiedit4", MODE_PRIVATE);
            text4 = sharedPreferences4.getString(TEXT4, "");
            SharedPreferences sharedPreferences5 = context.getSharedPreferences("bahiedit5", MODE_PRIVATE);
            text5 = sharedPreferences5.getString(TEXT5, "");
            SharedPreferences sharedPreferences9 = context.getSharedPreferences("bahiedit9", MODE_PRIVATE);
            text9 = sharedPreferences9.getString(TEXT9, "");
            SharedPreferences sharedPreferences10 = context.getSharedPreferences("bahiedit10", MODE_PRIVATE);
            text10 = sharedPreferences10.getString(TEXT10, "");
            SharedPreferences sharedPreferences11 = context.getSharedPreferences("bahiedit11", MODE_PRIVATE);
            text11 = sharedPreferences11.getString(TEXT11, "");
            SharedPreferences sharedPreferences15 = context.getSharedPreferences("bahiedit15", MODE_PRIVATE);
            text15 = sharedPreferences15.getString(TEXT15, "");
            SharedPreferences sharedPreferences16 = context.getSharedPreferences("bahiedit16", MODE_PRIVATE);
            text16 = sharedPreferences16.getString(TEXT16, "");
            SharedPreferences sharedPreferences17 = context.getSharedPreferences("bahiedit17", MODE_PRIVATE);
            text17 = sharedPreferences17.getString(TEXT17, "");
            SharedPreferences sharedPreferences21 = context.getSharedPreferences("bahiedit21", MODE_PRIVATE);
            text21 = sharedPreferences21.getString(TEXT21, "");
            SharedPreferences sharedPreferences22 = context.getSharedPreferences("bahiedit22", MODE_PRIVATE);
            text22 = sharedPreferences22.getString(TEXT22, "");
            SharedPreferences sharedPreferences23 = context.getSharedPreferences("bahiedit23", MODE_PRIVATE);
            text23 = sharedPreferences23.getString(TEXT23, "");
            SharedPreferences sharedPreferences27 = context.getSharedPreferences("bahiedit27", MODE_PRIVATE);
            text27 = sharedPreferences27.getString(TEXT27, "");
            SharedPreferences sharedPreferences28 = context.getSharedPreferences("bahiedit28", MODE_PRIVATE);
            text28 = sharedPreferences28.getString(TEXT28, "");
            SharedPreferences sharedPreferences29 = context.getSharedPreferences("bahiedit29", MODE_PRIVATE);
            text29 = sharedPreferences29.getString(TEXT29, "");
            SharedPreferences sharedPreferences33 = context.getSharedPreferences("bahiedit33", MODE_PRIVATE);
            text33 = sharedPreferences33.getString(TEXT33, "");
            SharedPreferences sharedPreferences34 = context.getSharedPreferences("bahiedit34", MODE_PRIVATE);
            text34 = sharedPreferences34.getString(TEXT34, "");
            SharedPreferences sharedPreferences35 = context.getSharedPreferences("bahiedit35", MODE_PRIVATE);
            text35 = sharedPreferences35.getString(TEXT35, "");
            SharedPreferences sharedPreferences39 = context.getSharedPreferences("bahiedit39", MODE_PRIVATE);
            text39 = sharedPreferences39.getString(TEXT39, "");
            SharedPreferences sharedPreferences40 = context.getSharedPreferences("bahiedit40", MODE_PRIVATE);
            text40 = sharedPreferences40.getString(TEXT40, "");
            SharedPreferences sharedPreferences41 = context.getSharedPreferences("bahiedit41", MODE_PRIVATE);
            text41 = sharedPreferences41.getString(TEXT41, "");
            SharedPreferences sharedPreferences45 = context.getSharedPreferences("bahiedit45", MODE_PRIVATE);
            text45 = sharedPreferences45.getString(TEXT45, "");
            SharedPreferences sharedPreferences46 = context.getSharedPreferences("bahiedit46", MODE_PRIVATE);
            text46 = sharedPreferences46.getString(TEXT46, "");
            SharedPreferences sharedPreferences47 = context.getSharedPreferences("bahiedit47", MODE_PRIVATE);
            text47 = sharedPreferences47.getString(TEXT47, "");
            SharedPreferences sharedPreferences49 = context.getSharedPreferences("bahiedit49", MODE_PRIVATE);
            SharedPreferences sharedPreferences51 = context.getSharedPreferences("bahiedit51", MODE_PRIVATE);
            text51 = sharedPreferences51.getString(TEXT51, "");
            SharedPreferences sharedPreferences52 = context.getSharedPreferences("bahiedit52", MODE_PRIVATE);
            text52 = sharedPreferences52.getString(TEXT52, "");
            SharedPreferences sharedPreferences53 = context.getSharedPreferences("bahiedit53", MODE_PRIVATE);
            text53 = sharedPreferences53.getString(TEXT53, "");
            //switchOnOff = sharedPreferences.getBoolean(SWITCH1, false);
        }

        public void updateViews() {
            editText3.setText(text3);
            editText4.setText(text4);
            editText5.setText(text5);
            editText9.setText(text9);
            editText10.setText(text10);
            editText11.setText(text11);
            editText15.setText(text15);
            editText16.setText(text16);
            editText17.setText(text17);
            editText21.setText(text21);
            editText22.setText(text22);
            editText23.setText(text23);
            editText27.setText(text27);
            editText28.setText(text28);
            editText29.setText(text29);
            editText33.setText(text33);
            editText34.setText(text34);
            editText35.setText(text35);
            editText39.setText(text39);
            editText40.setText(text40);
            editText41.setText(text41);
            editText45.setText(text45);
            editText46.setText(text46);
            editText47.setText(text47);
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
                        if (editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0
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
                        if (editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0
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
                        if (editText3.getText().toString().length() == 0 && editText4.getText().toString().length() == 0
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
                        if (editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0
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
                        if (editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0
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
                        if (editText9.getText().toString().length() == 0 && editText10.getText().toString().length() == 0
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
                        if (editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0
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
                        if (editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0
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
                        if (editText15.getText().toString().length() == 0 && editText16.getText().toString().length() == 0
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
                        if (editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0
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
                        if (editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0
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
                        if (editText21.getText().toString().length() == 0 && editText22.getText().toString().length() == 0
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
                        if (editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0
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
                        if (editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0
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
                        if (editText27.getText().toString().length() == 0 && editText28.getText().toString().length() == 0
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
                        if (editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0
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
                        if (editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0
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
                        if (editText33.getText().toString().length() == 0 && editText34.getText().toString().length() == 0
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
                        if (editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0
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
                        if (editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0
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
                        if (editText39.getText().toString().length() == 0 && editText40.getText().toString().length() == 0
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
                        if (editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0
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
                        if (editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0
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
                        if (editText45.getText().toString().length() == 0 && editText46.getText().toString().length() == 0
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
                        if (editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0
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
                        if (editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0
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
                        if (editText51.getText().toString().length() == 0 && editText52.getText().toString().length() == 0
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
