import java.util.Scanner;
class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a Number: ");
        int n = sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
if(n%i==0){
    count++;
}
        }
        String str = (count==2) ? "Prime Number" : "Not a Prime Number";
        System.out.println(str);
        sc.close();
}
}