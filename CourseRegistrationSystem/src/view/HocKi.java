
package view;


import dao.GiaoVuDAO;
import dao.HocKiDAO;
import dao.LopHocDAO;
import pojo.GiaovuEntity;
import pojo.HockiEntity;
import pojo.LophocEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class HocKi extends javax.swing.JPanel {
    //Ma dang thao tac chinh sua, xoa
    private int maHK;

    public int getMaHK() {
        return maHK;
    }

    public void setMaHK(int maHK) {
        this.maHK = maHK;
    }



    public HocKi() {
        initComponents();
        loadDanhSach();
    }

    private void loadDanhSach() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Mã học kì");
        dtm.addColumn("Tên học kì");
        dtm.addColumn("Năm học");
        dtm.addColumn("Ngày bắt đầu");
        dtm.addColumn("Ngày kết thúc");
        for (HockiEntity hocKi : HocKiDAO.getDanhSachHK())
            dtm.addRow(new Object[]{hocKi.getMaHocKi(), hocKi.getTenHocKi(), hocKi.getNamHoc(),
                    hocKi.getNgayBatDau(), hocKi.getNgayKetThuc()});

        jTable1.setModel(dtm);
        txtNamHoc.setText("");
        txtNgayBD.setText("");
        txtNgayKT.setText("");

    }

    private void getData(HockiEntity hocKi) throws ParseException {
        hocKi.setTenHocKi(boxHK.getItemAt(boxHK.getSelectedIndex()));
        int namHoc;
        if (txtNamHoc.getText().compareTo("") == 0) {
            namHoc = Calendar.getInstance().get(Calendar.YEAR);
        } else {
            namHoc = Integer.parseInt(txtNamHoc.getText());
        }
        hocKi.setNamHoc(namHoc);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String ngayBD = txtNgayBD.getText();
        if (ngayBD.compareTo("") == 0) {
            ngayBD = java.time.LocalDate.now().toString();
            System.out.println(ngayBD);
        }
        hocKi.setNgayBatDau(format.parse(ngayBD));
        String ngayKT = txtNgayKT.getText();
        if (ngayKT.compareTo("") == 0) {
            ngayKT = java.time.LocalDate.now().toString();
        }
        hocKi.setNgayKetThuc(format.parse(ngayKT));

    }

    private void setData(HockiEntity hocKi) {
        if (hocKi.getTenHocKi().compareTo("HK 1") == 0) {
            boxHK.setSelectedIndex(0);
        }
        if (hocKi.getTenHocKi().compareTo("HK 2") == 0) {
            boxHK.setSelectedIndex(1);
        }
        if (hocKi.getTenHocKi().compareTo("HK 3") == 0) {
            boxHK.setSelectedIndex(2);
        }
        txtNamHoc.setText(String.valueOf(hocKi.getNamHoc()));
        txtNgayBD.setText(hocKi.getNgayBatDau().toString());
        txtNgayKT.setText(hocKi.getNgayKetThuc().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNgayBD = new javax.swing.JTextField();
        txtNgayKT = new javax.swing.JTextField();
        txtNamHoc = new javax.swing.JTextField();
        boxHK = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSet = new javax.swing.JButton();

        jLabel1.setText("Danh sách học kì");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String[]{
                        "Mã học kì", "Tên học kì", "Năm học", "Ngày bắt đầu", "Ngày kết thúc"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jLabel2.setText("Thông tin một học kì");

        jLabel3.setText("Học kì");

        jLabel4.setText("Năm học");

        jLabel5.setText("Ngày bắt đầu");

        jLabel6.setText("Ngày kết thúc");


        boxHK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"HK 1", "HK 2", "HK 3"}));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSet.setText("Set kì hiện tại");
        btnSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(99, 99, 99)
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtNamHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(boxHK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(92, 92, 92))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(btnThem)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnLuu)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnXoa)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSet))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(217, 217, 217)
                                                .addComponent(jLabel1)))
                                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(boxHK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtNamHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThem)
                                        .addComponent(btnLuu)
                                        .addComponent(btnXoa)
                                        .addComponent(btnSet))
                                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>



    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        sb.append("Thêm thông tin học kì không thành công");
        HockiEntity hocKi = new HockiEntity();
        try {
            getData(hocKi);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int kq = HocKiDAO.addHK(hocKi);
        if (kq != 1) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        }
        loadDanhSach();
    }

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        sb.append("Xoá học kì không thành công ");

        int kq = HocKiDAO.deleteHK(maHK);
        if (kq != 1) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "Xoá thành công");
        }
        loadDanhSach();
    }

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        sb.append("Chỉnh sửa học kì không thành công ");
        HockiEntity hocKi = HocKiDAO.getThongTinHK(maHK);
        int kq = HocKiDAO.updateThongTinHK(hocKi);
        if (kq != 1) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }else
        {
            JOptionPane.showMessageDialog(this, "Luu thanh cong");
        }
        loadDanhSach();
    }

    private void btnSetActionPerformed(java.awt.event.ActionEvent evt) {
        HockiEntity hocKi = HocKiDAO.getThongTinHK(maHK);
        if(hocKi == null){
            StringBuilder sb = new StringBuilder();
            sb.append("Học kì chưa được chọn");
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",
                    JOptionPane.ERROR_MESSAGE);
        }else {
            if (HocKiDAO.getThongTinHKHT() != null) {
                HockiEntity hk = HocKiDAO.getThongTinHKHT();
                hk.setKiHienTai(0);
                HocKiDAO.updateThongTinHK(hk);
            }
            hocKi.setKiHienTai(1);
            HocKiDAO.updateThongTinHK(hocKi);
            JOptionPane.showMessageDialog(this, "Set thành công");
        }
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) throws ParseException {
        maHK = Integer.parseInt(this.jTable1.getValueAt(this.jTable1.getSelectedRow(),
                0).toString());
        System.out.println(maHK);
        HockiEntity hocKi = HocKiDAO.getThongTinHK(maHK);
        setData(hocKi);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSet;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> boxHK;
    private javax.swing.JTextField txtNgayBD;
    private javax.swing.JTextField txtNgayKT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNamHoc;

}
