package view;

import dao.GiaoVuDAO;
import dao.SinhVienDAO;
import pojo.GiaovuEntity;
import pojo.SinhvienEntity;

import javax.swing.*;

public class DoiMatKhau extends javax.swing.JPanel {


    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtMKCu;
    private javax.swing.JPasswordField txtMKMoi;
    private javax.swing.JPasswordField txtNhapLai;

    public DoiMatKhau() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMKCu = new javax.swing.JPasswordField();
        txtNhapLai = new javax.swing.JPasswordField();
        txtMKMoi = new javax.swing.JPasswordField();
        btnXacNhan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel2.setText("Mật khẩu cũ");

        jLabel3.setText("Mật khẩu mới");

        jLabel4.setText("Nhập lại");

        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMKMoi)
                                        .addComponent(txtMKCu)
                                        .addComponent(txtNhapLai)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(175, Short.MAX_VALUE)
                                .addComponent(btnXacNhan)
                                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        );

        jLabel1.setText("Đổi mật khẩu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(176, 176, 176)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(17, Short.MAX_VALUE))
        );
    }


    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {
        int maNguoiDung = DangNhap.getIduser();
        if (maNguoiDung == 0) {
            StringBuilder sb = new StringBuilder();
            GiaovuEntity giaoVu = GiaoVuDAO.getThongTinGV(DangNhap.getUsername());
            if (txtMKCu.getText().compareTo(giaoVu.getMatKhau()) != 0) {
                {
                    sb.append("Mật khẩu không đúng");
                    JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (txtMKMoi.getText().compareTo(txtNhapLai.getText()) != 0) {
                    sb.append("Mật khẩu nhập lại không đúng");
                    JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    giaoVu.setMatKhau(txtMKMoi.getText());
                    int kq = GiaoVuDAO.updateThongTinGV(giaoVu);
                    if (kq == 1) {
                        JOptionPane.showMessageDialog(this,"Đổi mật khẩu thành công");
                    }
                }
            }
        } else {
            {
                StringBuilder sb = new StringBuilder();
                SinhvienEntity sinhVien = SinhVienDAO.getThongTinSV(DangNhap.getUsername());
                if (txtMKCu.getText().compareTo(sinhVien.getMatKhau()) != 0) {
                    sb.append("Mật khẩu không đúng");
                    JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    if (txtMKMoi.getText().compareTo(txtNhapLai.getText()) != 0) {
                        sb.append("Mật khẩu nhập lại không đúng");
                        JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        sinhVien.setMatKhau(txtMKMoi.getText());
                        int kq = SinhVienDAO.updateThongTinSV(sinhVien);
                        if (kq == 1) {
                            System.out.println("Thanh Cong");
                        }
                    }
                }


            }
        }
    }

}
