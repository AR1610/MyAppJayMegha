package com.myappjaymegha;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {

    Button btnAlert,btnCustomDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        btnAlert = findViewById(R.id.btn_AlertDialog);
        btnCustomDialog = findViewById(R.id.btn_cstm_dialog);
        btnCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater layoutInflater = getLayoutInflater();
                View myview = layoutInflater.inflate(R.layout.raw_custom_dialog,null);

                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setView(myview);
                builder.show();

            }
        });

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder= new AlertDialog.Builder(AlertActivity.this);
                builder.setIcon(R.mipmap.ic_launcher_round);
                builder.setMessage("Are you sure, You want to delete this file ?");
                builder.setTitle(R.string.app_name);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "Yes is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "No", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNeutralButton("Finish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                    }
                });
                builder.show();
            }
        });
    }


    @Override
    public void onBackPressed() {
       // super.onBackPressed();


        AlertDialog.Builder builder= new AlertDialog.Builder(AlertActivity.this);
        builder.setIcon(R.mipmap.ic_launcher_round);
        builder.setMessage("Are you sure, You want to exit this App ?");
        builder.setTitle(R.string.app_name);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finish();
            }
        });
        builder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.dismiss();
            }
        });
        builder.show();

    }
}