package com.example.lining.game_animals;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lining on 2018/3/23.
 */

public class Failure extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.failure);
        TextView tv_fail= findViewById(R.id.tv_failure);
        TextView tv_showscore_fail = findViewById(R.id.tv_fail_score);
        Button bt_goback_fail = findViewById(R.id.bt_goback_fail);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/font_one.TTF");
        tv_fail.setTypeface(typeface);
        tv_showscore_fail.setTypeface(typeface);
        bt_goback_fail.setTypeface(typeface);

        Intent intent = getIntent();
        String score = intent.getStringExtra("score");
        tv_showscore_fail.setText("Sorry, you got "+score+".");

        bt_goback_fail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
