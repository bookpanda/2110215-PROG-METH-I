package Student;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new UndergraduateStudent("Lisa");
		Student s3 = new GraduateStudent("Peter");

		s1.printName();
		s2.printName();

		((UndergraduateStudent) s2).computeCourseGrade();

//	やばい	((UndergraduateStudent) s1).computeCourseGrade();

	}

	public static void helloStudent(Student s) {
		System.out.println("Hello " + s.getName());

		if (s instanceof GraduateStudent) {
			String advisor = ((GraduateStudent) s).getAdvisorName();
			System.out.println("Hello " + advisor);
		}
	}

}
