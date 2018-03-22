package com.clase3;
//definición de clase
public class Main {
        //punto de partida del programa o secuencia de pasos
        public static void main(String [] args){
            //asignación de la variable de nombre con un dato 
            String nombre ="PROGRAMACION";
            //asignación de un numero en una variable tipo Entera
            int numero = 10;
            //obtención del modulo de un numero con el operador %
         int resultado = numero%2;
         /*comando if, usado para determinar una operación booleana
            en este caso estamos consultando si la variable resultado
            es distinta de ZERO. Si la operación resulta positiva (TRUE)
            indica que el número es impar, indicando por consola un "SI"
         */         
         if(resultado != 0){
             //salida por consola que indica SI, si el numero es impar
             System.out.println("SI");
         }else{
             //salida por consola indicado NO, si no es un numero impar
            System.out.println("NO");
         }
         /*
         TAREA:
                tomar los numeros de su rut y construir un algoritmo que permita indicar digito a digito
                si es un numero par o impar.
         Ejemplo:
         rut: 123456-k
         rut sin DV: 123456 <-- este numero usted evaluará
         numero a evaluar: 123456
         1 - es impar
         2 - es par
         3 - es impar
         .
         .
         .
         
         */
         
        }
    
}
