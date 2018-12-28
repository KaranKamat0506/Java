import java.io.*;

class CreateOut{
	public static void main(String[] args) {
		try{
			File f=new File("output.dat");
			if (!f.exists()) {
				f.createNewFile();
			}
		}
		catch(IOException e){
			System.out.println(e);
		}

	}
}