package com.pixplicity.workshop.beginners.intentions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends Activity implements View.OnClickListener {

    private EditText mEmailAddress;

    private EditText mEmailSubject;

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mEmailAddress = (EditText) findViewById(R.id.email_address);
        mEmailSubject = (EditText) findViewById(R.id.email_subject);

        mButton = (Button) findViewById(R.id.next);
        mButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Exercise 03.01

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(SecondActivity.EXTRA_EMAIL_ADDRESS, mEmailAddress.getText().toString());
        intent.putExtra(SecondActivity.EXTRA_EMAIL_SUBJECT, mEmailSubject.getText().toString());
        startActivity(intent);

    }

}