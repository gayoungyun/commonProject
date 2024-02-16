package commonProject;

import java.util.Scanner;

public class Ga {
	public void inputData() {
		Scanner input = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("번호 입력 1~4");
			System.out.print(">>>");
			num = input.nextInt();
			if (num == 1) {
				System.out.println("에어컨을 켭니다");
			}else if (num == 2) {
				System.out.println("에어컨을 끕니다");
			}else if (num == 3) {
				System.out.println("풍향조절");
			}else if (num == 4) {
				System.out.println("온도조절");
				break;
			}else {
				System.out.println("번호를 다시 입력하세요");
			}

		}


	}

}
