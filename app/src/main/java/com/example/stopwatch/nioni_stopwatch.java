package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.List;

public class nioni_stopwatch extends AppCompatActivity {
    Button nioni_go;
    Animation round;
    Chronometer nioni_timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nioni_stopwatch);

        nioni_go = findViewById(R.id.go);
        nioni_timer = findViewById(R.id.timer);

        // load animasi
        round = AnimationUtils.loadAnimation(this,R.anim.round);

        nioni_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //panah.startAnimation(round);
                nioni_go.animate().alpha(1).translationY(-80).setDuration(300).start();
                nioni_timer.setBase(SystemClock.elapsedRealtime());
                nioni_timer.start();
            }


        });

    }

}
