package com.example.smartmanagertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CaiDatThongTinAppChinhSach extends AppCompatActivity {
    TextView txtChinhSach;
    String chinhSach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cai_dat_thong_tin_app_chinh_sach);
        linkViews();

    }

    private void linkViews() {
        txtChinhSach=findViewById(R.id.txtCaiDatChinhSach);
    }
}