package school.mjc.stage0.loops.task3;

import java.util.Scanner;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum=0;
        double z=1;
        for (int i=1;i<=lengthOfLastNumber;i++) {


            sum+=Math.pow(10,z++)-1;
        }
        System.out.println(sum);
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        calculateSum(x);
    }
}
