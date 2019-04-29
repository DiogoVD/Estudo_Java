package Aula1;
import java.util.*;
import java.lang.*;
public class ex219 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int raio;
		double diametro, circunferencia, area;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro numero?");
		raio = in.nextInt();
		
		diametro = 2*raio;
		circunferencia = 2*Math.PI*Math.PI;
		area = 2*Math.PI*raio;
		
		System.out.println("Diametro: "+diametro);
		System.out.println("Circunferencia: "+circunferencia);
		System.out.println("Área: "+area);
	}

}
