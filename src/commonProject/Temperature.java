package commonProject;

import java.util.Scanner;

public class Temperature {
	private int conTemp = (int)(Math.random()*10+16);
	
	public int getConTemp() {
		return conTemp;
	}

	public void setConTemp(int conTemp) {
		this.conTemp = conTemp;
	}

	public void display() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("온도조절을 할 수 있는 기능입니다.");
		
		while (true) {
			System.out.println("옵션을 선택해주세요.");
			System.out.println("1. 현재 온도 확인");
			System.out.println("2. 온도 올리기");
			System.out.println("3. 온도 낮추기");
			System.out.println("4. 기능 종료");
			System.out.println(">>");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				this.tempCheck();
			} else if (menu == 2) {
				this.tempUp();
			} else if (menu == 3) {
				this.tempDown();
			} else if (menu == 4) {
				break;
			} else {
				System.out.println("옵션에 있는 번호를 입력해주세요");
			}
		} //while 종료
	} //display 종료
	
	public void tempCheck() {
		System.out.println("현재 설정 목표 온도는 : " + conTemp + "도 입니다.");
		System.out.println("옵션 선택 메뉴로 돌아갑니다.");
	} //tempCheck 종료
	
	public void tempUp() {
		System.out.println("온도를 높입니다. 최대 26도까지 설정할 수 있습니다.");
		this.conTemp ++;
		if (this.conTemp > 26) {
			conTemp --;
			System.out.println("최대 설정 온도입니다. 메뉴로 돌아갑니다.");
		}
		System.out.println("현재 설정 목표 온도는 : " + conTemp + "도 입니다.");
		System.out.println();
	} // tempUp 종료
	
	public void tempDown() {
		System.out.println("온도를 내립니다. 최대 16도까지 설정할 수 있습니다.");
		this.conTemp --;
		if (this.conTemp < 16) {
			conTemp ++;
			System.out.println("최저 설정 온도입니다. 메뉴로 돌아갑니다.");
		}
		System.out.println("현재 설정 목표 온도는 : " + conTemp + "도 입니다.");
		System.out.println();
	} //tempDown 종료
	
} //Temperature class 종료
