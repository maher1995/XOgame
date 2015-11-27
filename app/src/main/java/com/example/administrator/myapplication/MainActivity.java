package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    Button [] b=new Button[9];
    int t=1;
    int y=0;
    TextView t1;
   Button bb;
    Button bbb;
     public void OnClick(View v) {



                  bb = (Button) findViewById(v.getId());
                 if (t == 1) {
                     bb.setText("O");
                     t = 2;
                 } else {
                     bb.setText("X");
                     t = 1;
                 }
                 win();
                 bb.setEnabled(false);

         }




     public void win(){

        t1 = (TextView) findViewById(R.id.textView);
        b[0] = (Button) findViewById(R.id.b1);
        b[1] = (Button) findViewById(R.id.b2);
        b[2] = (Button) findViewById(R.id.b3);
        b[3] = (Button) findViewById(R.id.b4);
        b[4] = (Button) findViewById(R.id.b5);
        b[5] = (Button) findViewById(R.id.b6);
        b[6] = (Button) findViewById(R.id.b7);
        b[7] = (Button) findViewById(R.id.b8);
        b[8] = (Button) findViewById(R.id.b9);

        if (b[0].getText() != "" && b[0].getText() == b[1].getText() && b[1].getText() == b[2].getText()) {
                  y=1;
            t1.setText( b[0].getText()+"  "+"Winner !");

        } else if (b[3].getText() != "" && b[3].getText() == b[4].getText() && b[4].getText() == b[5].getText()) {
            t1.setText(b[3].getText()+"  "+"Winner !");
                     y=1;
        } else if (b[6].getText() != "" && b[6].getText() == b[7].getText() && b[7].getText() == b[8].getText()) {
            t1.setText(b[6].getText()+"  "+ "Winner !");
                     y=1;
        } else if (b[0].getText() != "" && b[0].getText() == b[3].getText() && b[3].getText() == b[6].getText()) {
            t1.setText( b[0].getText()+"  "+"Winner !");
                      y=1;
        } else if (b[1].getText() != "" && b[1].getText() == b[4].getText() && b[4].getText() == b[7].getText()) {
            t1.setText(b[1].getText()+"  "+"Winner !");
                       y=1;
        } else if (b[2].getText() != "" && b[2].getText() == b[5].getText() && b[5].getText() == b[8].getText()) {
            t1.setText( b[2].getText()+"  "+"Winner !");
                      y=1;
        } else if (b[0].getText() != "" && b[0].getText() == b[4].getText() && b[4].getText() == b[8].getText()) {
            t1.setText( b[0].getText()+"  "+"Winner !");
                    y=1;
        } else if (b[2].getText() != "" && b[2].getText() == b[4].getText() && b[4].getText() == b[6].getText()) {
            t1.setText(b[2].getText()+"  "+ "Winner !");
                      y=1;
        }
             if(y==1) {
                 for (int i = 0; i < b.length; i++)
                     b[i].setEnabled(false);
             }
    }
    }
