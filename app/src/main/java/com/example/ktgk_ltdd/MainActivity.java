package com.example.ktgk_ltdd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView txtTitle;
    EditText edtBai;
    Button btnChonBH, btnPlay, btnPause;
    SeekBar skSong;

    ArrayList<Song> arraySong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getView();
        AddSong();
    }

    private void AddSong() {
        arraySong = new ArrayList<>();
        arraySong.add(new Song("Ái Nộ", R.))

    }

    private void getView() {
        txtTitle = findViewById(R.id.txtTitle);
        edtBai = findViewById(R.id.edtBai);
        btnChonBH = findViewById(R.id.btnChonBH);
        btnPlay = findViewById(R.id.btnPlay);
        btnPause = findViewById(R.id.btnPause);
        skSong = findViewById(R.id.skSong);
    }


}