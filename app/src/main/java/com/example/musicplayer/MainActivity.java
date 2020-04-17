package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imagePlayPause;
    private TextView textCurrentTime, textTotalDuration;
    private SeekBar playerSeekBar;
    private MediaPlayer mediaPlayer;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagePlayPause = findViewById(R.id.imagePlayPause);
        textCurrentTime = findViewById(R.id.currentTime);
        textTotalDuration = findViewById(R.id.textTotalDuration);
        playerSeekBar = findViewById(R.id.playerSeekBar);
        mediaPlayer = new MediaPlayer();

        playerSeekBar.setMax(100);

    }
}
