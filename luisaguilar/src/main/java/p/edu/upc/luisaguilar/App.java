package p.edu.upc.luisaguilar;

import java.util.Scanner;
/**
 * Hello world!
 * Con scanner puedo crear un objeto
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner s=new Scanner(System.in);
    	int numero;
    	double Numero;
    	
    	//Wrapper ( Clases envolventes ) ==> Casting
    	//double -> para valores
    	//Double -> para metodos y clases
    	Double valores=new Double(13);
    	
    	String[] arrNombres=new String[3];
    	
        System.out.println( "Hello World!" );
        
        for (int i = 0; i < arrNombres.length; i++) {
			System.out.println("Nombre"+(i+1) );
			arrNombres[i]=s.nextLine();
		}
    }
}
