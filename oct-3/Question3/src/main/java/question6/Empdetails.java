package question6;


import java.util.HashMap;
import java.util.Map;

public class Empdetails {

		public static Map<Integer, String> map() {

			Map<Integer, String> mp = new HashMap<Integer, String>(); // Integer for id, String for name.

			mp.put(001, "Mushruf");
			mp.put(002, "John");
			mp.put(003, "Alice");
			mp.put(004, "Adam");
			mp.put(005, "Criston");

			return mp;

		}

		public static void main(String[] args) {
			System.out.println(map());

		}

	

}
