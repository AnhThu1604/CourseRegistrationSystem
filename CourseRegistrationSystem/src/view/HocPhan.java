package view;

import dao.HocKiDAO;
import dao.HocPhanDAO;
import dao.MonHocDAO;
import pojo.HockiEntity;
import pojo.HocphanEntity;
import pojo.MonhocEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.util.Iterator;

public class HocPhan extends javax.swing.JPanel {

    private javax.swing.JComboBox<String> boxCa;
    private javax.swing.JComboBox<String> boxThu;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtGiaoVien;
    private javax.swing.JTextField txtMaHP;
    private javax.swing.JTextField txtMaMH;
    private javax.swing.JTextField txtPhong;
    private javax.swing.JTextField txtSlot;
    private javax.swing.JTextField txtSoTinChi;
    private javax.swing.JTextField txtTenMon;
    private javax.swing.JTextField txtTim;


    public HocPhan() {
        initComponents();
        loadDanhSach();
    }

    //Ham loa danh sach cac hoc phan cua ki hien tai
    private void loadDanhSach() {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        HockiEntity hocKi = HocKiDAO.getThongTinHKHT();
        if (hocKi != null) {
            Iterator<MonhocEntity> list = hocKi.getMons().iterator();
            while (list.hasNext()) {
                MonhocEntity monHoc = list.next();
                Iterator<HocphanEntity> listHP = monHoc.getHocphans().iterator();
                while (listHP.hasNext()) {
                    HocphanEntity hocPhan = listHP.next();
                    dtm.addRow(new Object[]{hocPhan.getMonHoc().getMaMonHoc(), hocPhan.getMonHoc().getTenMonHoc(),
                            hocPhan.getMaHocPhan(), hocPhan.getGiaoVien(), hocPhan.getTenPhongHoc()});
                }
            }
        }

        txtMaMH.setText("");
        txtTenMon.setText("");
        txtMaMH.setText("");
        txtSoTinChi.setText("");
        txtGiaoVien.setText("");
        txtPhong.setText("");
        txtSlot.setText("");
        boxThu.setSelectedIndex(0);
        boxCa.setSelectedIndex(0);
    }

    //Ham lay cac du lieu tu form nhap
    private void getData(HocphanEntity hocPhan) throws ParseException {
        hocPhan.setGiaoVien(txtGiaoVien.getText());
        hocPhan.setTenPhongHoc(txtPhong.getText());
        hocPhan.setCaHoc(Integer.parseInt(boxCa.getItemAt(boxCa.getSelectedIndex())));
        hocPhan.setNgayHoc(Integer.parseInt(boxThu.getItemAt(boxThu.getSelectedIndex())));
        hocPhan.setSlotToiDa(Integer.parseInt(txtSlot.getText().toString()));
    }

    //Ham set cac du lieu len form nhap
    private void setData(HocphanEntity hocPhan) {
        txtMaMH.setText(hocPhan.getMonHoc().getMaMonHoc());
        MonhocEntity monHoc = MonHocDAO.getThongTinMH(txtMaMH.getText());
        txtTenMon.setText(monHoc.getTenMonHoc());
        txtMaHP.setText(hocPhan.getMaHocPhan());
        txtSoTinChi.setText(monHoc.getSoTinChi().toString());
        txtGiaoVien.setText(hocPhan.getGiaoVien());
        txtPhong.setText(hocPhan.getTenPhongHoc());
        txtSlot.setText(hocPhan.getSlotToiDa().toString());


        int thu[] = {2, 3, 4, 5, 6, 7};
        int ca[] = {1, 2, 3, 4};
        int ngayHoc = hocPhan.getNgayHoc();
        int caHoc = hocPhan.getCaHoc();

        for (int i = 0; i < 6; i++) {
            if (thu[i] == ngayHoc) {
                boxThu.setSelectedIndex(i);
            }
            if (ca[i] == caHoc) {
                boxCa.setSelectedIndex(i);
            }
        }


    }

