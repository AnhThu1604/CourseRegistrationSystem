
package view;


import dao.GiaoVuDAO;
import dao.LopHocDAO;
import dao.MonHocDAO;
import dao.SinhVienDAO;
import pojo.GiaovuEntity;
import pojo.LophocEntity;
import pojo.MonhocEntity;
import pojo.SinhvienEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.util.Iterator;

public class LopHoc extends javax.swing.JPanel {


    public LopHoc() {
        initComponents();
        loadDanhSach();
    }

    private void loadDanhSach() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Mã lớp học");
        dtm.addColumn("Tổng sinh viên");
        dtm.addColumn("Số sinh viên nam");
        dtm.addColumn("Số sinh viên nữ");
        for (LophocEntity lopHoc : LopHocDAO.getDanhSachLH())
            dtm.addRow(new Object[]{lopHoc.getMaLopHoc(), lopHoc.getTongSv(), lopHoc.getTongSvNam(), lopHoc.getTongSvNu()});
        dtm.removeRow(0);
        jTable1.setModel(dtm);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtTim = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã lớp học", "Tổng sinh viên", "Số sinh viên nam", "Số sinh viên nữ"
            }
        ) {
            Class[] types = new Class [] {
                String.class, Integer.class, Integer.class, Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });


        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Danh sách lớp học");

        txtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimActionPerformed(evt);
            }
        });
        txtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });


        btnThem.setText("Thêm mới");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThem)
                        .addGap(5, 5, 5)
                        .addComponent(btnXoa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt){

    }
    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void txtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        StringBuilder sb = new StringBuilder();
        if(txtTim.getText().compareTo("")!= 0) {
            LophocEntity lopHoc = new LophocEntity(txtTim.getText(), 0,0,0);
            int kq = LopHocDAO.addLH(lopHoc);
            if(kq == 0){
                sb.append("Lớp học đã có trong danh sách, vui lòng nhập lại!");
                JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            sb.append("Vui lòng nhập mã lớp");
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }

        loadDanhSach();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        StringBuilder sb = new StringBuilder();
        String maLopHoc = txtTim.getText();
        System.out.println(maLopHoc);
        if(maLopHoc.compareTo("")!=0){
            LophocEntity lopHoc = LopHocDAO.getThongTinLH(maLopHoc);
            Iterator<SinhvienEntity> list = lopHoc.getList().iterator();
            while (list.hasNext()) {
                SinhvienEntity sinhVien = list.next();
                sinhVien.setLop("");
                SinhVienDAO.updateThongTinSV(sinhVien);
            }
            int kq = LopHocDAO.deleteLH(maLopHoc);
            if(kq == 0){
                sb.append("Xoá không thành công");
                JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                        JOptionPane.ERROR_MESSAGE);
            }
        }else{
            sb.append("Vui lòng nhập mã lớp để xoá");
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }
        loadDanhSach();
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
