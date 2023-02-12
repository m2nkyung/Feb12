import java.util.*;
public class Assignment4_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] p = new Person[3];
		
		p[0] = new Person("김준희", 135);
		p[1] = new Person("민준희", 155);
		p[2] = new Person("구준희", 207);
		
		System.out.println(getMax(p).toString());
	}
	
	public static Person getMax(Person[] p) {
		Arrays.sort(p);
		return p[p.length - 1];
	}
}