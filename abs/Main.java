package abs;

public class Main {

	public static void main(String[] args) {
		Parent d= new Dog();
		Parent c=new Cat();
		d.Sound();
		c.Sound();
		Parent.greet();

	}

}
