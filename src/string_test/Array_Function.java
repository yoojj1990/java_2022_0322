package string_test;

public class Array_Function {
	
	static int sum(int a,int b) {
		int sum = a + b;
		return sum;
		}	
	
	static int[] outputArray(int a, int b, int c){ //리턴값이 배열 - int배열이라 int로 선언
		int arr[] = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		return arr;
	}

	public static void main(String[] args) { // 매개변수가 문자열 배열
		// TODO Auto-generated method stub
		
		int ret[] = new int[3];
		ret = outputArray(1,2,3);
		
		
		
		
		
		
		
		
		
	}

}
