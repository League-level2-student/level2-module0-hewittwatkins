package arrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		
		String[] strArray = new String[] {"Hi","Hello","What's Up","Hey There","Hola"};
		
		
		//2. print the third element in the array
		
		System.out.println(strArray[2]);
		
		//3. set the third element to a different value
		
		strArray[2] = "bob";
		
		//4. print the third element again
		
		System.out.println(strArray[2]);
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
		//6. make an array of 50 integers
		
		int[] intArray = new int[50];
		for (int i = 0; i < 50; i++) {
			intArray[i] = i;
		}
		
		//7. use a for loop to make every value of the integer array a random number
		
		//did in #6
		
		//8. without printing the entire array, print only the smallest number in the array
		
		int smallNum = intArray[0];
		for (int i = 1; i < intArray.length; i++) {
			if (smallNum > intArray[i]) {
				smallNum = intArray[i];
			}
	
		}
		System.out.println(smallNum);
		
		//9 print the entire array to see if step 8 was correct
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		//10. print the largest number in the array.
		
		int bigNum = intArray[0];
		for (int i = 1; i < intArray.length; i++) {
			if (bigNum < intArray[i]) {
				bigNum = intArray[i];
			}
	
		}
		System.out.println(bigNum);
		
		
	}
}
