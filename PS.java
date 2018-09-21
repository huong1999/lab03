package huongdo;

//import java.util.Scanner;

public class PS {
    public static int ucln(int a, int b)
    {
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }

    public static void setTu(int tu) {
        this.tu = tu;
    }
    public static void setMau(int mau){
        this.mau=mau;
    }
    public static void cong(int tu1,int mau1,int tu2,int mau2)
    {
        int tu_cong,mau_cong;
        if(mau1==0||mau2==0)
            System.out.println("invalid");
        else {
            tu_cong = (tu1*mau2) + (tu2*mau1);
            mau_cong=mau1*mau2;
            System.out.println("Tong 2 phan so "+tu1+"/"+"mau1 + "+tu2+"/"+mau2+" = ");
            if(tu_cong%ucln(tu_cong,mau_cong)==0&&(mau_cong%ucln(tu_cong,mau_cong)==0))
                System.out.println((tu_cong/ucln(tu_cong,mau_cong))+"/"+(mau_cong/ucln(tu_cong,mau_cong)));
            else
                System.out.println(tu_cong+"/"+mau_cong);
        }
    }
    public static void tru(int tu1,int mau1,int tu2,int mau2)
    {
        int tu_tru,mau_tru;
        if(mau1==0||mau2==0)
            System.out.println("invalid");
        else {
            tu_tru = (tu1*mau2) - (tu2*mau1);
            mau_tru=mau1*mau2;
            System.out.println("Hieu 2 phan so "+tu1+"/"+"mau1 + "+tu2+"/"+mau2+" = ");
            if(tu_tru%ucln(tu_tru,mau_tru)==0&&(mau_tru%ucln(tu_tru,mau_tru)==0))
                System.out.println((tu_tru/ucln(tu_tru,mau_tru))+"/"+(mau_tru/ucln(tu_tru,mau_tru)));
            else
                System.out.println(tu_tru+"/"+mau_tru);
        }
    }
    public static void nhan(int tu1,int mau1,int tu2,int mau2)
    {
        int tu_cong,mau_cong;
        if(mau1==0||mau2==0)
            System.out.println("invalid");
        else {
            tu_cong = tu1*tu2;
            mau_cong=mau1*mau2;
            System.out.println("Tich 2 phan so "+tu1+"/"+"mau1 + "+tu2+"/"+mau2+" = ");
            if(tu_cong%ucln(tu_cong,mau_cong)==0&&(mau_cong%ucln(tu_cong,mau_cong)==0))
                System.out.println((tu_cong/ucln(tu_cong,mau_cong))+"/"+(mau_cong/ucln(tu_cong,mau_cong)));
            else
                System.out.println(tu_cong+"/"+mau_cong);
        }
    }
    public static void chia(int tu1,int mau1,int tu2,int mau2)
    {
        int tu_chia,mau_chia;
        if(mau1==0||mau2==0)
            System.out.println("invalid");
        else {
            tu_chia = (tu1*mau2);
            mau_chia=tu2*mau1;
            System.out.println("Thuong 2 phan so "+tu1+"/"+"mau1 + "+tu2+"/"+mau2+" = ");
            if((tu_chia%ucln(tu_chia,mau_chia))==0&&(mau_chia%ucln(tu_chia,mau_chia)==0))
                System.out.println((tu_chia/ucln(tu_chia,mau_chia))+"/"+(mau_chia/ucln(tu_chia,mau_chia)));
            else
                System.out.println(tu_chia+"/"+mau_chia);
        }
    }
    public boolean equals(int tu1,int mau1,int tu2,int mau2){
        if((tu1==tu2&&mau1==mau2)||((tu1/ucln(tu1,mau1)==tu2/ucln(tu1,mau1))&&(mau1/ucln(tu1,mau1)==(mau2/ucln(tu1,mau1)))))
            return true;
        else
            return false;
    }
    public static void main(String[] agrs){
        //Scanner scan=new Scanner(System.in);
        int tu1,mau1,tu2,mau2;
        tu1.setTu("1");
        mau1.setMau("2");
        tu2.setTu("3");
        mau2.setMau("4");
        cong(tu1,mau1,tu2,mau2);
        tru(tu1,mau1,tu2,mau2);
        nhan(tu1,mau1,tu2,mau2);
        chia(tu1,mau1,tu2,mau2);
        if(equals(tu1,mau1,tu2,mau2)==true)
            System.out.println("2 phan so bang nhau");
        else
            System.out.println("2 phan so khac nhau");
    }
}
