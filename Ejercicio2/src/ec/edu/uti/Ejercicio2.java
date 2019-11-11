
package ec.edu.uti;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        // tipos de datos numeriucos enteros
        int numero1;
       byte numero2;
       short numero3;
       long numero4;
                //numeros reales
                double numero5;
                float numero6;
                // caracteres
                char caracter1;
                String cadena1;
                        //boleanos
                 boolean esverdadero;
                 long a=1;
                 long b=7;
                 //long a=1,b=7
                 System.out.println("la suma de ay b es "+a+b);
                 int x=3,y=6;
                 a=x;
                 //AREA DEL CIRCULO
                 int radio= 10;
               double pi=3.1416;
               double area = pi*Math.pow(radio,2);
               
                 System.out.println(" el area del circulo de radio " +radio+ " es :"+area);
               
                 //
                 int w=5;
                 int u=5;
                 int resultado=w/u+9;
                 
                 if(resultado==10){System.out.println("ES POSITIVO");
                 }
                 else {System.out.println("ES NEGATIVO");
                 }
                 // DESCUENTO
                 
               double subtotal,iva,total,descuento= 0;
                       subtotal=100;
                   if (subtotal>100){
                       descuento=subtotal*100;
                     
                   }
                    else{ 
                    descuento =0;
                     iva =100*0.12;
                   total= subtotal+iva-descuento;
                       System.out.println("El total es:"+total);
                     
    }
   
}
  

              
}                               
                         
    
    

