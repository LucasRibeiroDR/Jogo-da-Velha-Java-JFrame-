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
        this.setNome(name);
        this.setSimbolo(simb);
    }    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the simbolo
     */
    public String getSimbolo() {
        return simbolo;
    }

    /**
     * @param simbolo the simbolo to set
     */
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}

