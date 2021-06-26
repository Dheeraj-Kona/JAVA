import java.util.*;
public class evenodd {
	public static void main(String[] result) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println((i ^ 1) == i + 1?"Even":"Odd"); //Using XOR operator
		System.out.println((i & 1) == 0?"Even":"Odd"); //Using And operator
		System.out.println((i | 1) > i?"Even":"Odd"); //Using Or operator
		sc.close();
	}
}
