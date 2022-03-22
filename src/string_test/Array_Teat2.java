package string_test;

public class Array_Teat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[][];
//		arr = new int[3][4];
//		
//		
//		int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
//		
//		int len = arr2.length; 
//		System.out.println(len); //행의 개수를 출력
//		
//		int len2 = arr2[1].length;
//		System.out.println(len2); //열의 개수를 출력
		
		
		int arr3[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				System.out.println(arr3[i][j]);
			}
		}
		
	}

}
