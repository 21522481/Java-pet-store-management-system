package QuanLyThuCung.Swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableEditDeleteActionCellRender extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSeleted, boolean bln1, int row, int column) {
        Component com = super.getTableCellRendererComponent(jtable, o, isSeleted, bln1, row, column);
        EditDeleteAction action = new EditDeleteAction();
        if (isSeleted == true) {
            if (row % 2 == 0) {
                action.setBackground(new Color(245, 245, 245));
            } else {
                action.setBackground(new Color(129,203,156, 100));
            }
        } else {
            if (row % 2 == 0) {
                action.setBackground(new Color(255, 255, 255));
            } else {
                action.setBackground(new Color(129,203,156, 60));
            }
        }
        return action;
    }
}
