/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author AA-LABB7PC08
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //1.-valorabsoluto
        int numero =-24;
       double valorabsoluto = Math.abs(numero);
        System.out.println("el valor  absoluto de "+numero+" es");
               System.out.println(valorabsoluto);
               //2.-seno y coseno de los angulos
               int angulo= 30;
                       double seno=Math.sin(angulo),coseno=Math.cos(angulo);
                       System.out.println(" el seno del "+angulo+" es");
                       System.out.println(seno);
                 System.out.println(" el coseno del "+angulo+" es");
                       System.out.println(coseno);
                     //3.-numero random  
            double random= (Math.random());
            System.out.println("El numero random es:");
            System.out.println(random);
            //raiz cuadrada
            int numero1 =36;
                    double raizcuadrada= Math.sqrt(numero1);
                    System.out.println(" la raiz cuadrada de "+numero1+" es "+raizcuadrada);
              //potencia de un numero
              int a=5;
              int b=7;
          double potencia= Math.pow(a,b);
              System.out.println("la potencia de "+ a +" elevado a la "+ b+" es");
              System.out.println(potencia);
              
              //esponente del numero e
           
              int num =3; 
                   double exponencial=Math.exp(num);
                   System.out.println("El exponente de "+num+ " es:");
           System.out.println(exponencial);
           
           // logaritmo de un numero
           int num1=200;
           double logaritmo=Math.log(num1);
           System.out.println("el logaritmo de "+num1+" es: ");
                   System.out.println(logaritmo);
                   //logaritmo de base 10
                  int num2=60;
                  double logaritmo10=Math.log10(num2);
                  System.out.println("el logaritmo base 10 de "+num2+" es:");
                  System.out.println(logaritmo10);
                          
                  //calcular el iva
                  double subtotal=33.55;
                  double ivax=0.12;
                  
                  double iva=subtotal*ivax;
                   double preciototal=subtotal+iva;
                  System.out.println("el iva es "+ iva);
                  
                  System.out.println("el percio total es "+preciototal);
                  
                  
                          
                         
                      
                                  
              
              
}
           
    
}
