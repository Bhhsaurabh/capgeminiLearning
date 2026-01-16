package fileHandling;
import java.io.*;
public class WriteFile {
	public static void main(String[] args) throws IOException {
		File folder = new File("/Users/bhhsaurabh/desktop/Files");
		folder.mkdir();
		
		File f1 = new File(folder , "name.txt");
		f1.createNewFile();
		
		File f2 = new File(folder , "add.txt");
		f2.createNewFile();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
		bw.write("Halku re");
		bw.newLine();
		bw.write("Aa re");
		bw.close();
		
		// write in a file
		
		BufferedWriter bw2 = new BufferedWriter(new FileWriter(f2));
		bw2.write("Sssm");
		bw2.close();
		
		// read in a file
		
		BufferedReader br = new BufferedReader(new FileReader(f1));
		//check files in a folder
		
		if(folder.exists()) {
			File[] files = folder.listFiles();
			for(int i = 0 ; i < files.length ; i++) {
				System.out.println(files[i].getName());
			}
		}
		
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
}
