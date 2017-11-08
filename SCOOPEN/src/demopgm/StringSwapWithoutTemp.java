package demopgm;

public class StringSwapWithoutTemp {

	public static void main(String[] args) {
  String fname="Pradip";
  String lname="Gadekar";
System.out.println("Before Swapping :");
  
  System.out.println("fname : "+fname);
   
  System.out.println("lname : "+lname);
  fname=fname+lname;
  System.out.println(fname);
  lname=fname.substring(0,fname.length()-lname.length());
  fname=fname.substring(lname.length());
  
  System.out.println("After Swapping :");
  
  System.out.println("fname : "+fname);
   
  System.out.println("lname : "+lname);
	}

}
