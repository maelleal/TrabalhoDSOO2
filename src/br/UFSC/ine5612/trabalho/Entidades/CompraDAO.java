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
public class CompraDAO {
    private static CompraDAO instancia;
    private HashMap<Integer, Compra> cacheCompras = new HashMap<>();
    private final String arquivoCompras = "compras.dat";
    
    private CompraDAO (){
        load();
    }
    
    public Compra get(Integer numeroCompra){
        return cacheCompras.get(numeroCompra);
    }
    
    public void put(Compra compra){
        cacheCompras.put(compra.getNumeroCompra(), compra);
        this.persist();
    }
    
    public void remove(Integer numeroCompra){
	cacheCompras.remove(numeroCompra);
	persist();
    }
    
    public void persist(){
        try{
           FileOutputStream fout = new FileOutputStream(arquivoCompras);
           ObjectOutputStream oo = new ObjectOutputStream(fout);
           oo.writeObject(cacheCompras);
           
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
            FileInputStream fin = new FileInputStream(arquivoCompras);
            ObjectInputStream oi = new ObjectInputStream(fin);
        
            this.cacheCompras = (HashMap<Integer, Compra>) oi.readObject();
            
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
    
    public static CompraDAO getInstancia(){
        if(instancia == null){
            instancia = new CompraDAO();
        }
        return instancia;
    }
    
    public Collection<Compra> getList(){
	return cacheCompras.values();
    }
}
