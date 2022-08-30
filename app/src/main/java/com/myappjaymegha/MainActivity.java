package com.myappjaymegha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUserName;
    Button btnLogin;
    TextView tvUsername;
    Button btnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUserName = findViewById(R.id.edit_userName);
        btnLogin = findViewById(R.id.btn_login);
        tvUsername = findViewById(R.id.tv_username);
        btnView = findViewById(R.id.btn_view);
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
                String strUserName = edtUserName.getText().toString();
                Toast.makeText(MainActivity.this, "Username is " + strUserName, Toast.LENGTH_SHORT).show();
                tvUsername.setText(strUserName);
                /* Explicit Intent*/
                Intent i = new Intent(MainActivity.this,HomeActivity.class);
                i.putExtra("KEY_USERNAME",strUserName); // put data in intent
                startActivity(i);
                /* Over Explicit Intent*/

            }
        });
    }
}