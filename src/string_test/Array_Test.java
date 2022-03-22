package string_test;

import java.util.*;

public class Array_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[]; //배열만 선언
//		arr = new int[10]; //배열의 원소 개수 지정
//		int arr[] = new int[10]; //같은 선언
//		arr[0] = 10;

		
//		int intArray[] = new int[5];
//		
//		intArray[0] = 5;
//		
//		
////		intArray[6] = 10; //인덱스 범위를 벗어난 오류
//		
//		System.out.print(intArray[6]); 
		
		
//		Scanner scanner  = new Scanner(System.in);
//		
//		int intarray[] = new int[5]; //배열생성
//		int arr_length = intarray.length; //배열 크기
//		int max = 0; //최대값
//		System.out.println("양수 5개를 입력하시오.");
//		for(int i = 0; i < arr_length; i++) { //for문의 배열의 길이를 상수값 말고 변수를 넣어서 만드는게 에러가 적다
//			intarray[i] = scanner.nextInt(); //입력받은 정수를 배열에 저장
//			if(intarray[i] > max) { // 최대값비교
//				max = intarray[i]; // 최대값 저장
//			}
//		}
//		System.out.print("가장 큰 수는 " + max + " 입니다,");
//		
//		scanner.close();
//	}
		
		
		
		int intarray[] = {10,30,15,12,110};
		
		for(int i:intarray){
			System.out.println(i);
		}
		
		String fruits[] = {"사과", "배", "바나나", "딸기"};
		
		for(String j : fruits) {
			System.out.println(j);
		}
		

		
	}	
		
	
		
}
