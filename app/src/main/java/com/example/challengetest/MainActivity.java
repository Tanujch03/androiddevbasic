package com.example.challengetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterclick(View view)
    {
        TextView txtfirstname = findViewById(R.id.txtfirstname);
        TextView txtlastname = findViewById(R.id.txtlastname);
        TextView txtemail = findViewById(R.id.txtemail);


        EditText edttextfirstname = findViewById(R.id.editTextfirstname);
        EditText edttextlastname = findViewById(R.id.editTextlastname);
        EditText edttextemail = findViewById(R.id.editTextTextemail);

        txtfirstname.setText("First Name: "+edttextfirstname.getText().toString());
        txtlastname.setText("Last Name: "+edttextlastname.getText().toString());
        txtemail.setText("Email: "+edttextemail.getText().toString());
    }


}