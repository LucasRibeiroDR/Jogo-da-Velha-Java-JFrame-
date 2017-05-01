/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDaVelha;

/**
 *
 * @author Lucas
 */
public class Jogador {
    private String nome;
    private String simbolo;
    
    public Jogador(){
        nome = " ";
        simbolo = " ";
    }
    
    public void definirNomesESimbolos(String name,String simb){
        this.nome = name;
        this.simbolo = simb;
    }    
}

