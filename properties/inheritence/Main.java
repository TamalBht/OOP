package properties.inheritence;

public interface Main {
	public static void main(String[] args){
		Box b1 =  new Box(1,2,3);
		System.out.println(b1.h+" "+b1.w+" "+b1.l);
		BoxWeight b2 = new BoxWeight(5,6,7,8);
		System.out.println(b2.l+" "+b2.w+" "+b2.h+" "+b2.weight);
		Box b3 = new BoxWeight(51,62,72,98);
		System.out.println(b3.l+" "+b3.w+" "+b3.h+" ");
		BoxWeight b4 = new BoxWeight(b2);
		System.out.println(b4.l+" "+b4.w+" "+b4.h+" "+b4.weight);





	}
}
