/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AppManajemenWisata;

import com.formdev.flatlaf.*;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class dataForm extends javax.swing.JFrame {
    
    public dataForm() {
        initComponents();
        loadData();
        verifikasiLogin();
//        showCount();
    }
    private void loadData() {
        List<Data> dataList = collectData();
        addCardsPanel(headlinesNews, dataList);
        greeting.setText("Selamat Datang, " + loginForm.nama);
    }
//    private void showCount(){
//        int totalBaris = totalData();
//        count.setText(""+totalBaris);
//        count.setHorizontalAlignment(SwingConstants.CENTER);
//    }
    private List<Data> collectData() {
        List<Data> dataList = new ArrayList<>();
        try (Connection con = db.getConnection()) {
            String query = "SELECT tema_mpw, lokasi_mpw, tgl_mpw, biaya_mpw, kegiatan_mpw, image_mpw FROM tb_data ORDER BY id_mpw DESC LIMIT 3";
            try (Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
                System.out.println("Berhasil terhubung");
                while (rs.next()) {
                    String tema = rs.getString("tema_mpw");
                    String lokasi = rs.getString("lokasi_mpw");
                    String tanggal = rs.getString("tgl_mpw");
                    String biaya = rs.getString("biaya_mpw");
                    String kegiatan = rs.getString("kegiatan_mpw");
                    String gambar = rs.getString("image_mpw");  
                    
                    
                    dataList.add(new Data(tema, lokasi, tanggal, biaya, kegiatan, gambar));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataList;
    }
    private JPanel createCard(String tema,String lokasi, String tanggal, String biaya, String kegiatan, String gambar) {
        JPanel card = new JPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBackground(new Color(255, 153, 0));

        JLabel imgLabel = new JLabel();
         try {
            BufferedImage img = ImageIO.read(getClass().getResource("/AppManajemenWisata/img/" + gambar));
            Image resizedImg = img.getScaledInstance(240, 80, Image.SCALE_SMOOTH);
            imgLabel.setIcon(new ImageIcon(resizedImg));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        JLabel temaLabel = new JLabel(tema);
        temaLabel.setFont(new java.awt.Font("Poppins", 0, 14));
        temaLabel.setForeground(Color.WHITE);
        JLabel lokasiLabel = new JLabel("Liburan ke " + lokasi);
        lokasiLabel.setFont(new java.awt.Font("Poppins", 0, 14));
        lokasiLabel.setForeground(Color.WHITE);
        JLabel biayaLabel = new JLabel("Rp. " + biaya);
        biayaLabel.setFont(new java.awt.Font("Poppins", 0, 14));
        biayaLabel.setForeground(Color.WHITE);
        JLabel tanggalLabel = new JLabel("Periode " + tanggal);
        tanggalLabel.setFont(new java.awt.Font("Poppins", 0, 12));
        tanggalLabel.setForeground(Color.WHITE);
        card.add(imgLabel);
        card.add(temaLabel);
        card.add(lokasiLabel);
        card.add(biayaLabel);
        card.add(tanggalLabel);
        
        card.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        card.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        return card;
    }
    private void addCardsPanel(JPanel panel, List<Data> dataList) {
        panel.removeAll();
        for (Data data : dataList) {
            JPanel card = createCard(data.getTema(), data.getLokasi(), data.getTanggal(), data.getBiaya(), data.getKegiatan(), data.getGambar());
            panel.add(card);
        }
        panel.revalidate();
        panel.repaint();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Bds = new javax.swing.JButton();
        BLg = new javax.swing.JButton();
        BBt = new javax.swing.JButton();
        BBt1 = new javax.swing.JButton();
        Bmng = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        greeting = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        bg_dsb = new javax.swing.JPanel();
        headlinesNews = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/Untitled-1.png"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 20, 100, 100);

        Bds.setBackground(new java.awt.Color(255, 153, 0));
        Bds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/ds.png"))); // NOI18N
        Bds.setToolTipText("");
        jPanel3.add(Bds);
        Bds.setBounds(20, 140, 100, 37);

        BLg.setBackground(new java.awt.Color(51, 51, 51));
        BLg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/logout.png"))); // NOI18N
        BLg.setToolTipText("");
        BLg.setContentAreaFilled(false);
        BLg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLgActionPerformed(evt);
            }
        });
        jPanel3.add(BLg);
        BLg.setBounds(20, 420, 100, 37);

        BBt.setBackground(new java.awt.Color(255, 153, 0));
        BBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/BookT.png"))); // NOI18N
        BBt.setToolTipText("");
        BBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBtActionPerformed(evt);
            }
        });
        jPanel3.add(BBt);
        BBt.setBounds(20, 240, 100, 37);

        BBt1.setBackground(new java.awt.Color(255, 153, 0));
        BBt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/list.png"))); // NOI18N
        BBt1.setToolTipText("");
        BBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBt1ActionPerformed(evt);
            }
        });
        jPanel3.add(BBt1);
        BBt1.setBounds(20, 290, 100, 37);

        Bmng.setBackground(new java.awt.Color(255, 153, 0));
        Bmng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/mng.png"))); // NOI18N
        Bmng.setToolTipText("");
        Bmng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmngActionPerformed(evt);
            }
        });
        jPanel3.add(Bmng);
        Bmng.setBounds(20, 190, 100, 37);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(0, 0, 140, 490);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/exit.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(908, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel1);
        jPanel1.setBounds(-3, 0, 960, 50);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(null);

        greeting.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        greeting.setForeground(new java.awt.Color(255, 255, 255));
        greeting.setText("App untuk mempermudah pendataan DEMO 1.0");
        jPanel2.add(greeting);
        greeting.setBounds(170, 30, 764, 48);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Penciptaan aplikasi untuk memenuhi tugas dosen Heri Wahyudi, S.T.,M.Kom.");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(170, 90, 467, 20);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/bg2.jpg"))); // NOI18N
        jPanel2.add(bg);
        bg.setBounds(0, 20, 970, 190);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(0, 30, 950, 200);

        bg_dsb.setBackground(new java.awt.Color(255, 255, 255));
        bg_dsb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg_dsb.setLayout(null);

        headlinesNews.setBackground(new java.awt.Color(255, 153, 0));
        headlinesNews.setForeground(new java.awt.Color(255, 255, 255));
        headlinesNews.setLayout(new java.awt.GridLayout(1, 0));
        bg_dsb.add(headlinesNews);
        headlinesNews.setBounds(180, 60, 720, 180);

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("EVENT TERBARU UNTUK KAMU !!");
        bg_dsb.add(jLabel5);
        jLabel5.setBounds(180, 20, 220, 40);

        jPanel4.add(bg_dsb);
        bg_dsb.setBounds(0, 230, 950, 260);
        bg_dsb.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BmngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmngActionPerformed
        // TODO add your handling code here:
        if (loginForm.userRole.equals("admin")) {
            new menuAdmin().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Access Denied. Only admins can access this section.");
        }
    }//GEN-LAST:event_BmngActionPerformed

    private void BBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBtActionPerformed
        // TODO add your handling code here:
        if (loginForm.userRole.equals("user")) {
            new bookForm().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Access Denied. Only USER can access this section.");
        }
    }//GEN-LAST:event_BBtActionPerformed

    private void BBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBt1ActionPerformed
        // TODO add your handling code here
        new tabelBook().setVisible(true);
        dispose();
    }//GEN-LAST:event_BBt1ActionPerformed

    private void BLgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLgActionPerformed
        // TODO add your handling code here:
        hapusSesi();
        balikLogin();
    }//GEN-LAST:event_BLgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Frame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Yakin pengen keluar??",
            "Aplikasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        }catch(Exception e){
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBt;
    private javax.swing.JButton BBt1;
    private javax.swing.JButton BLg;
    private javax.swing.JButton Bds;
    private javax.swing.JButton Bmng;
    private javax.swing.JLabel bg;
    private javax.swing.JPanel bg_dsb;
    private javax.swing.JLabel greeting;
    private javax.swing.JPanel headlinesNews;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
    
    
