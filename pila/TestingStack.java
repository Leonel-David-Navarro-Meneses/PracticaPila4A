package pila;

import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestingStack {
    public static void main(String[] args) throws IOException {
        Stack pila;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int t;
        Data <Double>dato;
        char respuesta;




        //para hacer la pila, se pued el tamaño de la pila
        System.out.println("escribe el tamaño de la pila");
         entrada =  bufer.readLine();
         t = Integer.parseInt(entrada);
         pila = new Stack(t);

         //probar que la pila este vacia
 System.out.println("ver el estado de la pila");
   if(pila.isEmpty()){
    System.out.println("la pila esta vacia");
   }else{
    System.out.println("la pila tiene elementos");
   }


   System.out.println("ver el estado de la pila");
   if(pila.isFull()){
    System.out.println("la pila esta llena");
   }else{
    System.out.println("la pila no esta llena");
   }





         //escribe informacion en la pila
         System.out.println("----------");
         do{
            System.out.println("escribe el dato double a introducir en la pila" );
            entrada = bufer.readLine();
            dato = new Data<>(Double.parseDouble(entrada));
           if( pila.push(dato)){
           System.out.println("el dato entro a la pila");
           System.out.println("escribir mas datos? pon n para detenerne");
           entrada = bufer.readLine();
           respuesta = entrada.charAt(0);
           }else{
           System.out.println("la pila esta llena ya no se puede escribir datos");
           respuesta = 'n';
           }
         }while(respuesta != 'n');

         
        }

}
