package mg.studio.game.animals;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lining on 2018/3/25.
 */

public class EndActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end);

        TextView tv_showscore = findViewById(R.id.tv_showscore);
        Button bt_goback = findViewById(R.id.bt_goback);


        Intent intent = getIntent();
        String score = intent.getStringExtra("score");


        tv_showscore.setText("You've got "+score+"!");

        bt_goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
