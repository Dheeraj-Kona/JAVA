import java.util.*;
public class vow
{
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         char ch = in.next().charAt(0);
         
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
System.out.println("vowels");
    }
    else{
        System.out.println("Consonants");
    }
	}
}
