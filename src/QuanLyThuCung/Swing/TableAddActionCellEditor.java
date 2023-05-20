package QuanLyThuCung.Swing;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;


public class TableAddActionCellEditor extends DefaultCellEditor {

    private final TableActionEvent event;

    public TableAddActionCellEditor(TableActionEvent event) {
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int row, int column) {
        AddAction action = new AddAction();
        action.initEvent(event, row);
        return action;
    }
}
