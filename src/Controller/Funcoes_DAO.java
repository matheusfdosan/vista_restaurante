package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import View.Consultar_Pedido_GUI;
import View.Efetuar_Pedido_GUI;

import static View.Efetuar_Pedido_GUI.numeros_pedidos_txt;
import static View.Efetuar_Pedido_GUI.num_mesa_txt;
import static View.Efetuar_Pedido_GUI.observacao_txt;
import static View.Efetuar_Pedido_GUI.garcom_txt;

import static View.Consultar_Pedido_GUI.id_pedido_txt;
import static View.Consultar_Pedido_GUI.numero_pedidos_txt_2;
import static View.Consultar_Pedido_GUI.obs_txt_2;
import static View.Consultar_Pedido_GUI.mesa_txt_2;
import static View.Consultar_Pedido_GUI.status_txt;
import static View.Consultar_Pedido_GUI.garcom_txt_2;
import static View.Consultar_Pedido_GUI.valorP_txt_2;
import static View.Consultar_Pedido_GUI.datetime_txt;

import static View.Comanda_GUI.id_pedido_txt_4;
import static View.Comanda_GUI.todos_pratos_painel;
import static View.Comanda_GUI.garcom_txt_3;
import static View.Comanda_GUI.mesa_txt_3;
import static View.Comanda_GUI.total_txt;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Connection;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Funcoes_DAO {

    public static String url = "jdbc:mysql://localhost/vista_restaurante"; // enderço do BD
    public static String username = "root"; //nome de um usuário de seu BD
    public static String password = "";  // senha do BD

    public static int id_pedido;
    public static String nums_pedidos;
    public static String mesa;
    public static String obs = "Sem observações";
    public static String garcom;
    public static String status;
    public static String datahora;
    public static String valorP;

    public static String buscar_precos(String nums_pedidos) {
        String precos = "";

        try {
            // Carregando o driver do MySQL
            Controller.Conecta_DAO.carregaDriver();

            // Estabelecendo a conexão
            Connection con = null;

            try {
                con = (Connection) DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                Logger.getLogger(Consultar_Pedido_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Dividindo os números de pedidos em uma lista para tratar repetições
            String[] pedidos = nums_pedidos.split(",");

            // Iterando por cada ID individualmente
            for (String id : pedidos) {
                // Modificando a consulta SQL para pegar o preço do prato
                String sql = "SELECT preco FROM menu WHERE id_prato = " + id.trim();

                // Criando e executando o comando SQL
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql);

                // Processando os resultados da consulta
                while (rs.next()) {
                    if (!precos.isEmpty()) {
                        precos += ","; // Separando os preços com vírgula
                    }
                    precos += rs.getString("preco"); // Adicionando o preço
                }
            }

            // Fechando a conexão
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar preços: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return precos;
    }

    public static String buscar_nomes_pedidos(String nums_pedidos) {
        String nomes = "";

        try {
            // Carregando o driver do MySQL
            Controller.Conecta_DAO.carregaDriver();

            // Estabelecendo a conexão
            Connection con = null;

            try {
                con = (Connection) DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                Logger.getLogger(Consultar_Pedido_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Dividindo os números de pedidos em uma lista para tratar repetições
            String[] pedidos = nums_pedidos.split(",");

            // Iterando por cada ID individualmente
            for (String id : pedidos) {
                // Modificando a consulta SQL para pegar os nomes dos pratos
                String sql = "SELECT nome_prato FROM menu WHERE id_prato = " + id.trim();

                // Criando e executando o comando SQL
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql);

                // Processando os resultados da consulta
                while (rs.next()) {
                    if (!nomes.isEmpty()) {
                        nomes += "\n\r"; // Separando os nomes com uma quebra de linha
                    }
                    nomes += rs.getString("nome_prato"); // Adicionando o nome do prato
                }
            }

            // Fechando a conexão
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar nomes dos pratos: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return nomes;
    }

    public static String calcula_total(String precos) {
        double total = 0.0;

        try {
            // Removendo espaços extras e dividindo a string em valores individuais
            String[] valores = precos.trim().split(",");

            // Somando os valores
            for (String valor : valores) {
                total += Double.parseDouble(valor.trim());
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular o total: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return "Erro ao calcular";
        }

        // Retornando o total formatado como "R$" seguido do resultado
        return "R$" + String.format("%.2f", total);
    }

    public static void efetuar_pedido() {
        // Inicio
        nums_pedidos = numeros_pedidos_txt.getText();
        mesa = num_mesa_txt.getText();
        obs = observacao_txt.getText();
        garcom = garcom_txt.getText();
        valorP = buscar_precos(nums_pedidos);
        status = "Em Preparo";

        Controller.Conecta_DAO.carregaDriver();

        try {
            Connection con = null;

            try {
                con = (Connection) DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                Logger.getLogger(Efetuar_Pedido_GUI.class.getName()).log(Level.SEVERE, null, ex);

            }

            // Recebendo os dados a serem inseridos na tabela
            String sql = "INSERT INTO pedido(mesa, numeros_pedidos, observacao, data_hora, garcom, status,preco_prat) values('" + mesa + "','" + nums_pedidos + "','" + obs + "', now(),'" + garcom + "','" + status + "','" + valorP + "')";

            try { // Tratamento de Erros para inserção

                // Criando varialvel que executara a inserção
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql); // Inserir comando no MySQL
                inserir.execute(); // Executando a inserção

                JOptionPane.showMessageDialog(null, "\nInserção realizada com sucesso!!!\n", "SUCESS", -1);
                numeros_pedidos_txt.setText("");
                num_mesa_txt.setText("");
                observacao_txt.setText("");
                garcom_txt.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "\nErro na inserção!", "ERRO!", 0);
            }

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente", "ERRO", 0);
        }

        // Fim
    }

    public static void consultar_pedido() {
        // inicio
        try {     //Iniciando o possivel tratamento de erros
            //Declarando a variavel código

            int codigo = Integer.valueOf(id_pedido_txt.getText());

            Controller.Conecta_DAO.carregaDriver(); // Carregando o driver

            try {// Tratamento de erro para a conexao
                // Declarando  a variavel de conexão con
                // e estabelendo a conexão

                Connection con = null;

                try {
                    con = (Connection) DriverManager.getConnection(url, username, password);
                } catch (SQLException ex) {
                    Logger.getLogger(Consultar_Pedido_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Declarando uma string com o comando mySQL para consulta
                String sql = "SELECT numeros_pedidos, observacao, garcom, status, data_hora, mesa,preco_prat FROM pedido where id_pedido = " + codigo;

                // Criando variavel que executara o comando da string sql
                Statement stm = (Statement) con.createStatement();

                try//Tratamento de erro da consulta
                { //Criando variavel que exibira os resultados
                    //Executando o comando da string sql na variavel rs
                    ResultSet rs = stm.executeQuery(sql);

                    int i = 0; // Variavel utilizada para saber se ha dados cadastrados

                    while (rs.next()) {  // Criando variaveis que receberão os valores do banco de dados
                        String n_pedidos = rs.getString("numeros_pedidos");
                        String obs = rs.getString("observacao");
                        String mesa = rs.getString("mesa");
                        String status = rs.getString("status");
                        String datetime = rs.getString("data_hora");
                        String garcom = rs.getString("garcom");
                        String precos = rs.getString("preco_prat");

                        i++;

                        //JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nEmail: " +telefone + "\nTelefone: " +telefone, "Resultado",-1);
                        numero_pedidos_txt_2.setText(String.valueOf(n_pedidos));
                        obs_txt_2.setText(String.valueOf(obs));
                        mesa_txt_2.setText(String.valueOf(mesa));
                        status_txt.setText(String.valueOf(status));
                        datetime_txt.setText(String.valueOf(datetime));
                        garcom_txt_2.setText(String.valueOf(garcom));
                        valorP_txt_2.setText(String.valueOf(precos));

                    }

                    if (i == 0) { // Verificando se ha dados cadastrados atraves da variavel i

                        JOptionPane.showMessageDialog(null, "Dado não cadastrado", "Resultado", -1);

                    }

                } catch (Exception ex) { // Consulta mal sucedida
                    JOptionPane.showMessageDialog(null, "\nErro ao consultar!", "ERRO", 0);
                }

            } catch (SQLException ex) {
                // Conexão com servidor mal sucedida
                JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor", "ERRO!", 0);
            }

        } catch (NumberFormatException erro) {
            // Código fora do formato
            JOptionPane.showMessageDialog(null, "Digite o código corretamante", "ERRO", 0);
            id_pedido_txt.setText("");
        }
        //fim
    }

    public static void atualizar_pedido() {
        // Inicio

        nums_pedidos = numero_pedidos_txt_2.getText(); // recebendo o nome
        obs = obs_txt_2.getText(); // recebendo o email         
        mesa = mesa_txt_2.getText();
        status = status_txt.getText();
        garcom = garcom_txt_2.getText();
        valorP = buscar_precos(nums_pedidos);
        datahora = datetime_txt.getText();
        int codigo = Integer.valueOf(id_pedido_txt.getText());

        Controller.Conecta_DAO.carregaDriver(); // Carregando o driver

        try {
            Connection con = null;
            try {
                con = (Connection) DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                Logger.getLogger(Consultar_Pedido_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "UPDATE pedido SET numeros_pedidos='" + nums_pedidos + "',mesa='" + mesa + "',status='" + status + "',observacao='" + obs + "',garcom='" + garcom + "',preco_prat='" + valorP + "',data_hora='" + datahora + "' WHERE id_pedido=" + codigo;

            try {
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção

                JOptionPane.showMessageDialog(null, "\nInserção realizada com sucesso!!!\n", "", -1);
                System.out.print(url);
                obs_txt_2.setText("");
                mesa_txt_2.setText("");
                status_txt.setText("");
                datetime_txt.setText("");
                garcom_txt_2.setText("");
                valorP_txt_2.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "\nErro na inserção!", "ERRO!", 0);
            }

        } catch (NumberFormatException e) {
            // Tratamento de erro caso o usuario não digite o telefone corretamente
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente", "ERRO", 0);
        }

        // Fim
    }

    public static void finalizar_pedido(String id) {
        // Inicio
        try { // Iniciando o possível tratamento de erros
            int codigo = Integer.valueOf(id);
            Controller.Conecta_DAO.carregaDriver(); // Carregando o driver

            try { // Tratamento de erro para a conexão
                Connection con = null;

                try {
                    con = (Connection) DriverManager.getConnection(url, username, password);
                } catch (SQLException ex) {
                    Logger.getLogger(Consultar_Pedido_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Alterando a consulta SQL para pegar os nomes dos pratos
                String sql = "SELECT numeros_pedidos, observacao, garcom, status, data_hora, mesa,preco_prat FROM pedido where id_pedido = " + codigo;

                // Criando variável que executará o comando da string SQL
                Statement stm = (Statement) con.createStatement();

                try { // Tratamento de erro da consulta

                    ResultSet rs = stm.executeQuery(sql);

                    int i = 0; // Variável utilizada para saber se há dados cadastrados     

                    while (rs.next()) {  // Criando variaveis que receberão os valores do banco de dados
                        String n_pedidos = rs.getString("numeros_pedidos");
                        String obs = rs.getString("observacao");
                        String mesa = rs.getString("mesa");
                        String status = rs.getString("status");
                        String datetime = rs.getString("data_hora");
                        String garcom = rs.getString("garcom");
                        String precos = rs.getString("preco_prat");

                        i++;

                        id_pedido_txt_4.setText(String.valueOf(codigo));
                        todos_pratos_painel.setText(buscar_nomes_pedidos(n_pedidos));
                        total_txt.setText(String.valueOf(calcula_total(buscar_precos(n_pedidos))));
                        mesa_txt_3.setText(String.valueOf(mesa));
                        garcom_txt_3.setText(String.valueOf(garcom));

                    }

                    if (i == 0) { // Verificando se há dados cadastrados
                        JOptionPane.showMessageDialog(null, "Nenhum prato encontrado para este pedido", "Resultado", -1);
                    }

                } catch (Exception ex) { // Consulta mal sucedida
                    JOptionPane.showMessageDialog(null, "\nErro ao consultar!", "ERRO", 0);
                }

            } catch (SQLException ex) {
                // Conexão com servidor mal sucedida
                JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor", "ERRO!", 0);
            }

        } catch (NumberFormatException erro) {
            // Código fora do formato
            JOptionPane.showMessageDialog(null, "Digite o código corretamente", "ERRO", 0);
            id_pedido_txt.setText("");
        }
        // Fim
    }

    public static void criar_comanda_pdf() {
        // inicio
        try { // Iniciando o possível tratamento de erros
            Integer id = Integer.valueOf(id_pedido_txt_4.getText());
            int codigo = Integer.valueOf(id);
            Controller.Conecta_DAO.carregaDriver(); // Carregando o driver

            try { // Tratamento de erro para a conexão
                Connection con = null;

                try {
                    con = (Connection) DriverManager.getConnection(url, username, password);
                } catch (SQLException ex) {
                    Logger.getLogger(Consultar_Pedido_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Alterando a consulta SQL para pegar os nomes dos pratos
                String sql = "SELECT numeros_pedidos, observacao, garcom, status, data_hora, mesa,preco_prat FROM pedido where id_pedido = " + codigo;

                // Criando variável que executará o comando da string SQL
                Statement stm = (Statement) con.createStatement();

                try { // Tratamento de erro da consulta

                    ResultSet rs = stm.executeQuery(sql);

                    int i = 0; // Variável utilizada para saber se há dados cadastrados     

                    while (rs.next()) {  // Criando variaveis que receberão os valores do banco de dados
                        String n_pedidos = rs.getString("numeros_pedidos");
                        String obs = rs.getString("observacao");
                        String mesa = rs.getString("mesa");
                        String status = rs.getString("status");
                        String datetime = rs.getString("data_hora");
                        String garcom = rs.getString("garcom");
                        String precos = rs.getString("preco_prat");

                        i++;

                        String nomes_P = buscar_nomes_pedidos(n_pedidos);
                        String precos_P = buscar_precos(n_pedidos);
                        String total = calcula_total(precos);

                        Controller.Comanda_DAO.Relatorio(n_pedidos, nomes_P, precos_P, total);
                        
                        
                    }

                    if (i == 0) { // Verificando se há dados cadastrados
                        JOptionPane.showMessageDialog(null, "Nenhum prato encontrado para este pedido", "Resultado", -1);
                    }

                } catch (Exception ex) { // Consulta mal sucedida
                    JOptionPane.showMessageDialog(null, "\nErro ao consultar!", "ERRO", 0);
                }

            } catch (SQLException ex) {
                // Conexão com servidor mal sucedida
                JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor", "ERRO!", 0);
            }

        } catch (NumberFormatException erro) {
            // Código fora do formato
            JOptionPane.showMessageDialog(null, "Digite o código corretamente", "ERRO", 0);
            id_pedido_txt.setText("");
        }
        // fim

    }
    
    public static void abrir_arquivo_de_ajuda() throws IOException {
        Desktop.getDesktop().open(new File("C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Vista_Restaurante\\src\\help\\index.html"));
    } 
}
