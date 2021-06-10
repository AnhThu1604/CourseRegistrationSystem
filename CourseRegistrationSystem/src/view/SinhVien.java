package view;

import bean.DanhMuc;
import controller.ChuyenManHinhSV;

import java.util.ArrayList;
import java.util.List;


public class SinhVien extends javax.swing.JFrame {


    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlbDangKi;
    private javax.swing.JLabel jlbDangXuat;
    private javax.swing.JLabel jlbDoiMK;
    private javax.swing.JLabel jlbThongTin;
    private javax.swing.JPanel jpnDangKi;
    private javax.swing.JPanel jpnDangXuat;
    private javax.swing.JPanel jpnDoiMK;
    private javax.swing.JPanel jpnThongTin;
    private javax.swing.JPanel jpnView;

    public SinhVien() {
        initComponents();
        /*------------------------Tham khao tren mang------------------------*/
        this.setTitle("Tai khoan sinh vien");
        ChuyenManHinhSV controller = new ChuyenManHinhSV(jpnView);

        controller.setView(jpnThongTin, jlbThongTin, "jpnThongTin");
        List<DanhMuc> list = new ArrayList<>();
        list.add(new DanhMuc("jpnThongTin", jpnThongTin, jlbThongTin));
        list.add(new DanhMuc("jpnDangKi", jpnDangKi, jlbDangKi));
        list.add(new DanhMuc("jpnDoiMK", jpnDoiMK, jlbDoiMK));
        list.add(new DanhMuc("jpnDangXuat", jpnDangXuat, jlbDangXuat));
        controller.setEvent(list);
        /*-------------------------------------------------------------------*/
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnThongTin = new javax.swing.JPanel();
        jlbThongTin = new javax.swing.JLabel();
        jpnDangXuat = new javax.swing.JPanel();
        jlbDangXuat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpnDangKi = new javax.swing.JPanel();
        jlbDangKi = new javax.swing.JLabel();
        jpnDoiMK = new javax.swing.JPanel();
        jlbDoiMK = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jpnThongTin.setBackground(new java.awt.Color(54, 33, 89));

        jlbThongTin.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongTin.setText("Thông tin cá nhân");

        javax.swing.GroupLayout jpnThongTinLayout = new javax.swing.GroupLayout(jpnThongTin);
        jpnThongTin.setLayout(jpnThongTinLayout);
        jpnThongTinLayout.setHorizontalGroup(
                jpnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnThongTinLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jlbThongTin)
                                .addContainerGap(87, Short.MAX_VALUE))
        );
        jpnThongTinLayout.setVerticalGroup(
                jpnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnThongTinLayout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(jlbThongTin)
                                .addGap(18, 18, 18))
        );

        jpnDangXuat.setBackground(new java.awt.Color(54, 33, 89));

        jlbDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        jlbDangXuat.setText("Đăng xuất");

        javax.swing.GroupLayout jpnDangXuatLayout = new javax.swing.GroupLayout(jpnDangXuat);
        jpnDangXuat.setLayout(jpnDangXuatLayout);
        jpnDangXuatLayout.setHorizontalGroup(
                jpnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDangXuatLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbDangXuat)
                                .addGap(105, 105, 105))
        );
        jpnDangXuatLayout.setVerticalGroup(
                jpnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDangXuatLayout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(jlbDangXuat)
                                .addGap(17, 17, 17))
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TÀI KHOẢN SINH VIÊN");

        jpnDangKi.setBackground(new java.awt.Color(54, 33, 89));

        jlbDangKi.setForeground(new java.awt.Color(255, 255, 255));
        jlbDangKi.setText("Đăng kí học phần");

        javax.swing.GroupLayout jpnDangKiLayout = new javax.swing.GroupLayout(jpnDangKi);
        jpnDangKi.setLayout(jpnDangKiLayout);
        jpnDangKiLayout.setHorizontalGroup(
                jpnDangKiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnDangKiLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jlbDangKi)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDangKiLayout.setVerticalGroup(
                jpnDangKiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDangKiLayout.createSequentialGroup()
                                .addContainerGap(22, Short.MAX_VALUE)
                                .addComponent(jlbDangKi)
                                .addGap(20, 20, 20))
        );

        jpnDoiMK.setBackground(new java.awt.Color(54, 33, 89));

        jlbDoiMK.setForeground(new java.awt.Color(255, 255, 255));
        jlbDoiMK.setText("Đổi mật khẩu");

        javax.swing.GroupLayout jpnDoiMKLayout = new javax.swing.GroupLayout(jpnDoiMK);
        jpnDoiMK.setLayout(jpnDoiMKLayout);
        jpnDoiMKLayout.setHorizontalGroup(
                jpnDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDoiMKLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbDoiMK)
                                .addGap(94, 94, 94))
        );
        jpnDoiMKLayout.setVerticalGroup(
                jpnDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDoiMKLayout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(jlbDoiMK)
                                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpnThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnDangKi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnDoiMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jpnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                                .addComponent(jpnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
                jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 480, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
                jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 550, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

}
