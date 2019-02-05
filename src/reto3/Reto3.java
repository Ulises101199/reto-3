/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AlumnoUTM
 */
public class Reto3 {

   
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        
        int puntaje;
        int [] valores = new int [3];
       int temp; 
        
       constructor personaje1 = new constructor ();
       mago personaje2 = new mago ();
       guerrero personaje3 = new guerrero ();
       System.out.println("Indique el puntaje para cada constructor");
       puntaje = Integer.parseInt(entrada.readLine());
       personaje1.setPuntaje(puntaje);
       System.out.println("Indique el puntaje para cada constructor");
       puntaje = Integer.parseInt(entrada.readLine());
       personaje2.setPuntaje(puntaje);
       System.out.println("Indique el puntaje para cada constructor");
       puntaje = Integer.parseInt(entrada.readLine());
       personaje3.setPuntaje(puntaje);
       
       valores [0] = personaje1.getPuntaje();
       valores [0] = personaje2.getPuntaje();
       valores [0] = personaje3.getPuntaje();
       
       for (int r = 0; r < valores.length; r ++){
           for (int j = r; j > 0; j--){
               
               temp = valores [j];
               valores [j] = valores [r-1];
               valores [ j -1] = temp;
               
           }
           
           
           for (int y = 0; y < valores.length; y ++){
               System.out.println(valores [y]);
           }
       }     
    }
    
}
