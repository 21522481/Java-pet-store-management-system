package QuanLyThuCung.Swing;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;


public class TableDeleteActionCellEditor extends DefaultCellEditor {

    private TableActionEvent event;

    public TableDeleteActionCellEditor(TableActionEvent event) {
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int row, int column) {
        DeleteAction action = new DeleteAction();
        action.initEvent(event, row);
        return action;
    }
}
