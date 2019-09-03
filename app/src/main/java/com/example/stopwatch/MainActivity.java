package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView splash_Utama, subSplash;
    Button nioni_btnijo;
    Animation nioni_alphago, _1;
    ImageView gambarSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        splash_Utama = findViewById(R.id.splashUtama);
        subSplash = findViewById(R.id.subSplash);
        nioni_btnijo = findViewById(R.id.nioni_btnijo);
        gambarSplash = findViewById(R.id.gambarSplash);

        // load animasi
        nioni_alphago = AnimationUtils.loadAnimation(this,R.anim.nioni_alphago);
        _1 = AnimationUtils.loadAnimation(this,R.anim._1);

        // menerapkan animasi ke foto
        gambarSplash.startAnimation(nioni_alphago);
        splash_Utama.startAnimation(_1);
        subSplash.startAnimation(_1);
        nioni_btnijo.startAnimation(_1);

        // oper even
        nioni_btnijo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, nioni_stopwatch.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

    }
}
