import java.util.*;
class harshad {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp;
      int rem = 0,sum = 0;
      temp = n;
      while(n>0){
          rem = n%10;
          sum=sum+rem;
          n=n/10; 
      }   
      if(temp%sum==0){
          System.out.print("Given Number Is Harshad NUmber");
      }   
      else{
          System.out.println("Given Numbr Is Not A Harshad NUmber");
      }
      sc.close();
  }
    
}
