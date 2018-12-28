import java.io.*;

class CreateOutfile{
	public static void main(String args[]){
		try{
			File f3=new File("outfile.txt");

			if(!f3.exists()){
				f3.createNewFile();
			}
		}

		catch(IOException e){}
	}

}