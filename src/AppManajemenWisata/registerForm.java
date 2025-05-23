/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AppManajemenWisata;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Acer
 */
public class registerForm extends javax.swing.JFrame {

    /**
     * Creates new form registerForm
     */
    public registerForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new GradientPanel(255, 153, 0, 51, 51, 51);
        bg_reg = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nama_reg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        username_reg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email_reg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cr_akun = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        confpass_reg = new javax.swing.JPasswordField();
        pass_reg = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel6.setLayout(null);

        bg_reg.setBackground(new java.awt.Color(51, 51, 51));
        bg_reg.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");
        bg_reg.add(jLabel3);
        jLabel3.setBounds(50, 130, 50, 22);
        bg_reg.add(nama_reg);
        nama_reg.setBounds(50, 150, 330, 40);

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        bg_reg.add(jLabel4);
        jLabel4.setBounds(50, 190, 90, 22);
        bg_reg.add(username_reg);
        username_reg.setBounds(50, 210, 330, 40);

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        bg_reg.add(jLabel5);
        jLabel5.setBounds(50, 250, 90, 22);
        bg_reg.add(email_reg);
        email_reg.setBounds(50, 270, 330, 40);

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        bg_reg.add(jLabel6);
        jLabel6.setBounds(50, 310, 90, 22);

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirmasi Ulang Password");
        bg_reg.add(jLabel7);
        jLabel7.setBounds(50, 370, 200, 22);

        cr_akun.setText("Buat");
        cr_akun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cr_akunActionPerformed(evt);
            }
        });
        bg_reg.add(cr_akun);
        cr_akun.setBounds(300, 450, 80, 40);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/back.png"))); // NOI18N
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        bg_reg.add(back);
        back.setBounds(0, 0, 50, 50);

        jLabel14.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Registrasi Akun App");
        bg_reg.add(jLabel14);
        jLabel14.setBounds(120, 60, 187, 28);
        bg_reg.add(confpass_reg);
        confpass_reg.setBounds(50, 390, 330, 40);
        bg_reg.add(pass_reg);
        pass_reg.setBounds(50, 330, 330, 40);

        jPanel6.add(bg_reg);
        bg_reg.setBounds(30, 30, 435, 513);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/Logo-orng.png"))); // NOI18N
        jPanel7.add(jLabel17);
        jLabel17.setBounds(120, 20, 200, 100);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/vektor.jpg"))); // NOI18N
        jPanel7.add(jLabel16);
        jLabel16.setBounds(20, 93, 400, 400);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/close-blck.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);
        jButton1.setBounds(390, 0, 50, 50);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(460, 30, 437, 513);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        loginForm LoginForm = new loginForm();
        LoginForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void cr_akunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cr_akunActionPerformed
        // TODO add your handling code here:
        String nama = nama_reg.getText().toString().trim();
        String username = username_reg.getText().toString().trim();
        String email = email_reg.getText().toString().trim();
        String password = pass_reg.getText().toString().trim();
        String conPassword = confpass_reg.getText().toString().trim();
        String role = "user";
        
        if (!password.equals(conPassword)) {
            JOptionPane.showMessageDialog(null, "Password tidak sesuai");
        }else if (password.equals("") || username.equals("")|| email.equals("")|| nama.equals("")) {
            JOptionPane.showMessageDialog(null, "tidak boleh kosong");
        }else{
            try {
                Connection con = db.getConnection();
                Statement sts = con.createStatement();
                String sql = "INSERT INTO tb_pengguna (username, password, email, nama, role)VALUES ('" + username + "', MD5('" + password + "'), '" + email + "', '" + nama + "', '" + role + "')";

                sts.executeUpdate(sql);
                con.close();
                JOptionPane.showMessageDialog(null, "Buat Akun Berhasil!");
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "terjadi kesalahan " + e.getMessage());
            }finally{
                this.dispose();
                loginForm a = new loginForm();
                a.setVisible(true);
            }
        }

    }//GEN-LAST:event_cr_akunActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerForm().setVisible(true);
            }
        });
    }
     public class GradientPanel extends JPanel {
        private Color color1;
        private Color color2;

        public GradientPanel(Color color1, Color color2) {
            this.color1 = color1;
            this.color2 = color2;
            setOpaque(false);
        }

        public GradientPanel(int r1, int g1, int b1, int r2, int g2, int b2) {
            this.color1 = new Color(r1, g1, b1);
            this.color2 = new Color(r2, g2, b2);
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int lebar = getWidth();
            int tinggi = getHeight();
            GradientPaint gp = new GradientPaint(0, 0, color1, lebar, 0, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, lebar, tinggi);

            g2d.dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel bg_reg;
    private javax.swing.JPasswordField confpass_reg;
    private javax.swing.JButton cr_akun;
    private javax.swing.JTextField email_reg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField nama_reg;
    private javax.swing.JPasswordField pass_reg;
    private javax.swing.JTextField username_reg;
    // End of variables declaration//GEN-END:variables
}
