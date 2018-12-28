interface Area{
	final double PI=3.1425926F;
	 compute(double x,double y);
}

class Triangle implements Area{
	public double compute(double x,double y){
		return(0.5*x*y);
	}
}

class Rectangle implements Area{
	public double compute(double x,double y){
		return(x*y);
	}
}

class InterfaceTest{
	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		Triangle tri=new Triangle();
		Area area;
		area=rect;
		System.out.println("Area of Rectangle=" + area.compute(10,20));
		area=tri;
		System.out.println("Area of Circle=" + area.compute(10,10));
	}
}