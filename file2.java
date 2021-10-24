 import java.util.*;
 import java.io.*;
 class filecreation2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Name of The Student:");
          String str = sc.nextLine();
         System.out.println();
          System.out.print("Enter Roll No:");
           String a = sc.nextLine();
           System.out.println();
           System.out.print("Enter Section:");
          String sec = sc.nextLine();
          System.out.println();
          System.out.print("Enter College Name :");
          String clg = sc.nextLine();
          System.out.println();
          try{
          File myfile = new File("Textfile.txt");
          FileWriter obj;
          myfile.createNewFile();
          obj = new FileWriter("Textfile.txt");
          BufferedWriter ot = new BufferedWriter(obj);
          ot.write("Name of the Student:-"+str);
          ot.newLine();
          ot.write("Roll No:"+a);
          ot.newLine();
          ot.write("Section:"+sec);
          ot.newLine();
          ot.write("College Name:"+clg);
          ot.newLine();
           ot.append("File Operations");
           ot.close();
           System.out.println(str);
           System.out.println(a);
           System.out.println(sec);
           System.out.println(clg);
          
     }
    catch(IOException e){
        e.printStackTrace();
    }
    sc.close();
    
}
 }
