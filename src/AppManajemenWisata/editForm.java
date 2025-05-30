/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AppManajemenWisata;

import com.formdev.flatlaf.json.ParseException;
import java.awt.Frame;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class editForm extends javax.swing.JFrame {

    private String id;
    private String kode;
    private String tema;
    private String lokasi;
    private String tgl;
    private String biaya;
    private String kegiatan;
    private String image;
    private File selectedFile;
    
    public editForm(String kode, String tema, String lokasi, String tanggal, String biaya, String kegiatan, String image, String id) {
        initComponents();
        this.id = id;
        this.kode = kode;
        this.tema = tema;
        this.lokasi = lokasi;
        this.tgl = tanggal;
        this.biaya = biaya;
        this.kegiatan = kegiatan;
        this.image = image;
        try {
            isidata();
        } catch (java.text.ParseException ex) {
            Logger.getLogger(editForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kode_mpw_edit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tema_mpw_edit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        lokasi_mpw_edit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        biaya_mpw_edit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        kgt_mpw_edit = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        namaGmbr_edit = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        chsGmbr_edit = new javax.swing.JButton();
        upData = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tgl_mpw_edit = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Event");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 160, 220, 19);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/logo2.png"))); // NOI18N
        jLabel3.setText("DUF");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 40, 220, 100);

        kode_mpw_edit.setEditable(false);
        jPanel1.add(kode_mpw_edit);
        kode_mpw_edit.setBounds(80, 180, 200, 40);

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PENGEDITAN DATA EVENT DARI APLIKASI");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 20, 280, 19);

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tema Event");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 230, 220, 19);
        jPanel1.add(tema_mpw_edit);
        tema_mpw_edit.setBounds(80, 250, 200, 40);

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kegiatan");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(340, 230, 220, 19);

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pilih Gambar");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 370, 220, 19);

        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal Pelaksanaan");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(340, 160, 220, 19);

        jTextField4.setText("jTextField1");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(80, 250, 200, 40);
        jPanel1.add(lokasi_mpw_edit);
        lokasi_mpw_edit.setBounds(80, 320, 200, 40);

        jLabel9.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lokasi Destinasi");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 300, 220, 19);
        jPanel1.add(biaya_mpw_edit);
        biaya_mpw_edit.setBounds(80, 390, 200, 40);

        kgt_mpw_edit.setColumns(20);
        kgt_mpw_edit.setRows(5);
        jScrollPane1.setViewportView(kgt_mpw_edit);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(340, 250, 240, 110);

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tanggal Pelaksanaan");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(340, 160, 220, 19);

        namaGmbr_edit.setEditable(false);
        jPanel1.add(namaGmbr_edit);
        namaGmbr_edit.setBounds(340, 390, 180, 40);

        jLabel11.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Biaya");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(80, 370, 220, 19);

        chsGmbr_edit.setText("Choose");
        chsGmbr_edit.setEnabled(false);
        chsGmbr_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chsGmbr_editActionPerformed(evt);
            }
        });
        jPanel1.add(chsGmbr_edit);
        chsGmbr_edit.setBounds(520, 390, 60, 40);

        upData.setBackground(new java.awt.Color(255, 153, 0));
        upData.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        upData.setForeground(new java.awt.Color(255, 255, 255));
        upData.setText("UPLOAD");
        upData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upDataActionPerformed(evt);
            }
        });
        jPanel1.add(upData);
        upData.setBounds(465, 450, 110, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/close.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(590, 0, 50, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/back.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 0, 50, 50);
        jPanel1.add(tgl_mpw_edit);
        tgl_mpw_edit.setBounds(340, 180, 240, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chsGmbr_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chsGmbr_editActionPerformed
        // TODO add your handling code here:
//        JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
//        int result = fileChooser.showOpenDialog(this);
//        if (result == JFileChooser.APPROVE_OPTION) {
//            selectedFile = fileChooser.getSelectedFile();
//            namaGmbr_edit.setText(selectedFile.getName());
//        }
    }//GEN-LAST:event_chsGmbr_editActionPerformed

    private void upDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upDataActionPerformed
        // TODO add your handling code here:
        
            try {
                String kode = kode_mpw_edit.getText();
                String tema = tema_mpw_edit.getText();
                String lokasi = lokasi_mpw_edit.getText();
                java.util.Date tgl = tgl_mpw_edit.getDate();
                int biaya = Integer.parseInt(biaya_mpw_edit.getText());
                String kegiatan = kgt_mpw_edit.getText();                
             
                java.sql.Date tanggal = new java.sql.Date(tgl.getTime());
                EditDatakeDatabase(kode, tema, lokasi, tanggal, biaya, kegiatan);
                JOptionPane.showMessageDialog(this, "File uploaded and saved successfully!");
                new menuAdmin().setVisible(true);
                dispose();
                
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        
        
    }//GEN-LAST:event_upDataActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Frame frame = new JFrame("Exit");

        if (JOptionPane.showConfirmDialog(frame, "Yakin pengen keluar??",
            "Aplikasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        menuAdmin MenuAdmin = new menuAdmin();
        MenuAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editForm("1", "MPW001", "Tema 1", "Lokasi 1", "2024-07-01", "500000", "Kegiatan 1", "image.jpg").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField biaya_mpw_edit;
    private javax.swing.JButton chsGmbr_edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextArea kgt_mpw_edit;
    private javax.swing.JTextField kode_mpw_edit;
    private javax.swing.JTextField lokasi_mpw_edit;
    private javax.swing.JTextField namaGmbr_edit;
    private javax.swing.JTextField tema_mpw_edit;
    private com.toedter.calendar.JDateChooser tgl_mpw_edit;
    private javax.swing.JButton upData;
    // End of variables declaration//GEN-END:variables

    private void isidata() throws java.text.ParseException {
       kode_mpw_edit.setText(this.kode);
       kgt_mpw_edit.setText(this.kegiatan);
       lokasi_mpw_edit.setText(this.lokasi);
       biaya_mpw_edit.setText(this.biaya);
       tema_mpw_edit.setText(this.tema);
       try {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(this.tgl);
            tgl_mpw_edit.setDate(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
       namaGmbr_edit.setText(this.image);
    }
    private void EditDatakeDatabase(String kode, String tema, String lokasi,java.sql.Date tanggal, int biaya, String kegiatan) {
        Connection con = db.getConnection();
        String data = "UPDATE tb_data SET tema_mpw=?, lokasi_mpw=?, tgl_mpw=?, biaya_mpw=?, kegiatan_mpw=? WHERE kode_mpw=?";
        try {
            PreparedStatement sts = con.prepareStatement(data);
            sts.setString(1, tema);
            sts.setString(2, lokasi);
            sts.setDate(3, tanggal);
            sts.setInt(4, biaya);
            sts.setString(5, kegiatan);
            sts.setString(6, kode);

            sts.executeUpdate();
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
