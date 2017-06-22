package com.rfs.brabbit.wingman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.NumberPicker;

public class SMS_Verification extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sms__verification);

        NumberPicker CountryPicker = (NumberPicker) findViewById(R.id.numberPickerCountry);
        Button RequestCodeButton = (Button) findViewById(R.id.buttonRequestCode);
        ImageButton GoBackSMS = (ImageButton) findViewById(R.id.Button_SMS_back);

        RequestCodeButton.setOnClickListener(this);
        GoBackSMS.setOnClickListener(this);

        final String[] Countrys= {"United States +1", "United Kingdom +44", "Australia +61", "Colombia +57"};

        CountryPicker.setMinValue(0);
        CountryPicker.setMaxValue(Countrys.length-1);
        CountryPicker.setDisplayedValues(Countrys);
        CountryPicker.setWrapSelectorWheel(true);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.Button_SMS_back){
            intent = new Intent(this, Intro.class);
        }else{
            intent = new Intent(this, EnterCode.class);
        }
        startActivity(intent);
    }
}
