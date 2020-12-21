package pruebas;

import java.util.Scanner;

public class numerosigualesono {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        //Declaro las dos variables para los números

        int num1, num2;

        System.out.println("Introdude el primer dígito:");

        num1 = sc.nextInt();
        System.out.println("Introdude el segundo dígito:");
        num2 = sc.nextInt();
        if(num1==num2){
            System.out.println("Los dos números son iguales");

        }else {
            if(num1>num2){
                System.out.println("El primer número es mayo que el segundo");
            }else {
                System.out.println("El primer número es menos que el segundo");
            }
        }

       


    }
}
