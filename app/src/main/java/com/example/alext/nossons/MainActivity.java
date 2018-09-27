package com.example.alext.nossons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final MediaPlayer soundTest = MediaPlayer.create(this,R.raw.zinzins);
        final Button b = findViewById(R.id.button_zinzins);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("", "" + soundTest.isPlaying());
                if (soundTest.isPlaying()) {
                    soundTest.pause();
                    soundTest.seekTo(0);
                }
                else {
                    soundTest.start();
                }
            }
        });
    }
}
