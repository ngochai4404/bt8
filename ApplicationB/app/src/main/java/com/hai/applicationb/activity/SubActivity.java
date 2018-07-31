package com.hai.applicationb.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.hai.applicationb.R;

public class SubActivity extends AppCompatActivity {
    public static final String MESSAGE = "MESSAGE";
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        initView();
        bindingData();
    }

    void initView() {
        tvMessage = findViewById(R.id.tv_message);
    }

    void bindingData() {
        String message = getIntent().getStringExtra(MESSAGE);
        if (message == null) {
            tvMessage.setText(getString(R.string.empty));
        } else {
            tvMessage.setText(message);
        }
    }
}
