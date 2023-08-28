package Unit_03;
import java.io.*;
public class P13_Task01_FileHandlingInJava{
	public static void main(String[] args){
		FileHandling fh = new FileHandling();
		fh.HandleFile();
	}
}

class FileHandling{
	void HandleFile() {
		int countWords=0;
		int countCharacter=0;
		int countLines=0;
		try {
			File file = new File("C:\\Users\\Lenovo\\eclipse-workspace\\JavaProgramming\\src\\Unit_03\\input");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null) {
				countLines++;
				countCharacter+=line.length();
				countWords+=line.split(" ").length;			
			}
			br.close();
			fr.close();
		}
		catch (FileNotFoundException e){
			e.getMessage();
		}
		catch (IOException e) {
			e.getMessage();
		}
		finally {
			System.out.println("Total number of Words: "+countWords);
			System.out.println("Total number of Lines: "+countLines);
			System.out.println("Total number of Characters: "+countCharacter);
		}
		
	}
}