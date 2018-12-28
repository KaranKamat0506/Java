class Invalid {

	public static void main(String args[]){
		int number,invalid=0,count=0;
		for(int i=0;i<args.length;i++){
			try{
				number=Integer.parseInt(args[i]);
			
			}
			catch(NumberFormatException e){
				invalid=invalid+1;
				System.out.println("Invalid Number= " + args[i]);
				continue;
			}
			count=count+1;
			
		}
		System.out.println("Valid Arguments: " + count);
		System.out.println("Invalid Arguments: " + invalid);
	}
}