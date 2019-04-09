/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.ine5612.trabalho.Entidades;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Ismael
 */
public class ProdutoDAO {
    private static ProdutoDAO instancia;
    private HashMap<Integer, Produto> cacheProdutos = new HashMap<>();
    private final String arquivoProdutos = "produtos.dat";
    
    private ProdutoDAO (){
        load();
    }
    
    public Produto get(Integer codProduto){
        return cacheProdutos.get(codProduto);
    }
    
    public void put(Produto produto){
        cacheProdutos.put(produto.getCodProduto(), produto);
        this.persist();
    }
    
    public void remove(Integer codProduto){
	cacheProdutos.remove(codProduto);
	persist();
    }
    
    public void persist(){
        try{
           FileOutputStream fout = new FileOutputStream(arquivoProdutos);
           ObjectOutputStream oo = new ObjectOutputStream(fout);
           oo.writeObject(cacheProdutos);
           
           oo.flush();
           fout.flush();
            
           oo.close();
           fout.close();
           
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            persist();
        }catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void load () {
        try {
            FileInputStream fin = new FileInputStream(arquivoProdutos);
            ObjectInputStream oi = new ObjectInputStream(fin);
        
            this.cacheProdutos = (HashMap<Integer, Produto>) oi.readObject();
            
            oi.close();
            fin.close();
        
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            persist();
        
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public static ProdutoDAO getInstancia(){
        if(instancia == null){
            instancia = new ProdutoDAO();
        }
        return instancia;
    }
    
    public Collection<Produto> getList(){
	return cacheProdutos.values();
    }
}
