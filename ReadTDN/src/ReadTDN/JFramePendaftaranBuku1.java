package ReadTDN;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import java.sql.*;
import javax.swing.JOptionPane;

import org.apache.commons.io.*;
import java.io.File;
import java.io.IOException;

public class JFramePendaftaranBuku1 extends Master {

    private String nama_file = "";

    public String bukuID = ""; //BUKUID DIPAKAI UNTUK UPDATE.
    public String judul = "";
    public String pengarang = "";
    public String penerbit = "";
    public String tahun = "";
    public String kategori = "";
    public String lokasi = "";

    public JFramePendaftaranBuku1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblJudul = new javax.swing.JLabel();
        judulText = new javax.swing.JTextField();
        lblPengarang = new javax.swing.JLabel();
        pengarangText = new javax.swing.JTextField();
        lblPenerbit = new javax.swing.JLabel();
        penerbitText = new javax.swing.JTextField();
        lblTahun = new javax.swing.JLabel();
        tahunText = new javax.swing.JTextField();
        lblKategori = new javax.swing.JLabel();
        lblLokasi = new javax.swing.JLabel();
        lokasiText = new javax.swing.JTextField();
        lblSampul = new javax.swing.JLabel();
        daftarBtn = new javax.swing.JButton();
        kategoriList = new javax.swing.JComboBox<>();
        uploadBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        lblBuku = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJudul.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblJudul.setText("Judul");
        jPanel1.add(lblJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 95, 37, -1));
        jPanel1.add(judulText, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 116, 201, -1));

        lblPengarang.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblPengarang.setText("pengarang");
        jPanel1.add(lblPengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 150, -1, -1));
        jPanel1.add(pengarangText, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 171, 201, -1));

        lblPenerbit.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblPenerbit.setText("Penerbit");
        jPanel1.add(lblPenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 205, -1, -1));
        jPanel1.add(penerbitText, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 226, 201, -1));

        lblTahun.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblTahun.setText("Tahun");
        jPanel1.add(lblTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 254, -1, -1));
        jPanel1.add(tahunText, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 275, 201, -1));

        lblKategori.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblKategori.setText("Kategori");
        jPanel1.add(lblKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 309, -1, -1));

        lblLokasi.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblLokasi.setText("Lokasi");
        jPanel1.add(lblLokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 358, -1, -1));
        jPanel1.add(lokasiText, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 379, 201, -1));

        lblSampul.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblSampul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblSampul, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 280, 374));

        daftarBtn.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 13)); // NOI18N
        daftarBtn.setText("Daftar");
        daftarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(daftarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 90, 33));

        kategoriList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(kategoriList, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 330, 201, -1));

        uploadBtn.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        uploadBtn.setText("UPLOAD");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });
        jPanel1.add(uploadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 90, 30));

        closeBtn.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        closeBtn.setText("CLOSE");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 90, 40));

        bEdit.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        bEdit.setText("EDIT");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });
        jPanel1.add(bEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 90, 30));

        bDelete.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        bDelete.setText("DELETE");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(bDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 90, 30));

        lblBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/buku.png"))); // NOI18N
        jPanel1.add(lblBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 140, 130));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("PENDAFTARAN BUKU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        //https://stackoverflow.com/questions/13516939/how-to-upload-and-display-image-in-jframe-using-jfilechooser

        JFileChooser filechooser = new JFileChooser(); //Membuat objek JFileChooser
        filechooser.setDialogTitle("Choose Your File"); //Membuat objek JFileChooser yang digunakan untuk dialog pemilihan file.
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY); //Mengatur judul dialog pemilihan file yang akan ditampilkan kepada pengguna.
        // Mengatur agar hanya file yang dapat dipilih, bukan direktori. 
        int returnval = filechooser.showOpenDialog(this); 
        if (returnval == JFileChooser.APPROVE_OPTION) {
            File file = filechooser.getSelectedFile(); //Mendapatkan file yang dipilih
            //Membaca gambar file
            BufferedImage bi;
            try {
                bi = ImageIO.read(file);
                //Mengubah ukuran gambar
                BufferedImage resizedImage = new BufferedImage(280, 374, BufferedImage.TYPE_INT_RGB);
                Graphics2D g2d = resizedImage.createGraphics();
                g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g2d.drawImage(bi, 0, 0, 280, 374, null);
                g2d.dispose();
                lblSampul.setIcon(new ImageIcon(resizedImage)); //Menampilkan gambar dalam JLabel

                //Mendapatkan direktori tempat file dipilih dan menggabungkannya dengan nama file 
                //yang dipilih untuk mendapatkan path lengkap file.
                String dir = filechooser.getCurrentDirectory().getAbsolutePath();
                nama_file = dir + "\\" + filechooser.getSelectedFile().getName();

            } catch (IOException e) {
                e.printStackTrace(); // todo: implement proper error handeling
            }
            this.pack(); // Menampilkan ulang frame
        }

    }//GEN-LAST:event_uploadBtnActionPerformed

    private void daftarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarBtnActionPerformed
        judul = judulText.getText();
        pengarang = pengarangText.getText();
        penerbit = penerbitText.getText();
        tahun = tahunText.getText();
        kategori = kategoriList.getSelectedItem().toString();
        lokasi = lokasiText.getText();

        try {
            String sql = "INSERT INTO buku(judul, pengarang, penerbit, tahun, kategori, lokasi)";
            sql += " values(?,?,?,?,?,?)";
            PreparedStatement stmt = (PreparedStatement) db.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, judul);
            stmt.setString(2, pengarang);
            stmt.setString(3, penerbit);
            stmt.setString(4, tahun);
            stmt.setString(5, kategori);
            stmt.setString(6, lokasi);
            stmt.executeUpdate();
            ResultSet rs = (ResultSet) stmt.getGeneratedKeys(); // getGeneratedKeys() digunakan untuk mendapatkan hasil kunci yang dihasilkan oleh operasi seperti INSERT dengan kolom otomatis bertambah nilainya.
            rs.next();
            String buku_id = rs.getString(1); //digunakan untuk mengambil nilai kolom pertama dari baris saat ini dalam objek ResultSet 

            //UPDATE RECORD YANG BARU SAJA DI MASUKKAN
            String sampul = buku_id + ".jpg";

            try 
            {
                File source = new File(nama_file); //Ini digunakan untuk merepresentasikan file sumber yang akan disalin.
                File dest = new File("img/" + sampul); //Ini digunakan untuk merepresentasikan lokasi tujuan file yang akan disalin.
                FileUtils.copyFile(source, dest);//Baris ini menggunakan metode copyFile() dari kelas FileUtils untuk menyalin file dari sumber ke tujuan. 
        
                //Metode ini menerima dua parameter, yaitu source yang merupakan file sumber yang akan disalin, dan dest yang merupakan lokasi tujuan file yang akan disalin. 
                //Baris ini mengasumsikan bahwa Anda telah mengimpor kelas FileUtils dan telah menyertakan dependensi yang diperlukan.
            } catch (Exception e) {

            }

            sql = "UPDATE buku SET sampul = '" + sampul + "' WHERE buku_id = " + buku_id;
            boolean success = db.Execute(sql);
            if (success) {
                JOptionPane.showMessageDialog(this, "Buku Berhasil Di Daftarkan");
            } else {
                JOptionPane.showMessageDialog(this, "Buku Gagal Di Daftarkan");
            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_daftarBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //https://stackoverflow.com/questions/17887927/adding-items-to-a-jcombobox
        String sql = "SELECT DISTINCT kategori FROM buku WHERE kategori IS NOT NULL";//Pernyataan ini akan mengambil nilai kategori yang unik dari tabel buku di mana nilai kategori tidak null.
        ResultSet rs = (ResultSet) db.getRS(sql);//Objek ResultSet akan digunakan untuk mengiterasi dan mendapatkan data yang dihasilkan dari pernyataan SQL.
        try {
            kategoriList.removeAllItems(); //Tindakan ini dilakukan untuk membersihkan JComboBox sebelum menambahkan item baru.
            while (rs.next()) {
                String kategori = rs.getString("kategori"); //Baris ini mengambil nilai kolom "kategori" dari baris saat ini dalam ResultSet dan menyimpannya dalam variabel 
                kategoriList.addItem(kategori);//Baris ini menambahkan nilai kategori ke dalam JComboBox cbKategori sebagai item baru.
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_formWindowOpened

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void getBukuInfo(String bukuID) {
        try {
            String sql = "SELECT * FROM buku WHERE buku_id = " + bukuID;
            ResultSet rs = (ResultSet) db.getRS(sql);
            if (rs.next()) {
                judulText.setText(rs.getString("judul"));
                pengarangText.setText(rs.getString("pengarang"));
                penerbitText.setText(rs.getString("penerbit"));
                tahunText.setText(rs.getString("tahun"));
                kategoriList.setSelectedItem(rs.getString("kategori"));
                lokasiText.setText(rs.getString("lokasi"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        // TODO add your handling code here:
        if (bEdit.getText().compareTo("EDIT") == 0) 
        {
            bukuID = JOptionPane.showInputDialog("Masukkan BukuID");
            if (bukuID.length() != 0) 
            {
                getBukuInfo(bukuID);
                bEdit.setText("SAVE");
            }
        } 
        else 
        {
            judul = judulText.getText();
            pengarang = pengarangText.getText();
            penerbit = penerbitText.getText();
            tahun = tahunText.getText();
            kategori = kategoriList.getSelectedItem().toString();
            lokasi = lokasiText.getText();

            try {
                String sql = "UPDATE buku SET judul = ? , pengarang = ? , penerbit = ? , tahun = ? , kategori = ? , lokasi = ? "
                        + " WHERE buku_id = ?";
                PreparedStatement stmt = (PreparedStatement) db.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, judul);
                stmt.setString(2, pengarang);
                stmt.setString(3, penerbit);
                stmt.setInt(4, Integer.parseInt(tahun));
                stmt.setString(5, kategori);
                stmt.setString(6, lokasi);
                stmt.setInt(7, Integer.parseInt(bukuID));
                if (stmt.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(this, "Buku Berhasil Di Update");
                    bEdit.setText("EDIT");
                } else {
                    JOptionPane.showMessageDialog(this, "Buku Gagal Di Update");
                }

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_bEditActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // TODO add your handling code here:
        if (bDelete.getText().compareTo("DELETE") == 0) {
            bukuID = JOptionPane.showInputDialog("Masukkan BukuID");
            if (bukuID.length() != 0) {
                getBukuInfo(bukuID);
                bEdit.setVisible(false);
                bDelete.setText("SAVE");
            }
        } else {

            try {
                String sql = "DELETE FROM buku WHERE buku_id = " + bukuID;
                if (db.Execute(sql)) {
                    JOptionPane.showMessageDialog(this, "Buku Berhasil Di Hapus");
                    judulText.setText("");
                    pengarangText.setText("");
                    penerbitText.setText("");
                    tahunText.setText("");
                    kategoriList.setSelectedIndex(0);
                    lokasiText.setText("");

                    bDelete.setText("DELETE");

                } else {
                    JOptionPane.showMessageDialog(this, "Buku Gagal Di Hapus");
                }
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_bDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePendaftaranBuku1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePendaftaranBuku1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePendaftaranBuku1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePendaftaranBuku1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePendaftaranBuku1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bDelete;
    public javax.swing.JButton bEdit;
    private javax.swing.JButton closeBtn;
    public javax.swing.JButton daftarBtn;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField judulText;
    private javax.swing.JComboBox<String> kategoriList;
    private javax.swing.JLabel lblBuku;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblLokasi;
    private javax.swing.JLabel lblPenerbit;
    private javax.swing.JLabel lblPengarang;
    private javax.swing.JLabel lblSampul;
    private javax.swing.JLabel lblTahun;
    private javax.swing.JTextField lokasiText;
    private javax.swing.JTextField penerbitText;
    private javax.swing.JTextField pengarangText;
    private javax.swing.JTextField tahunText;
    private javax.swing.JButton uploadBtn;
    // End of variables declaration//GEN-END:variables
}
