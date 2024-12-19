package properties.inheritence;

public class BoxWeight extends Box{
	double weight;
	BoxWeight(){
		super();
		this.weight=-1;
	}	
	BoxWeight(BoxWeight other){
		super(other);
		weight=other.weight;
	}
	BoxWeight(double l,double w,double h,double weight){
		super(l,w,h);
		this.weight=weight;
		
	}
	
}
