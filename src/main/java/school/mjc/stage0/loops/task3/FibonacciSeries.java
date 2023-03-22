package school.mjc.stage0.loops.task3;

import java.util.Scanner;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f1=1;
        int f2=1;
        int f=1;
        for (int i=3;i<=lastFibonacci;i++){
            f=f1+f2;
            f2=f1;
            f1=f;
        }
        System.out.println(f);
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        printFibonacci(x);
    }
}
