package ex02_estructura_algoritmo;
import java.util.Scanner;
public class Ex02_estructura_algoritmo {

    public static void main(String[] args) {
       // Declarar variables, constantes y/o arreglos.
        Scanner scanner = new Scanner(System.in);
        String nombre;
        char sexo;
	int edad;
        boolean transporte;
        double salario;
	// Dimensionar arreglos.
	
	// Iniciar variables, constantes y/o arreglos
        nombre = "Santiago";
        sexo = 'M';
        edad = 17;
        transporte = true;
        
        
	// Entrada de Datos: Pueden ser solicitados o no
        System.out.println(nombre);
        System.out.println(sexo);
        System.out.println(edad);
        System.out.println(transporte);
        System.out.println("Digita el numero de tu salario");
        salario = scanner.nextDouble();
	// Proceso: Determinar los requerimientos y validaciones. Generalmente,	
	//          se usan las estructuras de control: Secuencial, condicional, repetici�n.
	
	// Salida de Datos. Resultado(s).
       
        
        String salarioFormateado = String.format("%.2f", salario);
        
        System.out.println("Salario con 2 decimales: " + salarioFormateado);
        
        scanner.close();
        
    }
    
}
