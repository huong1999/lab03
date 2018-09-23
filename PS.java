package huongdo;

import static com.company.Main.ucln;

public class PS
{
    private int tu, mau;        //khai bao

    //ham tinh UCLN
    private static int UCLN(int a, int b)
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

/*constructor*/
    public PS(int tu, int mau)
    {
        this.tu=tu;
        this.mau=mau;
    }

//setter
    public void setTu(int tu)
    {
        this.tu=tu;
    }
    public void setMau(int mau)
    {
        this.mau=mau;
    }
//getter
    public int getTu()
    {
        return this.tu;
    }
    public int getMau()
    {
        return this.mau;
    }
//rut on phan so
    public  PS rutGon(PS s) {
        if(s.tu==0) {
            s.mau = 0;
            return s;
        }
        if(s.tu==s.mau) {
            s.tu = 1;
            s.mau = 1;
            return s;
        }
        if(s.tu>0&&s.mau<0)
        {
            s.tu=-s.tu;
            s.mau=Math.abs(s.mau);
            return s;
        }
        return s;
    }

/*cac ham tinh toan*/
public  PS congPS(PS s1, PS s2)
{
    PS s = new PS(0, 0);
    if(s1.mau == s2.mau)
    {
        s.tu = s1.tu + s2.tu;
        s.mau = s1.mau;
    }
    else
    {
        s.tu = s1.tu * s2.mau + s2.tu * s1.mau;
        s.mau = s1.mau * s2.mau;

    }
    s = rutGon(s);
    return s;
}
    public  PS truPS(PS s1, PS s2)
    {
        PS s = new PS(0, 0);
        if(s1.mau == s2.mau)
        {
            s.tu = s1.tu - s2.tu;
            s.mau = s1.mau;
        }
        else
        {
            s.tu = s1.tu * s2.mau - s2.tu * s1.mau;
            s.mau = s1.mau * s2.mau;

        }
        s = rutGon(s);
        return s;
    }
    public  PS nhanPS(PS s1, PS s2)
    {
        PS s = new PS(0, 0);
        s.tu = s1.tu * s2.tu;
        s.mau = s1.mau * s2.mau;
        s = rutGon(s);
        return s;
    }
    public PS chiaPS(PS s1, PS s2)
    {
        PS s = new PS(0, 0);
        s.tu = s1.tu * s2.mau;
        s.mau = s1.mau * s2.tu;
        s = rutGon(s);
        return s;
    }

    public boolean equals(PS ps1) {
        if(this.tu*ps1.mau==ps1.tu*this.mau)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        PS ps1 = new PS(5, 3);
        PS ps2 = new PS(5, 3);

        PS ps  = new PS(0, 0);

        ps = ps.congPS(ps1, ps2);
        System.out.println("Tong: " + ps.tu + "/" + ps.mau);
        ps = ps.truPS(ps1, ps2);
        System.out.println("Hieu: " + ps.tu + "/" + ps.mau);
        ps = ps.nhanPS(ps1, ps2);
        System.out.println("Tich: " + ps.tu + "/" + ps.mau);
        ps = ps.chiaPS(ps1, ps2);
        System.out.println("Thuong: " + ps.tu + "/" + ps.mau);

        if( ps1.equals(ps2)==true)
            System.out.println("2 phan so bang nhau");
        else
            System.out.println("2 phan so khac nhau");
    }
}