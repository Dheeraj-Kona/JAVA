import java.util.*;
class LinearSearch {
  public static void main(String[] args) {
    int a[] = new int[10];
    int n, size, found = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array");
    size = sc.nextInt();
    System.out.println("Enter "+size+" Elements");
    for(int i =0;i<size;i++){
      a[i] = sc.nextInt();
    }
    System.out.println("Enter Search Element");
    n=sc.nextInt();
    for(int i = 0;i<size;i++){
      if(a[i]==n){
        System.out.println("The Element Is Found At Position :"+i);
        found = 1;
        break;
      }
    }
    if(found ==0){
      System.out.println("Element Not Found");
    }
    sc.close();
  }
}
