package com.example.smartmanagertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.example.nhacnho.NhacNho;
import com.example.nhacnho.NhacNhoAdapter;

import java.util.ArrayList;

public class NhacNhoActivity extends AppCompatActivity {
    ListView lvNhacNho;
    ArrayList<NhacNho> nhacNhos;
    NhacNhoAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhacnho_main);
        linkViews();
        initData();
        loadData();
        addEvents();
    }

    private void linkViews() {
        lvNhacNho=findViewById(R.id.lvNhacNho);
    }

    private void initData() {
        nhacNhos= new ArrayList<NhacNho>();
        nhacNhos.add(new NhacNho("Tiết kiệm","Mua xe","Hàng tháng","Ngày 20"));
        nhacNhos.add(new NhacNho("Chi","Tiền điện","Hàng tháng","Ngày 29"));

    }



    private void loadData() {
        adapter= new NhacNhoAdapter(NhacNhoActivity.this,R.layout.nhac_nho_item_layout,nhacNhos);
        lvNhacNho.setAdapter(adapter);
    }

    private void addEvents() {

    }
}