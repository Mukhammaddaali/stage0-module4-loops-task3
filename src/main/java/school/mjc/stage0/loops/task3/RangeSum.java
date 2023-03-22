package school.mjc.stage0.loops.task3;

import java.util.Scanner;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum=0;
        for (int i=firstBoarder;i<=secondBoarder;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        printSumInclusive(x,y);
    }
}
