package com.myappjaymegha;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class DateTimeActivity extends AppCompatActivity {

    Button btnDate, btnTime;
    TextView tvDate, tvTime;
    int date, month, year, hour, minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);
        btnDate = findViewById(R.id.btn_date);
        tvDate = findViewById(R.id.tv_date);
        btnTime = findViewById(R.id.btn_time);
        tvTime = findViewById(R.id.tv_time);

        Calendar calendar = Calendar.getInstance();
        date = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(DateTimeActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hours, int minutes) {
                        tvTime.setText(hours + ":" + minutes);

                    }
                }, hour, minute, true);

                timePickerDialog.show();
            }
        });


        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(DateTimeActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int date) {

                        tvDate.setText(date + "/" + (month + 1) + "/" + year);
                    }
                }, year, month, date);
                datePickerDialog.show();
            }
        });


    }
}