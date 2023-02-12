// 사칙연산을 하는 계산기를 완성하세요. (인터페이스 사용)

import java.util.Scanner;
public class Week4_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int a, b;
		String ch;
		
		System.out.print("두 정수와 연산자를 입력하세요 : ");
		a = input.nextInt();
		b = input.nextInt();
		ch = input.next();
		
		switch(ch) {
		case "+" :
			Add ad = new Add();
			ad.setValue(a, b);
			ad.calculate();
			System.out.println(ad.getResult());
			break;
		case "-" :
			Sub su = new Sub();
			su.setValue(a, b);
			su.calculate();
			System.out.println(su.getResult());
			break;
		case "*" :
			Mul mu = new Mul();
			mu.setValue(a, b);
			mu.calculate();
			System.out.println(mu.getResult());
			break;
		case "/" :
			Div di = new Div();
			di.setValue(a, b);
			di.calculate();
			System.out.println(di.getResult());
			break;
		}
	}
}