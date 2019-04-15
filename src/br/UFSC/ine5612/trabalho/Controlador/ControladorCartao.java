/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.ine5612.trabalho.Controlador;

import br.UFSC.ine5612.trabalho.Telas.TelaCartao;
import javax.swing.JOptionPane;

/**
 *
 * @author Ismael
 */
public class ControladorCartao {
    private static ControladorCartao instancia;
  
            
    public static ControladorCartao getInstancia() {
        if (instancia == null) {
            instancia = new ControladorCartao();
        }
        return instancia;
    }
    
    public boolean validaCartao(String cartao){
        cartao = cartao.replaceAll(" ", "").trim();
        if(cartao.length() != 16){
            return false;
        }
        return true;
    }
    
    
    public void showTelaCartao(){
        TelaCartao.getInstancia().setVisible(true);
    }

    public void compraCancelada() {
        JOptionPane.showMessageDialog(null, "Numero do cartão inválido", "Cartão inválido", JOptionPane.DEFAULT_OPTION);
    }

    public void finalizaCompra() {
        ControladorCompra.getInstancia().finalizaCompra();
        
    }

    public void showTelaCompra() {
        ControladorCompra.getInstancia().showTelaCompra();
    }
}
