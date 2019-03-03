package pl.edu.agh.mwo;

public class FizzBuzz {

	public static void main(String[] args) {
		test();
	}
	
	public static String[] test() {
		String[] arr = new String[101];
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					arr[i] = "FizzBuzz";
				}
				else
				{
					arr[i] = "Fizz";
				}
			}
			else if (i % 5 == 0) {
				arr[i] = "Buzz";
			}
			else
			{
				arr[i] = Integer.toString(i);
			}	
		}
		
//		for (String string : arr) {
//			System.out.println(string);
//		}
		
		return arr;
	}
	
}
