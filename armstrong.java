import java.util.Scanner;
class armstrong {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int n = sc.nextInt();
    int sum =0;
    int temp = n;
    while(n>0){
        int r = n%10;
        sum+=r*r*r;
        n/=10;
    }
    String str = (temp == sum) ? "Armstrong" : "Not a Armstrong";
    System.out.print(str); 
    sc.close();
}
}
