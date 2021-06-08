/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import dao.GiaoVuDAO;
import dao.SinhVienDAO;
import pojo.GiaovuEntity;
import pojo.SinhvienEntity;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThongTinChiTietGV extends javax.swing.JPanel {
    String ma = DangNhap.getUsername();
    GiaovuEntity giaoVu = GiaoVuDAO.getThongTinGV(ma);

    public ThongTinChiTietGV() {
        initComponents();
        txtMa.setText(ma);
        txtTen.setText(giaoVu.getHoVaTen());
        txtNgaySinh.setText(giaoVu.getNgaySinh().toString());
        txtDiaChi.setText(giaoVu.getDiaChi());
        txtCMND.setText(giaoVu.getCmnd());

        if(giaoVu.getPhai().compareTo("Nam") == 0){
            jComboBox1.setSelectedIndex(0);
        }

        if(giaoVu.getPhai().compareTo("Nữ") == 0) {
            jComboBox1.setSelectedIndex(1);
        }
        txtEmail.setText(giaoVu.getEmail());

    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jLabel1.setText("Thông tin chi tiết");

        jLabel2.setText("Mã giáo vụ");

        jLabel3.setText("Họ và tên");

        jLabel4.setText("Mật khẩu");

        jLabel5.setText("Ngày sinh");

        jLabel6.setText("Địa chỉ");

        jLabel7.setText("CMND/Căn cước");

        jLabel8.setText("Giới tính");

        jLabel9.setText("Email");


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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel7)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtEmail)
                                                        .addComponent(txtCMND)
                                                        .addComponent(txtMa)
                                                        .addComponent(txtNgaySinh)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(206, 206, 206)
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap(44, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLuu)
                                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addGap(41, 41, 41)
                                .addComponent(btnLuu)
                                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>



    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
        giaoVu.setHoVaTen(txtTen.getText());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date;
        date = txtNgaySinh.getText();
        if(date.compareTo("") == 0) {
            date = "0000-00-00";
        }
        giaoVu.setNgaySinh(format.parse(date));
        giaoVu.setCmnd(txtCMND.getText());
        giaoVu.setDiaChi(txtDiaChi.getText());
        giaoVu.setEmail(txtEmail.getText());
        System.out.println(jComboBox1.getSelectedIndex());
        System.out.println(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));

        giaoVu.setPhai(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).toString());
        int kq = GiaoVuDAO.updateThongTinGV(giaoVu);
        if (kq == 1){
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công");
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTen;
    // End of variables declaration
}
