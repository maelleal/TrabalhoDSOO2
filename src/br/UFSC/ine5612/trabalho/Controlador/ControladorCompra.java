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
import br.UFSC.ine5612.trabalho.Telas.TelaCupom;
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
        ControladorProduto.getInstancia().criaProduto("Picanha", 11, 20);
        ControladorProduto.getInstancia().criaProduto("Fandangos", 12, 3.50f);
        ControladorProduto.getInstancia().criaProduto("Doritos", 13, 3.50f);
        ControladorProduto.getInstancia().criaProduto("Pipoca", 14, 2);
        ControladorProduto.getInstancia().criaProduto("Lentilha", 15, 2.5f);
        ControladorProduto.getInstancia().criaProduto("Papel Higiênico", 16, 5);
        ControladorProduto.getInstancia().criaProduto("Pêra", 17, 1);
        ControladorProduto.getInstancia().criaProduto("Uva", 18, 0.95f);
        ControladorProduto.getInstancia().criaProduto("Abacaxi", 19, 1);
        ControladorProduto.getInstancia().criaProduto("Pote Plastico", 20, 2.5f);
        ControladorProduto.getInstancia().criaProduto("Cigarro Gudang", 21, 23);
        ControladorProduto.getInstancia().criaProduto("Halls", 22, 2);
        ControladorProduto.getInstancia().criaProduto("Trindent", 23, 2);
        ControladorProduto.getInstancia().criaProduto("Cerveja Heineken", 24, 3.50f);
        ControladorProduto.getInstancia().criaProduto("Pão Françês", 25, 4);
        ControladorProduto.getInstancia().criaProduto("Miojo Nissin", 26, 0.70f);
        ControladorProduto.getInstancia().criaProduto("Refrigerante Coca-Cola", 27, 8);
        ControladorProduto.getInstancia().criaProduto("Arroz Kiarroz 5KG", 28, 6.75f);
        ControladorProduto.getInstancia().criaProduto("Amaciante Ype", 29, 5);
        ControladorProduto.getInstancia().criaProduto("Cerveja Schin", 30, 1.80f);
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
    private float totalCompra(){
        float total = 0;
        for(Produto p : listProdutos){
            total += p.getPreco();
        }
        return total;
    }
    public void finalizaCompra() {
        Compra c = new Compra(listProdutos, getDate(), totalCompra());
        CompraDAO.getInstancia().put(c);
        TelaCompra.getInstancia().limpaTela();
        TelaCupom.getInstancia().setTabela(listProdutos);
        listProdutos.clear();
    }

    public float showBalanco(String data) {
        float total = 0;
        for(Compra c : CompraDAO.getInstancia().getList()){
            if(c.getData().equals(data)){
                //qtd++;
                total += c.getValorTotal();
            }
        }
        return total;  
    }

}
