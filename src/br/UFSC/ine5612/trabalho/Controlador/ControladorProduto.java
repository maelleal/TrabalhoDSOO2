/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.ine5612.trabalho.Controlador;

import br.UFSC.ine5612.trabalho.Entidades.Produto;
import br.UFSC.ine5612.trabalho.Entidades.ProdutoDAO;
import java.io.Serializable;

/**
 *
 * @author Ismael
 */
public class ControladorProduto implements Serializable {

    private static ControladorProduto instancia;

    public static ControladorProduto getInstancia() {
        if (instancia == null) {
            instancia = new ControladorProduto();
        }
        return instancia;
    }

    
    public void criaProduto(String nome, Integer codigo, float preco) {
        Produto produtoNovo = new Produto(nome, codigo, preco);
        serializaProduto(produtoNovo);
    }

    public void serializaProduto(Produto produto) {
        ProdutoDAO.getInstancia().put(produto);
    }
    public Produto findProdutoByCodigo(int numero){
        return ProdutoDAO.getInstancia().get(numero);
    }
}
