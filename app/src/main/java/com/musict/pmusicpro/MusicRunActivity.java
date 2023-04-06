package com.musict.pmusicpro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MusicRunActivity extends AppCompatActivity {


    ImageView play;
    static MediaPlayer mMediaPlayer;
    int currentIndex = 0;

//    Button okp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_run);




//
//        play = findViewById(R.id.play);
//
//
//        ArrayList<Integer>songs = new ArrayList<>();
//
//
//        songs.add(R.raw.demon);
//        songs.add(R.raw.dhoka);
//        songs.add(R.raw.buildbeacheng);
//        songs.add(R.raw.badhabit);
//
//
//        mMediaPlayer =MediaPlayer.create(getApplicationContext(),songs.get(currentIndex));
//
//
//        play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (mMediaPlayer!=null && mMediaPlayer.isPlaying()){
//                    mMediaPlayer.pause();
//                }
//                else {
//                    mMediaPlayer.start();
//                }
//            }
//        });
//












        
//        play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//
//                play.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        MediaPlayer beep = MediaPlayer.create(MusicRunActivity.this,R.raw.apnabanale);
//                        beep.start();
//                        beep.stop();
//                    }
//                });
//
//
//            }
//        });


    }
}