package com.demo.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mPx;
    private Button mDp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mPx = (Button) findViewById(R.id.px);
        mPx.setOnClickListener(this);
        mDp = (Button) findViewById(R.id.dp);
        mDp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.px:
                // TODO 21/01/12
                startActivity(new Intent(this,PxActivity.class));
                break;
            case R.id.dp:
                // TODO 21/01/12
                startActivity(new Intent(this,DpActivity.class));
                break;
            default:
                break;
        }
    }
}