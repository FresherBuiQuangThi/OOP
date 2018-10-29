package OOP;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Controller controller = new Controller();
		
		System.out.print("Nhap vao bai can lam: ");
		boolean cont = true;
		
		do {
			int chon = scanner.nextInt();
			
			switch(chon) {
			case 1:
				System.out.println("Chon het");
				controller.select();
				break;
			case 2:
				System.out.println("Chon theo id");
				System.out.print("Nhap vao id can lay: ");
				int id = scanner.nextInt();
				controller.selectwhere(id);
				break;
			case 3:
				Students students = new Students("Ngoc", 18, "Xuan Da", 9.0);
				System.out.println("Them");
				controller.add(students);
				break;
			case 4:
				System.out.println("Xoa");
				break;
			case 5:
				System.out.println("Sua");
				break;
			default:
				System.out.println("Bye bye bye!!!");
				cont = false;
				break;
			}	
		}
		while(cont);
	}
}
