package com.lisxapp.circle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.lisxapp.circle.ui.CircleActivity;
import com.lisxapp.circle.ui.FormActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_CircleActivity;
    private Button btn_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_CircleActivity = (Button) findViewById(R.id.btn_CircleActivity);
        btn_list = (Button) findViewById(R.id.btn_list);
        btn_CircleActivity.setOnClickListener(this);
        btn_list.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = null;
        switch (id) {
            case R.id.btn_CircleActivity:
                intent = new Intent(MainActivity.this, CircleActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_list:
                intent = new Intent(MainActivity.this, FormActivity.class);
                startActivity(intent);
                break;
        }

    }
}
