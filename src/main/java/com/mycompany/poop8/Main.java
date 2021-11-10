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
public class Main {
    public static void main(String[] args) {
        System.out.println("####Objetos se comportan como sus superclases####");
        PoligonoC poligonoc=new PoligonoC();
        Object objeto = poligonoc;
        System.out.println(poligonoc);
        System.out.println(objeto);
        poligonoc=(PoligonoC)objeto;
        System.out.println(poligonoc);
        
        poligonoc=new TrianguloC();
        System.out.println(poligonoc);
        poligonoc=new CuadrilateroC();
        System.out.println(poligonoc.toString());
        
        System.out.println("#########Clases abstractas#############");
        PoligonoA polA=new TrianguloA();
        System.out.println(polA);
        polA=new CuadrilateroA();
        System.out.println(polA);
        
        System.out.println("#############Interfaces###########");        
        //Se puede crear una referencia a interfaz
        InstrumentoMusical instrumento;
        //Pero no se puede implementar
        instrumento=new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento);
    }
}
