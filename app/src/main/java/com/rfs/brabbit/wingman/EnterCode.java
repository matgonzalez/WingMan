package com.rfs.brabbit.wingman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class EnterCode extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_enter_code);

        ImageButton GoBackEnterCode = (ImageButton) findViewById(R.id.Button_EnterCode_back);

        GoBackEnterCode.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.Button_EnterCode_back){
            intent = new Intent(this, SMS_Verification.class);
        }else{
            intent = new Intent(this, SMS_Verification.class);
        }
        startActivity(intent);
    }
}
