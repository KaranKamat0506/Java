package mypkg1;

public class Delay{
	public static void milisec(int n){
		long i,j,k;
		for(k=0;k<n;k++){
			j=100000;
			for (i=1;i<100000 ;i++ ) {
				j=j-1;
			}
		}
	}
}