package com.example.jobs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Three extends AppCompatActivity {
    RadioButton male, female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        male =(RadioButton)findViewById(R.id.male);
        female =(RadioButton) findViewById(R.id.female);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked =((RadioButton) view).isChecked();
        String str="";
        switch (view.getId()){
            case R.id.male:
                if(checked)
                    str="MALE Selected";
                break;
            case R.id.female:
                if (checked)
                    str="FEMALE Selected";
                break;

        }
        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
    }
}
