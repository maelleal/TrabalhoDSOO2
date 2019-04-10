/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.ine5612.trabalho.Controlador;

import br.UFSC.ine5612.trabalho.Telas.TelaCompra;
import br.UFSC.ine5612.trabalho.Telas.TelaInicial;
import br.UFSC.ine5612.trabalho.Telas.TelaSenha;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Ismael
 */
public class ControladorCompra implements Serializable {
    private static ControladorCompra instancia;
            
    public static ControladorCompra getInstancia() {
        if (instancia == null) {
            instancia = new ControladorCompra();
        }
        return instancia;
    }
    
    
    private ControladorCompra (){
        
    }
    public void showTelaCompra(){
        TelaCompra.getInstancia().setVisible(true);
    }
    
    public void showTelaSenha(){
        TelaSenha.getInstancia().setVisible(true);
    }
    
    public void showTelaInicial(){
        TelaInicial.getInstancia().setVisible(true);
    }
    
    public void insereProdutoNaCompra(){
        
        
    }
    public void mostraModalConfirmacao(){
        
    }
    
    public void mostraModal(){
        JOptionPane.showMessageDialog(null, "Cancelamento", "Operação realizada com sucesso", JOptionPane.DEFAULT_OPTION);
    }
    
    public void cancelaProduto(){
        
    }
    
    public void cancelaCompra(){
        
    }
    
    public void finalizaCompra(){
        
    }
}
