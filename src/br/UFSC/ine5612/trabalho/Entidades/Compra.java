/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.ine5612.trabalho.Entidades;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ismael
 */
public class Compra implements Serializable{

    private ArrayList<Produto> listaCompra;
    private Integer numeroCompra;
    private String data;
    private float valorTotal;

    public Compra(ArrayList<Produto> listaCompra, String data, float valorTotal) {
        this.listaCompra = listaCompra;
        this.numeroCompra = CompraDAO.getInstancia().getProxNumCompra();
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public ArrayList<Produto> getListaCompra() {
        return listaCompra;
    }

    public void setListaCompra(ArrayList<Produto> listaCompra) {
        this.listaCompra = listaCompra;
    }

    public Integer getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(Integer numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public void insereProduto(Produto produto) {
        listaCompra.add(produto);
    }

    public void removeProduto(Produto produto) {
        listaCompra.remove(produto);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

}
