package com.hfad.messenger;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReceiveMessageActivity extends Activity {

    public static final String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(MESSAGE);
        TextView messageView = (TextView) findViewById(R.id.message);
        messageView.setText(stringExtra);

    }
}
