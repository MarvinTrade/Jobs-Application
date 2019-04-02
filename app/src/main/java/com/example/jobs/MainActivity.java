package com.example.jobs;
/**
 * MARVIN TAREMWA
 * 2016/BIT/087/PS
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button getnamebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getnamebtn = (Button) findViewById(R.id.getnamebtn);
        getnamebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onGetNameClick();
            }

        });
    }

    public void onGetNameClick() {
        Intent intent= new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
