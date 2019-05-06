package Aula1;

import java.util.*;

public class ex218 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3, arr[];
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro numero?");
		n1 = in.nextInt();
		System.out.println("Digite o segundo numero?");
		n2 = in.nextInt();
		System.out.println("Digite o terceiro numero?");
		n3 = in.nextInt();
		
		arr = order(n1,n2,n3);
		System.out.println(n1+n2+n3);
		System.out.println((n1+n2+n3)/3);
		System.out.println(n1*n2*n3);
		System.out.println(arr[2]);
		System.out.println(arr[0]);
		
	}
	
	public static int[] order(int n1, int n2, int n3){
		int[] numbers = new int[3];
		numbers[0] = n1;
		numbers[1] = n2;
		numbers[2] = n3;
		
		Arrays.sort(numbers);
		return numbers;
	}

}
