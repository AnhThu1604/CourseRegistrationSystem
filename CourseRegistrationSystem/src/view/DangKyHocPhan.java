package view;

import dao.HocKiDAO;
import dao.HocPhanDAO;
import dao.PhieuDKDAO;
import dao.SinhVienDAO;
import pojo.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DangKyHocPhan extends javax.swing.JPanel {

    //Lay ra thong tin sinh vien dang dang nhap vao he thong
    private SinhvienEntity sinhVien = SinhVienDAO.getThongTinSV(DangNhap.getUsername());

    private javax.swing.JButton btnDangKi;
    private javax.swing.JButton btnHuy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;

    public DangKyHocPhan() {
        initComponents();
        loadDanhSachHP();
        loadTKB();
    }

    //Ham lay ra danh sach cac vi tri duoc tich o phan dang ki
    private ArrayList getViTri1() {
        ArrayList<Integer> vitri = new ArrayList<>();
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (jTable1.getValueAt(i, 7).equals(true)) {
                vitri.add(i);
            }
        }
        return vitri;
    }

    //Ham lay ra danh sach cac vi tri duoc tich o phan huy hoc phan
    private ArrayList getViTri2() {
        ArrayList<Integer> vitri = new ArrayList<>();
        for (int i = 0; i < jTable2.getRowCount(); i++) {
            if (jTable2.getValueAt(i, 4).equals(true)) {
                vitri.add(i);
            }
        }
        return vitri;
    }

    //Ham kiem tra so luong mon (khong vuot qua 8 mon)
    //return 0: vuot qua 8
    private int checkSoLuong() {
        if (getViTri1().size() >= 9)
            return 0;
        else
            return 1;
    }

    //Ham kiem tra trung mon (khong duoc dang ki hai hoc phan cung mot mon)
    //return 0: co hai hoc phan cung mon
    private int checkTrungMon() {
        ArrayList<Integer> vitri = getViTri1();
        String tenMon1;
        String tenMon2;
        for (int i = 0; i < vitri.size(); i++) {
            tenMon1 = jTable1.getValueAt(vitri.get(i), 0).toString();
            for (int j = i + 1; j < vitri.size(); j++) {
                tenMon2 = jTable1.getValueAt(vitri.get(j), 0).toString();
                if (tenMon1.compareTo(tenMon2) == 0) {
                    return 0;
                }
            }

        }
        return 1;
    }

    //Ham kiem tra trung thoi gian hoc
    //return 0: co hai hoc phan cung ngay hoc va trung ca hoc
    private int checkTrungGio() {
        ArrayList<Integer> vitri = getViTri1();
        for (int i = 0; i < vitri.size(); i++) {
            for (int j = i + 1; j < vitri.size(); j++) {
                if (jTable1.getValueAt(vitri.get(i), 4) == jTable1.getValueAt(vitri.get(j), 4)) {
                    if (jTable1.getValueAt(vitri.get(i), 5) == jTable1.getValueAt(vitri.get(j), 5)) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }

    //Ham kiem tra thoi gian dang ki
    //return 0: het thoi gian dang ki
    private int checkThoiGianDK() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date tgHienTai = null;
        try {
            tgHienTai = format.parse(LocalDate.now().toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        HockiEntity hocKiHT = HocKiDAO.getThongTinHKHT();
        Iterator<DangkiHpEntity> thoiGian = hocKiHT.getDks().iterator();
        while (thoiGian.hasNext()) {
            DangkiHpEntity tgDangKi = thoiGian.next();
            if (tgDangKi.getNgayBatDau().compareTo(tgHienTai) <= 0 && tgDangKi.getNgayKetThuc().compareTo(tgHienTai) >= 0) {
                return 1;
            }
        }
        return 0;
    }

    //Ham kiem tra cac mon da dang ki voi cac mon dang thuc hien dang ki
    //return 0: hop le
    //return 1: vuot qua so luong 8 mon
    //return 2: trung mon
    //return 3: trung thoi gian hoc
    private int checkMonHocDaDangKi() {
        //Kiem tra danh sach mon dang dang ki
        if (checkSoLuong() == 0)
            return 1;
        if (checkTrungMon() == 0)
            return 2;
        if (checkTrungGio() == 0)
            return 3;
        Iterator<PhieuDkEntity> list = sinhVien.getPhieus().iterator();

        //Kiem tra danh sach mon da dang ki
        //Neu danh sach co phan tu
        if (list != null) {
            List<Integer> vitri = getViTri1();
            int soLuong = vitri.size();
            while (list.hasNext()) {
                PhieuDkEntity phieuDK = list.next();
                for (int i = 0; i < vitri.size(); i++) {
                    //Kiem tra trung mon
                    if (jTable1.getValueAt(vitri.get(i), 0).toString().
                            compareTo(phieuDK.getHocPhan().getMonHoc().getTenMonHoc()) == 0) {
                        return 2;
                    } else {
                        //Kiem tra trung gio
                        if (jTable1.getValueAt(vitri.get(i), 4) == phieuDK.getHocPhan().getNgayHoc()) {
                            if (jTable1.getValueAt(vitri.get(i), 5) == phieuDK.getHocPhan().getCaHoc()) {
                                return 3;
                            }
                        }
                    }
                }
                soLuong++;
                //Kiem tra so luong
                if (soLuong >= 9) {
                    return 1;
                }
            }
        } else {
            return 0;
        }
        return 0;
    }

    //Ham load danh sach hoc phan dang mo
    private void loadDanhSachHP() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        HockiEntity hocKi = HocKiDAO.getThongTinHKHT();
        if (hocKi != null) {
            Iterator<MonhocEntity> list = hocKi.getMons().iterator();
            while (list.hasNext()) {
                MonhocEntity monHoc = list.next();
                Iterator<HocphanEntity> listHP = monHoc.getHocphans().iterator();
                while (listHP.hasNext()) {
                    HocphanEntity hocPhan = listHP.next();
                    dtm.addRow(new Object[]{hocPhan.getMonHoc().getTenMonHoc(),
                            hocPhan.getMaHocPhan(), hocPhan.getMonHoc().getSoTinChi(),
                            hocPhan.getGiaoVien(), hocPhan.getNgayHoc(), hocPhan.getCaHoc(),
                            hocPhan.getTenPhongHoc(), false});
                }
            }
        }
    }


    //Ham load danh sach cac mon hoc sinh vien da dang ki
    private void loadTKB() {
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.setRowCount(0);
        Iterator<PhieuDkEntity> list = sinhVien.getPhieus().iterator();
        while (list.hasNext()) {
            PhieuDkEntity hocPhan = list.next();
            dtm.addRow(new Object[]{hocPhan.getHocPhan().getNgayHoc(), hocPhan.getHocPhan().getCaHoc(),
                    hocPhan.getHocPhan().getMonHoc().getTenMonHoc(), hocPhan.getHocPhan().getTenPhongHoc(), false});
        }
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnDangKi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnHuy = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                        "Tên môn", "Mã học phần", "Số tín chỉ", "Giáo viên", "Thứ", "Ca", "Phòng", "Đăng kí"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class,
                    java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                Class type = types[columnIndex];
                return type;
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });


        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Danh sách học phần ");

        btnDangKi.setText("Đăng kí");
        btnDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKiActionPerformed(evt);
            }
        });

        jLabel1.setText("Thời khoá biểu");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Thứ", "Ca", "Môn học", "Phòng học", "Huỷ đăng kí"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });


        jScrollPane2.setViewportView(jTable2);

        btnHuy.setText("Huỷ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator4)
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnDangKi)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(323, 323, 323)
                                                                .addComponent(jLabel2))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(342, 342, 342)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnHuy)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDangKi)
                                .addGap(9, 9, 9)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnHuy)
                                .addContainerGap(167, Short.MAX_VALUE))
        );
    }

    //Ham xu ly khi nguoi dung nhan vao nut dang ki
    private void btnDangKiActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        //Kiem tra thoi gian dang ki
        if (checkThoiGianDK() == 0) {
            sb.append("Chưa tới thời gian đăng kí");
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            //Kiem tra danh sach dang ki rong
            List<Integer> vitri = getViTri1();
            if (vitri.size() == 0) {
                sb.append("Chưa chọn môn học");
                JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                //Kiem tra voi cac mon hoc da dang ki
                int kq = checkMonHocDaDangKi();
                switch (kq) {
                    //Xu ly khi cac thong tin gio, mon hop le
                    case 0: {
                        for (int i = 0; i < vitri.size(); i++) {
                            HocphanEntity hocPhan = HocPhanDAO.getThongTinHP(jTable1.getValueAt(vitri.get(i), 1).toString());
                            PhieuDkEntity phieu = new PhieuDkEntity(sinhVien, hocPhan);
                            int ketQua = PhieuDKDAO.addPhieu(phieu);
                            if (ketQua == 0) {
                                sb.append("Đăng kí không thành công");
                                JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        JOptionPane.showMessageDialog(this, "Đăng kí thành công");
                        loadTKB();

                    }
                    break;
                    case 1: {
                        sb.append("Số lượng đăng kí vượt quá 8 học phần, vui lòng đăng kí lại");
                        JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                    case 2: {
                        sb.append("Trùng môn học, vui lòng đăng kí lại");
                        JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                    case 3: {
                        sb.append("Có môn bị trùng lắp giờ học, vui lòng đăng kí lại");
                        JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                }
            }
        }
    }

    //Ham xu ly khi nguoi dung nhan vao nut huy
    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        //Kiem tra thoi gian huy
        if (checkThoiGianDK() == 0) {
            sb.append("Đã hết thời gian huỷ học phần");
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            List<Integer> vitri = getViTri2();
            //Kiem tra cac vi tri chon rong
            if (vitri.size() > 0) {
                Iterator<PhieuDkEntity> list = sinhVien.getPhieus().iterator();
                while (list.hasNext()) {
                    PhieuDkEntity phieuDK = list.next();
                    for (int i = 0; i < vitri.size(); i++) {
                        if (jTable2.getValueAt(vitri.get(i), 2).toString().compareTo(phieuDK.getHocPhan().getMonHoc().getTenMonHoc()) == 0) {
                            int kq = PhieuDKDAO.deletePhieu(phieuDK);
                            if (kq == 0) {
                                sb.append("Huỷ không thành công");
                                JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                                        JOptionPane.ERROR_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(this, "Huỷ môn học thành công");
                                loadTKB();
                            }
                        }
                    }
                }
            }
        }
    }
}
