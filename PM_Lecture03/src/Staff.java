
public class Staff implements Cloneable {
	int id;
	String name;

	public Staff(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
//	copy constructor (use this instead of clone)
	public Staff(Staff other) {
		this(other.id, other.name);
	}

	public Object clone() {
		try {
			return super.clone();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", fullname=" + name + "]";
	}
}
