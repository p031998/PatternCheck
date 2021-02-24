package javasample6;
import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		ImplementPattern check=new ImplementPattern();
		while(true) {
			System.out.println("Enter your choice between 1-4:");
			@SuppressWarnings("resource")
			Scanner ch = new Scanner(System.in);
			int choice=ch.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter your pattern:");
				String Firstpattern=ch.next();
				check.useCase1(Firstpattern);
				break;
			case 2:
				System.out.println("Enter your pattern:");
				String Secondpattern=ch.next();
				check.useCase2(Secondpattern);
				break;
			case 3:
				System.out.println("Enter your pattern:");
				String Thirdpattern=ch.next();
				check.useCase3(Thirdpattern);
				break;
			case 4:
				System.out.println("Enter your pattern");
				String Fourthpattern=ch.next();
				check.useCase4(Fourthpattern);
				break;
				default:
					System.out.println("Wrong Choice");
					break;
			}
		}
	}

}
