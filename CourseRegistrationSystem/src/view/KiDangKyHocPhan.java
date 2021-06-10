package view;

import dao.DangKiHPDAO;
import dao.HocKiDAO;
import pojo.DangkiHpEntity;
import pojo.HockiEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class KiDangKyHocPhan extends javax.swing.JPanel {

    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtBatDau;
    private javax.swing.JTextField txtKetThuc;

    public KiDangKyHocPhan() {
        initComponents();
        loadDanhSach();
    }

    //Ham load danh sach cac ki dang ki hoc phan
    public void loadDanhSach() {
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.setRowCount(0);
        for (DangkiHpEntity dangKi : DangKiHPDAO.getDanhSachTGDK())
            dtm.addRow(new Object[]{dangKi.getHocKi().getMaHocKi(), dangKi.getNgayBatDau(), dangKi.getNgayKetThuc()});
        txtBatDau.setText("");
        txtKetThuc.setText("");
    }

    //Ham lay thong tin tu form
    private void getData(DangkiHpEntity dangKi) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String ngayBD = txtBatDau.getText();
        String ngayKT = txtKetThuc.getText();
        if (ngayBD.compareTo("") == 0) {
            ngayBD = java.time.LocalDate.now().toString();
        }
        if (ngayKT.compareTo("") == 0) {
            ngayKT = java.time.LocalDate.now().toString();
        }
        dangKi.setNgayBatDau(format.parse(ngayBD));
        dangKi.setNgayKetThuc(format.parse(ngayKT));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        txtBatDau = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtKetThuc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnThem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jLabel10.setText("Thêm kì đăng ký");

        jLabel11.setText("Bắt đầu");


        jLabel12.setText("Kết thúc");

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Mã kì", "Thời gian bắt đầu", "Thời gian kết thúc"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                    true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel13.setText("Danh sách các kì đăng ký học phần");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(166, 166, 166)
                                                .addComponent(jLabel13)))
                                .addContainerGap(27, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(237, 237, 237)
                                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel12)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtKetThuc))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel10)
                                                                .addComponent(txtBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addComponent(btnThem)
                                .addContainerGap(151, Short.MAX_VALUE))
        );
    }// </editor-fold>

    //Ham xu ly khi nguoi dung nhan vao them
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {//GEN-FIRST:event_btnThemActionPerformed
        StringBuilder sb = new StringBuilder();
        HockiEntity hocKiHT = HocKiDAO.getThongTinHKHT();
        //Kiem tra hoc ki hien tai da duoc set chua
        if (hocKiHT != null) {
            DangkiHpEntity dangKi = new DangkiHpEntity();
            dangKi.setHocKi(hocKiHT);
            getData(dangKi);
            int kq = DangKiHPDAO.addTGDK(dangKi);
            if (kq == 0) {
                sb.append("Thêm kì đăng kí học phần không thành công");
                JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
            }
        } else {

            sb.append("Chưa set học kì hiện tại. Vui lòng set lại!");
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }
        loadDanhSach();
    }
}