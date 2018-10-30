package com.example.user.modul2;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;


public class SplashScreen extends AppCompatActivity {
    TextView tvSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        tvSplash = (TextView) findViewById(R.id.tvSplash);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            //setelah splash akan diarahkan ke aktivity yg telah ditentukan
            public void run() {
                startActivity(new Intent(getApplicationContext(), Menu.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}