/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop8;

/**
 *
 * @author Hyperion
 */
public class PruebaMeses {
    public static void main(String[] args) {
        //Se puede acceder a las variables de la interfaz sin crear instancias
        System.out.println("El mes "+Meses.DOS+" corresponde a:");
        System.out.println(Meses.NOMBRE_MESES[Meses.DOS]);
    }
}
