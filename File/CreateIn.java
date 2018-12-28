import java.io.*;

class CreateIn{
	public static void main(String[] args) {
		try{
			File file=new File("input.dat");
			
			if (!file.exists()) {
				file.createNewFile();
			}
		}
		
		catch(IOException e){
			System.out.println(e);
		}
	}
}