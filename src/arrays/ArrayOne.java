package arrays;

import java.util.Arrays;

public class ArrayOne {
//What is array
	//is an object which contains elements of similar data type
	//index-->0,1,2....
	//array5-->5--> 0-4
	//Advantages-->Code optimization-->we can retrieve or sort the data effeciently
	//Random access--> we can get any data located at an index position.
	
	//Types of array-->Single dimensional array and multidimensional array.
	//Syntax
	/*
	 * datatype[] variablename
	 * datatype variablename[]
	 * 
	 */
	public void singleDimensional() {
		
		int a[] = new int[5];
		a[0] = 40;
		a[1] = 80;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50; 
		//a[5] = 70;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		 
		//int a[] = {22,89,67,89,67};
		//System.out.println(a[3]);
		System.out.println("before sort "+a[3]);
		Arrays.parallelSort(a);
		System.out.println("After sort "+a[3]);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//Assignment for monday-->Sort array values without using existing method
	}
	
	public static void main(String[] args) {
		/*
		 * datatype[][] variableName = new datatype[][]
		 * dtatype variablename[][] = new 
		 */
		/*
		int[][] a = new int[2][2];
		a[0][0] = 1;
		a[0][1] = 4;
		a[1][0] = 6;
		a[1][1] = 9;
		*/
		int[][] a = {{1,4},{6,9}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
