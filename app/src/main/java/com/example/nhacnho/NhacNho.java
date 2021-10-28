package com.example.nhacnho;

public class NhacNho {
    private String theLoai;
    private String ten;
    private String chuKy;
    private String thoiGianNhac;

    public NhacNho(String theLoai, String ten, String chuKy, String thoiGianNhac) {
        this.theLoai = theLoai;
        this.ten = ten;
        this.chuKy = chuKy;
        this.thoiGianNhac = thoiGianNhac;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChuKy() {
        return chuKy;
    }

    public void setChuKy(String chuKy) {
        this.chuKy = chuKy;
    }

    public String getThoiGianNhac() {
        return thoiGianNhac;
    }

    public void setThoiGianNhac(String thoiGianNhac) {
        this.thoiGianNhac = thoiGianNhac;
    }
}