    //Ham kiem tra thong tin mon hoc
    private MonhocEntity kiemTraMonHoc(String maMonHoc) {
        MonhocEntity monHoc = MonHocDAO.getThongTinMH(maMonHoc);
        StringBuilder sb = new StringBuilder();
        if (monHoc != null) {
            txtTenMon.setText(monHoc.getTenMonHoc());
            txtSoTinChi.setText(monHoc.getSoTinChi().toString());
        } else {
            return null;
        }
        return monHoc;
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenMon = new javax.swing.JTextField();
        txtGiaoVien = new javax.swing.JTextField();
        txtSoTinChi = new javax.swing.JTextField();
        txtSlot = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        boxThu = new javax.swing.JComboBox<>();
        boxCa = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMaHP = new javax.swing.JTextField();
        txtPhong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaMH = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();

        jLabel1.setText("Danh sách học phần");


        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Mã môn học", "Tên môn học", "Mã học phần", "Số tín chỉ", "Giáo viên"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    tableMouseClicked(evt);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel2.setText("Thông tin chi tiết học phần");

        txtMaMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaMHActionPerformed(evt);
            }
        });

        jLabel4.setText("Tên môn học");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnThemActionPerformed(evt);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        jLabel5.setText("Số tín chỉ");

        jLabel6.setText("Giáo viên");

        jLabel7.setText("Thứ");

        jLabel8.setText("Ca");

        jLabel9.setText("Số slot tối đa");

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnLuuActionPerformed(evt);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        boxThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"2", "3", "4", "5", "6", "7"}));

        boxCa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4"}));

        jLabel14.setText("Mã học phần");

        jLabel15.setText("Tên phòng học");


        jLabel3.setText("Mã môn học");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(249, 249, 249)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel14)
                                                        .addComponent(jLabel3))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(txtSoTinChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                                                        .addComponent(txtMaHP, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtTenMon, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtGiaoVien))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel15)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jLabel7)
                                                                                        .addComponent(jLabel8)
                                                                                        .addComponent(jLabel9)
                                                                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(txtSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                        .addComponent(boxCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(boxThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(34, 34, 34)
                                                                                                .addComponent(btnLuu)
                                                                                                .addGap(29, 29, 29)
                                                                                                .addComponent(btnXoa))))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel14)
                                                        .addComponent(txtMaHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(txtSoTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel15)
                                                        .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(boxThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(boxCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(txtGiaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel9)
                                                .addComponent(txtSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThem)
                                        .addComponent(btnLuu)
                                        .addComponent(btnXoa))
                                .addGap(57, 57, 57))
        );

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnTim)
                                .addGap(71, 71, 71))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(41, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(297, 297, 297)
                                                        .addComponent(jLabel1))
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(55, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTim))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel1)
                                        .addGap(178, 178, 178)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(432, Short.MAX_VALUE)))
        );
    }

    //Ham xu ly khi nguoi dung nhan vao tim
    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {
        HocphanEntity hocPhan = HocPhanDAO.getThongTinHP(txtTim.getText());
        if (hocPhan == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Không tìm thấy học phần có mã " + txtTim.getText());
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
            loadDanhSach();
        } else {
            setData(hocPhan);

        }
    }

    //Ham xu ly khi nguoi dung nhap ma mon hoc
    //nhan enter --> hien ra thong tin nhu ten so tin chi
    //hien ra thong bao neu mon hoc khong ton tai
    private void txtMaMHActionPerformed(java.awt.event.ActionEvent evt) {
        if (kiemTraMonHoc(txtMaMH.getText()) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Môn học không tồn tại");
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    //Ham xu ly khi nguoi dung nhan them hoc phan
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {//GEN-FIRST:event_btnThemActionPerformed
        StringBuilder sb = new StringBuilder();
        //Kiem tra ma hoc phan
        if (txtMaHP.getText() != null) {
            if (MonHocDAO.getThongTinMH(txtMaMH.getText()) != null) {
                MonhocEntity monhoc = kiemTraMonHoc(txtMaMH.getText());
                HocphanEntity hocPhan = new HocphanEntity(txtMaHP.getText());
                getData(hocPhan);
                hocPhan.setMonHoc(monhoc);
                int kq = HocPhanDAO.addHP(hocPhan);
                if (kq != 1) {
                    sb.append("Thêm học phần không thành công");
                    JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    txtMaHP.setText("");
                    loadDanhSach();
                }
            } else {
                sb.append("Mã học phần không được rỗng");
                JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    //Ham xu ly khi nguoi dung nhan luu phan chinh sua cua hoc phan
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {//GEN-FIRST:event_btnLuuActionPerformed
        StringBuilder sb = new StringBuilder();
        HocphanEntity hocPhan = HocPhanDAO.getThongTinHP(txtMaHP.getText());
        getData(hocPhan);
        int kq = HocPhanDAO.updateThongTinHP(hocPhan);
        if (kq != 1) {
            sb.append("Chỉnh sửa thông tin không thành công");
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công");
            loadDanhSach();
        }
        loadDanhSach();
    }//GEN-LAST:event_btnLuuActionPerformed

    //Ham xu ly khi nguoi dung nhan vao xoa
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        StringBuilder sb = new StringBuilder();

        int kq = HocPhanDAO.deleteHP(txtMaHP.getText());
        if (kq != 1) {
            sb.append("Xoá học phần không thành công");
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Xoá thành công");
        }

        loadDanhSach();
    }//GEN-LAST:event_btnXoaActionPerformed

    //Ham xu ly khi nguoi dung click chuot vao bang
    private void tableMouseClicked(java.awt.event.MouseEvent evt) throws ParseException {
        String ma = this.table.getValueAt(this.table.getSelectedRow(), 2).toString();
        HocphanEntity hocPhan = HocPhanDAO.getThongTinHP(ma);
        setData(hocPhan);
    }
}
