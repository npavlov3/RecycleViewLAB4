package codingwithmitch.com.recyclerview;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    MediaPlayer splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        splash = new MediaPlayer();
        splash = MediaPlayer.create(this, R.raw.splash);
        splash.start();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                splash.pause();
                startActivity(new Intent(Splash.this, MainActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,8000);



    }
}