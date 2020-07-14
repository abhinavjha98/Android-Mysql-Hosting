package com.example.mysql_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText pas,usr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usr = (EditText) findViewById( R.id.username);
        pas = (EditText) findViewById(R.id.password);
    }
    public void loginBtn(View view) {
        String user = usr.getText().toString();
        String pass = pas.getText().toString();
        Background backgroundWorker = new Background(this);
        backgroundWorker.execute( user, pass);
        
    }
}
