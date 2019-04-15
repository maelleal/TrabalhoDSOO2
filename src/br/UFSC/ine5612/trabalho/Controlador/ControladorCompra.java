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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ismael
 */
public class ControladorCompra implements Serializable {

    private static ControladorCompra instancia;
    private Integer numeroCompra = 1;
    ArrayList<Produto> listProdutos = new ArrayList();

    public static ControladorCompra getInstancia() {
        if (instancia == null) {
            instancia = new ControladorCompra();
        }
        return instancia;
    }

    private ControladorCompra(){

    }

    public void showTelaCompra() {
        TelaCompra.getInstancia().setVisible(true);
    }

    public void showTelaSenha() {
        TelaSenha.getInstancia().setVisible(true);
    }

    public void showTelaInicial() {
        TelaInicial.getInstancia().setVisible(true);
    }

    public void showTelaDataBalanco() {
        TelaDataBalanco.getInstancia().setVisible(true);
    }

    public ArrayList<Produto> verificaProduto(String numero) {
        try {
            int codProduto = Integer.valueOf(numero);
            Produto produtoAchado = ControladorProduto.getInstancia().findProdutoByCodigo(codProduto);

            if (produtoAchado == null) {
                JOptionPane.showMessageDialog(null, "Não há nenhum item com o código " + codProduto + "", "Código inválido", JOptionPane.ERROR_MESSAGE);
            } else {
                listProdutos.add(produtoAchado);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Esse campo só aceita numero de 0-9, tente novamente!", "Código inválido", JOptionPane.ERROR_MESSAGE);
        }
        return listProdutos;
    }

    public void showTelaBalanco(String data) {
        int numCompras = 0;
        float valorTotal = 0;
        for (Compra compra : CompraDAO.getInstancia().getList()) {
            if (compra.getData().equals(data)) {
                numCompras++;
                valorTotal = valorTotal + compra.getValorTotal();
            }
        }
        if (numCompras == 0) {
            JOptionPane.showMessageDialog(null, "Não há nenhuma compra nessa data", "Data inválida", JOptionPane.DEFAULT_OPTION);
        } else {
            TelaBalanco.getInstancia().setDadosBalanco(numCompras, valorTotal);
            TelaBalanco.getInstancia().setVisible(true);
        }
    }

    public ArrayList<Produto> removeProduto(int codProduto) {
        for (Produto p : listProdutos) {
            if (p.getCodProduto() == codProduto) {
                listProdutos.remove(p);
                return listProdutos;
            }
        }
        return listProdutos;
    }

    public void cancelarCompra() {
        listProdutos.clear();
        TelaCompra.getInstancia().setVisible(false);
        showTelaInicial();
    }

    public int getTamanhoLista() {
        return listProdutos.size();
    }

    private String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void finalizaCompra(String valor) {
        valor = valor.replace(",", ".");
        valor = valor.replace("R", "");
        valor = valor.replace("$", "");
        valor = valor.replace(" ", "");
        valor = valor.replace("=", "");
        float valorTotal = Float.parseFloat(valor);
        Compra c = new Compra(listProdutos, getDate(), valorTotal);
        CompraDAO.getInstancia().put(c);
        System.out.println(c.getData());
        System.out.println(c.getListaCompra());
        System.out.println(c.getNumeroCompra());
        System.out.println(c.getValorTotal());
    }

}
