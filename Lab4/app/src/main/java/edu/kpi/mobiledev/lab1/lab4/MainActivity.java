package edu.kpi.mobiledev.lab1.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickAudio(View view) {
        Intent intent = new Intent(MainActivity.this, AudioActivity.class);
        startActivity(intent);
    }
    public void OnClickVideo(View view) {
        Intent intent = new Intent(MainActivity.this, VideoActivity.class);
        startActivity(intent);
    }
}
