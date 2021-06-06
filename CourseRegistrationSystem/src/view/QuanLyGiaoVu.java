
package view;


import dao.LopHocDAO;
import dao.GiaoVuDAO;
import dao.SinhVienDAO;
import pojo.LophocEntity;
import pojo.GiaovuEntity;
import pojo.SinhvienEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class QuanLyGiaoVu extends javax.swing.JPanel {


    public QuanLyGiaoVu() {
        initComponents();
        loadDanhSach();

    }
    private void loadDanhSach()
    {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Mã");
        dtm.addColumn("Họ và tên");
        dtm.addColumn("Ngày sinh");
        dtm.addColumn("Địa chỉ");
        for (GiaovuEntity giaoVu: GiaoVuDAO.getDanhSachGV())
            dtm.addRow(new Object[]{giaoVu.getMa(), giaoVu.getHoVaTen(), giaoVu.getNgaySinh(), giaoVu.getDiaChi()});
        jTable1.setModel(dtm);

        txtMa.setText("");
        txtTen.setText("");
        txtNgaySinh.setText("");
        txtCMND.setText("");
        txtEmail.setText("");
        txtDiaChi.setText("");
        txtMatKhau.setText("");
        box1.setSelectedIndex(0);
    }

    private void getData(GiaovuEntity giaoVu) throws ParseException {
        giaoVu.setHoVaTen(txtTen.getText());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if(txtNgaySinh.getText().compareTo("") == 0) {
            Date date = format.parse("0000-00-00");
            giaoVu.setNgaySinh(date);
        }
        else{
            Date date = format.parse(txtNgaySinh.getText());
            giaoVu.setNgaySinh(date);
        }
        giaoVu.setCmnd(txtCMND.getText());
        giaoVu.setDiaChi(txtDiaChi.getText());
        giaoVu.setEmail(txtEmail.getText());
        giaoVu.setMatKhau(txtMatKhau.getText());
        giaoVu.setPhai(box1.getItemAt(box1.getSelectedIndex()).toString());

    }

    private void setData(GiaovuEntity giaoVu) {
        txtMa.setText(giaoVu.getMa());
        txtTen.setText(giaoVu.getHoVaTen());
        txtMatKhau.setText(giaoVu.getMatKhau());
        txtDiaChi.setText(giaoVu.getDiaChi());
        txtCMND.setText(giaoVu.getCmnd());
        txtNgaySinh.setText(giaoVu.getNgaySinh().toString());

        if(giaoVu.getPhai().compareTo("Nam") == 0){
            box1.setSelectedIndex(0);
        }

        if(giaoVu.getPhai().compareTo("Nữ") == 0) {
            box1.setSelectedIndex(1);
        }

        txtEmail.setText(giaoVu.getEmail());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnLuu = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        txtMa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        box1 = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Mã", "Họ Và Tên", "Ngày sinh", "Địa chỉ"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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

        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });

        jButtonSearch.setText("Tìm kiếm");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabel5.setText("Ngày sinh");

        jLabel6.setText("Địa chỉ");

        jLabel7.setText("CMND/Căn cước");

        jLabel8.setText("Giới tính");

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

        jLabel9.setText("Email");

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });

        jLabel1.setText("Thông tin chi tiết");

        jLabel2.setText("Mã giáo vụ");

        jLabel3.setText("Họ và tên");

        jLabel4.setText("Mật khẩu");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(206, 206, 206)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel7)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtEmail)
                                                        .addComponent(txtCMND)
                                                        .addComponent(txtMa)
                                                        .addComponent(txtNgaySinh)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addComponent(btnThem)
                                                .addGap(35, 35, 35)
                                                .addComponent(btnLuu)
                                                .addGap(38, 38, 38)
                                                .addComponent(btnXoa)))
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnLuu)
                                        .addComponent(btnXoa)
                                        .addComponent(btnThem))
                                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonSearch)))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonSearch))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(147, 147, 147)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        jLabel10.setText("Danh sách thông tin giáo vụ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel10)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jSeparator3)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {
        GiaovuEntity giaoVu= GiaoVuDAO.getThongTinGV(jTextFieldSearch.getText());
        if(giaoVu == null)
        {
            StringBuilder sb = new StringBuilder();
            sb.append("Khong tìm thấy giáo vụ có mã "+ jTextFieldSearch.getText());
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                JOptionPane.ERROR_MESSAGE);
            loadDanhSach();
        }else{
            setData(giaoVu);
        }
    }

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Thêm thông tin giáo vụ không thành công");
        if(txtMa.getText().compareTo("")!=0) {
            GiaovuEntity giaoVu = new GiaovuEntity(txtMa.getText());
            getData(giaoVu);
            int kq = GiaoVuDAO.addGV(giaoVu);
            if(kq!=1)
            {
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

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        if(txtMa.getText().toLowerCase(Locale.ROOT).compareTo(DangNhap.getUsername()) == 0)
        {
            sb.append("Tài khoản đang thực hiện trên hệ thống, không thể xoá");
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                JOptionPane.ERROR_MESSAGE);
        }
        else{
            int kq = GiaoVuDAO.deleteGV(txtMa.getText());
            if(kq != 1){
                sb.append("Xoá tài khoản giáo vụ không thành công");
                JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        loadDanhSach();
    }

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
        StringBuilder sb = new StringBuilder();
        if(txtMa.getText().toLowerCase(Locale.ROOT).compareTo(DangNhap.getUsername()) == 0)
        {
            sb.append("Tài khoản đang thực hiện trên hệ thống, chỉnh sửa thông tin ở trang này");
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }
        else{
            GiaovuEntity giaoVu = GiaoVuDAO.getThongTinGV(txtMa.getText());
            getData(giaoVu);
            int kq = GiaoVuDAO.updateThongTinGV(giaoVu);
            if (kq != 1){
                sb.append("Chỉnh sửa thông tin không thành công");
                JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        loadDanhSach();
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) throws ParseException {
        String username = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0).toString();
        GiaovuEntity giaoVu = GiaoVuDAO.getThongTinGV(username);
        setData(giaoVu);
    }


    // Variables declaration - do not modify
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTen;
    // End of variables declaration
}
