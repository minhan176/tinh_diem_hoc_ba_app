package com.rosion.xthcb.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rosion.xthcb.MyData;
import com.rosion.xthcb.R;

import com.rosion.xthcb.activity_mon;

public class AdapMon extends RecyclerView.Adapter<AdapMon.ViewHolder> {

    MyData[] myData;
    Context context;

    public AdapMon(MyData[] myData, activity_mon activity) {
        this.myData = myData;
        this.context = activity;
    }

    @NonNull
    @Override
    public AdapMon.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_mon, parent, false);
        AdapMon.ViewHolder viewHolder = new AdapMon.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapMon.ViewHolder holder, int position) {
        final MyData myDataList = myData[position];
        holder.textViewDate.setText(myDataList.getName());
    }

    @Override
    public int getItemCount() {
        return myData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewDate;
        TextView te1, te2, te3, te4, te5, te6, te7, te8, te9, tieudecot;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDate = itemView.findViewById(R.id.nameDate);

            te1 = itemView.findViewById(R.id.text1);
            te2 = itemView.findViewById(R.id.text2);
            te3 = itemView.findViewById(R.id.text3);
            te4 = itemView.findViewById(R.id.text4);
            te5 = itemView.findViewById(R.id.text5);
            te6 = itemView.findViewById(R.id.text6);
            te7 = itemView.findViewById(R.id.text7);
            te8 = itemView.findViewById(R.id.text8);
            te9 = itemView.findViewById(R.id.text9);
            tieudecot = itemView.findViewById(R.id.tieudecot);

            Intent intent = ((Activity) context).getIntent();
            float a0 = intent.getFloatExtra("a0", 0);
            float a1 = intent.getFloatExtra("a1", 0);
            float b0 = intent.getFloatExtra("b0", 0);
            float c0 = intent.getFloatExtra("c0", 0);
            float c1 = intent.getFloatExtra("c1", 0);
            float d1 = intent.getFloatExtra("d1", 0);
            float d7 = intent.getFloatExtra("d7", 0);
            float d14 = intent.getFloatExtra("d14", 0);
            float d15= intent.getFloatExtra("d15", 0);
            float tieucot = intent.getFloatExtra("tieucot", 0);

            float no1 = intent.getFloatExtra("no1", 0);float no2 = intent.getFloatExtra("no2", 0);float no3 = intent.getFloatExtra("no3", 0);
            float no4 = intent.getFloatExtra("no4", 0);float no5 = intent.getFloatExtra("no5", 0);float no6 = intent.getFloatExtra("no6", 0);
            float no7 = intent.getFloatExtra("no7", 0);float no8 = intent.getFloatExtra("no8", 0);float no9 = intent.getFloatExtra("no9", 0);
            float no10 = intent.getFloatExtra("no10", 0);float no11 = intent.getFloatExtra("no11", 0);float no12 = intent.getFloatExtra("no12", 0);
            float no13 = intent.getFloatExtra("no13", 0);float no14 = intent.getFloatExtra("no14", 0);float no15 = intent.getFloatExtra("no15", 0);
            float no16 = intent.getFloatExtra("no16", 0);float no17 = intent.getFloatExtra("no17", 0);float no18 = intent.getFloatExtra("no18", 0);
            float no19 = intent.getFloatExtra("no19", 0);float no20 = intent.getFloatExtra("no20",0);
            float no21 = intent.getFloatExtra("no21", 0);float no22 = intent.getFloatExtra("no22", 0);float no23 = intent.getFloatExtra("no23", 0);
            float no24 = intent.getFloatExtra("no24", 0);float no25 = intent.getFloatExtra("no25", 0);float no26 = intent.getFloatExtra("no26", 0);
            float no27 = intent.getFloatExtra("no27", 0);float no28 = intent.getFloatExtra("no28", 0);float no29 = intent.getFloatExtra("no29", 0);
            float no30 = intent.getFloatExtra("no30", 0);
            float no31 = intent.getFloatExtra("no31", 0);float no32 = intent.getFloatExtra("no32", 0);float no33 = intent.getFloatExtra("no33", 0);
            float no34 = intent.getFloatExtra("no34", 0);float no35 = intent.getFloatExtra("no35", 0);float no36 = intent.getFloatExtra("no36", 0);
            float no37 = intent.getFloatExtra("no37", 0);float no38 = intent.getFloatExtra("no38", 0);float no39 = intent.getFloatExtra("no39", 0);
            float no40 = intent.getFloatExtra("no40", 0);
            float no41 = intent.getFloatExtra("no41", 0);float no42 = intent.getFloatExtra("no42", 0);float no43 = intent.getFloatExtra("no43", 0);
            float no44 = intent.getFloatExtra("no44", 0);float no45 = intent.getFloatExtra("no45", 0);float no46 = intent.getFloatExtra("no46", 0);
            float no47 = intent.getFloatExtra("no47", 0);float no48 = intent.getFloatExtra("no48", 0);float no49 = intent.getFloatExtra("no49", 0);
            float no50 = intent.getFloatExtra("no50", 0);
            float no51 = intent.getFloatExtra("no51", 0);float no52 = intent.getFloatExtra("no52", 0);float no53 = intent.getFloatExtra("no53", 0);
            float no54 = intent.getFloatExtra("no54", 0);

            if(tieucot == 1){
                tieudecot.setText("Tổng 6 kì / 6");
            }
            if(tieucot == 2){
                tieudecot.setText("Tổng 5 kì / 5");
            }
            if(tieucot == 3){
                tieudecot.setText("Tổng 3 kì / 3");
            }
            if(tieucot == 4){
                tieudecot.setText("Tổng 2 cột / 2");
            }
            if(tieucot == 5){
                tieudecot.setText("Tổng 3 cột / 3");
            }
            if ((no1 > 10 || no2 > 10 || no3 > 10 || no4 > 10 || no5 > 10 || no6 > 10 )
                    &&( no7 > 10 || no8 > 10 || no9 > 10 || no10 > 10 || no11 > 10 || no12 > 10 )
                    &&( no13 > 10 || no14 > 10 || no15 > 10 || no16 > 10 || no17 > 10 || no18 > 10 )
                    && (no19 > 10 || no20 > 10 || no21 > 10 || no22 > 10 || no23 > 10 || no24 > 10)
                    && (no25 > 10 || no26 > 10 || no27 > 10 || no28 > 10 || no29 > 10 || no30 > 10 )
                    &&( no31 > 10 || no32 > 10 || no33 > 10 || no34 > 10 || no35 > 10 || no36 > 10 )
                    && (no37 > 10 || no38 > 10 || no39 > 10 || no40 > 10 || no41 > 10 || no42 > 10 )
                    &&( no43 > 10 || no44 > 10 || no45 > 10 || no46 > 10 || no47 > 10 || no48 > 10 )
                    &&( no49 > 10 || no50 > 10 || no51 > 10 || no52 > 10 || no53 > 10 || no54 > 10)) {
                te1.setText("!");
                te1.setTextColor(Color.parseColor("#888888"));
                te2.setText("!");
                te2.setTextColor(Color.parseColor("#888888"));
                te3.setText("!");
                te3.setTextColor(Color.parseColor("#888888"));
                te4.setText("!");
                te4.setTextColor(Color.parseColor("#888888"));
                te5.setText("!");
                te5.setTextColor(Color.parseColor("#888888"));
                te6.setText("!");
                te6.setTextColor(Color.parseColor("#888888"));
                te7.setText("!");
                te7.setTextColor(Color.parseColor("#888888"));
                te8.setText("!");
                te8.setTextColor(Color.parseColor("#888888"));
                te9.setText("!");
                te9.setTextColor(Color.parseColor("#888888"));
                //tieudecot.setText("Tổng 5 kì / 5");

            }else {
                if (no1 > 10 || no2 > 10 || no3 > 10 || no4 > 10 || no5 > 10 || no6 > 10 ) {
                    te1.setText("");
                    te1.setTextColor(Color.parseColor("#888888"));
                } else {
                    te1.setText(String.valueOf(a0));
                }
                if (no7 > 10 || no8 > 10 || no9 > 10 || no10 > 10 || no11 > 10 || no12 > 10 ) {
                    te2.setTextColor(Color.parseColor("#888888"));
                    te2.setText("");
                } else {
                    te2.setText(String.valueOf(a1));
                }
                if (no13 > 10 || no14 > 10 || no15 > 10 || no16 > 10 || no17 > 10 || no18 > 10 ) {
                    te3.setTextColor(Color.parseColor("#888888"));
                    te3.setText("");
                } else {
                    te3.setText(String.valueOf(b0));
                }

                if (no19 > 10 || no20 > 10 || no21 > 10 || no22 > 10 || no23 > 10 || no24 > 10) {
                    te4.setTextColor(Color.parseColor("#888888"));
                    te4.setText("");
                } else {
                    te4.setText(String.valueOf(c0));
                }

                if (no25 > 10 || no26 > 10 || no27 > 10 || no28 > 10 || no29 > 10 || no30 > 10 ) {
                    te5.setTextColor(Color.parseColor("#888888"));
                    te5.setText("");
                } else {
                    te5.setText(String.valueOf(c1));
                }

                if ( no31 > 10 || no32 > 10 || no33 > 10 || no34 > 10 || no35 > 10 || no36 > 10  ) {
                    te6.setTextColor(Color.parseColor("#888888"));
                    te6.setText("");
                } else {
                    te6.setText(String.valueOf(d1));
                }

                if (no37 > 10 || no38 > 10 || no39 > 10 || no40 > 10 || no41 > 10 || no42 > 10 ) {
                    te7.setTextColor(Color.parseColor("#888888"));
                    te7.setText("");
                } else {
                    te7.setText(String.valueOf(d7));
                }

                if ( no43 > 10 || no44 > 10 || no45 > 10 || no46 > 10 || no47 > 10 || no48 > 10 ) {
                    te8.setTextColor(Color.parseColor("#888888"));
                    te8.setText("");
                } else {
                    te8.setText(String.valueOf(d14));
                }

                if (no49 > 10 || no50 > 10 || no51 > 10 || no52 > 10 || no53 > 10 || no54 > 10) {
                    te9.setTextColor(Color.parseColor("#888888"));
                    te9.setText("");
                } else {
                    te9.setText(String.valueOf(d15));
                }
            }
        }
    }
}
