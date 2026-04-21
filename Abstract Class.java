public class AbstractMain {

	public static void main(String[] args) {
		 Shape s1 = new Circle();
         s1.area();
         s1 = new Rectangle();
         s1.area();
	}

}

public class Circle extends Shape{

	@Override
	public void area() {
		System.out.println(" Inside circle area method...");
		
	}

}


