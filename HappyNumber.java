import java.util.*;
import java.lang.Math;

public class HappyNumber {
    public static int happy(int n){
        int num=n;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+(int)Math.pow(rem,2);
            num=num/=10;

        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        while(n>=9){
            n=happy(n);

        }
        if(n==1){
            System.out.println("Happy number..");
        }else{
            System.out.println("Not Happy");
        }

    }
    
}