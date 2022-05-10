package testes;

import java.util.Scanner;

public class Introducao ｛
   public static void main(String[] args) {
  
       Scanner num = new Scanner(System.in);
       System.out.println("Escreva um num com 3 digitos: ");
  
       Integer valor = numero.nextInt();  //Digamos que o valor é 123
       Integer resto = 0;        
  
       resto = valor % 10; 
       valor = valor / 10;  
  
       System.out.println(resto); 
  
       resto = valor % 10; 
       valor = valor / 10; 
  
       System.out.println(resto); //imprime 2      
       System.out.println(valor); //imprime 1        
   ｝
}
