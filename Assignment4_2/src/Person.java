public class Person implements Comparable { 
	String name;
	double height;
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
	public String toString() {
		return "제일 키 큰 사람\n" + name + " " + height;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Person other = (Person) o;
		
		if(height < other.height) {
			return -1;
		} else if(height > other.height) {
			return 1;
		} else {
			return 0;
		}
	}
}