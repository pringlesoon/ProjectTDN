package ReadTDN;

import com.mysql.jdbc.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

public class JFrameRegister extends Master { //Kelas dan Objek

    public String userName = "";
    public String nama = "";
    public String noTelpon = "";
    public String tanggal = "";
    public String alamat = "";
    public String eMail = "";
    public String role = "";
    public String passWord = "";
    public String rePassword = "";
    
    public JFrameRegister() { //Kelas dan Objek
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namaTxt = new javax.swing.JTextField();
        noTelpTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        roleSelect = new javax.swing.JComboBox<>();
        emailTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        rePasswordTxt = new javax.swing.JPasswordField();
        registBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tglLahirCh = new com.toedter.calendar.JDateChooser();
        jCShowPassword1 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        alamatTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 51));

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        jLabel1.setFont(new java.awt.Font("Trajan Pro 3", 1, 48)); // NOI18N
        jLabel1.setText("READTDN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("SMART-LIBRARY");

        jLabel3.setText("Nama Lengkap");

        jLabel4.setText("No Telepon");

        namaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTxtActionPerformed(evt);
            }
        });

        noTelpTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTelpTxtActionPerformed(evt);
            }
        });

        jLabel8.setText("Tanggal Lahir");

        jLabel5.setText("Username");

        jLabel6.setText("Email");

        jLabel7.setText("Role");

        roleSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pegawai", "Pengunjung" }));
        roleSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleSelectActionPerformed(evt);
            }
        });

        jLabel9.setText("Password");

        jLabel10.setText("Re-Password");

        registBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registBtn.setText("REGISTER");
        registBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registBtnActionPerformed(evt);
            }
        });

        jLabel11.setText("You already have to an account? ");

        jCShowPassword1.setText("Show Password");
        jCShowPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCShowPassword1ActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Login now!");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setText("Alamat");

        alamatTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13)
                            .addComponent(alamatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(tglLahirCh, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(noTelpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7)
                                            .addComponent(roleSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jCShowPassword1)
                            .addComponent(rePasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(412, 412, 412)
                                .addComponent(registBtn))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(361, 361, 361)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noTelpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tglLahirCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alamatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(jLabel5))
                    .addComponent(roleSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rePasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCShowPassword1)
                .addGap(31, 31, 31)
                .addComponent(registBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTxtActionPerformed

    private void registBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registBtnActionPerformed
        Date date = tglLahirCh.getDate();
    if (date != null) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        tanggal = dateFormat.format(date);
    } else {
        JOptionPane.showMessageDialog(this, "Isi tanggal tidak boleh kosong!", "Try Again", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    userName = usernameTxt.getText(); //Enkapsulasi adalah konsep untuk menyembunyikan detail implementasi dari luar, dan hanya mengekspos fungsionalitas yang dibutuhkan.
    nama = namaTxt.getText();
    noTelpon = noTelpTxt.getText(); 
    alamat = alamatTxt.getText();
    eMail = emailTxt.getText();
    
    passWord = new String(passwordTxt.getPassword());
    rePassword = new String(rePasswordTxt.getPassword());
    role = roleSelect.getSelectedItem().toString();
    
    if (userName.isEmpty() || passWord.isEmpty() || nama.isEmpty() || noTelpon.isEmpty() || alamat.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong!", "Message", JOptionPane.INFORMATION_MESSAGE);
    } else if (passWord.length() < 8) {
        JOptionPane.showMessageDialog(this, "Password Harus Diisi Minimal 8 Karakter", "Message", JOptionPane.INFORMATION_MESSAGE);
    } else if (!passWord.equals(rePassword)) {
        JOptionPane.showMessageDialog(this, "Password Tidak Sesuai!", "Message", JOptionPane.INFORMATION_MESSAGE);
    } else {
        try {
            String checkUsernameSql = "SELECT userName from user WHERE userName = '" + userName + "'";
            ResultSet rs = (ResultSet) db.getRS(checkUsernameSql);
            if (rs.last()) {
                int rows = rs.getRow();
                if (rows == 1) {
                    JOptionPane.showMessageDialog(this, "Username ini sudah digunakan!", "Warning", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            
            String insertUserSql = "INSERT INTO user(userName, passWord, role) VALUES('" + userName + "', '" + passWord + "', '" + role + "')";
            boolean userSuccess = db.Execute(insertUserSql);
            
            String insertMemberSql = "INSERT INTO member(userName, nama, tgl_lahir, email, no_telp, alamat) VALUES('" + userName + "', '" + nama + "', '" + tanggal + "', '" + eMail + "', '" + noTelpon + "', '" + alamat + "')";
            boolean memberSuccess = db.Execute(insertMemberSql);
            
            if (userSuccess && memberSuccess) {
                JOptionPane.showMessageDialog(this, "Berhasil melakukan Registrasi", "Massage", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new JFrameLogin().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Gagal melakukan Registrasi!", "Warning!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }//GEN-LAST:event_registBtnActionPerformed

    private void alamatTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatTxtActionPerformed

    private void jCShowPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCShowPassword1ActionPerformed
        if (jCShowPassword1.isSelected()) {
            passwordTxt.setEchoChar((char) 0);
            rePasswordTxt.setEchoChar((char) 0);
        }
        
        else {
            passwordTxt.setEchoChar('*');
            rePasswordTxt.setEchoChar('*');
        }
    }//GEN-LAST:event_jCShowPassword1ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        JFrameLogin login = new JFrameLogin();
        login.main(null);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void roleSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleSelectActionPerformed

    private void noTelpTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTelpTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noTelpTxtActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameRegister().setVisible(true); //Inheritance (Pewarisan)mewarisi kelas 'Master'
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JCheckBox jCShowPassword1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField namaTxt;
    private javax.swing.JTextField noTelpTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JPasswordField rePasswordTxt;
    private javax.swing.JButton registBtn;
    public javax.swing.JComboBox<String> roleSelect;
    private com.toedter.calendar.JDateChooser tglLahirCh;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables

    private String hashPassword(String passWord) { //ecapsulation
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
}

//Program ini menunjukkan penggunaan dasar dari konsep-konsep OOP dalam Java, seperti enkapsulasi, inheritance, dan polymorphism, serta integrasi dengan antarmuka pengguna (GUI) menggunakan Java Swing.
