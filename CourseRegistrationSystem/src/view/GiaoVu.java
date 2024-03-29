package view;

import bean.DanhMuc;
import controller.ChuyenManHinhGV;

import java.util.ArrayList;
import java.util.List;


public class GiaoVu extends javax.swing.JFrame {

    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlbDKHP;
    private javax.swing.JLabel jlbDangXuat;
    private javax.swing.JLabel jlbDoiMK;
    private javax.swing.JLabel jlbGiaoVu;
    private javax.swing.JLabel jlbHocKi;
    private javax.swing.JLabel jlbHocPhan;
    private javax.swing.JLabel jlbLopHoc;
    private javax.swing.JLabel jlbMonHoc;
    private javax.swing.JLabel jlbSinhVien;
    private javax.swing.JLabel jlbThongTin;
    private javax.swing.JPanel jpnDKHP;
    private javax.swing.JPanel jpnDangXuat;
    private javax.swing.JPanel jpnDoiMK;
    private javax.swing.JPanel jpnGiaoVu;
    private javax.swing.JPanel jpnHocKi;
    private javax.swing.JPanel jpnHocPhan;
    private javax.swing.JPanel jpnLopHoc;
    private javax.swing.JPanel jpnMonHoc;
    private javax.swing.JPanel jpnSinhVien;
    private javax.swing.JPanel jpnThongTin;
    private javax.swing.JPanel jpnView;

    public GiaoVu() {
        initComponents();
        this.setTitle("Tai khoan giao vu");

        ChuyenManHinhGV controller = new ChuyenManHinhGV(jpnView);

        controller.setView(jpnThongTin, jlbThongTin, "jpnThongTin");
        List<DanhMuc> list = new ArrayList<>();
        list.add(new DanhMuc("jpnThongTin", jpnThongTin, jlbThongTin));
        list.add(new DanhMuc("jpnSinhVien", jpnSinhVien, jlbSinhVien));
        list.add(new DanhMuc("jpnGiaoVu", jpnGiaoVu, jlbGiaoVu));
        list.add(new DanhMuc("jpnMonHoc", jpnMonHoc, jlbMonHoc));
        list.add(new DanhMuc("jpnHocPhan", jpnHocPhan, jlbHocPhan));
        list.add(new DanhMuc("jpnHocKi", jpnHocKi, jlbHocKi));
        list.add(new DanhMuc("jpnLopHoc", jpnLopHoc, jlbLopHoc));
        list.add(new DanhMuc("jpnDKHP", jpnDKHP, jlbDKHP));


        list.add(new DanhMuc("jpnDoiMK", jpnDoiMK, jlbDoiMK));
        list.add(new DanhMuc("jpnDangXuat", jpnDangXuat, jlbDangXuat));
        controller.setEvent(list);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jpnView = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpnThongTin = new javax.swing.JPanel();
        jlbThongTin = new javax.swing.JLabel();
        jpnSinhVien = new javax.swing.JPanel();
        jlbSinhVien = new javax.swing.JLabel();
        jpnGiaoVu = new javax.swing.JPanel();
        jlbGiaoVu = new javax.swing.JLabel();
        jpnDoiMK = new javax.swing.JPanel();
        jlbDoiMK = new javax.swing.JLabel();
        jpnDangXuat = new javax.swing.JPanel();
        jlbDangXuat = new javax.swing.JLabel();
        jpnDKHP = new javax.swing.JPanel();
        jlbDKHP = new javax.swing.JLabel();
        jpnLopHoc = new javax.swing.JPanel();
        jlbLopHoc = new javax.swing.JLabel();
        jpnMonHoc = new javax.swing.JPanel();
        jlbMonHoc = new javax.swing.JLabel();
        jpnHocPhan = new javax.swing.JPanel();
        jlbHocPhan = new javax.swing.JLabel();
        jpnHocKi = new javax.swing.JPanel();
        jlbHocKi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
                jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 593, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
                jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(402, 550));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TÀI KHOẢN GIÁO VỤ");

