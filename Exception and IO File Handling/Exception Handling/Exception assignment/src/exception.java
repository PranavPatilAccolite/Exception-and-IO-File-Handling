import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.logging.*;
public class exception {
	public static void main(String[] args) throws Throwable, IOException {
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		int a = 10;
		int b = 0;
		int k[] = new int[10];
        File file = new File("E://file.txt");
        try {
        	k[10] = 100;
        }catch(ArrayIndexOutOfBoundsException e){
        	FileHandler Fh1 = new FileHandler("C:\\\\Users\\\\pranav.patil\\\\Desktop\\\\ArrayIndexOutOfBoundsException.txt");
        	logger.addHandler(Fh1);
        	System.out.println("Caught Array Index Out Of Bounds Exception");
            logger.log(Level.SEVERE, e.getMessage()); 
        }
        try {
        	FileReader fr = new FileReader(file);
        	fr.close();
        }catch(FileNotFoundException e){
        	FileHandler Fh1 = new FileHandler("C:\\\\Users\\\\pranav.patil\\\\Downloads\\\\FileNotFoundException.txt");
        	logger.addHandler(Fh1);
        	System.out.println("Caught File Not Found Exception");
        	logger.log(Level.SEVERE, e.getMessage());
        }
        try {
        	int c = a/b;
        	System.out.println("c = " + c);
        }catch(ArithmeticException e){
        	FileHandler Fh1 = new FileHandler("C:\\\\Users\\\\pranav.patil\\\\Documents\\\\ArithmeticException.txt");
        	logger.addHandler(Fh1);
        	System.out.println("Caught Arithmetic Exception");
            logger.log(Level.INFO, e.getMessage());
        }  
    }
}
