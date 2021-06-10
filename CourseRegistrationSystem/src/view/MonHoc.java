package view;


import dao.HocKiDAO;
import dao.MonHocDAO;
import pojo.HockiEntity;
import pojo.MonhocEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.util.Iterator;

public class MonHoc extends javax.swing.JPanel {


    // Variables declaration - do not modify
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtMaMH;
    private javax.swing.JTextField txtSoTinChi;
    private javax.swing.JTextField txtTenMH;

    public MonHoc() {
        initComponents();
        loadDanhSach();
    }

    //Ham load danh sach
    private void loadDanhSach() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        HockiEntity hocKi = HocKiDAO.getThongTinHKHT();
        if (hocKi != null) {
            Iterator<MonhocEntity> list = hocKi.getMons().iterator();
            while (list.hasNext()) {
                MonhocEntity monHoc = list.next();
                dtm.addRow(new Object[]{monHoc.getMaMonHoc(), monHoc.getTenMonHoc(), monHoc.getSoTinChi()});
            }
        }
        txtMaMH.setText("");
        txtTenMH.setText("");
        txtSoTinChi.setText("");

    }

    //Ham lay thong tin tu form
    private void getData(MonhocEntity monHoc) throws ParseException {
        monHoc.setTenMonHoc(txtTenMH.getText().toString());
        monHoc.setSoTinChi(Integer.parseInt(txtSoTinChi.getText()));
    }

    //Ham set thong tin len form
    private void setData(MonhocEntity monHoc) {
        txtMaMH.setText(monHoc.getMaMonHoc());
        txtTenMH.setText(monHoc.getTenMonHoc());
        txtSoTinChi.setText(monHoc.getSoTinChi().toString());
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaMH = new javax.swing.JTextField();
        txtSoTinChi = new javax.swing.JTextField();
        txtTenMH = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        jLabel1.setText("Danh sách môn học");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                        "Mã môn học", "Tên môn học", "Số tín chỉ"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    jTable1MouseClicked(evt);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Mã môn học");

        jLabel3.setText("Tên môn học");

        jLabel4.setText("Số tín chỉ");

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(283, 283, 283)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(191, 191, 191)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(113, 113, 113)
                                                        .addComponent(btnThem)
                                                        .addGap(35, 35, 35)
                                                        .addComponent(btnLuu)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnXoa))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(102, 102, 102)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel2)
                                                                .addComponent(jLabel4))
                                                        .addGap(27, 27, 27)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtTenMH)
                                                                .addComponent(txtMaMH)
                                                                .addComponent(txtSoTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTim))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtSoTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThem)
                                        .addComponent(btnLuu)
                                        .addComponent(btnXoa))
                                .addContainerGap(57, Short.MAX_VALUE))
        );
    }


    //Ham xu ly khi nguoi dung nhan vao tim kiem
    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {
        MonhocEntity monHoc = MonHocDAO.getThongTinMH(jTextField4.getText().toString());
        if (monHoc == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Khong tìm thấy giáo vụ có mã " + jTextField4.getText().toString());
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
            loadDanhSach();
        } else {
            setData(monHoc);
        }
    }

    //Ham xu ly khi nguoi dung nhan vao luu thong tin
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
        StringBuilder sb = new StringBuilder();
        MonhocEntity monHoc = MonHocDAO.getThongTinMH(txtMaMH.getText());
        if (monHoc != null) {
            sb.append("Cập nhật thông tin không thành công");
            getData(monHoc);
            int kq = MonHocDAO.updateThongTinMH(monHoc);
            if (kq == 1) {
                JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công");
                loadDanhSach();
            } else {
                JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            sb.append("Môn học chưa có trong danh sách");
        }

    }

    //Ham xu ly khi nguoi dung nhan vao them
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
        StringBuilder sb = new StringBuilder();
        if (txtMaMH.getText() != null) {
            MonhocEntity monHoc = new MonhocEntity(txtMaMH.getText());
            if (HocKiDAO.getThongTinHKHT() != null) {
                getData(monHoc);
                monHoc.setHocKi(HocKiDAO.getThongTinHKHT());
                int kq = MonHocDAO.addMH(monHoc);
                if (kq == 0) {
                    sb.append("Thêm không thành công");
                    JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                            JOptionPane.ERROR_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                }
            } else {
                sb.append("Chưa set học kì hiện tại");
                JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            sb.append("Mã môn học không được rỗng");
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }
        loadDanhSach();
    }

    //Ham xu ly khi nguoi dung nhan vao xoa
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {
        int kq = MonHocDAO.deleteMH(txtMaMH.getText());
        StringBuilder sb = new StringBuilder();
        sb.append("Xoá môn học không thành công");
        if (kq == 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Xoá thành công");
        }
        loadDanhSach();
    }

    //Ham xu ly khi nguoi dung nhan vao bang danh sach
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) throws ParseException {
        String maMonHoc = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0).toString();
        MonhocEntity monHoc = MonHocDAO.getThongTinMH(maMonHoc);
        setData(monHoc);
    }

    // End of variables declaration
}

