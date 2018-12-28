import java.io.*;
class CreateInfile{
	public static void main(String args[]){
		try{
			File f2=new File("infile.txt");

			if(!f2.exists()){
				f2.createNewFile();
			}
		}

		catch(IOException e){
			e.printStackTrace();
		}
	}
}