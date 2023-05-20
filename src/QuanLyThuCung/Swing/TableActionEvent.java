package QuanLyThuCung.Swing;

public interface TableActionEvent {
    public void onAdd(int row);
    public void onEdit(int row);
    public void onDelete(int row);
}
