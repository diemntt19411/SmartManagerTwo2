package com.example.smartmanagertwo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KetNoi_MoiBan extends AppCompatActivity {

    Button btnInvite,btnHuy;
    private AlertDialog.Builder moibanBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_noi_moi_ban);
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_ketnoi_invite);
        dialog.show();

        btnInvite=dialog.findViewById(R.id.btnInvite);
        btnHuy=dialog.findViewById(R.id.btnHuy);
        btnInvite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                showDialog1();


            }

        });



    }

    private void showDialog1() {
        moibanBuilder = new AlertDialog.Builder(this);
        moibanBuilder.setCancelable(false);
        moibanBuilder.setView(R.layout.dialog_ketnoi_gioithieu);
        moibanBuilder.create();
        moibanBuilder.show();




    }
}