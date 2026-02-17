package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int mCount=1;
    private TextView mshowCount;
    private String msg="AZIZ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        Log.d("Tag",msg);

        setContentView(R.layout.activity_main);
        mshowCount=(TextView) findViewById(R.id.showcount);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void showToast(View view) {
        Toast toast= Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showCount(View view) {
        ++mCount;
        Log.d("Tag",msg);
        if(mshowCount!=null){
            mshowCount.setText(Integer.toString(mCount));
            Log.d("Tag",msg);
        }
    }

    public void newFon(View view) {
        --mCount;
        if(mshowCount!=null){
            mshowCount.setText(Integer.toString(mCount));
            Log.d("Tag",msg);
        }
    }

    public void ToZero(View view) {
        mCount=0;
        if(mshowCount!=null){
            mshowCount.setText(Integer.toString(mCount));
            Log.d("Tag",msg);
        }

    }
}