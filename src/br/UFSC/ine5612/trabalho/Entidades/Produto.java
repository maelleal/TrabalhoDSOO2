/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.ine5612.trabalho.Entidades;

/**
 *
 * @author Ismael
 */
public class Produto {
    private String nome;
    private Integer codProduto;
    private int preco;

    public Produto(String nome, Integer codigo, int preco) {
        this.nome = nome;
        this.codProduto = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codigo) {
        this.codProduto = codigo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    
}
