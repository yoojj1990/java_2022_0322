package string_test;

import java.util.*;

public class String_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
			System.out.print(">>");
//			String txt = scanner.nextLine(); //���� ���� �Է¹���
			String txt = scanner.next(); // ���� �ϸ� �������� �ѱ�
			System.out.println(txt);
			if(txt.equals("exit")) { //2���� �ؽ�Ʈ�� ���ҋ� ���� ���
				break;
			}
			
		}
		System.out.println("���α׷��� �����մϴ�.");
		scanner.close();
	}
	
}