        jpnThongTin.setBackground(new java.awt.Color(54, 33, 89));
        jpnThongTin.setPreferredSize(new java.awt.Dimension(173, 54));

        jlbThongTin.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongTin.setText("Thông tin cá nhân");

        javax.swing.GroupLayout jpnThongTinLayout = new javax.swing.GroupLayout(jpnThongTin);
        jpnThongTin.setLayout(jpnThongTinLayout);
        jpnThongTinLayout.setHorizontalGroup(
                jpnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnThongTinLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jlbThongTin)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThongTinLayout.setVerticalGroup(
                jpnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnThongTinLayout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(jlbThongTin)
                                .addGap(18, 18, 18))
        );

        jpnSinhVien.setBackground(new java.awt.Color(54, 33, 89));
        jpnSinhVien.setPreferredSize(new java.awt.Dimension(173, 54));

        jlbSinhVien.setForeground(new java.awt.Color(255, 255, 255));
        jlbSinhVien.setText("SINH VIÊN");

        javax.swing.GroupLayout jpnSinhVienLayout = new javax.swing.GroupLayout(jpnSinhVien);
        jpnSinhVien.setLayout(jpnSinhVienLayout);
        jpnSinhVienLayout.setHorizontalGroup(
                jpnSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnSinhVienLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jlbSinhVien)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnSinhVienLayout.setVerticalGroup(
                jpnSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnSinhVienLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jlbSinhVien)
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        jpnGiaoVu.setBackground(new java.awt.Color(54, 33, 89));
        jpnGiaoVu.setPreferredSize(new java.awt.Dimension(173, 54));

        jlbGiaoVu.setForeground(new java.awt.Color(255, 255, 255));
        jlbGiaoVu.setText("GIÁO VỤ");

        javax.swing.GroupLayout jpnGiaoVuLayout = new javax.swing.GroupLayout(jpnGiaoVu);
        jpnGiaoVu.setLayout(jpnGiaoVuLayout);
        jpnGiaoVuLayout.setHorizontalGroup(
                jpnGiaoVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnGiaoVuLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jlbGiaoVu)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnGiaoVuLayout.setVerticalGroup(
                jpnGiaoVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnGiaoVuLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jlbGiaoVu)
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        jpnDoiMK.setBackground(new java.awt.Color(54, 33, 89));

        jlbDoiMK.setForeground(new java.awt.Color(255, 255, 255));
        jlbDoiMK.setText("Đổi mật khẩu");

        javax.swing.GroupLayout jpnDoiMKLayout = new javax.swing.GroupLayout(jpnDoiMK);
        jpnDoiMK.setLayout(jpnDoiMKLayout);
        jpnDoiMKLayout.setHorizontalGroup(
                jpnDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnDoiMKLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jlbDoiMK)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDoiMKLayout.setVerticalGroup(
                jpnDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDoiMKLayout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(jlbDoiMK)
                                .addGap(18, 18, 18))
        );

        jpnDangXuat.setBackground(new java.awt.Color(54, 33, 89));

        jlbDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        jlbDangXuat.setText("Đăng xuất");

        javax.swing.GroupLayout jpnDangXuatLayout = new javax.swing.GroupLayout(jpnDangXuat);
        jpnDangXuat.setLayout(jpnDangXuatLayout);
        jpnDangXuatLayout.setHorizontalGroup(
                jpnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnDangXuatLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jlbDangXuat)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDangXuatLayout.setVerticalGroup(
                jpnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnDangXuatLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jlbDangXuat)
                                .addContainerGap(26, Short.MAX_VALUE))
        );

        jpnDKHP.setBackground(new java.awt.Color(54, 33, 89));
        jpnDKHP.setPreferredSize(new java.awt.Dimension(173, 54));

        jlbDKHP.setForeground(new java.awt.Color(255, 255, 255));
        jlbDKHP.setText("KÌ ĐĂNG KÍ HỌC PHẦN");

        javax.swing.GroupLayout jpnDKHPLayout = new javax.swing.GroupLayout(jpnDKHP);
        jpnDKHP.setLayout(jpnDKHPLayout);
        jpnDKHPLayout.setHorizontalGroup(
                jpnDKHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnDKHPLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jlbDKHP)
                                .addContainerGap(71, Short.MAX_VALUE))
        );
        jpnDKHPLayout.setVerticalGroup(
                jpnDKHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnDKHPLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jlbDKHP)
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        jpnLopHoc.setBackground(new java.awt.Color(54, 33, 89));
        jpnLopHoc.setPreferredSize(new java.awt.Dimension(173, 54));

        jlbLopHoc.setForeground(new java.awt.Color(255, 255, 255));
        jlbLopHoc.setText("LỚP HỌC");

        javax.swing.GroupLayout jpnLopHocLayout = new javax.swing.GroupLayout(jpnLopHoc);
        jpnLopHoc.setLayout(jpnLopHocLayout);
        jpnLopHocLayout.setHorizontalGroup(
                jpnLopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnLopHocLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jlbLopHoc)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnLopHocLayout.setVerticalGroup(
                jpnLopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnLopHocLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jlbLopHoc)
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        jpnMonHoc.setBackground(new java.awt.Color(54, 33, 89));
        jpnMonHoc.setPreferredSize(new java.awt.Dimension(173, 54));

        jlbMonHoc.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonHoc.setText("MÔN HỌC");

        javax.swing.GroupLayout jpnMonHocLayout = new javax.swing.GroupLayout(jpnMonHoc);
        jpnMonHoc.setLayout(jpnMonHocLayout);
        jpnMonHocLayout.setHorizontalGroup(
                jpnMonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnMonHocLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jlbMonHoc)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnMonHocLayout.setVerticalGroup(
                jpnMonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnMonHocLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jlbMonHoc)
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        jpnHocPhan.setBackground(new java.awt.Color(54, 33, 89));
        jpnHocPhan.setPreferredSize(new java.awt.Dimension(173, 54));

        jlbHocPhan.setForeground(new java.awt.Color(255, 255, 255));
        jlbHocPhan.setText("HỌC PHẦN");

        javax.swing.GroupLayout jpnHocPhanLayout = new javax.swing.GroupLayout(jpnHocPhan);
        jpnHocPhan.setLayout(jpnHocPhanLayout);
        jpnHocPhanLayout.setHorizontalGroup(
                jpnHocPhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnHocPhanLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jlbHocPhan)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnHocPhanLayout.setVerticalGroup(
                jpnHocPhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnHocPhanLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jlbHocPhan)
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        jpnHocKi.setBackground(new java.awt.Color(54, 33, 89));
        jpnHocKi.setPreferredSize(new java.awt.Dimension(173, 54));

        jlbHocKi.setForeground(new java.awt.Color(255, 255, 255));
        jlbHocKi.setText("HỌC KÌ");

        javax.swing.GroupLayout jpnHocKiLayout = new javax.swing.GroupLayout(jpnHocKi);
        jpnHocKi.setLayout(jpnHocKiLayout);
        jpnHocKiLayout.setHorizontalGroup(
                jpnHocKiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnHocKiLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jlbHocKi)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnHocKiLayout.setVerticalGroup(
                jpnHocKiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnHocKiLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jlbHocKi)
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnDoiMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                        .addComponent(jpnSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                        .addComponent(jpnGiaoVu, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                        .addComponent(jpnMonHoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                        .addComponent(jpnHocPhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                        .addComponent(jpnHocKi, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                        .addComponent(jpnLopHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addComponent(jpnDKHP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpnSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpnGiaoVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnHocKi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnDKHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                        .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

}
