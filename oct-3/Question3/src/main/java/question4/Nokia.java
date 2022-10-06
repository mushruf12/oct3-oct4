package question4;

public class Nokia extends Mobiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nokia s = new Nokia();
		System.out.println(s.brand());
		System.out.println(s.amount());

	}

	@Override
	String brand() {
		// TODO Auto-generated method stub
		return "Nokia";
	}

	@Override
	int amount() {
		// TODO Auto-generated method stub
		return 1500;
	}

}
