//import java.util.*;
import java.io.*;
import java.util.Scanner;
class filecreation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name:");
        String s = sc.nextLine();
        String n = sc.nextLine();
        int a = sc.nextInt();
        try {
            File myObj = new File(s+".txt");
            myObj.createNewFile();
            Scanner reader = new Scanner(myObj);
            FileWriter myWriter = new FileWriter(s+".txt");
            myWriter.write(n);
            String aa = Integer.toString(a);
            myWriter.write(aa);
            myWriter.close();
            System.out.println(n);
            System.out.println(aa);
            reader.close();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          sc.close();
        }
      }