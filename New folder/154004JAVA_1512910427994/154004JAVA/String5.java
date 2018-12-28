public class String5{
	public static void main(String args[]) {
		String s1 = "Next semester we will be doing project";
		int len = s1.length();
		System.out.println( "String Length is : " + len );
		
		String s2 = " on new technology";
		s1.concat(s2);
		System.out.println("Concatenated : "+s1);

		char result1 = s1.charAt(14);
		System.out.println("charAt(14) :"+result1);
		
		int result2 = s1.compareTo(s2);
		System.out.println(result2);

		String s3= " On New technology";	
		boolean retVal1 = s2.equals(s3);
		boolean retVal2 = s2.equalsIgnoreCase(s3);
		System.out.println("Returned 1 : "+retVal1+"Returned 2 : "+retVal2);
	
		char[] s4 = new char[15];
		s1.getChars(0, 13, s4, 0);
		System.out.println(s4);

		System.out.println("IndexOf o : "+s1.indexOf('o'));
		System.out.println("LastIndexOf o :"+s1.lastIndexOf('o'));
		
		System.out.println("Replaced : "+s3.replace('o', 'N'));	

		System.out.println("Substring : "+s1.substring(14));
		System.out.println("Substring(Strt,End) :"+s1.substring(14,25));

		System.out.println("LowerCase : "+s1.toLowerCase());
		System.out.println("UpperCase : "+s1.toUpperCase());
	}
}

