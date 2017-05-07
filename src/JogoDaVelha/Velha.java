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
                            
        VelhaTela.BotaoVelhaCampo1.setEnabled(true);
        VelhaTela.BotaoVelhaCampo2.setEnabled(true);
        VelhaTela.BotaoVelhaCampo3.setEnabled(true);
        VelhaTela.BotaoVelhaCampo4.setEnabled(true);
        VelhaTela.BotaoVelhaCampo5.setEnabled(true);
        VelhaTela.BotaoVelhaCampo6.setEnabled(true);
        VelhaTela.BotaoVelhaCampo7.setEnabled(true);
        VelhaTela.BotaoVelhaCampo8.setEnabled(true);
        VelhaTela.BotaoVelhaCampo9.setEnabled(true);

        VelhaTela.botaoFinalizarPartida.setEnabled(true);
        VelhaTela.botaoIniciarPartida.setEnabled(false);
        VelhaTela.campoNomeJogador1.setEnabled(false);
        VelhaTela.campoNomeJogador2.setEnabled(false);
        VelhaTela.campoSimboloJogador1.setEnabled(false);
        VelhaTela.campoSimboloJogador2.setEnabled(false); 
    }
       
    public int passarTurno(){//conceito de encapsulamento;
        turno += 1;
        return turno;
    }
    
    public void verificarResultado(String jogada, String jogador){
        if(jogada.contains("1")){ //147
            if(jogada.contains("4")){
                if(jogada.contains("7")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!");
                    turno=0;
                    finalizarPartida();
                }
            }
            
            if(jogada.contains("5")){//159
                if(jogada.contains("9")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!");
                    turno=0;
                    finalizarPartida();
                }
            }
            if(jogada.contains("2")){//123
                if(jogada.contains("3")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!");
                    turno=0;                
                    finalizarPartida();
                }
            }
            
        }
        
        if(jogada.contains("2")){
            if(jogada.contains("5")){
                if(jogada.contains("8")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!");
                    turno=0;
                    finalizarPartida();
                    
                }
            }
        }
        
        if(jogada.contains("3")){
            if(jogada.contains("5")){
                if(jogada.contains("7")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!");
                    turno=0;
                    finalizarPartida();
                }
            }
            if(jogada.contains("6")){
                if(jogada.contains("9")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!");
                    turno=0;
                    finalizarPartida();
                }
            }
        }
        
        if(jogada.contains("4")){
            if(jogada.contains("5")){
                if(jogada.contains("6")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!");
                    turno=0;
                    finalizarPartida();
                }
            }
        }
        
        if(jogada.contains("7")){
            if(jogada.contains("8")){
                if(jogada.contains("9")){
                    JOptionPane.showMessageDialog(null, "Parabéns "+jogador+"! Você venceu o jogo!");
                    turno=0;
                    finalizarPartida();
                }
            }
        }
        
        if(turno==9){
            JOptionPane.showMessageDialog(null, "Empate! Deu velha!");
            finalizarPartida();
        }
            
    }
    
    public void finalizarPartida(){
        VelhaTela.BotaoVelhaCampo1.setEnabled(false);
        VelhaTela.BotaoVelhaCampo2.setEnabled(false);
        VelhaTela.BotaoVelhaCampo3.setEnabled(false);
        VelhaTela.BotaoVelhaCampo4.setEnabled(false);
        VelhaTela.BotaoVelhaCampo5.setEnabled(false);
        VelhaTela.BotaoVelhaCampo6.setEnabled(false);
        VelhaTela.BotaoVelhaCampo7.setEnabled(false);
        VelhaTela.BotaoVelhaCampo8.setEnabled(false);
        VelhaTela.BotaoVelhaCampo9.setEnabled(false);

        VelhaTela.BotaoVelhaCampo1.setText("  ");
        VelhaTela.BotaoVelhaCampo2.setText("  ");
        VelhaTela.BotaoVelhaCampo3.setText("  ");
        VelhaTela.BotaoVelhaCampo4.setText("  ");
        VelhaTela.BotaoVelhaCampo5.setText("  ");
        VelhaTela.BotaoVelhaCampo6.setText("  ");
        VelhaTela.BotaoVelhaCampo7.setText("  ");
        VelhaTela.BotaoVelhaCampo8.setText("  ");
        VelhaTela.BotaoVelhaCampo9.setText("  ");

        VelhaTela.botaoFinalizarPartida.setEnabled(false);
        VelhaTela.botaoIniciarPartida.setEnabled(true);
        VelhaTela.campoNomeJogador1.setEnabled(true);
        VelhaTela.campoNomeJogador2.setEnabled(true);
        VelhaTela.campoSimboloJogador1.setEnabled(true);
        VelhaTela.campoSimboloJogador2.setEnabled(true);
    }
}
