/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.ine5612.trabalho.Entidades;

import java.util.ArrayList;

/**
 *
 * @author Pedro Paulo
 */
public class Senha {
    private String nome;
    private String senha ;

    public Senha() {
        this.nome = "Administrador";
        this.senha = "admin@ufsc";
    }
    
    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

}
