public class Pack1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class obj = new CD().getClass();
		
		System.out.println("class name : " + obj.toString());
		System.out.println(obj + "의 클래스 이름은 " + obj.getClass().getName());
	}
}