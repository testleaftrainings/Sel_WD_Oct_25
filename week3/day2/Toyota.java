package week3.day2;

public class Toyota extends Car{

	public void nameOfTheCar() {
		System.out.println("FORTUNER");
	}
	
	public void logoOfCar() {
		System.out.println("T");
	}
	
//	@Override
//	public void breaks() {
//		System.out.println("ABS");
//	}

//	@Override
//	public void designOfCar() {
//		System.out.println("DESIGN NO: 235HGY46-OCT-2025");
//	}
	
	public static void main(String[] args) {
		
		Toyota product =new Toyota();
		product.designOfCar();
		product.horn();
		product.clutch();
		product.steering();
		product.logoOfCar();
		product.nameOfTheCar();
		product.breaks();
	}

}


