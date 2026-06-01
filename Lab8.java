import java.util.Scanner;
public class Lab8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean exit = true;
		while(exit){
			System.out.print("Enter the first number: ");
			int number = input.nextInt();
			System.out.print("Enter the second number: ");
			int number1 = input.nextInt();
			if(number==0||number1==0){
				System.out.println("Neither value can equal 0");
			}else if(number > number1){
				System.out.println("Invalid input!! number should be less than or equal to number1.");
			}else{
				System.out.print("Enter "+number+" values to populate the array: ");
				int [] array = new int[number];
				for(int i = 0; i < array.length; i++){
					array[i] = input.nextInt();
				}
				int sum = sumBetween(number, number1);
				System.out.println("The sum of integers between "+number+" and "+number1+" is: "+sum);
				int sumArray = sumArray(array, 0);
				System.out.print("The sum of {");
				for(int i = 0; i < array.length; i++){
					System.out.print(array[i]+",");
				}
				System.out.println("} is: "+sumArray);
				printNumbers(number1);
				System.out.println();
				int max = findMax(array, 0);
				System.out.println("The max of the array is: "+max);
				int factorial = factorial(number);
				System.out.println("The factorial of "+number+" is: "+factorial);
				exit = false;
			}
		}
		input.close();
	}
	public static int sumBetween(int number, int number1) {
        if (number==number1) {
            return number;
        } else {
            return number +sumBetween(number+1,number1);
        }
    }

    public static int sumArray(int[] array, int index){
    	if (index==array.length) {
            return 0;
        } else {
            return array[index] + sumArray(array,index+1);
        }
    	
    }

    public static void printNumbers(int n) {
    	if (n==1) {
        	System.out.print(n+" ");
        } else {
        	printNumbers(n-1);
        	System.out.print(n +" ");
    	}
	}

	public static int findMax(int[] arr, int index) {
    	if (index >= arr.length) {
            return Integer.MIN_VALUE;
        } else {
           int nextIndex = findMax(arr,index+1);
           if(arr[index]>nextIndex){
           	return arr[index];
           } else {
           	return nextIndex;
           }
        }
	}

	public static int factorial(int n) {
    	if (n==0) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
	}

}