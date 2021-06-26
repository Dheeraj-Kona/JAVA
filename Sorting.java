import java.util.*;
public class sorting
{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		int arr[];
        arr = new int[4];
        for(int i =0;i<4;i++){
            arr[i] = sc.nextInt();       
             }
             Arrays.sort(arr);
                  System.out.println("Highest Number In The Series Is: "+ arr[3]);
             
              
	}
}
