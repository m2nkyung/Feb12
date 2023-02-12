public class Student implements Comparable {
	private String name;
	private int id;
	
	public Student(String name , int id) {
		this.name = name;
		this.id = id;
	}
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student other = (Student)o;
		
		if(id < other.id) {
			return -1;
		} else if(id > other.id) {
			return 1;
		} else {
			return 0;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}