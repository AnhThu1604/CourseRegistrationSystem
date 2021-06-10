package controller;

import bean.DanhMuc;
import view.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;


public class ChuyenManHinhGV {
    List<DanhMuc> listDanhMuc = null;
    private JPanel rootPanel;
    private String selectedKind = "";

    public ChuyenManHinhGV(JPanel _rootPanel) {
        this.rootPanel = _rootPanel;
    }

    // hàm này dùng để set cac panel( set lai mau sac, chuyen man hinh)
    public void setView(JPanel panel, JLabel label, String kind) {
        selectedKind = kind;

        panel.setBackground(new Color(85, 65, 118));
        label.setBackground(new Color(85, 65, 118));

        rootPanel.removeAll();
        rootPanel.setLayout(new BorderLayout());
        // _rootPanel.add(new TrangChu());

        switch (kind) {
            case "jpnThongTin": {
                rootPanel.add(new ThongTinChiTietGV());
            }
            break;

            case "jpnGiaoVu": {
                rootPanel.add(new QuanLyGiaoVu());
            }
            break;

            case "jpnSinhVien": {
                rootPanel.add(new QuanLySinhVien());
            }
            break;
            case "jpnMonHoc": {
                rootPanel.add(new MonHoc());
            }
            break;
            case "jpnHocPhan": {
                rootPanel.add(new HocPhan());
            }
            break;
            case "jpnHocKi": {
                rootPanel.add(new HocKi());
            }
            break;

            case "jpnLopHoc": {
                rootPanel.add(new LopHoc());
            }
            break;

            case "jpnDKHP": {
                rootPanel.add(new KiDangKyHocPhan());
            }
            break;

            case "jpnDoiMK": {
                rootPanel.add(new DoiMatKhau());
            }
            break;

            case "DangXuat": {
            }
            break;
        }

        rootPanel.validate();
        rootPanel.repaint();
    }

    //Ham them event khi click chuot vao panel
    public void setEvent(List<DanhMuc> listDanhMuc) {
        this.listDanhMuc = listDanhMuc;
        for (DanhMuc item : listDanhMuc) {
            item.getLabel().addMouseListener(new LabelEvent(item.getKind(), item.getPanel(), item.getLabel()));
        }
    }

    private void setChangeBackground(String kind) {
        for (DanhMuc dm : listDanhMuc) {
            if (dm.getKind().equalsIgnoreCase(kind)) {
                dm.getPanel().setBackground(new Color(85, 65, 118));
                dm.getLabel().setBackground(new Color(85, 65, 118));
            } else {
                dm.getPanel().setBackground(new Color(54, 33, 89));
                dm.getLabel().setBackground(new Color(54, 33, 89));
            }
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
                }
                break;

                case "jpnSinhVien": {
                    node = new QuanLySinhVien();
                }
                break;

                case "jpnGiaoVu": {
                    node = new QuanLyGiaoVu();
                }
                break;

                case "jpnMonHoc": {
                    node = new MonHoc();
                }
                break;
                case "jpnHocPhan": {
                    node = new HocPhan();
                }
                break;

                case "jpnHocKi": {
                    node = new HocKi();
                }
                break;

                case "jpnLopHoc": {
                    node = new LopHoc();
                }
                break;

                case "jpnDKHP": {
                    node = new KiDangKyHocPhan();
                }
                break;

                case "jpnDoiMK": {
                    node = new DoiMatKhau();
                }
                break;

                case "jpnDangXuat": {
                    String[] options = {"Chắc chắn", "Huỷ"};
                    int kq = JOptionPane.showOptionDialog(null, "Bạn có chắn chắc muốn thoát khỏi hệ thống?",
                            "Nhấn vào lựa chọn của bạn", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, options, options[0]);
                    if (kq == 0) {
                        System.exit(0);
                    }
                }
                break;

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
            jpnItem.setBackground(new Color(85, 65, 118));
            jlbItem.setBackground(new Color(85, 65, 118));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(85, 65, 118));
            jlbItem.setBackground(new Color(85, 65, 118));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!selectedKind.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(54, 33, 89));
                jlbItem.setBackground(new Color(54, 33, 89));
            }
        }
    }
}
