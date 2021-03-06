package com.example.pratical_2_part_a_version_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;
    private TextView btnCount;
    private TextView btnZero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView)findViewById(R.id.show_count);
        btnCount = (TextView) findViewById(R.id.button_count);
        btnZero = (TextView) findViewById(R.id.button_zero);
    }
    public void showToast(View view){
        Toast toast= Toast.makeText(this,R.string.toast_message, Toast.LENGTH_SHORT);

        toast.show();

    }
    public void countUp(View view){
        ++mCount;
        if(mShowCount!=null)
            btnZero.setBackgroundColor(Color.RED);
            mShowCount.setText(Integer.toString(mCount));
        if ((mCount%2)==0){
            btnCount.setBackgroundColor(Color.CYAN);
        }
        else{
            btnCount.setBackgroundColor(Color.YELLOW);
        }

    }
    public void showZero(View view){
        btnZero.setBackgroundColor(Color.DKGRAY);
        mCount=0;
        mShowCount.setText(Integer.toString(mCount));
    }
}