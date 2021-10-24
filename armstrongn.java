import java.util.Scanner;
import java.lang.Math;
public class armstrongn {
    public static void digit (int n ){
        int count=0,sum=0;
        int Number=n,temp=n;
            while(n!=0){
            n/=10;
            ++count;
        }
        while(Number > 0){
         int r = Number%10;
         sum+=(int)Math.pow(r,count);
         Number/=10;
        }
        String str = (sum==temp) ? "Armstrong Number" : "Not a Armstrong Number";
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        digit(num);
        sc.close();
        
    }
}
