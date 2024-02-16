package commonProject;

import java.util.Scanner;

public class common_ {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=0; 
		System.out.println("입력");
		num = input.nextInt();
		
		switch(num){
			case 1 : System.out.println("에어컨 온도조절");break;
			case 2 : System.out.println("에어컨 풍량조절");break;
			case 3 : System.out.println("에어컨 리모컨 설정");break;
		}
			
		}

}
