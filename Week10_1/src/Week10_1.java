//컴퓨터는 Random클래스를 이용하여 난수를 발생시켜 사용자와 가위바위보를 한다

import java.util.Random;
import java.util.Scanner;
public class Week10_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.print("하나를 선택 : 가위(1), 바위(2), 보(3) : ");
		int i = input.nextInt();
		int com = rd.nextInt(4);
		
		switch(i) {
		case 1 :
			System.out.println("당신은 가위를 냈습니다.");
			if(com == 2) { 
				System.out.println("바위 / 당신이 졌습니다.");
			} else if (com == 3) {
				System.out.println("보 / 당신이 이겼습니다.");
			} else {
				System.out.println("가위 / 비겼습니다.");
			}
			break;
			
		case 2 :
			System.out.println("당신은 바위를 냈습니다.");
			if(com == 2) { 
				System.out.println("바위 / 비겼습니다.");
			} else if (com == 3) {
				System.out.println("보 / 당신이 졌습니다.");
			} else {
				System.out.println("가위 / 당신이 이겼습니다.");
			}
			break;
			
		case 3 :
			System.out.println("당신은 보를 냈습니다.");
			if(com == 2) { 
				System.out.println("바위 / 당신이 이겼습니다.");
			} else if (com == 3) {
				System.out.println("보 / 비겼습니다..");
			} else {
				System.out.println("가위 / 당신이 졌습니다.");
			}
			break;	
		}
	}
}