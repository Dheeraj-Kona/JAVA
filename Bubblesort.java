 import java.util.*;
class Bubblesort {
    public static void main(String[] args) {
        int num,i,j,temp;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of integer elements to sort:");
        num = Sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter "+num+" integers");
        for(i = 0 ;i<num;i++){
            arr[i] = Sc.nextInt();
        }
        for(i=0;i<(num-1);i++){
            for(j=0;j<(num-i-1);j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println("Sorted List of Integers:");
        for(i =0;i<num;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
