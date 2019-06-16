import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment3 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\pranav.patil\\Desktop\\input.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("C:\\Users\\pranav.patil\\Desktop\\output.txt", true);
			String s;
			while ((s = br.readLine()) != null) {
				fw.write(s);
				fw.write("\n");
				fw.flush();
			}
			br.close();
			fw.close();
            System.out.println("file copied");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
