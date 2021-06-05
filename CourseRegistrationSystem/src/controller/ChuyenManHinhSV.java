
package controller;

import bean.DanhMuc;
import view.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;

public class ChuyenManHinhSV {
    private JPanel rootPanel;
    private String selectedKind = "";
    List<DanhMuc> listDanhMuc = null;

    public ChuyenManHinhSV(JPanel _rootPanel) {
        this.rootPanel = _rootPanel;
    }

    // hàm này dùng để set các tab mặc định cho 1 panel/frame
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
                rootPanel.add(new ThongTinChiTietSV());
            } break;

            case "jpnDangKi": {
                rootPanel.add(new DangKyHocPhan());
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
                    node = new ThongTinChiTietSV();
                } break;

                case "jpnDangKi": {
                    node = new DangKyHocPhan();
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

