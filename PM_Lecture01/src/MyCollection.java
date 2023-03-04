import java.util.ArrayList;

public class MyCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[3];
		scores[0] = 10;
		scores[1] = 5;
		scores[2] = 7;
		
		for(int s : scores) {
			System.out.println(s);
		}
		
		ArrayList<Integer> students = new ArrayList<Integer>();
		students.add(7);
		students.add(5);
		students.add(10);
		
		System.out.println(students.toString());
		students.add(1,99);
		System.out.println(students);
		
		students.set(0, 9999);
		students.remove(3);
		System.out.println(students);
	}

}
