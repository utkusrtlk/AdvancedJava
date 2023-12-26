package polymorphism;

public class Test {

	public static void main(String[] args) {
		

		System.out.println("=> "+toplama(3,5));
		System.out.println("\n=> "+toplama(3,4,5));
		System.out.println("\n=> "+toplama("2",3));
		
		Dog doggy = new Dog();
		System.out.println("\n"+doggy.hareket());
		Snake snake = new Snake();
		System.out.println(snake.hareket());
	}

	public static int toplama(int a, int b) {
		return a+b;
	}
	
	public static int toplama(int a, int b, int c) {
		return a+b+c;
	}
	
	public static boolean toplama(String x, int y) {
		return false;
	}
}

class Animal{
	public String hareket() {
		return "hareket ederim.";
	}
}

class Dog extends Animal{
	public String hareket() {
		return "kosarim.";
	}
}

class Snake extends Animal{
	
}
