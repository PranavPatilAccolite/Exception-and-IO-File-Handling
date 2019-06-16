import java.io.File;
public class Assignment1 {
	   public static void main(String[] args) {
		      dirTree(new File("C:\\Users\\pranav.patil\\Desktop"));
	   }
	   public static void dirTree(File dir){
		   File[] subdirs=dir.listFiles();
		   for(File subdir: subdirs)
		   {
			   if (subdir.isDirectory()){
				   dirTree(subdir);
			   } 
			   else {
			   doFile(subdir);
			   }
		   }
	   } 
	   public static void doFile(File file){
		   System.out.println(file.getAbsolutePath());
	   }
}
