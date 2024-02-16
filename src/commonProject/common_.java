package commonProject;

import java.util.Scanner;

public class common_ {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=0; 
		
		while (true) {
			System.out.println("메뉴 입력");
			System.out.print(">>>");
			num = input.nextInt();
		switch(num){
			case 1 : System.out.println("에어컨 온도조절");break;
			case 2 : System.out.println("에어컨 풍량조절");
			Seo s = new Seo();
				s.display();
				break;
			case 3 : System.out.println("에어컨 리모컨 설정");break;
		}
		}
		}

}
