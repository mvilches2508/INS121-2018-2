package com.clase2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fimar
 */
public class Main {
    public static void main (String []arg){
        Polera poleraVAR = new Polera();
        System.out.println("Talla: "+poleraVAR.talla);
        System.out.println("cantidad: "+poleraVAR.cantidad);
        poleraVAR.setTalla("M");
        System.out.println("Talla: "+poleraVAR.talla);
        
    }
}
