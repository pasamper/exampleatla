/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocoche;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author pasamper
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private int color;
    
private List<Rueda> ruedas = null;
private List<Motor> motores = null;
private List<Puerta> puertas = null;

public Coche(){
    ruedas = new ArrayList();
    motores = new ArrayList();
    puertas = new ArrayList();
    for (int i = 0; i < 4; i++) {
        
        ruedas.add (new Rueda());
    
    motores = new LinkedList();
    puertas = new ArrayList();
    
        motores.add (new Motor());
    
        for (int j = 0; j < 5; j++) {
            puertas.add (new Puerta());
            
        }
        
    }
}
}
