/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.ine5612.trabalho.Controlador;

import br.UFSC.ine5612.trabalho.Entidades.Senha;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Paulo
 */
public class ControladorSenha implements Serializable {

    private static ControladorSenha instancia;

    public static ControladorSenha getInstancia() {
        if (instancia == null) {
            instancia = new ControladorSenha();
        }
        return instancia;
    }

    public boolean verificaSenha(String senha) {
        boolean senhaValida = false;
        Senha s = new Senha();
        if (s.getSenha().equals(senha)) {
            senhaValida = true;
        } else {
            JOptionPane.showMessageDialog(null, "Senha inserida incorretamente, tente novamente!", "Aviso de Senha", JOptionPane.ERROR_MESSAGE);
        }
        return senhaValida;
    }

}
