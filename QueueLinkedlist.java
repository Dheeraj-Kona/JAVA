import java.util.*;
class Node{
    public int data;
    public Node link,p,q,k,head,tail;
    public Node(){
        head = tail=null;
    }
    public Node(int x){
        this.data=x;
        this.link=null;
    }
}
class Queue extends Node{
    void insert(int x){
        p = new Node(x);
        if(head == null){
            head= tail=p;
        }
        else{
            tail.link=p;
            tail=p;
        }
    }
    void display(){
        if(head==null){
            System.out.println("Queue Is Empty");
        }
        else{
            String s = "Elements Are";
            for(p=head;p!=null;p=p.link){
                s = s+" "+p.data;
            }
            System.out.println(s);
        }
    }
    void delete(){
        if(head == null){
            System.out.println("Deletion Not Possible,Queue Underflow");  
        }
        else{
            System.out.println("Deleted Element is"+head.data);
        p=head;
        head=head.link;
    }
    }
}
class Queuelinkedlist{
    public static void main(String[] args) {
        Queue  q = new Queue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Stack");
        int n =sc.nextInt();
        while(true){
            System.out.println("Enter Choice\n1.Insert\n2,Delete\n3.Display\n Other:exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter a New Element to insert into Queue");
              int x =sc.nextInt();
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