import java.util.*;
 class pattern3 { 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 65;
        for(int i = 0;i<=n-1;i++){
            int x = i;
          for(int j =0;j<=i;j++){
            System.out.print((char)(a+x)+" ");
            x +=1;
        }
    System.out.println();    
      } 
     
      sc.close(); 

        }  
    }
    