package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView mbmidisplay,magedisplay,mweightdisplay,mheightdisplay,mbmicategory,mgender,mcomment,madvice1,madvice2,madvice3;
    Button mgotomain;
    Intent intent;

    ImageView mimageview,mimgad1,mimgad2,mimgad3;
    String mbmi,cateogory;
    float intbmi;

    String height;
    String weight;

    float intheight,intweight;

    RelativeLayout mbackground;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ColorDrawable colorDrawable=new ColorDrawable(Color.parseColor("#1E1D1D"));

        getSupportActionBar().hide();


        intent=getIntent();
        mbmidisplay=findViewById(R.id.bmidisplay);
        mbmicategory = findViewById(R.id.bmicategorydispaly);
        mgotomain=findViewById(R.id.gotomain);
        mimageview=findViewById(R.id.imageview);
        mbackground=findViewById(R.id.background);
        mcomment=findViewById(R.id.comment);
        madvice1=findViewById(R.id.advice1);
        mimgad1=findViewById(R.id.advice1IMG);
        madvice2=findViewById(R.id.advice2);
        mimgad2=findViewById(R.id.advice2IMG);
        madvice3=findViewById(R.id.advice3);
        mimgad3=findViewById(R.id.advice3IMG);

        height=intent.getStringExtra("height");
        weight=intent.getStringExtra("weight");

        intheight=Float.parseFloat(height);
        intweight=Float.parseFloat(weight);

        intheight=intheight/100;
        intbmi=intweight/(intheight*intheight);
        mbmi=Float.toString(intbmi);
        System.out.println(mbmi);

        if(intbmi<16)
        {
            mbmicategory.setText("Severe Thinness");
            mbackground.setBackgroundColor(Color.rgb(244, 214, 72));
            mimageview.setImageResource(R.drawable.semiwarning);
            mcomment.setText("Here are some advices to help you increase your weight");
            mimgad1.setImageResource(R.drawable.nowater);
            madvice1.setText("Don't drink water before meals");
            mimgad2.setImageResource(R.drawable.bigmeal);
            madvice2.setText("Use bigger plates");
            mimgad3.setImageResource(R.drawable.sleep);
            madvice3.setText("Get quality sleep");
        }
        else if(intbmi<16.9 && intbmi>16)
        {
            mbmicategory.setText("Moderate Thinness");
            mbackground.setBackgroundColor(Color.rgb(244, 214, 72));
            mimageview.setImageResource(R.drawable.semiwarning);
            mcomment.setText("Here are some advices to help you increase your weight");
            mimgad1.setImageResource(R.drawable.nowater);
            madvice1.setText("Don't drink water before meals");
            mimgad2.setImageResource(R.drawable.bigmeal);
            madvice2.setText("Use bigger plates");
            mimgad3.setImageResource(R.drawable.sleep);
            madvice3.setText("Get quality sleep");
        }
        else if(intbmi<18.4 && intbmi>17)
        {
            mbmicategory.setText("Mild Thinness");
            mbackground.setBackgroundColor(Color.rgb(244, 214, 72));
            mimageview.setImageResource(R.drawable.semiwarning);
            mcomment.setText("Here are some advices to help you increase your weight");
            mimgad1.setImageResource(R.drawable.nowater);
            madvice1.setText("Don't drink water before meals");
            mimgad2.setImageResource(R.drawable.bigmeal);
            madvice2.setText("Use bigger plates");
            mimgad3.setImageResource(R.drawable.sleep);
            madvice3.setText("Get quality sleep");
        }
        else if(intbmi<24.9 && intbmi>18.5 )
        {
            mbmicategory.setText("Normal");
            mimageview.setImageResource(R.drawable.ok);
        }
        else if(intbmi <29.9 && intbmi>25)
        {
            mbmicategory.setText("Overweight");
            mbackground.setBackgroundColor(Color.rgb(244, 75, 62));
            mimageview.setImageResource(R.drawable.warning);
            mcomment.setText("Here are some advices to help you decrease your weight");
            mimgad1.setImageResource(R.drawable.water);
            madvice1.setText("Drink water a half hour before meals");
            mimgad2.setImageResource(R.drawable.twoeggs);
            madvice2.setText("Eat only two meals per day and make sure that they contains a high protein");
            mimgad3.setImageResource(R.drawable.nosugar);
            madvice3.setText("Drink coffee or tea and avoid sugary food");
        }
        else if(intbmi<34.9 && intbmi>30)
        {
            mbmicategory.setText("Obese Class I");
            mbackground.setBackgroundColor(Color.rgb(244, 75, 62));
            mimageview.setImageResource(R.drawable.warning);
            mcomment.setText("Here are some advices to help you decrease your weight");
            mimgad1.setImageResource(R.drawable.water);
            madvice1.setText("Drink water a half hour before meals");
            mimgad2.setImageResource(R.drawable.twoeggs);
            madvice2.setText("Eat only two meals per day and make sure that they contains a high protein");
            mimgad3.setImageResource(R.drawable.nosugar);
            madvice3.setText("Drink coffee or tea and avoid sugary food");
        }
        else
        {
            mbmicategory.setText("Obese Class II");
            mbackground.setBackgroundColor(Color.rgb(244, 75, 62));
            mimageview.setImageResource(R.drawable.warning);
            mcomment.setText("Here are some advices to help you decrease your weight");
            mimgad1.setImageResource(R.drawable.water);
            madvice1.setText("Drink water a half hour before meals");
            mimgad2.setImageResource(R.drawable.twoeggs);
            madvice2.setText("Eat only two meals per day and make sure that they contains a high protein");
            mimgad3.setImageResource(R.drawable.nosugar);
            madvice3.setText("Drink coffee or tea and avoid sugary food");
        }

        mbmidisplay.setText(mbmi);


        mgotomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent1);
            }
        });


    }
}