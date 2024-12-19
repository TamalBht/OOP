package properties.polymorphism;
import access.A;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes shape = new Shapes();
		shape.area();
		Circle c=new Circle();
		c.area();
		Shapes s= new Square();
		s.area();
		A a = new A(20,"Tamal");
		System.out.println(a.getNum());
		
		

	}

}
