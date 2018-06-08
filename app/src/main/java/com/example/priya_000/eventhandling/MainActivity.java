package com.example.priya_000.eventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=(Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(                                   //tap
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView text1=(TextView)findViewById(R.id.text1);
                        text1.setText("small click");
                    }
                }
        );

        btn1.setOnLongClickListener(                             //on long
                new Button.OnLongClickListener(){
             public boolean onLongClick(View v){
                 TextView text1=(TextView)findViewById(R.id.text1);
                 text1.setText("long click");
                 return true;          //event handle ho rha h agar click long hua to true mtlb event handle ho gya agar click long enough ni hua
                                       // to wo event ko click p bhej dega aur click use handle krega
             }
         }
        );
    }
}
