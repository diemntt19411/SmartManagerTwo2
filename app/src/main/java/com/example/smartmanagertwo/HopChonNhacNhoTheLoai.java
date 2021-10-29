package com.example.smartmanagertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.hopchon.HopChonAdapter;
import com.example.hopchon.HopChonItem;

import java.util.ArrayList;

public class HopChonNhacNhoTheLoai extends AppCompatActivity {
    GridView gvNhacNhoTheLoai;
    ArrayList<HopChonItem> items;
    HopChonAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hop_chon_nhac_nho_the_loai);
        linkViews();
        initData();
        LoadData();
        addEvents();
    }

    private void linkViews() {
        gvNhacNhoTheLoai=findViewById(R.id.gvHopChonItem);
    }

    private void initData() {
        items=new ArrayList<HopChonItem>();
        items.add(new HopChonItem(R.drawable.ic_thu_nhap,"Thu"));
        items.add(new HopChonItem(R.drawable.ic_di_chuyen,"Chi"));
        items.add(new HopChonItem(R.drawable.ic_quan_ao,"Tiết kiệm"));
        items.add(new HopChonItem(R.drawable.ic_mua_sam,"DS mua sắm"));


    }

    private void LoadData() {
        adapter = new HopChonAdapter(HopChonNhacNhoTheLoai.this,R.layout.hop_chon_item,items);
        gvNhacNhoTheLoai.setAdapter(adapter);
    }

    private void addEvents() {
    }
}