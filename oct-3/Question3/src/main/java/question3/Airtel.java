package question3;

public class Airtel extends Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airtel a = new Airtel();
		System.out.println(a.operator("Airtel"));
		System.out.println(a.amount(299));
		System.out.println(a.validity());
		System.out.println(a.addbenfits());

	}

	@Override
	String operator(String a) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	int amount(int a) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	int validity() {
		// TODO Auto-generated method stub
		return 28;
	}

	@Override
	String addbenfits() {
		// TODO Auto-generated method stub
		return "Unlimited Calls";
	}

}
