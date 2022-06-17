package com.kyungjin.project10_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        setTitle("투표 결과");

        Intent intent = getIntent();
        int[] voteResult = intent.getIntArrayExtra("VoteCount");
        String[] imageName = intent.getStringArrayExtra("ImageName");
        TextView tv[] = new TextView[imageName.length];
        RatingBar rb[] = new RatingBar[imageName.length];

        Integer tvID[] = {R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4, R.id.tv5,
                R.id.tv6, R.id.tv7, R.id.tv8, R.id.tv9};
        Integer rbID[] = {R.id.rb1, R.id.rb2, R.id.rb3, R.id.rb4, R.id.rb5,
                R.id.rb6, R.id.rb7, R.id.rb8, R.id.rb9};

        for (int i = 0; i < voteResult.length; i++){
            finish();
        }
    }
}
