package commonProject;

import java.util.Scanner;

public class Seo {
	public void display() {

		//case 2 : System.out.println("에어컨 풍량조절");break;
		Scanner input = new Scanner(System.in);
		int num;
		for (;;) {
			System.out.println("1.low\t2.medium\t3.high\t4.back");
			System.out.print(">>>");
			num = input.nextInt();
			if (num == 1) {
				System.out.println("low");
			}else if (num == 2) {
				System.out.println("medium");
			}else if (num == 3) {
				System.out.println("high");
			}else if (num == 4) {
				break;
			}else {
				System.out.println("invalid input value");
			}

		}


	}
}
