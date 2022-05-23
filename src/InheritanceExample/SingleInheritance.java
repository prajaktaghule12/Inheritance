package InheritanceExample;

public class SingleInheritance {

	public static void main(String[] args) {
//On parent reference you can call only parent class methods variables
		Parent p=new Parent();
		p.m1();
		
//On Child class reference you can call parent as well as child class methods and variables
		Child c=new Child();
		c.m1();
		c.m2();

	}

}
