package es.Studium.Buscar;
import java.util.Random;
import java.util.Scanner;
public class Buscar {

	public static void main(String[] args)
	
	{
		Scanner teclado = new Scanner(System.in);
		
		int tabla[] = new int[100];
		int i;
		int numero;
		boolean encontrado = false;
		
		Random aleatorio = new Random();
		for (i=0;i<100;i++)
		{
		tabla [i] = aleatorio.nextInt(100)+1;
		}
		for (i=0;i<100;i++)
		{
			System.out.println(tabla[i]);
		}
		System.out.println("¿Que número quieres buscar?");
		numero = teclado.nextInt();
		for (i=0;i<100;i++)
		{
			if(numero==tabla[i])
			{
				System.out.println("El número está en la posicion "+i);
			encontrado = true;
			}
		}
		if (!encontrado)
		{
			System.out.println("el número no está");
		}
		
		teclado.close();
		
	}

}
