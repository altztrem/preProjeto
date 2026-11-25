package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class EstiloTabela {
    public static void estilizarBotao(JTable tabela, int coluna) {
        tabela.getColumnModel().getColumn(coluna).setCellRenderer(new TableCellRenderer() {
            private final JButton botao = new JButton();

            @Override
            public Component getTableCellRendererComponent(JTable tabela, Object valor,
                    boolean selecionado, boolean foco, int linha, int coluna) {
                botao.setText(valor == null ? "" : valor.toString());
                botao.setBackground(new Color(0, 120, 231));
                botao.setForeground(Color.WHITE);
                botao.setFont(new Font("Segoe UI", Font.BOLD, 12));
                botao.setFocusPainted(false);
                return botao;
            }
        });
    }
}
