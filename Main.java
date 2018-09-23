package com.company;
import java.util.Scanner;
public class Main {
    public static int fibonaci(int n){      //ham de qui
        if(n==0||n==1)
            return 1;
        else
            return fibonaci(n-1)+fibonaci(n-2);
    }

    public static int ucln(int a, int b)            //tinh ucln cua a va b
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
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b,n;
        a=scan.nextInt();
        b=scan.nextInt();
        n=scan.nextInt();
	    System.out.println("UCLN cua a & b là : " + ucln(a,b));
        System.out.print("fibonaci thu "+n+" bang " + fibonaci(n));
    }
}
