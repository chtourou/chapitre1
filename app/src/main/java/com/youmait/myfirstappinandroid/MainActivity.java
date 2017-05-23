package com.youmait.myfirstappinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtdisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtdisplay = (TextView) findViewById(R.id.txtdisplay);
        txtdisplay.setText("Welcome");
        final Button busmit = (Button) findViewById(R.id.busumit);
        busmit.setText("click me");
        busmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                busmit.setText("You click me");
                txtdisplay.setText("Welcome from button");
            }
        });
    }


    //  public void buclick(View view) {
 // txtdisplay.setText("Welcome from button");
  // }
    }



