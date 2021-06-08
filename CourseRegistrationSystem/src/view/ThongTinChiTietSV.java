
package view;


import dao.LopHocDAO;
import dao.SinhVienDAO;
import pojo.LophocEntity;
import pojo.SinhvienEntity;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ThongTinChiTietSV extends javax.swing.JPanel {
        String maSinhVien = DangNhap.getUsername();
        SinhvienEntity sinhVien = SinhVienDAO.getThongTinSV(maSinhVien);

    public ThongTinChiTietSV() {
        initComponents();
        txtMa.setText(maSinhVien);
        txtTen.setText(sinhVien.getHoVaTen());
        txtNgaySinh.setText(sinhVien.getNgaySinh().toString());
        txtDiaChi.setText(sinhVien.getDiaChi());
        txtCMND.setText(sinhVien.getCmnd());

        if(sinhVien.getPhai().compareTo("Nam") == 0){
            jComboBox1.setSelectedIndex(0);
        }

        if(sinhVien.getPhai().compareTo("Nữ") == 0) {
            jComboBox1.setSelectedIndex(1);
        }

        txtEmail.setText(sinhVien.getEmail());
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
            scrollPane1 = new java.awt.ScrollPane();
            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel34 = new javax.swing.JLabel();
            jLabel35 = new javax.swing.JLabel();
            jLabel36 = new javax.swing.JLabel();
            jLabel37 = new javax.swing.JLabel();
            jLabel38 = new javax.swing.JLabel();
            jLabel39 = new javax.swing.JLabel();
            jLabel40 = new javax.swing.JLabel();
            jLabel41 = new javax.swing.JLabel();
            jLabel42 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            txtMa = new javax.swing.JTextField();
            txtTen = new javax.swing.JTextField();
            txtMatKhau = new javax.swing.JTextField();
            txtNgaySinh = new javax.swing.JTextField();
            txtCMND = new javax.swing.JTextField();
            txtLopHoc = new javax.swing.JTextField();
            txtDiaChi = new javax.swing.JTextField();
            jPanel2 = new javax.swing.JPanel();
            btnLuu = new javax.swing.JButton();
            txtEmail = new javax.swing.JTextField();
            jComboBox1 = new javax.swing.JComboBox<>();

            jLabel1.setText("Thông tin chi tiết");

            jLabel34.setText("Mã số sinh viên");

            jLabel35.setText("Họ và tên");

            jLabel36.setText("Mật khẩu");

            jLabel37.setText("Ngày sinh");

            jLabel38.setText("Địa chỉ");

            jLabel39.setText("CMND/Căn cước");

            jLabel40.setText("Giới tính");

            jLabel41.setText("Lớp học");

            jLabel42.setText("Email");

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

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(86, 86, 86)
                                    .addComponent(btnLuu)
                                    .addContainerGap(106, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(btnLuu)
                                    .addContainerGap(43, Short.MAX_VALUE))
            );

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ"}));

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(29, 29, 29)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(34, 34, 34))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jLabel39)
                                                                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                    .addGap(6, 6, 6)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(txtLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGap(9, 9, 9)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(jLabel37)
                                                                            .addComponent(jLabel38)
                                                                            .addComponent(jLabel36)
                                                                            .addComponent(jLabel35)
                                                                            .addComponent(jLabel34))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                            .addComponent(txtTen)
                                                                            .addComponent(txtMa)
                                                                            .addComponent(txtMatKhau)
                                                                            .addComponent(txtNgaySinh)
                                                                            .addComponent(txtDiaChi)
                                                                            .addComponent(txtCMND, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(183, 183, 183)
                                                    .addComponent(jLabel1)))
                                    .addContainerGap(60, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jSeparator1)
                                            .addContainerGap()))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel34)
                                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel35)
                                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(5, 5, 5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel36)
                                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel37)
                                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel38)
                                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel39)
                                            .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel40)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(9, 9, 9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel41)
                                            .addComponent(txtLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel42)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(41, 41, 41)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(48, 48, 48)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(512, Short.MAX_VALUE)))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
            );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNamActionPerformed



    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
        sinhVien.setHoVaTen(txtTen.getText());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date;
        date = txtNgaySinh.getText();
        if(date.compareTo("") == 0) {
            date = "0000-00-00";
        }
        sinhVien.setNgaySinh(format.parse(date));
        sinhVien.setCmnd(txtCMND.getText());
        sinhVien.setDiaChi(txtDiaChi.getText());
        sinhVien.setEmail(txtEmail.getText());
        System.out.println(jComboBox1.getSelectedIndex());
        System.out.println(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));

        sinhVien.setPhai(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).toString());
        int kq = SinhVienDAO.updateThongTinSV(sinhVien);
        if (kq == 1){
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton btnLuu;

    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTextField txtLopHoc;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
