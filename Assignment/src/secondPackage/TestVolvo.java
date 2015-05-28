package secondPackage;

public class TestVolvo {

	public static void main(String[] args) {
		Volvo edwinVolvo = new Volvo();
		
		edwinVolvo.setDetails("Edwin's Volvo", 15);
		
		edwinVolvo.setUp();
		edwinVolvo.tearDown();
		
		
		String car = edwinVolvo.getCarName();
		System.out.println(car);
		
	}

}
