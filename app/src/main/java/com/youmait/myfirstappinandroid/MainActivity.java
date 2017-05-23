package com.youmait.myfirstappinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtdisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  txtdisplay= (TextView) findViewById(R.id.txtpisplay);
        txtdisplay.setText("Welcome");
    }


    public void buclick(View view) {
        txtdisplay.setText("Welcome from button");

    }
}
