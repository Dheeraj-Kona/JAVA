import java.util.Scanner;
class Queueoperation {
   int size,front,rear;
   int a[];
  public Queueoperation(int n){
       size = n;
       a = new int[size];
       front = rear = 0;
   } 
   void insert(int y){
       if(rear == size){
           System.out.println("Queue Is FUll");
       }
       else{
        System.out.println("Enter a Element");
           a[rear] = y;
           rear++;
       }
   }
void delete(){
   if(front == rear){
    System.out.println("Queue IS Empty");
   } 
   else{
       System.out.println("The Deleted Element is"+a[front]);
       front++;
   }
}
void display(){
    if(front == rear){
System.out.println("Queue Is Empty");
    }
    else{
        String s = "The Elements Are:";
        for(int i =front;i<rear;i++){
            s=s+" "+a[i];
        }
        System.out.println(s+"\t");
    }  
}
}
class Queuenew{
    public static void main(String[] args) {
        int n,x;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of the Queue");
        n=s.nextInt();
        Queueoperation q = new Queueoperation(n);
        while(true){
            System.out.println("Enter Choice\n1.Insert\n2.Delete\n3.Display\n Other:exit");
            int ch = s.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter a New Element to insert into Queue");
                x =s.nextInt();
                q.insert(x);
                break;
                case 2:
               q.delete();
                break;
                case 3 :
                q.display();
                break;
                default:
                System.exit(0);
            }
        }
    }
}
