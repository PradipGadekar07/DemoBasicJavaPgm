/**
 * 
 */
package demopgm;

/**
 * @author Pradip Gadekar
 *
 */
class Parent{
	public void ParentDisplay(){
		System.out.println("In Parent");
	}
}
class Child extends Parent{
	public void ChildDisplay(){
		System.out.println("In Child");
	}
	void m2(){
		System.out.println("in child m2()");
	}
}
public class OopsPgm {

	public static void main(String[] args) {
        Parent p=new Parent();
        p.ParentDisplay();
        //p.ChildDisplay();
        
        Parent p1=new Child();
        p1.ParentDisplay();
       // p1.ChildDisplay();
	}

}
