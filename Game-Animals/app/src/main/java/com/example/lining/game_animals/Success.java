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

public class Success extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success);
        TextView tv_success = findViewById(R.id.tv_success);
        TextView tv_showscore = findViewById(R.id.tv_showscore);
        Button bt_goback = findViewById(R.id.bt_goback);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/font_one.TTF");
        tv_showscore.setTypeface(typeface);
        tv_success.setTypeface(typeface);
        bt_goback.setTypeface(typeface);

        Intent intent = getIntent();
        String score = intent.getStringExtra("score");

        tv_showscore.setText("Well down,you've got "+score+"!");

        bt_goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
