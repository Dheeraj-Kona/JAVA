import java.util.Scanner;
class BinarySearchExample
{
   public static void main(String args[])
   {
      int a[] = new int[10];
      Scanner sc = new Scanner(System.in);
      int size,key,i,j;
      System.out.println("Enter size of elements:");
      size = sc.nextInt(); 
      System.out.println("Enter " + size + " integers");
      for (i = 0; i < size; i++){
          a[i] = sc.nextInt();
      }
      for(i=0;i<size;i++){
          for(j=i+1;j<size;j++){
              if(a[i]>a[j]){
                  int temp = a[i];
                  a[i] = a[j];
                  a[j]=temp;
              }
          } 
      }
      System.out.print("Elements After Sorting:");
      for(i =0;i<size;i++){
        System.out.print(a[i]+" ");
    }
      System.out.println("\nEnter the search value:");
      key= sc.nextInt();
      int found = 0,first = 0,last = size-1;
      sc.close();
      while(first <= last){
     int  middle = (last+ first)/2;
      if(a[middle]==key){
          System.out.println("The Element is Found At  Index Position "+(middle));
          found = 1;
          break;
      }
      else if(a[middle]>key){
          last=middle-1;
      }
      else{
          first =middle+1;
      }
      }
      if((found==0)&&(first>last)){
          System.out.print("Element Not Found");
      }
     
   }
}