package com.example.linearlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_toLinearLayout=(Button)findViewById(R.id.btn_toLinearLayout);
        btn_toLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LinearLayoutActivity.class);
                startActivity(intent);
            }
        });
        Button btn_toConstraintLayout=(Button)findViewById(R.id.btn_toConstraintLayout);
        btn_toConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ConstraintLayoutActivity.class);
                startActivity(intent);
            }
        });
        Button btn_toTableLayout=(Button)findViewById(R.id.btn_toTableLayout);
        btn_toTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TableLayoutActivity.class);
                startActivity(intent);
            }
        });
    }

}
