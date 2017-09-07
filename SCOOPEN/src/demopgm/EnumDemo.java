package demopgm;

public enum EnumDemo {
	AS,QW,ER,SD;
	EnumDemo()
	{
		System.out.println("in enum:");
	}
	
}
 class simple123{
	public static void main(String[] args) {
		 EnumDemo e= EnumDemo.AS;
	System.out.println("hiii");
	EnumDemo[]a=e.values();
	for (EnumDemo enumDemo : a) {
		System.out.println(enumDemo.ordinal()+"=="+enumDemo);
	}
	}
}
