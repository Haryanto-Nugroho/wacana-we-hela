
package AppManajemenWisata;

import com.formdev.flatlaf.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class loginForm extends javax.swing.JFrame {

    public static String userRole;
    public static String nama;

    
    public loginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_lForm = new GradientPanel(51, 51, 51, 255, 153, 0);
        panel_lform = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        i_email = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        LButton = new javax.swing.JButton();
        i_pass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg_lForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_lform.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/logoAccount-blck.png"))); // NOI18N
        jLabel16.setText("Login");

        i_email.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        i_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_emailActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel17.setText("Password");

        jLabel18.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel18.setText("Email atau Username");

        LButton.setBackground(new java.awt.Color(51, 51, 51));
        LButton.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        LButton.setForeground(new java.awt.Color(255, 255, 255));
        LButton.setText("LOGIN");
        LButton.setBorderPainted(false);
        LButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_lformLayout = new javax.swing.GroupLayout(panel_lform);
        panel_lform.setLayout(panel_lformLayout);
        panel_lformLayout.setHorizontalGroup(
            panel_lformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_lformLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_lformLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(panel_lformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addGroup(panel_lformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(i_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addComponent(i_email)))
                .addGap(40, 40, 40))
        );
        panel_lformLayout.setVerticalGroup(
            panel_lformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_lformLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(2, 2, 2)
                .addComponent(i_email, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(i_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(LButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        bg_lForm.add(panel_lform, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/exit.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPreferredSize(new java.awt.Dimension(23, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        bg_lForm.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 0, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/logo2.png"))); // NOI18N
        bg_lForm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 210, 90));

        LButton1.setBackground(new java.awt.Color(255, 153, 0));
        LButton1.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        LButton1.setForeground(new java.awt.Color(255, 255, 255));
        LButton1.setText("Register");
        LButton1.setBorderPainted(false);
        LButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LButton1ActionPerformed(evt);
            }
        });
        bg_lForm.add(LButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 200, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenWisata/img/awal.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(260, 307));
        bg_lForm.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 260, 307));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_lForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_lForm, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Frame frame = new JFrame("Exit");

        if (JOptionPane.showConfirmDialog(frame, "Yakin pengen keluar??",
            "Aplikasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LButtonActionPerformed
        String email = i_email.getText();
        String password = new String(i_pass.getPassword());

        if (verifikasiLogin(email, password)) {
            dataForm dataForm = new dataForm();
            dataForm.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Email atau Password salah!", "Login Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LButtonActionPerformed

    private void i_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i_emailActionPerformed

    private void LButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LButton1ActionPerformed
        // TODO add your handling code here:
        registerForm RegisterForm = new registerForm();
        RegisterForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_LButton1ActionPerformed

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
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LButton;
    private javax.swing.JButton LButton1;
    private javax.swing.JPanel bg_lForm;
    private javax.swing.JTextField i_email;
    private javax.swing.JPasswordField i_pass;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panel_lform;
    // End of variables declaration//GEN-END:variables

    private boolean verifikasiLogin(String identifikasi, String password) {
        Connection con = db.getConnection();
        String data = "SELECT * FROM tb_pengguna WHERE (username = ? OR email = ?) AND password = MD5(?) ";
        try {
            PreparedStatement sts = con.prepareStatement(data);
            sts.setString(1, identifikasi);
            sts.setString(2, identifikasi);
            sts.setString(3, password);
            ResultSet rs= sts.executeQuery();

            if (rs.next()) {
                loginForm.userRole = rs.getString("role");
                loginForm.nama = rs.getString("nama");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
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
//    public class GradientButton extends JButton {
//        private Color color1;
//        private Color color2;
//
//        public GradientButton(String text, Color color1, Color color2) {
//            super(text);
//            this.color1 = color1;
//            this.color2 = color2;
//            setContentAreaFilled(false);
//            setFocusPainted(false);
//            setBorderPainted(false);
//        }
//
//        @Override
//        protected void paintComponent(Graphics g) {
//            if (!isOpaque() && getModel().isPressed()) {
//                setOpaque(true);
//            } else if (isOpaque() && !getModel().isPressed()) {
//                setOpaque(false);
//            }
//
//            Graphics2D g2d = (Graphics2D) g.create();
//            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//            GradientPaint gp = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2);
//            g2d.setPaint(gp);
//            g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
//
//            super.paintComponent(g2d);
//            g2d.dispose();
//        }
//    }
}
