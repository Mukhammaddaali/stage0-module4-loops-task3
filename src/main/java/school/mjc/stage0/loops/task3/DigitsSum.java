package school.mjc.stage0.loops.task3;

import java.util.Scanner;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum=0;
        for (;;){
            sum+=t%10;
            t=t/10;
            if (t==0) break;
        }
        System.out.println(sum);
    }
   public void main(String []args){
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       printDigitsSum(x);
   }
}
