package string_test;

import java.util.*;

public class String_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
			System.out.print(">>");
//			String txt = scanner.nextLine(); //띄어쓰기 까지 입력받음
			String txt = scanner.next(); // 띄어쓰기 하면 다음으로 넘김
			System.out.println(txt);
			if(txt.equals("exit")) { //2개의 텍스트를 비교할떄 많이 사용
				break;
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}
	
}
