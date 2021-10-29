package com.example.smartmanagertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

public class NhacNhoThemActivity extends AppCompatActivity {
    TextView txtThemTheLoai;
    TextView txtThemNgayBatDau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhacnho_new_item);

        linkViews();
        addEvents();
    }

    private void addEvents() {
        txtThemTheLoai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(NhacNhoThemActivity.this);
                dialog.setContentView(R.layout.hop_thoai_chon);
                dialog.show();
            }
        });
        MaterialDatePicker.Builder<Long> builder= MaterialDatePicker.Builder.datePicker();
        builder.setTitleText("SELECT DATE");
        MaterialDatePicker materialDatePicker = builder.build();
        txtThemNgayBatDau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                materialDatePicker.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
            }
        });
//        materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
//            @Override
//            public void onPositiveButtonClick(Object selection) {
//                txtThemNgayBatDau.setText(materialDatePicker.getHeaderText());
//            }
//        });
//        materialDatePicker.addOnNegativeButtonClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                materialDatePicker.dismiss();
//            }
//        });

    }

    private void linkViews() {
        txtThemTheLoai=findViewById(R.id.txtNhacNhoThemTheLoai);
        txtThemNgayBatDau=findViewById(R.id.txtNhacNhoThemNgayBatDau);
    }
}