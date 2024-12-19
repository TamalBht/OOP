package properties.inheritence;

public class Box {
	public double l,w,h;
	Box(){
		this.l=this.w=this.h=-1;
	}
	Box(double l,double w, double h){
		this.l=l;
		this.h=h;
		this.w=w;
		}
	Box(Box old){
		this.l=old.l;
		this.w=old.w;
		this.h=old.h;
	}
}
