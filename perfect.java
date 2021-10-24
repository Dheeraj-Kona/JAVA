import java.util.Scanner;
class perfect {
    perfect(int n){
        int count=0;
        for(int i=1;i<=n/2;i++){
            if(n%1==0)
            count+=i;
        }
       String str = (count == n) ? "Perfect Number" : "Not a Perfect number";
       System.out.println(str);
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        sc.close();
        perfect p = new perfect(num);
        
    }
}
