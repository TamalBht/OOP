package Taylor;
import java.util.Scanner;
public class Taylor {
	static int fact(int a) {
		int result=1;
		for (int i=1;i<=a;i++) {
			result*=i;
		}
		return result;
		
	}
	static double power(double base,int power) {
		double result=1;
		for(int i=1;i<=power;i++) {
			result*=base;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter term: ");
		Scanner sc = new Scanner(System.in);
		double x=sc.nextDouble();
		double term=1;
		int n=0;
		double result=0;
		while( term > 0.00001 ) {
			term=(power(x,n)/fact(n));
			result+=term;
			n++;
		}
		System.out.printf("Result: %.5f",result);
		sc.close();
		

	}

}
