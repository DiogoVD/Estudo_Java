package Aula2;

public class ExerciciosAula {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercicio3();

	}
	
	public static void Exercicio1(){
		int i=10;
		double d=9.85;
		char c='a';
		boolean b=true;
		
		System.out.print("i="+i);
		System.out.print("d="+d);
		System.out.print("c="+c);
		System.out.print("i+d="+(int)(i+d));
		System.out.print("b="+b);
		if(b==true)System.out.print("positivo");else System.out.print("falso");
	}
	
	public static void Exercicio2(){
		int l=393;
		byte b;
		b = (byte)l;
		System.out.print("O valor de b é "+b);
		
		/* Explicação: O Tipo inteiro possui 4 bytes em sua totalidade de range
		  como o tipo byte possui apenas 1 byte ele considera apenas o byte menos 
		  significativo do inteiro. resultando em: 
		  int 393 = 00000000 00000000 00000001 10001001
		  ao converter fica assim:
		  byte 10001001 = -119 */
	}
	public static void Exercicio3(){
		int i;
		for(i=1;i<=500;i++){
			if(i%2==0 && i<=498)System.out.print(i+", ");
			if(i%2==0 && i>498)System.out.print(i+".");
		}
		/*Programa para imprimir todos os numeros pares de 1 a 500.*/
	}

}
