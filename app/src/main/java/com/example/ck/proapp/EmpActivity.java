package com.example.ck.proapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class EmpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp);
        if (((Switch)findViewById(R.id.switch1)).isChecked()) {
            change = true;
        } else {
            change = false;
        }
    }

    int count=0;
    boolean change;
    public void Btn1_Click(View V)
    {
        TextView tex = (TextView) findViewById(R.id.textView);

        if (change == false) {
            count++;
        } else {
            count--;
        }
        tex.setText("已点击"+count+"次");

    }

    public void txt_Click(View V)
    {
        count=0;
        ((TextView)V).setText("已点击"+count+"次");
    }

    public void switch_Click(View V)
    {
        if (((Switch) V).isChecked()) {
            change = true;
        } else {
            change = false;

        }

    }

    public void goBtn2_Click(View V)
    {

        startActivity(new Intent(EmpActivity.this,secActivity.class));

    }
    public void goBtn1_Click(View V)
    {

        startActivity(new Intent(EmpActivity.this,fullActivity.class));

    }
}
