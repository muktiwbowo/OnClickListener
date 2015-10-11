package com.muktiwibowo.android.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnPlus, btnMinus;
    TextView textView;
    private int one = 14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlus = (Button) findViewById(R.id.btn_plus);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        textView = (TextView) findViewById(R.id.text_view);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
    }

    public void fontPlus(){
        one = one + 1 ;
        textView.setTextSize(one);
    }

    public void fontMinus(){
        one = one - 1;
        textView.setTextSize(one);
    }

    @Override
    public void onClick(View v) {
        if (v == btnPlus){
            Toast.makeText(this,"Button +1 Clicked",Toast.LENGTH_SHORT).show();
            fontPlus();
        }else if (v == btnMinus){
            Toast.makeText(this,"Button -1 Clicked",Toast.LENGTH_SHORT).show();
            fontMinus();
        }
    }
}
