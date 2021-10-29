package com.example.smartmanagertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NhacNhoThemActivity extends AppCompatActivity {
    EditText edtThemTheLoai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhacnho_new_item);
        linkViews();
        addEvents();
    }

    private void addEvents() {
        edtThemTheLoai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(NhacNhoThemActivity.this);
                dialog.setContentView(R.layout.hop_thoai_chon);
                dialog.show();
            }
        });

    }

    private void linkViews() {
        edtThemTheLoai=findViewById(R.id.edtNhacNhoThemTheLoai);
    }
}