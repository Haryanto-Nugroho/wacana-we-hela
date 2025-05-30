/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AppManajemenWisata;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class bookForm extends javax.swing.JFrame {
    private Map<String, String> destinationMap;
    private String kodeBooking;
    private String nama;
    private String alamat;
    private String notelp;
    private String selectedDestination;
    private String lokasi;
    private String tanggal;
    private String biaya;
    
    public bookForm() {
        initComponents();
        populateDestinations();
        nama_pmsn.setText(loginForm.nama);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama_pmsn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat_pmsn = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        tema = new javax.swing.JComboBox<>();
        no_telp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kirim = new javax.swing.JButton();
        close = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/slogan.png"))); // NOI18N
        jPanel2.add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/line.png"))); // NOI18N
        jPanel2.add(jLabel3);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/logo3.png"))); // NOI18N
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(80, 40, 330, 70);

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pilih Destinasi");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 200, 130, 22);

        nama_pmsn.setEditable(false);
        nama_pmsn.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        nama_pmsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_pmsnActionPerformed(evt);
            }
        });
        jPanel1.add(nama_pmsn);
        nama_pmsn.setBounds(80, 160, 340, 30);

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama Pemesan");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 140, 130, 22);

        alamat_pmsn.setColumns(20);
        alamat_pmsn.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        alamat_pmsn.setRows(4);
        alamat_pmsn.setAutoscrolls(false);
        jScrollPane1.setViewportView(alamat_pmsn);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 280, 340, 100);

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat Pemesan");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 260, 130, 22);

        tema.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.add(tema);
        tema.setBounds(80, 220, 340, 30);

        no_telp.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        no_telp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_telpActionPerformed(evt);
            }
        });
        jPanel1.add(no_telp);
        no_telp.setBounds(80, 410, 340, 30);

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No Handphone");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 390, 130, 22);

        kirim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/kirim.png"))); // NOI18N
        kirim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kirimActionPerformed(evt);
            }
        });
        jPanel1.add(kirim);
        kirim.setBounds(330, 460, 90, 30);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/close.png"))); // NOI18N
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close);
        close.setBounds(450, 0, 50, 50);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/back.png"))); // NOI18N
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(0, 0, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nama_pmsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_pmsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_pmsnActionPerformed

    private void no_telpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_telpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_telpActionPerformed

    private void kirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kirimActionPerformed
        // TODO add your handling code here:
        String nama = nama_pmsn.getText();
        String alamat = alamat_pmsn.getText();
        String notelp = no_telp.getText();
        String selectedDestination = (String) tema.getSelectedItem();
        String kodeMpw = getKeyByValue(destinationMap, selectedDestination);
        String kodeBooking = buatKodebooking();
        saveBooking(kodeBooking, nama, alamat, notelp, kodeMpw);
        
        Map<String, String> details = getAdditionalDetails(kodeMpw);
        String lokasi = details.get("lokasi");
        String tanggal = details.get("tanggal");
        String biaya = details.get("biaya");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detailDaftar(kodeBooking, nama, alamat, notelp, selectedDestination, lokasi, tanggal, biaya).setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_kirimActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        Frame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Yakin pengen keluar??",
            "Aplikasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_closeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        dataForm dataForm = new dataForm();
        dataForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(bookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookForm().setVisible(true);
            }
        });
    }
    private String getKeyByValue(Map<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
    private void populateDestinations() {
        
        destinationMap = getDestinations();
        for (String destination : destinationMap.values()) {
            tema.addItem(destination);
        }
    }
    private Map<String, String> getDestinations() {
        Map<String, String> destinations = new HashMap<>();
        try {
            Connection con = db.getConnection();
            Statement stmt = con.createStatement();
            String query = "SELECT kode_mpw, tema_mpw FROM tb_data";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                destinations.put(rs.getString("kode_mpw"), rs.getString("tema_mpw"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return destinations;
    }
    private void saveBooking(String kodeBooking, String name, String address, String phone, String kodeMpw) {
        try {
            Connection con = db.getConnection();
            Statement stmt = con.createStatement();
            String query = "INSERT INTO tb_booking (kode_bookingan, nama_pemesan, alamat_pemesan, notelp, kode_mpw) VALUES ('"+ kodeBooking +"','" + name + "', '" + address + "', '" + phone + "', '" + kodeMpw + "')";
            stmt.executeUpdate(query);
            con.close();
            JOptionPane.showMessageDialog(this, "Pemesanan Berhasil!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error Menyimpan Pemesanan");
        }
    }
    private String buatKodebooking(){
        String abjad = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random acak = new Random();
        StringBuilder rakit = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            rakit.append(abjad.charAt(acak.nextInt(abjad.length())));
        }
        return rakit.toString();
    }
    private Map<String, String> getAdditionalDetails(String kodeMpw) {
        Map<String, String> details = new HashMap<>();
        try {
            Connection con = db.getConnection();
            Statement stmt = con.createStatement();
            String query = "SELECT lokasi_mpw, tgl_mpw, biaya_mpw FROM tb_data WHERE kode_mpw = '" + kodeMpw + "'";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                details.put("lokasi", rs.getString("lokasi_mpw"));
                details.put("tanggal", rs.getString("tgl_mpw"));
                details.put("biaya", rs.getString("biaya_mpw"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return details;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat_pmsn;
    private javax.swing.JButton back;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kirim;
    private javax.swing.JTextField nama_pmsn;
    private javax.swing.JTextField no_telp;
    private javax.swing.JComboBox<String> tema;
    // End of variables declaration//GEN-END:variables
}
