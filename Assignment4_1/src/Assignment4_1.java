//p275를 이용하여 다음을 완성하세요. 배열의 크기를 입력받고 학번과 이름을 입력하여 학번 순서대로 출력하세요 

import java.util.*;
public class Assignment4_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("배열의 크기는 : ");
		int n = input.nextInt();
		
		Student[] stu = new Student[n];
		
		for(int i = 0; i < stu.length; i++) {
			System.out.print("이름 >> ");
			String name = input.next();
			System.out.print("학번 >> ");
			int id = input.nextInt();
			
			stu[i] = new Student(name, id);
		}
		
		Arrays.sort(stu);
		
		for(Student s : stu) {
			System.out.println(s.getId() + ", " + s.getName());
		}
	}
}