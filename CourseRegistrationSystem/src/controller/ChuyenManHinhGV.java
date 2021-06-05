
package controller;


import view.*;
import bean.DanhMuc;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ChuyenManHinhGV {
     private JPanel rootPanel;
    private String selectedKind = "";
    List<DanhMuc> listDanhMuc = null;

    public ChuyenManHinhGV(JPanel _rootPanel) {
        this.rootPanel = _rootPanel;
    }

    // hàm này dùng để set các tab mặc đGVịnh cho 1 panel/frame
    // cách làm việc: đổi màu tab mặc định và hiển thị nội dung tab đó
    // truyền vào panel chứa cái tab đó và nhãn trong cái panel và kind of tab 
    public void setView(JPanel panel, JLabel label, String kind) {
        selectedKind = kind;

        panel.setBackground(new Color(85,65,118));
        label.setBackground(new Color(85,65,118));

        rootPanel.removeAll();
        rootPanel.setLayout(new BorderLayout());
        // _rootPanel.add(new TrangChu());

        switch (kind) {
            case "jpnThongTin": {
                rootPanel.add(new ThongTinChiTietGV());
            } break;

            case "jpnGiaoVu": {
                rootPanel.add(new QuanLyGiaoVu());
            } break;

            case "jpnSinhVien": {
                rootPanel.add(new QuanLySinhVien());
            } break;
            case "jpnMonHoc": {
                rootPanel.add(new MonHoc());
            } break;
            case "jpnHocKi": {
                rootPanel.add(new HocKi());
            } break;

            case "jpnLopHoc": {
                rootPanel.add(new LopHoc());
            } break;

           case "jpnDoiMK": {
               rootPanel.add(new DoiMatKhau());
           } break;

           // case "DangXuat": {
           //     _rootPanel.add(new DangKyMonHoc());
           // } break;

        
        }

        rootPanel.validate();
        rootPanel.repaint();
    }

    // add event cho các item trong _listDanhMuc 
    public void setEvent(List<DanhMuc> listDanhMuc) {
        this.listDanhMuc = listDanhMuc;
        for (DanhMuc item : listDanhMuc) {
            item.getLabel().addMouseListener(new LabelEvent(item.getKind(), item.getPanel(), item.getLabel()));
        }
    }

    class LabelEvent implements MouseListener {

        private JPanel node;
        private String kind;

        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "jpnThongTin": {
                    node = new ThongTinChiTietGV();
                } break;

                case "jpnSinhVien": {
                    node = new QuanLySinhVien();
                } break;

                case "jpnGiaoVu": {
                    node = new QuanLyGiaoVu();
                } break;

                case "jpnMonHoc": {
                    node = new MonHoc();
                } break;

                case "jpnHocKi": {
                    node = new HocKi();
                } break;

                case "jpnLopHoc": {
                    node = new LopHoc();
                } break;

                case "jpnDoiMK": {
                    node = new DoiMatKhau();
                } break;
         
            }
            rootPanel.removeAll();
            rootPanel.setLayout(new BorderLayout());
            rootPanel.add(node);
            rootPanel.validate();
            rootPanel.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            selectedKind = kind;
            jpnItem.setBackground(new Color(85,65,118));
            jlbItem.setBackground(new Color(85,65,118));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(85,65,118));
            jlbItem.setBackground(new Color(85,65,118));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!selectedKind.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(54, 33, 89));
                jlbItem.setBackground(new Color(54, 33, 89));
            }
        }
    }


    private void setChangeBackground(String kind) {
        for (DanhMuc dm: listDanhMuc) {
            if (dm.getKind().equalsIgnoreCase(kind)) {
                dm.getPanel().setBackground(new Color(85,65,118));
                dm.getLabel().setBackground(new Color(85,65,118));
            }
            else {
                dm.getPanel().setBackground(new Color(54, 33, 89));
                dm.getLabel().setBackground(new Color(54, 33, 89));
            }
        }
    }
}
