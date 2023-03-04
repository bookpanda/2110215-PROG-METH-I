
public class Company {

	public static void main(String[] args) {
		Staff s1 = new Staff(101, "Lisa");
		Staff s2 = new Staff(s1.id, s1.name);
		
		Staff s3 = (Staff) s1.clone();
		System.out.println(s3);
		
		Staff s4 = new Staff(s1);
		System.out.println(s4.equals(s1));
	}
	
}
