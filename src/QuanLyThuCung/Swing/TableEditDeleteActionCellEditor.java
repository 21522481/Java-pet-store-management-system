package QuanLyThuCung.Swing;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;


public class TableEditDeleteActionCellEditor extends DefaultCellEditor {
    private TableActionEvent event;

    public TableEditDeleteActionCellEditor(TableActionEvent event) {
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int row, int column) {
        EditDeleteAction action = new EditDeleteAction();
        action.initEvent(event, row);
        return action;
    }
}
