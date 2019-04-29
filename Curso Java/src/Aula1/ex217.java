package Aula1;

import java.util.Scanner;

public class ex217 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro numero?");
		n1 = in.nextInt();
		System.out.println("Digite o segundo numero?");
		n2 = in.nextInt();
		
		if(n1>n2){
			System.out.println(n1+" is larger");
		}else{
			if(n2>n1){
				System.out.println(n2+" is larger");
			}else{
				System.out.println("These numbers are equal");
			}
		}
	}

}
