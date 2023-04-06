package com.musict.pmusicpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PlaylistActivity extends AppCompatActivity {



    LinearLayout punjabiplaylist,gujaratiplaylist,hindiplaylist,englisplaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        playlist();

    }

    private void playlist() {



        englisplaylist = findViewById(R.id.englishplaylist);
        hindiplaylist = findViewById(R.id.hindiplaylist);
        gujaratiplaylist = findViewById(R.id.gujaratiplaylist);
        punjabiplaylist = findViewById(R.id.punjabiplaylist);





        englisplaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistActivity.this,EnglishPlaylist.class);
                startActivity(intent);
            }
        });



        hindiplaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistActivity.this,HindiPlaylist.class);
                startActivity(intent);

            }
        });




        gujaratiplaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistActivity.this,GujaratiPlaylist.class);
                startActivity(intent);

            }
        });





        punjabiplaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistActivity.this, PunjabiPlaylist.class);
                startActivity(intent);

            }
        });



    }
}