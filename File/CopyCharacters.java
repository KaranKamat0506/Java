import java.io.*;

class CopyCharacters{
	public static void main(String[] args) {
		File inFile=new File("infile.txt");
		File outFile=new File("outfile.txt");
		FileReader ins=null;
		FileWriter outs=null;
		try{
			ins=new FileReader(inFile);
			outs=new FileWriter(outFile);
			int ch;
			while((ch=ins.read())!=-1){
				outs.write(ch);
			}
		}
		catch(IOException e){
			System.out.println(e);
			System.exit(-1);
		}
		finally{
			System.out.println("Contents copied");
			try{
				ins.close();
				outs.close();
			}
			catch(IOException e){}
		}
	}
}