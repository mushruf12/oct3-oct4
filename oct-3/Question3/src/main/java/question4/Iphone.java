package question4;


public class Iphone extends Mobiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone s = new Iphone();
		System.out.println(s.brand());
		System.out.println(s.amount());

	}

	@Override
	String brand() {
		// TODO Auto-generated method stub
		return "Apple";
	}

	@Override
	int amount() {
		// TODO Auto-generated method stub
		return 150000;
	}

}
