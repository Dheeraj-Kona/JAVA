import java.util.*;
class Solution {
    static int reverse(int num)
    {
        boolean condition = false;
        if (num < 0)
        {
            condition = true;
            num = -num ;
        }
      
        int prev= 0, rev = 0;
        while (num != 0)
        {
      
            rev = (rev*10) + num%10;
      
            if ((rev - (num%10))/10 != prev)
            {
                return 0;
            }
      
            prev = rev;
            
            num = num/10;
        }
      
        return (condition == true)? -rev : rev;
    }
    public static void main(String[] args) {
     
        Scanner hey = new Scanner(System.in);
        
        int x = hey.nextInt();
        
        System.out.println(reverse(x));
        
        hey.close();
    }
}