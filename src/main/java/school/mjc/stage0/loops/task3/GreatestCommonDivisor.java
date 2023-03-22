package school.mjc.stage0.loops.task3;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd=0;
        for (int i=1;i<=first&&i<=second;i++){
            if (first % i ==0&& second % i==0) gcd=i;
        }
        System.out.println(gcd);
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        printGCD(x,y);
    }
}
