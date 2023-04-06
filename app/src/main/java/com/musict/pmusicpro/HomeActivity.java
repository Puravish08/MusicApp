package com.musict.pmusicpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {


//    ActivityMainBinding mainBinding;

    LinearLayout s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24,s25,s26,s27,s28,s29,s30,s31,s32;
    AppCompatButton song,playlist,folder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        

        music();
    }

    private void music() {

         s1 = findViewById(R.id.s1);
         s2 = findViewById(R.id.s2);
         s3 = findViewById(R.id.s3);
         s4 =findViewById(R.id.s4);
         s5 = findViewById(R.id.s5);
         s6 = findViewById(R.id.s6);
         s7 = findViewById(R.id.s7);
         s8 = findViewById(R.id.s8);
         s9 = findViewById(R.id.s9);
         s10 = findViewById(R.id.s10);
         s11 = findViewById(R.id.s11);
         s12 = findViewById(R.id.s12);
         s13 = findViewById(R.id.s13);
         s14 = findViewById(R.id.s14);
         s15 = findViewById(R.id.s15);
         s16 = findViewById(R.id.s16);
         s17 = findViewById(R.id.s17);
         s18 = findViewById(R.id.s18);
         s19 = findViewById(R.id.s19);
         s20 = findViewById(R.id.s20);
         s21 = findViewById(R.id.s21);
         s22 = findViewById(R.id.s22);
         s23 = findViewById(R.id.s23);
         s24 = findViewById(R.id.s24);
        s25 = findViewById(R.id.s25);
        s26 = findViewById(R.id.s26);
        s27 = findViewById(R.id.s27);
         s28 = findViewById(R.id.s28);
         s29 = findViewById(R.id.s29);
         s30 = findViewById(R.id.s30);
         s31 = findViewById(R.id.s31);
         s32 = findViewById(R.id.s32);
         
         
         
         song =findViewById(R.id.song);
         playlist =findViewById(R.id.playlist);
         folder =findViewById(R.id.folder);





        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeActivity.this,PlaylistActivity.class);
                startActivity(intent);
            }
        });






        folder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeActivity.this,FolderActivity.class);
                startActivity(intent);
            }
        });















        s1.setOnClickListener(new View.OnClickListener() {@Override
             public void onClick(View v) {
                 Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
                 startActivity(intent);     }});



        s2.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});


        s3.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});

        s4.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});

        s5.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});




        s6.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});


        s7.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});
        s8.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});
        s9.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});

        s10.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});
        s11.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});
        s12.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});
        s13.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});
        s14.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});
        s15.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});
        s16.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});
        s17.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});
        s18.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});
        s19.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});
        s20.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});



        s21.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});


        s22.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});


        s23.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});


        s24.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});


        s25.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});


        s26.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});


        s27.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});


        s28.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});


        s29.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});


        s30.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});

        s31.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});

        s32.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this,MusicRunActivity.class);
            startActivity(intent);     }});



    }
}