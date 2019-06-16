import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Assignment4 {
	
	public static void main(String[] args) throws IOException {
		String src = "C:\\\\Users\\\\pranav.patil\\\\Desktop\\\\file.txt";
		String dest = "C:\\\\Users\\\\pranav.patil\\\\Downloads\\\\file.txt";
		copyFile(src,dest);
	}
    public static void copyFile(String from, String to){
        Path src = Paths.get(from);
        Path dest = Paths.get(to);
        try {
			Files.copy(src, dest);
			System.out.println("File Copied.");
		} catch (IOException e) {
			System.out.println("File failed to copy.");
		}
    }
}
