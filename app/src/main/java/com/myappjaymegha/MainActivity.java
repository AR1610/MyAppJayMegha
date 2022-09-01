package com.myappjaymegha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUserName;
    Button btnLogin;
    TextView tvUsername;
    Button btnView;
    RadioGroup radioGroup;
    CheckBox chb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUserName = findViewById(R.id.edit_userName);
        btnLogin = findViewById(R.id.btn_login);
        tvUsername = findViewById(R.id.tv_username);
        btnView = findViewById(R.id.btn_view);
        radioGroup = findViewById(R.id.radio_grp);
        chb = findViewById(R.id.chb);
        
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Implicit Intent*/
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(i);
                /*over Implicit Intent */
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chb.isChecked()){

                    String strUserName = edtUserName.getText().toString();
                    int id = radioGroup.getCheckedRadioButtonId();
                    RadioButton radioButton = findViewById(id);
                    String strGender = radioButton.getText().toString();

                    Toast.makeText(MainActivity.this, "Gender is " + strGender, Toast.LENGTH_SHORT).show();
                    tvUsername.setText(strUserName);
                    /* Explicit Intent*/
                    Intent i = new Intent(MainActivity.this,HomeActivity.class);
                    i.putExtra("KEY_USERNAME",strUserName); // put data in intent
                    startActivity(i);
                    /* Over Explicit Intent*/

                }else {
                    Toast.makeText(MainActivity.this, "Please Select CheckBox", Toast.LENGTH_SHORT).show();
                }
               
            }
        });
    }
}