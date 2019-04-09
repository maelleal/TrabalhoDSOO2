/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.ine5612.trabalho.Entidades;


import java.util.ArrayList;

/**
 *
 * @author Ismael
 */
public class Compra {
    private ArrayList<Produto> listaCompra;
    private Integer numeroCompra;
    private int data;


    public Compra(ArrayList<Produto> listaCompra, Integer numeroCompra, int data) {
        this.listaCompra = listaCompra;
        this.numeroCompra = numeroCompra;
        this.data = data;
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
    
    public void insereProduto(Produto produto){
        listaCompra.add(produto);
    }
    
    public void removeProduto(Produto produto){
        listaCompra.remove(produto);
    }
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
