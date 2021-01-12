package com.demo.screen;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PxActivity extends AppCompatActivity {

    private TextView mResolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_px);
        initView();
    }

    private void initView() {
        mResolution = (TextView) findViewById(R.id.resolution);
        DisplayMetrics dm = getResources().getDisplayMetrics();
        int screenWidth = dm.widthPixels;
        int screenHeight = dm.heightPixels;
        mResolution.setText("当前分辨率："+screenWidth+" * "+screenHeight + " (px)");
    }
}