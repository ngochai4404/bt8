package com.hai.broadcastapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.hai.broadcastapplication.R;
import com.hai.broadcastapplication.util.Config;

public class MainActivity extends AppCompatActivity {
    EditText etMessageA;
    EditText etMessageB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    void initView() {
        etMessageA = findViewById(R.id.et_message_a);
        etMessageB = findViewById(R.id.et_message_b);
    }

    public void openA(View v) {
        Intent t = new Intent();
        t.putExtra(Config.MESSAGE, etMessageA.getText() + "");
        t.setAction(Config.CALL_A);
        sendBroadcast(t);
    }

    public void openB(View v) {
        Intent t = new Intent();
        t.putExtra(Config.MESSAGE, etMessageB.getText() + "");
        t.setAction(Config.CALL_B);
        sendBroadcast(t);
    }
}
