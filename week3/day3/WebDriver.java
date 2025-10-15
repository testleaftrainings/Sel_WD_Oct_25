package week3.day3;

public interface WebDriver {
	
	
	//private;public;protected;default
	
	//unimplemented methods
	void findElement();
	
	public void findElements();
	
	public void get();
	
	//till java 1.7 -> 100% Abstract Method -> unimplemented methods. 
	
	//implementation methos - 2 types 
	// 1. Static method; 2. default method.
	
	static void quit() {
		System.out.println("Static");
	}
	
	default void click() {
		System.out.println("Default");
	}
	
	static void doubleValue() {
		System.out.println("doubleValue");
	}
	
	void clicked();
	
	void run();
	
	void got();
	
	void keys();

}
