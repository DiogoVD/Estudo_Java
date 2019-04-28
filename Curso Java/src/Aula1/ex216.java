package Aula1;
import java.util.*;
public class ex216 {

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
		System.out.println(n1 + n2);
		System.out.println(n1*n2);
		System.out.println(n1-n2);
		System.out.println(divisao(n1, n2));
	}
	
	public static int divisao(int n3, int n4){
		if(n3!=0 && n4!=0){ 
			return n3/n4;
		}else{
			return 0;
		}
	}

}
