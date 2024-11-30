package Controller;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabio
 */
public class Comanda_DAO {

    public static void Relatorio(String n_pedidos, String nomes_P, String precos_P, String total) throws Exception {

        //inicio
        Document doc = null;
        OutputStream os = null;

        try {
            // Cria o documento tamanho A4 com margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);

            // Cria a stream de saída
            os = new FileOutputStream("Comanda.pdf");

            // Associa a stream de saída ao documento
            PdfWriter.getInstance(doc, os);

            // Abre o documento
            doc.open();

            // Título do documento
            Font tituloFont = new Font(Font.FontFamily.TIMES_ROMAN, 22, Font.BOLD);
            Paragraph titulo = new Paragraph("Vista Restaurante\n\n", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            doc.add(titulo);

            // Cabeçalho da comanda
            Font headerFont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
            Paragraph header = new Paragraph("Comanda\n", headerFont);
            header.setAlignment(Element.ALIGN_CENTER);
            doc.add(header);

            // Detalhes da comanda
            Font textFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL);
            doc.add(new Paragraph("Número dos Pratos: " + n_pedidos + "\n", textFont));
            doc.add(new Paragraph("Itens Consumidos:\n", textFont));

            // Lista os itens consumidos
            String[] nomesArray = nomes_P.split("\n\r");
            String[] precosArray = precos_P.split(",");
            for (int i = 0; i < nomesArray.length; i++) {
                String item = nomesArray[i].trim();
                String preco = (i < precosArray.length) ? precosArray[i].trim() : "N/A";
                doc.add(new Paragraph("- " + item + " (" + preco + ")", textFont));
            }

            // Espaço
            doc.add(new Paragraph("\n"));

            // Total
            Font totalFont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
            Paragraph totalPar = new Paragraph("Valor Total: " + total + "\n", totalFont);
            totalPar.setAlignment(Element.ALIGN_RIGHT);
            doc.add(totalPar);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (doc != null) {
                // Fechamento do documento
                doc.close();
            }
            if (os != null) {
                try {
                    // Fechamento da stream de saída
                    os.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        // Abre o PDF gerado
        try {
            Desktop.getDesktop().open(new File("Comanda.pdf"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //fim

    }

    static void Relatorio(String n_pedidos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}