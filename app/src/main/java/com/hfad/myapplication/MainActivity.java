package com.hfad.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void radioClick(View view) {

        ImageView myImageView = (ImageView) findViewById(R.id.imageView);
        if (view.getId() == R.id.apple) {
            myImageView.setImageResource(R.drawable.apple);
            mp = MediaPlayer.create(this, R.raw.war);
        } else if (view.getId() == R.id.burger) {
            myImageView.setImageResource(R.drawable.burger);
            mp = MediaPlayer.create(this, R.raw.spirit);

        } else {
            myImageView.setImageResource(R.drawable.hotdog);
            mp = MediaPlayer.create(this, R.raw.jazz);
        }

    }


    public void startSong(View view) {
        mp.start();
    }

    public void stopSong(View view) {
        mp.pause();
    }

    public void pause() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}