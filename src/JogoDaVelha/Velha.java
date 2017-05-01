/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDaVelha;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Velha { //classe que controla o jogo como um todo
    Jogador jogador1 = new Jogador();
    Jogador jogador2 = new Jogador();
    private int turno; //conceito de encapsulamento;   
    String jogadasJogador1;
    String jogadasJogador2;

    public void iniciarPartida(String nome1, String nome2, String simb1, String simb2){
        jogador1.definirNomesESimbolos(nome1, simb1);
        jogador2.definirNomesESimbolos(nome2, simb2);
        turno = 0;
        jogadasJogador1 = "";
        jogadasJogador2 = "";
    }
       
    public int passarTurno(){//conceito de encapsulamento;
        turno += 1;
        return turno;
        
    }
    
    public void verificarResultado(String jogada, String jogador){
        if(jogada.contains("1")){ //147
            if(jogada.contains("4")){
                if(jogada.contains("7")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!" ,"Vencedor",JOptionPane.OK_OPTION);
                    turno=0;                }
            }
            
            if(jogada.contains("5")){//159
                if(jogada.contains("9")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!" ,"Vencedor",JOptionPane.OK_OPTION);
                    turno=0;
                }
            }
            if(jogada.contains("2")){//123
                if(jogada.contains("3")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!" ,"Vencedor",JOptionPane.OK_OPTION);
                    turno=0;                }
            }
            
        }
        
        if(jogada.contains("2")){
            if(jogada.contains("5")){
                if(jogada.contains("8")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!" ,"Vencedor",JOptionPane.OK_OPTION);
                    turno=0;
                    
                }
            }
        }
        
        if(jogada.contains("3")){
            if(jogada.contains("5")){
                if(jogada.contains("7")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!" ,"Vencedor",JOptionPane.OK_OPTION);
                    turno=0;
                }
            }
            if(jogada.contains("6")){
                if(jogada.contains("9")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!" ,"Vencedor",JOptionPane.OK_OPTION);
                    turno=0;
                }
            }
        }
        
        if(jogada.contains("4")){
            if(jogada.contains("5")){
                if(jogada.contains("6")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!" ,"Vencedor",JOptionPane.OK_OPTION);
                    turno=0;
                }
            }
        }
        
        if(jogada.contains("7")){
            if(jogada.contains("8")){
                if(jogada.contains("9")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!" ,"Vencedor",JOptionPane.OK_OPTION);
                    turno=0;
                }
            }
        }
    }
    
    
}
