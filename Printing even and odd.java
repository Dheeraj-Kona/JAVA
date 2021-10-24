import java.util.*;
class sample{
      public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          String s = Integer.toString(n);
          System.out.println("Even Numbers:");
          for(int i =1;i<=s.length();i++){
              if(i%2==0){
                  System.out.println(i);
              }
          }
          System.out.println("Odd Numbers:");
          for(int i =1;i<=s.length();i++){
              if(i%2!=0){
                  System.out.println(i);
              }
            }
      sc.close();
    }
}