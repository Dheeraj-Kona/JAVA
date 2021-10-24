import java.util.Scanner;
class Sol {
    public  static int subtractProductAndSum(int n) {
        int sum=0,rem=0,mul=1;
        while(n>0){
            rem = n%10;
            sum= sum+rem;
            mul = mul*rem;
            n/=10;
        }
        return mul-sum;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(subtractProductAndSum(n));
        sc.close();
    }
}