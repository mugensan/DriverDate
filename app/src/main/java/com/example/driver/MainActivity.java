package com.example.driver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button btn_get_date;
    private Date date;
    private TextView tv_hidden;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_get_date = findViewById(R.id.btn_get_date);
        tv_hidden = findViewById(R.id.tv_hidden_view);

        btn_get_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            transitionDate();



            }
        });
    }

    public void transitionDate(){
        Intent intent = new Intent(this,SecondActivity.class);
        Date today = Calendar.getInstance().getTime();//getting date
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");//formating according to my need
        String today_date = formatter.format(today);

        System.out.println(today_date);
        tv_hidden.setText(today_date);
        intent.putExtra("DATE",tv_hidden.getText().toString());
        startActivity(intent);

    }


}
