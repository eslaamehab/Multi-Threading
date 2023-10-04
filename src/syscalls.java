import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;

public class syscalls {
    //SYSCALL1
    public static void readfile(String S) throws IOException {
        try {
            File file = new File(S);

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
       
    }

    //SYSCALL2
    public static void writeFile(String filename, String data) throws IOException {
        try {
      
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(data);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
        System.out.print("Done");
    }
    //SYSCALL3

    public static void print(String S) {
        System.out.print(S);
    }

    //SYSCALL4
    public static String input(String data) throws IOException {
    	System.out.println(data);
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;

    }

    public static void print300() {
        for (int i = 0; i <= 300; i++) {
            System.out.println(i);
        }
    }

    public static void print500to1000() {
        for (int i = 500; i <= 1000; i++) {
            System.out.println(i);
        }

    }

    public static void count(int i, int j) throws IOException  {
    	  File file = new File(makeFile());
          FileWriter writer = new FileWriter(file);
          //Create the file
              System.out.println("File is created!");
        if (i < j) {
            while (i != j) {
            	writer.write(Integer.toString(i)+" ");
                i++;
            }    
            writer.write(Integer.toString(j)+" ");
        }
        else {
            while (i != j) {
            	writer.write(Integer.toString(j)+" ");
                j++;
            }
            writer.write(Integer.toString(i)+" ");
        }
        //Write Content
        writer.close();     

    }
    public static String makeFile() {
      //  String before = "/Users/mohamedhesham/Desktop/test";
        String before = "test";
        String after = ".txt";
        String concat = before+UUID.randomUUID()+after;
     return concat;   
    }
     
    
    
}