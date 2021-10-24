import java.util.*;
import java.io.*;

class inputclass{
    static Scanner in = new Scanner(System.in);
    
}

public class billingmachine {  //class defnition

    //file creation method and data entry choosing services
    public  static void data(String name){
        Scanner choice = new Scanner(System.in); //Scanner Class
        File f = new File(name+".txt");
        if(f.exists() && !f.isDirectory()) { 
            System.out.println("User Already Exists!!");
            System.out.print("Choose Another Name:");
            String  str = choice.nextLine();
            System.out.println(); 
            data(str);  
        }
        else{
            //data entry
        System.out.print("Enter Place of Origin:"); //place of customer
        String place = choice.nextLine();
        System.out.println();
        System.out.print("Enter Occupation of the Customer:"); //Occupation of customer
        String  duty = choice.nextLine();
        System.out.println();
        System.out.print("Enter Mobile Number of the Customer:");  //mobile no of the customer
        String  ph = choice.nextLine();
        System.out.println();
        
        //datawriting to file
        try{
            File myFile = new File(name+".txt");
            myFile.createNewFile();//creatingfile
          FileWriter  flobj = new FileWriter(name+".txt");
          BufferedWriter in = new BufferedWriter(flobj); //file writer
          //writing data
          in.write("----------Customer Details----------");
          in.newLine();
          in.write("Name of the Customer:"+name);
          in.newLine();
          in.write("Place of Origin:"+place);
          in.newLine();
          in.write("Occupation:"+duty);
          in.newLine();
          in.write("Phone Number of the Customer:"+ph);
          in.newLine();
          in.close();
         }
         catch(IOException e){
             System.out.println("xxx---An Error Occured---xxx");
             e.printStackTrace();
         }
         System.out.println("-----Please Choose Your Services-----");
         services(name);
         choice.close();
        }
    }

       //choosing services
     public static void services(String name){   
        System.out.println("(1)General Suite --> Rs.500.00 per day");
        System.out.println("(2)AC  General Suite --> Rs.750.00 per day");
        System.out.println("(3)AC Luxury Suite --> Rs.1500.00 per day");
        Scanner iScanner = new Scanner(System.in);
        int choose = iScanner.nextInt();
        
        BufferedWriter serviBufferedwWriter = null;
        try{
            File fileser = new File(name+".txt");
            FileWriter writer = new FileWriter(fileser,true);
            serviBufferedwWriter = new BufferedWriter(writer);
            serviBufferedwWriter.append("-----Services Choosen By Customer-----");
            serviBufferedwWriter.newLine();
            if(choose == 1){
                serviBufferedwWriter.append("->General Suite");
                serviBufferedwWriter.newLine();
               
            }
            if(choose == 2){
                serviBufferedwWriter.append("->AC General Suite");
                serviBufferedwWriter.newLine();
                
                
            }
            if(choose == 3){
                            serviBufferedwWriter.append("->AC Luxury Suite");
                            serviBufferedwWriter.newLine();
                            
                
            }
            serviBufferedwWriter.close();
           
        }
      catch(IOException e){
                           System.out.println("xxx---An Error Occured---xxx");
                            e.printStackTrace();
            }  
            iScanner.close();
}


    //method to read data from existing Entry
    public static void dataread(String namesString){
        File f = new File( namesString+".txt");
if(f.exists() && !f.isDirectory()) { 
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(namesString+".txt"));
            String lines = reader.readLine();
            while(lines != null){
                System.out.println(lines);
                lines = reader.readLine();
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("Error Occured");
            e.getStackTrace();
        }
    }
    else{
        System.out.println("File Not Found");
    }
    
}
//main method
public static void main(String[] args) {
    //Choosing Operation
    System.out.println("1.New Customer");
    System.out.println("2.Exisiting Customer");
    System.out.println("3.Billing");
    System.out.print("Enter Operation:");
    int m = inputclass.in.nextInt();
    System.out.println();
    Scanner swt = new Scanner(System.in);
    switch(m){
        case 1:
        System.out.print("Enter Customer Name:");
        String name = swt.nextLine();
        System.out.println();
        data(name);

        break;
        case 2:
        System.out.print("Enter Customer Name:");
        String namesString = swt.nextLine();
        dataread(namesString); 

        break;
        case 3:
        System.out.print("Enter Customer Name:");
        //String billname = swt.nextLine();
        //billing(billname);
        break;
        
    }
    swt.close();
}
}