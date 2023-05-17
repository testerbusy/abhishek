package controlStatements;

public class LoopStatement {

	public static void main(String[] args) {
		//int a = 1;
		/*
		do {
			System.out.println("THis is my do while loop");
		}
		while(a< 3);
		
		//write a code to print from 1 to 10 using do while loop.
		
		while (a<=10) {
			if(a%2==1) {
			System.out.println("this is number "+a);
			}
			a++;
		}
		*/
		for(int a = 1; a<=4; a++) {
			for(int j=1; j<=4; j++) {
				if(a==2 || j==2)
				{
				  continue;
				}
				else {
					System.out.println(a+" "+j);
				}
			}
			
		}

		/*
		int[] a = {1, 3, 7, 2, 10, 3, 7, 23, 45, 78};
		for(int i : a) {
			if(i==23) {
				break;
			}
			else {
				System.out.println(i);
			}
			
		}
		*/
	}
}
