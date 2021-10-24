import java.io.*;
 
class file3 { 
    public static void main(String[] args) {
        BufferedReader reader;
        try{
        reader = new BufferedReader(new FileReader("Textfile.txt"));
        String line = reader.readLine();
        while(line != null){
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
            }
            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
              
        }
    }

