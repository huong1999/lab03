package bai3;
public class phuongThuc {

    public static void main(String[] args){
        Teacher T1=new Teacher();    //phuong thuc khoi tao <tham chieu doi tuong Teacher>
        Doctor d1=new Doctor();

        System.out.println(T1.toString()+"\n"+d1.toString());
    }


    static class Teacher {

        private String mon,tenGV,tuoi;          //khai bao cac thuoc tinh chi co trong lop Teacher

        public void setMon(String mon) {            //setter
            this.mon = mon;
        }

        public String getTenGV() {              //getter
            return tenGV;
        }

        public void setTenGV(String tenGV) {
            this.tenGV = tenGV;
        }

        public String getMon() {
            return mon;
        }

        public void setTuoi(String tuoi) {
            this.tuoi = tuoi;
        }
        public String getTuoi() {
            return tuoi;
        }

    }
//
    static class Student {
        private String truong,lop,tenHS;

        public String getTruong() {
            return truong;
        }

        public void setTruong(String truong) {
            this.truong = truong;
        }

        public String getLop() {
            return lop;
        }

        public void setLop(String lop) {
            this.lop = lop;
        }

        public String getTenHS() {
            return tenHS;
        }

        public void setTenHS(String tenHS) {
            this.tenHS = tenHS;
        }
    }
//
    static class Programer {
        private String congTi,tuoi;

        public void setCongTi(String congTi) {
            this.congTi = congTi;
        }

        public String getCongTi() {
            return congTi;
        }

        public String getTuoi() {
            return tuoi;
        }

        public void setTuoi(String tuoiP) {
            this.tuoi = tuoi;
        }
    }
//
    static class Cat {
        private String chungLoai,color;

        public String getChungLoai() {
            return chungLoai;
        }

        public void setChungLoai(String chungLoai) {
            this.chungLoai = chungLoai;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
//
    static public class Dog {
        private String chungLoai,color,ten;

        public String getChungLoai() {
            return chungLoai;
        }

        public void setChungLoai(String chungLoai) {
            this.chungLoai = chungLoai;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }
    }
//
    static class Boss {
        private String linhVuc,congTi;

        public String getLinhVuc() {
            return linhVuc;
        }

        public void setLinhVuc(String linhVuc) {
            this.linhVuc = linhVuc;
        }

        public String getCongTi() {
            return congTi;
        }

        public void setCongTi(String congTi) {
            this.congTi = congTi;
        }
    }
//
    static class Doctor {
        private String khoa,vien,ten,tuoi;

        public String getKhoa() {
            return khoa;
        }

        public void setKhoa(String khoa) {
            this.khoa = khoa;
        }

        public String getVien() {
            return vien;
        }

        public void setVien(String vien) {
            this.vien = vien;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getTuoi() {
            return tuoi;
        }

        public void setTuoi(String tuoi) {
            this.tuoi = tuoi;
        }
    }
//
    static class President {
        private String country,ten,tuoi;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getTuoi() {
            return tuoi;
        }

        public void setTuoi(String tuoi) {
            this.tuoi = tuoi;
        }
    }
//
    static class Engineers {
        private String Nganh,ten,tuoi;

        public String getNganh() {
            return Nganh;
        }

        public void setNganh(String nganh) {
            Nganh = nganh;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getTuoi() {
            return tuoi;
        }

        public void setTuoi(String tuoi) {
            this.tuoi = tuoi;
        }
    }
//
    static class Driver {
        private String phuongTien,ten,bienSo;

        public String getPhuongTien() {
            return phuongTien;
        }

        public void setPhuongTien(String phuongTien) {
            this.phuongTien = phuongTien;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getBienSo() {
            return bienSo;
        }

        public void setBienSo(String bienSo) {
            this.bienSo = bienSo;
        }
    }
}