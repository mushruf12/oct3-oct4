package question4;

public class Samsung extends Mobiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung s = new Samsung();
		System.out.println(s.brand());
		System.out.println(s.amount());

	}

	@Override
	String brand() {
		// TODO Auto-generated method stub
		return "Samsung";
	}

	@Override
	int amount() {
		// TODO Auto-generated method stub
		return 15000;
	}

}
