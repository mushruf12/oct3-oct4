package question4;

public class Motorola extends Mobiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorola s = new Motorola();
		System.out.println(s.brand());
		System.out.println(s.amount());

	}

	@Override
	String brand() {
		// TODO Auto-generated method stub
		return "Motorola";
	}

	@Override
	int amount() {
		// TODO Auto-generated method stub
		return 10000;
	}

}
