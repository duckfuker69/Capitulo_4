/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

/**
 *
 * @author dani
 */
public class Test {
    public static void main(String[] args) {
        Die dado1 = new Die();
        
        System.out.println(dado1.getNumero());
        dado1.lanzar();
        System.out.println(dado1.getNumero());
        
    }
    
}
