package interfaces;

public class Car implements Brakes,engine {
	String type;
	Car(String type){
		this.type=type;
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("This will start on" + type );
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("The "+type+" engine will stop");
 		
	}

	@Override
	public void acc() {
		System.out.println("The "+ type + "Engine will accelerate");
		
	}

	@Override
	public void brake() {
		System.out.println("Normal brakes");
		
	}

}
