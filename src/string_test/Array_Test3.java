package string_test;

public class Array_Test3 {
	public static void main(String[] args) {
		
		int arr[][];
		arr = new int[3][4];
		
		int arr2[][];
		arr2 = new int[4][];
		
		arr2[0] = new  int[1];
		arr2[1] = new  int[4];
		arr2[2] = new  int[2];
		arr2[3] = new  int[6];
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j] = (i+1)*10 + j;
			}
		}		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}		
		
		
		
		
		
		
		
		
		
		
	}

	
}
