package com.company;
import java.util.Scanner;
public class Main {
    public static int func1(int a,int b){
        if(a>b)
            return a;
        return b;
    }
    public static int func2(int a,int b,int c){
        if(a>b && a>c)
            return a;
        if(b>a && b>c)
            return b;
        return c;
    }
    public static int func3(int a,int b){
        int sum = 0 ;
        for(int i = 0; i<b;i++){
            sum += a + 10 * i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        if(q==1) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(func1(n, m));
        }
        if(q==2){
            int z = sc.nextInt();
            int x = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(func2(z,x,c));
        }
        if(q==3) {
            int w = sc.nextInt();
            int e = sc.nextInt();
            System.out.println(func3(w, e));
        }
    }
}