//    public class GradientPanel extends JPanel {
//        private Color color1;
//        private Color color2;
//
//        public GradientPanel(Color color1, Color color2) {
//            this.color1 = color1;
//            this.color2 = color2;
//            setOpaque(false);
//        }
//
//        public GradientPanel(int r1, int g1, int b1, int r2, int g2, int b2) {
//            this.color1 = new Color(r1, g1, b1);
//            this.color2 = new Color(r2, g2, b2);
//            setOpaque(false);
//        }
//
//        @Override
//        protected void paintComponent(Graphics g) {
//            super.paintComponent(g);
//            Graphics2D g2d = (Graphics2D) g.create();
//            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//            int lebar = getWidth();
//            int tinggi = getHeight();
//            GradientPaint gp = new GradientPaint(0, 0, color1, 0, tinggi, color2);
//            g2d.setPaint(gp);
//            g2d.fillRect(0, 0, lebar, tinggi);
//
//            g2d.dispose();
//        }
//    }

    private void verifikasiLogin(){
        if (!loginForm.userRole.equals("admin")) {
            // Jika bukan admin, sembunyikan tombol Manage Data
            Bmng.setVisible(true);
        }
    }
//    private int totalData(){
//        int totalRows = 0;
//        try (Connection con = db.getConnection(); Statement stmt = con.createStatement()){
//            String choose = "SELECT COUNT(*) FROM tb_data WHERE lokasi_mpw = 'Bali'";
//            ResultSet rs = stmt.executeQuery(choose);
//            if (rs.next()) {
//                totalRows = rs.getInt(1);
//                System.out.println("Total Rows: " + totalRows);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(dataForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return totalRows;
//    }
    private void hapusSesi(){
        loginForm.nama = null;
        loginForm.userRole = null;
    }
    private void balikLogin(){
        loginForm LoginForm = new loginForm();
        LoginForm.setVisible(true);
        this.dispose();
    }
}
