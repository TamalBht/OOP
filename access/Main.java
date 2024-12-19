package access;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(15,"Tamal");
		int abc=a.getNum();
		System.out.println(abc);
		a.setNum(5);
		System.out.println(a.getNum());

	}

}
