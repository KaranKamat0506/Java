import java.io.*;

class CreateFile1{
	public static void main(String[] args) {
		try{
			File f=new File("myfile.txt");

			if(!f.exists()){
				f.createNewFile();
			}
		}
		catch(IOException e){
			e.printStackTrace();
			}
		}
	}
