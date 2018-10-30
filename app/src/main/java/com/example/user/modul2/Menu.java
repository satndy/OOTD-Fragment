package com.example.user.modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton showindex = (ImageButton) findViewById(R.id.imageButton3);
        showindex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton showcredit = (ImageButton) findViewById(R.id.imageButton4);
        showcredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Credit.class);
                startActivity(intent);
            }
        });

        ImageButton showabout = (ImageButton) findViewById(R.id.imageButton5);
        showabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, About.class);
                startActivity(intent);
            }
        });

        ImageButton showexit    = (ImageButton) findViewById(R.id.imageButton6);
        showexit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                moveTaskToBack(true);

                //membuat method tombol keluar dari aplikasi

            }
        });

    }
}
