/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.ine5612.trabalho.Controlador;

import br.UFSC.ine5612.trabalho.Entidades.Compra;
import br.UFSC.ine5612.trabalho.Entidades.CompraDAO;
import br.UFSC.ine5612.trabalho.Entidades.Produto;
import br.UFSC.ine5612.trabalho.Telas.TelaBalanco;
import br.UFSC.ine5612.trabalho.Telas.TelaCompra;
import br.UFSC.ine5612.trabalho.Telas.TelaDataBalanco;
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
    
    public void showTelaDataBalanco(){
        TelaDataBalanco.getInstancia().setVisible(true);
    }
    
    public Produto verificaProduto(String numero){
        int codProduto = Integer.valueOf(numero);	
        Produto p = ControladorProduto.getInstancia().findProdutoByCodigo(codProduto);
        if( p == null){
            JOptionPane.showMessageDialog(null, "Não há nenhum item com o código "+codProduto+"", "Código inválido", JOptionPane.DEFAULT_OPTION);        
        }
        return p;
    }
    
    public void showTelaBalanco(int data){
        int numCompras = 0;
        float valorTotal = 0;
        for (Compra compra : CompraDAO.getInstancia().getList()) {
            if(compra.getData() == data){
                numCompras++;
                valorTotal = valorTotal+compra.getValorTotal();
            }
        }
        if(numCompras == 0){
            JOptionPane.showMessageDialog(null, "Não há nenhuma compra nessa data", "Data inválida", JOptionPane.DEFAULT_OPTION);
        } else {
            TelaBalanco.getInstancia().setDadosBalanco(numCompras, valorTotal);
            TelaBalanco.getInstancia().setVisible(true);
        }       
    }
    
    public void insereProdutoNaCompra(){
        
        
    }
    public void mostraModalConfirmacao(){
        
    }
        
    public void cancelaProduto(){
        
    }
    
    public void cancelaCompra(){
        
    }
    
    public void finalizaCompra(){
        
    }

    
}
