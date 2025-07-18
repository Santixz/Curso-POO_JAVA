package ex07_condicional_anidado;

public class Ex07_condicional_anidado {
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = 5;
        num2 = 5;
        
        
       if (num1 > num2) {
           System.out.println("El numero 1 es mayor al numero 2.");
       } else {
           if (num1 == num2) {
               System.out.println("Los numeros son iguales");
           }
           else {
               System.out.println("El numero 2 es mayor al numero 1.");
           }
       }
    }
    
}
