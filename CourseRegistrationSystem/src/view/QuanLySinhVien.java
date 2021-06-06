/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.LopHocDAO;
import dao.SinhVienDAO;
import pojo.LophocEntity;
import pojo.SinhvienEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QuanLySinhVien extends javax.swing.JPanel {

    public QuanLySinhVien() {
        initComponents();
        loadClass();
        loadDanhSach();

    }
    private void loadDanhSach()
    {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Mã");
        dtm.addColumn("Họ và tên");
        dtm.addColumn("Ngày sinh");
        dtm.addColumn("Địa chỉ");
        String lop = box.getItemAt(box.getSelectedIndex()).toString();
        LophocEntity lopHoc = LopHocDAO.getThongTinLH(lop);
        Iterator<SinhvienEntity> list = lopHoc.getList().iterator();

        while (list.hasNext()) {
            SinhvienEntity sinhVien = list.next();
            dtm.addRow(new Object[]{sinhVien.getMaSinhVien(), sinhVien.getHoVaTen(), sinhVien.getNgaySinh(), sinhVien.getDiaChi()});
        }
        jTable2.setModel(dtm);

        txtMa.setText("");
        txtTen.setText("");
        txtNgaySinh.setText("");
        txtCMND.setText("");
        txtEmail.setText("");
        txtDiaChi.setText("");
        jPasswordField1.setText("");

    }

    private void loadClass(){
        List<LophocEntity> ds = LopHocDAO.getDanhSachLH();
        for(int i=1; i<ds.size(); i++){
            box.addItem(ds.get(i).getMaLopHoc());
        }

    }

    private void getData(SinhvienEntity sinhVien) throws ParseException {
        sinhVien.setHoVaTen(txtTen.getText());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if(txtNgaySinh.getText().compareTo("") == 0) {
            Date date = format.parse("0000-00-00");
            sinhVien.setNgaySinh(date);
        }
        else{
            Date date = format.parse(txtNgaySinh.getText());
            sinhVien.setNgaySinh(date);
        }
        sinhVien.setCmnd(txtCMND.getText());
        sinhVien.setDiaChi(txtDiaChi.getText());
        sinhVien.setEmail(txtEmail.getText());
        sinhVien.setMatKhau(jPasswordField1.getText());
        sinhVien.setPhai(box1.getItemAt(box1.getSelectedIndex()).toString());
        sinhVien.setLop(box.getItemAt(box.getSelectedIndex()).toString());
    }

    private void setData(SinhvienEntity sinhVien) {
        txtMa.setText(sinhVien.getMaSinhVien());
        txtTen.setText(sinhVien.getHoVaTen());
        jPasswordField1.setText(sinhVien.getMatKhau());
        txtDiaChi.setText(sinhVien.getDiaChi());
        txtCMND.setText(sinhVien.getCmnd());
        txtNgaySinh.setText(sinhVien.getNgaySinh().toString());

        if(sinhVien.getPhai().compareTo("Nam") == 0){
            box1.setSelectedIndex(0);
        }

        if(sinhVien.getPhai().compareTo("Nữ") == 0) {
            box1.setSelectedIndex(1);
        }
        txtEmail.setText(sinhVien.getEmail());
    }



    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jButtonSearch = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        box1 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnThem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        box = new javax.swing.JComboBox<>();

        jButtonSearch.setText("Tìm kiếm");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Mã sinh viên", "Họ và tên", "Ngày sinh", "Địa chỉ"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    jTable2MouseClicked(evt);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("Thông tin chi tiết");

        jLabel34.setText("Mã số sinh viên");

        jLabel35.setText("Họ và tên");

        jLabel36.setText("Mật khẩu");

        jLabel37.setText("Ngày sinh");

        jLabel38.setText("Địa chỉ");

        jLabel39.setText("CMND/Căn cước");

        jLabel40.setText("Giới tính");

        jLabel42.setText("Email");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 459, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(btnThem)
                                                .addGap(49, 49, 49)
                                                .addComponent(btnLuu)
                                                .addGap(44, 44, 44)
                                                .addComponent(btnXoa))
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel37)
                                                        .addComponent(jLabel38)
                                                        .addComponent(jLabel36)
                                                        .addComponent(jLabel35)
                                                        .addComponent(jLabel34))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtNgaySinh)
                                                        .addComponent(txtDiaChi)
                                                        .addComponent(txtMa)
                                                        .addComponent(txtTen)
                                                        .addComponent(txtCMND, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                                        .addComponent(jPasswordField1)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel39)
                                                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(209, 209, 209)
                                                .addComponent(jLabel1)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel34)
                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel35)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel36)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel37)
                                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel38)
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel39)
                                        .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel40)
                                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel42)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThem)
                                        .addComponent(btnLuu)
                                        .addComponent(btnXoa))
                                .addGap(27, 27, 27)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(537, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(86, 86, 86)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonSearch))
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonSearch))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 599, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setText("Danh sách sinh viên");

        jLabel41.setText("Lớp học");

        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel41)
                                        .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }// </editor-fold>

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {
        SinhvienEntity sinhVien = null;
        String lop = box.getItemAt(box.getSelectedIndex()).toString();
        LophocEntity lopHoc = LopHocDAO.getThongTinLH(lop);
        Iterator<SinhvienEntity> list = lopHoc.getList().iterator();
        while (list.hasNext()) {
            sinhVien = list.next();
            if(sinhVien.getMaSinhVien().compareTo(jTextFieldSearch.getText().toString())==0){
                setData(sinhVien);
                return;
            }
        }
        if(sinhVien == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Khong tìm thấy giáo vụ có mã "+ jTextFieldSearch.getText());
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
            loadDanhSach();
        }
    }

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {
        loadDanhSach();
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Thêm không thành công");
        if(txtMa.getText().compareTo("") != 0) {
            SinhvienEntity sinhVien = new SinhvienEntity(txtMa.getText());
            getData(sinhVien);
            int kq = SinhVienDAO.addSV(sinhVien);
            if (kq == 1) {
                LophocEntity lopHoc = LopHocDAO.getThongTinLH(box.getItemAt(box.getSelectedIndex()));
                LopHocDAO.ThemSV(lopHoc, box1.getItemAt(box1.getSelectedIndex()));
            }else {
                JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }
        loadDanhSach();


    }

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
        StringBuilder sb = new StringBuilder();
        SinhvienEntity sinhVien = SinhVienDAO.getThongTinSV(txtMa.getText());
        if(sinhVien!=null){
            sb.append("Cập nhật thông tin không thành công");
        getData(sinhVien);
        int kq = SinhVienDAO.updateThongTinSV(sinhVien);
        if (kq == 1) {
            LophocEntity lopHoc = LopHocDAO.getThongTinLH(box.getItemAt(box.getSelectedIndex()));
            LopHocDAO.SuaSV(lopHoc, box1.getItemAt(box1.getSelectedIndex()));
        }
        else{
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }}
        else{
            sb.append("Sinh viên không tồn tại trong danh sách nên không thực hiện chỉnh sửa thông tin.");
        }
        loadDanhSach();

    }

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {
        int kq = SinhVienDAO.deleteSV(txtMa.getText());
        StringBuilder sb = new StringBuilder();
        sb.append("Xoá sinh viên không thành công");
        if(kq == 1){
            LophocEntity lopHoc = LopHocDAO.getThongTinLH(box.getItemAt(box.getSelectedIndex()));
            LopHocDAO.XoaSV(lopHoc, box1.getItemAt(box1.getSelectedIndex()));
        }
        else{
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }
        loadDanhSach();

    }

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) throws ParseException {
        String username = this.jTable2.getValueAt(this.jTable2.getSelectedRow(), 0).toString();
        SinhvienEntity sinhVien = SinhVienDAO.getThongTinSV(username);
        setData(sinhVien);
    }


    // Variables declaration - do not modify
    private javax.swing.JComboBox<String> box;
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTen;
    // End of variables declaration
}


