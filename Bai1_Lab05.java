package com.company;
//fix lỗi ham main
    class Fruit {                //lớp Hoa Qua
        public int cost;
        public int number;
        public String Origin;
        public String day;
        public Fruit(){
            super();
        }

        public Fruit(int cost, int number, String Origin, String day){
            this.cost=cost;
            this.number=number;
            this.Origin=Origin;
            this.day=day;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getOrigin() {
            return Origin;
        }

        public void setOrigin(String origin) {
            Origin = origin;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }
    }

    class Orange extends Fruit {         //lop Qua Cam
        public Orange(){
            super();
        }

        public Orange(int cost, int number, String Origin, String day) {
            super(cost, number, Origin, day);
        }
    }

    class Apple extends Fruit {          //lop Qua Tao
        public Apple(){
            super();
        }

        public Apple(int cost, int number, String Origin, String day) {
            super(cost, number, Origin, day);
        }
    }

    class caoPhongOrange extends Orange {        //lop Cam Cao Phong
        public caoPhongOrange(){
            super();
        }

        public caoPhongOrange(int cost, int number, String Origin, String day) {
            super(cost, number, Origin, day);
        }
    }

    class SanhOrange extends Orange {        //lop cam Sanh

        public SanhOrange() {
            super();
        }

        public SanhOrange(int cost, int number, String Origin, String day) {
            super(cost, number, Origin, day);
        }
    }
public class Bai1_Lab05 {
    public static void main(String[] args) {
        Fruit f = new Fruit(10,1000,"Viet nam","10/7/2018");
        System.out.println("-Gia hoa qua : " + f.getCost()+"k/kg");
        System.out.println("-So luong hoa qua : "+f.getNumber());
        System.out.println("-Xuat xu :"+f.getOrigin());
        System.out.println("-Ngay nhap : "+f.getDay() + "\n");


        Orange or = new Orange(20,2000,"Thai Lan","12/7/2018");
        System.out.println("-Gia cam : " + or.getCost()+"k/kg");
        System.out.println("-So luong cam : "+or.getNumber());
        System.out.println("-Xuat xu :"+or.getOrigin());
        System.out.println("-Ngay nhap : "+or.getDay() + "\n");


        Apple app = new Apple(25,3000,"Campuchia","11/7/2018");
        System.out.println("-Gia tao : " + app.getCost()+"k/kg");
        System.out.println("-So luong tao : "+app.getNumber());
        System.out.println("-Xuat xu :"+app.getOrigin());
        System.out.println("-Ngay nhap : "+app.getDay() + "\n");


        caoPhongOrange cp = new caoPhongOrange(15,1500,"Lao","10/7/2018");
        System.out.println("-Gia cam Cao Phong : " + cp.getCost()+"k/kg");
        System.out.println("-So luong cam Cao Phong : "+cp.getNumber());
        System.out.println("-Xuat xu :"+cp.getOrigin());
        System.out.println("-Ngay nhap : "+cp.getDay() + "\n");

        SanhOrange s = new SanhOrange(20,4000,"Nhat Ban","12/7/2018");
        System.out.println("-Gia cam Sanh : " + s.getCost()+"k/kg");
        System.out.println("-So luong cam Sanh : "+s.getNumber());
        System.out.println("-Xuat xu :"+s.getOrigin());
        System.out.println("-Ngay nhap : "+s.getDay());

    }
}