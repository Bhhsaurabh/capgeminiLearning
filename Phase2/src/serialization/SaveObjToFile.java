package serialization;
import java.io.*;
public class SaveObjToFile implements Serializable {
	String name;
	int id;
	SaveObjToFile(){
		
	}
	SaveObjToFile(String name ,int id){
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		SaveObjToFile s1 = new SaveObjToFile("Saurabh",1);
		
		File f1 = new File("/Users/bhhsaurabh/desktop/Files" ,"StudentsDetails");
		f1.createNewFile();
		
		// Serialization write object in f1
		
		FileOutputStream ot = new FileOutputStream(f1);
		ObjectOutputStream oj = new ObjectOutputStream(ot);
		oj.writeObject(s1);
		oj.close();
		
		
		// Deserialization read object from f1
		
		FileInputStream ip = new FileInputStream(f1);
		ObjectInputStream op = new ObjectInputStream(ip);
		SaveObjToFile s2 =  (SaveObjToFile)op.readObject();
		
		System.out.println("Name: " + s2.name + " " + "Id: " + s2.id);
		op.close();
	}
}
