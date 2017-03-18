import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MainMethod {

	public static void main(String[] args) {

		Collection data1 = new Collection();

		data1.setFirstName("Kiran");            // object
		data1.setLastName("Thapa");
		data1.setState("VA");
		data1.setCountry("USA");
		data1.setPhoneNumber(70323233);
		data1.setIncome(50000);
		data1.setAge(32);
		data1.setGender('M');

		Collection data2 = new Collection();

		data2.setFirstName("Shyam");
		data2.setLastName("Poudel");
		data2.setState("PA");
		data2.setCountry("USA");
		data2.setPhoneNumber(43578789);
		data2.setIncome(40000);
		data2.setAge(31);
		data2.setGender('M');

		Collection data3 = new Collection();

		data3.setFirstName("Hira");
		data3.setLastName("Shetty");
		data3.setState("LA");
		data3.setCountry("USA");
		data3.setPhoneNumber(1233233456);
		data3.setIncome(34000);
		data3.setAge(27);
		data3.setGender('F');

		Collection data4 = new Collection();

		data4.setFirstName("Gita");
		data4.setLastName("Khan");
		data4.setState("KS");
		data4.setCountry("USA");
		data4.setPhoneNumber(65654343);
		data4.setIncome(12000);
		data4.setAge(56);
		data4.setGender('F');

		Collection data5 = new Collection();

		data5.setFirstName("Kabita");
		data5.setLastName("Adhikari");
		data5.setState("LA");
		data5.setCountry("USA");
		data5.setPhoneNumber(56756789);
		data5.setIncome(76000);
		data5.setAge(23);
		data5.setGender('F');

		Collection data6 = new Collection();

		data6.setFirstName("Hari");
		data6.setLastName("Achharya");
		data6.setState("VA");
		data6.setCountry("USA");
		data6.setPhoneNumber(32456411);
		data6.setIncome(32000);
		data6.setAge(21);
		data6.setGender('M');

		Collection data7 = new Collection();

		data7.setFirstName("Pritam");
		data7.setLastName("KC");
		data7.setState("MD");
		data7.setCountry("USA");
		data7.setPhoneNumber(20234567);
		data7.setIncome(98000);
		data7.setAge(29);
		data7.setGender('M');

		Collection data8 = new Collection();

		data8.setFirstName("Hira");
		data8.setLastName("Chand");
		data8.setState("LA");
		data8.setCountry("USA");
		data8.setPhoneNumber(33765678);
		data8.setIncome(21750);
		data8.setAge(43);
		data8.setGender('F');

		ArrayList<String> employeLastName = new ArrayList<String>();

		employeLastName.add(data1.getLastName());
		employeLastName.add(data2.getLastName());
		employeLastName.add(data3.getLastName());
		employeLastName.add(data4.getLastName());
		employeLastName.add(data5.getLastName());
		employeLastName.add(data6.getLastName());
		employeLastName.add(data7.getLastName());
		employeLastName.add(data8.getLastName());

		
		System.out.println("Q.N.1 The employee last name using ArrayList Data Structure: \n");
		for (String name : employeLastName) {

			
			System.out.println(name);       
		}

		

		HashMap<String, Long> namePhone = new HashMap<String, Long>();
		namePhone.put(data1.getFullName(), data1.getPhoneNumber());
		namePhone.put(data2.getFullName(), data2.getPhoneNumber());
		namePhone.put(data3.getFullName(), data3.getPhoneNumber());
		namePhone.put(data4.getFullName(), data4.getPhoneNumber());
		namePhone.put(data5.getFullName(), data5.getPhoneNumber());
		namePhone.put(data6.getFullName(), data6.getPhoneNumber());
		namePhone.put(data7.getFullName(), data7.getPhoneNumber());
		namePhone.put(data8.getFullName(), data8.getPhoneNumber());
		
	    System.out.println("Q.N 2 The employee full name and Phone Number using Hash Map Data Structure :\n ");
		for (Map.Entry<String, Long> entry : namePhone.entrySet()) {
			String key = entry.getKey();
			Long value = entry.getValue();
			System.out.println("key : " + key +   " and Value: "    +value); 
   
		}

		TreeSet<String> fname = new TreeSet<String>();
		fname.add(data1.getFirstName());
		fname.add(data2.getFirstName());
		fname.add(data3.getFirstName());
		fname.add(data4.getFirstName());
		fname.add(data5.getFirstName());
		fname.add(data6.getFirstName());
		fname.add(data7.getFirstName());
		fname.add(data8.getFirstName());

		
		System.out.println("Q.N 3. only first name using Treeset Data Structure : \n");
		
		for (String Name : fname)
			
		System.out.println(Name); 

		ArrayList<Character> employe = new ArrayList<Character>();
		employe.add(data1.getGender());
		employe.add(data2.getGender());
		employe.add(data3.getGender());
		employe.add(data4.getGender());
		employe.add(data5.getGender());
		employe.add(data6.getGender());
		employe.add(data7.getGender());
		employe.add(data8.getGender());

		ArrayList<String> employeName = new ArrayList<String>();
		employeName.add(data1.getFirstName());
		employeName.add(data2.getFirstName());
		employeName.add(data3.getFirstName());
		employeName.add(data4.getFirstName());
		employeName.add(data5.getFirstName());
		employeName.add(data6.getFirstName());
		employeName.add(data7.getFirstName());
		employeName.add(data8.getFirstName());

		
		System.out.println("QN.4 The female employe  only  using ArrayList :\n ");
		for (int i = 0; i < employe.size(); i++) { 

			if (employe.get(i) == 'F') {

				System.out.println(employeName.get(i) + "  " + employeLastName.get(i));
			}

		}
	}
}
