/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.ine5612.trabalho;

import br.UFSC.ine5612.trabalho.Controlador.ControladorCompra;
import br.UFSC.ine5612.trabalho.Controlador.ControladorProduto;
import br.UFSC.ine5612.trabalho.Entidades.Produto;
import br.UFSC.ine5612.trabalho.Entidades.ProdutoDAO;
import br.UFSC.ine5612.trabalho.Telas.TelaInicial;

/**
 *
 * @author Ismael
 */
public class TrabalhoDSOO2 {
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            ControladorCompra.getInstancia().showTelaInicial();
            }
        });
       
        for (Produto p : ProdutoDAO.getInstancia().getList()) {
            System.out.println(p.getNome());
        }
        
    }
    
    
}
