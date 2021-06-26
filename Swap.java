import java.util.*;
public class swapnumbers {
	public static void main(String[] swap) {
		
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt(),b = sc.nextInt();;
		System.out.println("Before Swap "+a+" "+b);
		a ^= b;
        b ^=a;
        a ^=b; 
		System.out.println("After Swap "+a+" "+b);
		sc.close();
	}
}
