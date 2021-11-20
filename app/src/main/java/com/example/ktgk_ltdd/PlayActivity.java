package com.example.ktgk_ltdd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    TextView txtTitlePlay;
    EditText edtBH;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btnChon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        getView1();
    }

    private void getView1() {
        txtTitlePlay = findViewById(R.id.txtTitlePlay);
        edtBH = findViewById(R.id.edtBH);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btnChon = findViewById(R.id.btnChon);
    }
}