import java.io.IOException;

public class Multithread 
{ 
    public static void main(String[] args) throws IOException 
    { 
            Multithreading process1 = new Multithreading("read");
    	     process1.start();
    	        Multithreading process2 = new Multithreading("write");
    	        process2.start();
    	        Multithreading process3 = new Multithreading("print300");
    	        process3.start();
    	        Multithreading process4 = new Multithreading("print500");
    	        process4.start();
    	        Multithreading process5 = new Multithreading("count");
    	        process5.start();
    	    }
            
}
         
    


    

