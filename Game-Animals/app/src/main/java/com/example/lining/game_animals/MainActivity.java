package com.example.lining.game_animals;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends Activity {
    private TextView tv_score_number;
    private TextView tv_animal;
    private TextView tv_round;
    private Button bt_quit;
    private int[] image = {R.drawable.bear_artboard,R.drawable.cat_artboard,R.drawable.fish_artboard,R.drawable.honey_artboard,
            R.drawable.pig_artboard,R.drawable.lion_artboard,R.drawable.bird_artboard,R.drawable.sun_artboard,
            R.drawable.tiger_artboard};
    private String[] animals = {"bear","cat","fish","honey","pig","loin","bird","sun","tiger"};
    private int[] imageID = {R.id.iv1,R.id.iv2,R.id.iv3,R.id.iv4,R.id.iv5,R.id.iv6,R.id.iv7,R.id.iv8,R.id.iv9};
    private int[] result = {0,1,2,3,4,5,6,7,8};
    private int count = 1;
    private int current_animal;
    private ImageView[] imageViews;
    private int score = 0;
    private static final int num_animals = 9;
    private boolean flag;
    private static final int TIMES = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setFont();
        generate();

    }


    public void choose_animal(View view){
        if(view == findViewById(imageID[current_animal]) && count < TIMES){
            score++;
        }

        if(count == TIMES && score>=6){
            Intent intent = new Intent(MainActivity.this,Success.class);
            intent.putExtra("score",score+"");
            startActivity(intent);
            finish();
        }
        if(count == TIMES && score<6){
            Intent intent = new Intent(MainActivity.this,Failure.class);
            intent.putExtra("score",score+"");
            startActivity(intent);
            finish();
        }
        tv_round.setText("ROUND:"+count);
        count++;

        tv_score_number.setText(score+"");
        generate();
    }



    public void generate(){
        current_animal = (int)(Math.random()*9);
        tv_animal.setText(animals[current_animal]);
        sort();
        flag = true;
        for(int i=0;i<num_animals;i++){
            imageViews[i].setImageResource(image[result[i]]);
           // imageViews[i].setTag(image[result[i]]);
            if(result[i] == current_animal && flag){
                current_animal = i;
                flag = false;
            }
        }
    }

    public void sort(){
        Random r = new Random(System.currentTimeMillis());
        for(int i=0;i<num_animals;i++){
            int k = r.nextInt(num_animals);
            int t = result[i];
            result[i] = result[k];
            result[k] = t;
        }
    }



    public void init(){
        imageViews = new ImageView[num_animals];
        tv_score_number = findViewById(R.id.tv_score_number);
        tv_animal = findViewById(R.id.tv_animal);
        bt_quit = findViewById(R.id.bt_quit);
        tv_round = findViewById(R.id.tv_round);
        for(int i=0;i<num_animals;i++){
            imageViews[i] = findViewById(imageID[i]);
        }
    }


    public void setFont(){
        TextView tv_title = findViewById(R.id.tv_title);
        TextView tv_score = findViewById(R.id.tv_score);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/font_one.TTF");
        tv_title.setTypeface(typeface);
        tv_score.setTypeface(typeface);
        tv_score_number.setTypeface(typeface);
        tv_animal.setTypeface(typeface);
        bt_quit.setTypeface(typeface);
        tv_round.setTypeface(typeface);
    }

    public void bt_quit(View view){
        this.finish();
    }
}
