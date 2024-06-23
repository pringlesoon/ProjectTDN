package ReadTDN;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.nio.charset.Charset;
import java.sql.*;
import javax.swing.JOptionPane;// Mengimpor kelas JOptionPane dari paket javax.swing
import java.nio.charset.StandardCharsets; // Mengimpor kelas StandardCharsets dari paket java.nio.charset
import java.security.MessageDigest;// Mengimpor kelas MessageDigest dari paket java.security
import java.security.NoSuchAlgorithmException; // Mengimpor kelas NoSuchAlgorithmException dari paket java.security
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;// Mengimpor kelas JDialog dari paket javax.swing, Inheritance meng-extend JDialog untuk menampilkan GUI login sebagai dialog.

public class JFrameLogin extends JDialog { // Inheritance, Mendefinisikan kelas JFrameLogin yang merupakan turunan dari JDialog

    String userName = ""; //Enkapsulasi
    String passWord = ""; //Enkapsulasi

    protected Database db = new Database(); //Ecapsulasi, Membuat objek db dari kelas Database

    public JFrameLogin() { // Konstruktor JFrameLogin
        initComponents(); // Polymorphism (Override method), Metode ini digunakan untuk menginisialisasi semua komponen GUI yang ada, seperti label, text field, checkbox, dan button.

        setModal(true); // Menetapkan dialog ini sebagai modal, sehingga harus ditutup sebelum kembali ke dialog induk
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        showPassword = new javax.swing.JCheckBox();
        loginBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        registBtn = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        jLabel1.setFont(new java.awt.Font("Trajan Pro 3", 1, 48)); // NOI18N
        jLabel1.setText("READTDN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("SMART-LIBRARY");

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Dont have an account?");

        registBtn.setForeground(new java.awt.Color(0, 0, 255));
        registBtn.setText("Register!");
        registBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showPassword)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(usernameText, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(passwordText)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPassword)
                .addGap(73, 73, 73)
                .addComponent(loginBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(registBtn))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registBtnMouseClicked
        JFrameRegister regis = new JFrameRegister();
        regis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registBtnMouseClicked

    //Method ini dipanggil ketika tombol "LOGIN" diklik. Mengambil username dan password dari input, melakukan hash terhadap password, dan memeriksa ke database apakah username dan password yang 
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        userName = usernameText.getText();
        passWord = new String(passwordText.getPassword());
        
        try
        {
            String sql = "SELECT A.username, password, role, B.nama FROM user A JOIN member B ON A.username = B.username "
                    + "WHERE A.username='" + userName + "' AND A.password='" + passWord + "'";
            com.mysql.jdbc.ResultSet rs = (com.mysql.jdbc.ResultSet) db.getRS(sql);
            int size = 0;
            while (rs.next()) 
            {
                db.loggedInNamaUser = rs.getString("nama");
                db.role = rs.getString("role");
                size++;
            }
            if (size == 0)
            {
                JOptionPane.showMessageDialog(this, "Pastikan username dan password yang anda masukkan benar!", "Login", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            JOptionPane.showMessageDialog(this, "Login Berhasil!", "Message" , JOptionPane.INFORMATION_MESSAGE);
            
            db.loggedInUser = userName;
            
            
            this.dispose();
            
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_loginBtnActionPerformed

    //Method ini dipanggil ketika checkbox "Show Password" diubah statusnya. Jika checkbox di-check, password akan ditampilkan sebagai plain text.
    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
            passwordText.setEchoChar((char) 0);
        } else {
            passwordText.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    public String hashPassword(String passWord) {
        try 
        {
            MessageDigest messdig = MessageDigest.getInstance("MD5");
            byte[] hashedBytes = messdig.digest(passWord.getBytes(StandardCharsets.UTF_8));
            
            StringBuilder strBldr = new StringBuilder();
            for (byte hashedByte : hashedBytes) {
                strBldr.append(String.format("%02x", hashedByte));
            }
            
            return strBldr.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try { // Blok try-catch untuk mengatur tampilan GUI
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) { // Menangani pengecualian jika kelas tidak ditemukan
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) { // Menangani pengecualian jika terjadi kesalahan instansiasi
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) { //Menangani pengecualian jika terjadi kesalahan akses
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) { // Menangani pengecualian jika look and feel tidak didukung
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordText;
    public javax.swing.JLabel registBtn;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}

//Program ini mengimplementasikan konsep-konsep dasar OOP seperti enkapsulasi, inheritance, dan polymorphism.
