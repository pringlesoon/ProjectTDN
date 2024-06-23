/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ReadTDN;

import com.mysql.jdbc.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFramePinjamanBuku extends Master {

    public Date today = null;
    public Date tgl_actual_kembali = null;
    public String userName = null;
    public String buku_id = null;
    private int jumlahBuku = 0;
    private final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    private int totalDenda = 0;
    
    DefaultTableModel tblModel = null;
    
    
    public JFramePinjamanBuku() {
        initComponents();
    }
    
    private void tambahBaris(String bukuID) {
        try {
            String sql = "SELECT * FROM buku WHERE buku_id = " + buku_id;
            ResultSet rs = (ResultSet) db.getRS(sql);
            if (rs.next())
            {
                //Baris ini menambahkan baris baru ke dalam model. 
                tblModel.addRow(new Object[]{
                rs.getString("buku_id"),
                rs.getString("judul"),
                rs.getString("pengarang"),
                rs.getString("penerbit"),
                rs.getString("tahun")});
            }
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        totalBukuTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bukuIDtxt = new javax.swing.JTextField();
        listKembalikanBtn = new javax.swing.JButton();
        pinjamBtn = new javax.swing.JButton();
        kembaliBtn = new javax.swing.JButton();
        lblTotalDenda = new javax.swing.JLabel();
        dendaText = new javax.swing.JTextField();
        keluarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBuku = new javax.swing.JTable();
        tanggalCh = new com.toedter.calendar.JDateChooser();
        listTambahBtn = new javax.swing.JButton();
        hitungBukuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("FORM PEMIJAMAN BUKU");

        jLabel1.setText("Tanggal");

        jLabel3.setText("Username");

        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        jLabel4.setText("Total Buku");

        totalBukuTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBukuTxtActionPerformed(evt);
            }
        });

        jLabel5.setText("ID Buku");

        bukuIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bukuIDtxtActionPerformed(evt);
            }
        });

        listKembalikanBtn.setText("List Kembalikan");
        listKembalikanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listKembalikanBtnActionPerformed(evt);
            }
        });

        pinjamBtn.setText("PINJAM");

        kembaliBtn.setText("KEMBALI");
        kembaliBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBtnActionPerformed(evt);
            }
        });

        lblTotalDenda.setText("TOTAL DENDA");

        keluarBtn.setText("KELUAR");
        keluarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarBtnActionPerformed(evt);
            }
        });

        tabelBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "buku_id", "Nama Buku", "Pengarang", "Penerbit", "Tahun"
            }
        ));
        tabelBuku.setColumnSelectionAllowed(true);
        tabelBuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tabelBukuKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBuku);
        tabelBuku.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        listTambahBtn.setText("List Tambah");
        listTambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listTambahBtnActionPerformed(evt);
            }
        });

        hitungBukuBtn.setText("Hitung Buku");
        hitungBukuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungBukuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(204, 204, 204))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 554, Short.MAX_VALUE)
                        .addComponent(keluarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTotalDenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dendaText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pinjamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kembaliBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145)))
                        .addGap(8, 8, 8)))
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tanggalCh, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bukuIDtxt)
                    .addComponent(listKembalikanBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalBukuTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listTambahBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hitungBukuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(bukuIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tanggalCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dendaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalDenda)
                            .addComponent(pinjamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kembaliBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(keluarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(totalBukuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hitungBukuBtn))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listKembalikanBtn)
                            .addComponent(listTambahBtn))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void totalBukuTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBukuTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBukuTxtActionPerformed

    private void bukuIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukuIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bukuIDtxtActionPerformed

    private void tabelBukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelBukuKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelBukuKeyTyped

    private void listKembalikanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listKembalikanBtnActionPerformed
        if(tblModel.getRowCount() < 1)
        {
            JOptionPane.showMessageDialog(this, "Masukkan Buku Untuk Dikembalikan!");
            return;
        }
        
        try 
        {
            userName = usernameText.getText();
            
            // Mengecek apakah username ada di database
            String sql = "SELECT username FROM user WHERE username = '" + userName + "'";
            ResultSet rs = (ResultSet) db.getRS(sql);
            if (!rs.next())
            {
                JOptionPane.showMessageDialog(this, "Username Tidak Terdaftar!");
                return;
            }
            
            for (int i = 0; i < tblModel.getRowCount(); i++)
            {
                buku_id = tabelBuku.getModel().getValueAt(i, 0).toString();
                
                //Dapatkan pinjam_id
                sql = "SELECT pinjam_id, tgl_kembali FROM pinjam WHERE buku_id = '" + buku_id + "' AND username = '" + userName + "' AND tgl_actual_kembali IS NULL";
                rs = (ResultSet) db.getRS(sql);
                
                if (rs.next())
                {
                    int pinjam_id = rs.getInt("pinjam_id");
                    Date tglKembali = rs.getDate("tgl_kembali");
                    
                    int denda = hitungDenda(tglKembali);
                    
                    sql = "UPDATE pinjam SET tgl_actual_kembali = '" + df.format(today) + "', denda = " + denda + " WHERE pinjam_id = " + pinjam_id + "";
                    boolean succes = db.Execute(sql);
                    if (succes) 
                    {
                        String msg = "Pinjam ID " + pinjam_id + " Berhasil Dikembalikan";
                        JOptionPane.showMessageDialog(this, msg);
                    }
                }
            }
            
            dendaText.setText(Integer.toString(this.totalDenda));
                        
        } 
        catch (Exception e){}
    }//GEN-LAST:event_listKembalikanBtnActionPerformed

    private void listTambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listTambahBtnActionPerformed
        buku_id = bukuIDtxt.getText();
        int n = tblModel.getRowCount() + 1;
        if (jumlahBuku + n > 4) {
            JOptionPane.showMessageDialog(this, "Tidak Boleh Meminjam Lebih Dari 4 Buku.");
            return;
        }
        
        if (cekBukuAdaDiTable(buku_id)) {
            JOptionPane.showMessageDialog(this, "Buku ID Sudah Ada di Tabel.");
            return;
        }
        tambahBaris(buku_id);
    }//GEN-LAST:event_listTambahBtnActionPerformed
    
    private void bPinjamActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        if(tblModel.getRowCount() < 1)
        {
            JOptionPane.showMessageDialog(this, "Pilih Buku Untuk Dipinjam!");
            return;
        }
        
        try 
        {
            userName = usernameText.getText();
            
            for (int i = 0; i < tblModel.getRowCount(); i++)
            {
                buku_id = tabelBuku.getModel().getValueAt(i, 0).toString();
                
                //LAMA PINJAM YANG DIPERBOLEHKAN. DIAMBIL DARI SETTING DATABASE
                int lamaPinjam = Integer.parseInt(db.getSettingValue("LAMA_PINJAM")); 
                
                Calendar cal = Calendar.getInstance();
                cal.setTime(today);
                cal.add(Calendar.DATE, lamaPinjam); 
                Date tglKembali = cal.getTime();
                
                String strTglKembali = df.format(tglKembali); 
                
                String strHariIni = df.format(today);
                
                // Mengecek apakah username ada di database
                String sql = "SELECT username FROM user WHERE username = '" + userName + "'";
                ResultSet rs = (ResultSet) db.getRS(sql);
                if (rs.next())
                {
                    sql = "INSERT INTO pinjam(tgl_pinjam, tgl_kembali, username, buku_id) "
                        + "VALUES('" + strHariIni + "' , '" + strTglKembali + "' , '" + userName + "' , '" + buku_id + "')";
                    boolean succes = db.Execute(sql);
                    if (succes) 
                    {
                        String msg = "Buku ID " + buku_id + " Berhasil Dipinjam";
                        JOptionPane.showMessageDialog(this, msg);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Username Tidak Terdaftar!");
                    return;
                }
                
            }
                        
        } 
        catch (Exception e){}
        
    }
    
    private boolean cekBukuAdaDiTable(String bukuID)
    {
        boolean hasil = false;
        int n = tblModel.getRowCount();
        if(n == 0)
        {
            return false;
        }
        
        for(int i = 0; i < n; i++)
        {
            String bukuIdDiTable =  tblModel.getValueAt(i, 0).toString();
            if (bukuID.compareTo(bukuIdDiTable) == 0)
            {
                hasil = true;
                break;
            }
        }
        return hasil;
    }
    
    private int hitungDenda(Date tglKembali) //tglKembali adalah tanggal harusnya kembali
    {
        int denda = 0;
                
        try 
        {
            //dapatkan denda perhari
            int dendaPerHari = Integer.parseInt(db.getSettingValue("DENDA_1HARI"));
            long selisih =  today.getTime() - tglKembali.getTime();
             if(selisih < 0)
             {
                denda = 0;
                return denda;
             }
                
            
            //https://www.ardhi.web.id/2019/05/java-menghitung-selisih-tanggal.html
//            long diffSeconds = diff / 1000;
//            long diffMinutes = diff / (60 * 1000);
//            long diffHours = diff / (60 * 60 * 1000);
            selisih = selisih / (24 * 60 * 60 * 1000);
//            long diffMonths = (diff / (24 * 60 * 60 * 1000)) / 30;
//            long diffYears =  ((diff / (24 * 60 * 60 * 1000)) / 30) / 12;
            
            
            denda = (int) (selisih * dendaPerHari);
           
            
            //Dapatkan maksimal Denda
            int maksDenda = Integer.parseInt(db.getSettingValue("DENDA_MAKS"));
            if (denda > maksDenda)
                denda = maksDenda;
        } 
        catch (Exception e) {
        }
        return denda;
    }
    
    private void hitungBukuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungBukuBtnActionPerformed
        try 
        {
            String sql = "SELECT COUNT(buku_id) AS jml_buku FROM pinjam WHERE username = '" + usernameText.getText() + "' AND tgl_actual_kembali is NULL";
            ResultSet rs = (ResultSet) db.getRS(sql);
            rs.next();
            this.jumlahBuku = rs.getInt("jml_buku");
            totalBukuTxt.setText((Integer.toString(jumlahBuku)));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_hitungBukuBtnActionPerformed

    private void kembaliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBtnActionPerformed
        buku_id = bukuIDtxt.getText();
        userName = usernameText.getText();
        
        try 
        {
            String sql = "SELECT pinjam_id, tgl_kembali FROM pinjam WHERE username = '" + userName + "' AND buku_id = " + buku_id + " AND tgl_actual_kembali is NULL";
            ResultSet rs = (ResultSet) db.getRS(sql);
            if (rs.next())
            {
                int pinjamId = rs.getInt("pinjam_id");
                tambahBaris(buku_id);
                
                //Hitung Denda
                Date tglKembali = rs.getDate("tgl_kembali");
                int denda = hitungDenda(tglKembali);
                this.totalDenda += denda;
                dendaText.setText(Integer.toString(totalDenda));
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Username Tersebut Tidak Meminjam Buku Yang Di input!");
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kembaliBtnActionPerformed

    private void keluarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_keluarBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        today = new Date();
        tanggalCh.setDate(today);// Mengatur tanggal hari ini
        tanggalCh.setEnabled(false);//Menonaktifkan jDateChooser agar tidak bisa diklik

        tblModel = (DefaultTableModel) tabelBuku.getModel();
        tblModel.setRowCount(0); //Hilangkan Baris Sebelumnya Di dalam Table
        
        totalBukuTxt.setEditable(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(JFramePinjamanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePinjamanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePinjamanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePinjamanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePinjamanBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bukuIDtxt;
    public javax.swing.JTextField dendaText;
    public javax.swing.JButton hitungBukuBtn;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluarBtn;
    public javax.swing.JButton kembaliBtn;
    public javax.swing.JLabel lblTotalDenda;
    public javax.swing.JButton listKembalikanBtn;
    public javax.swing.JButton listTambahBtn;
    public javax.swing.JButton pinjamBtn;
    private javax.swing.JTable tabelBuku;
    private com.toedter.calendar.JDateChooser tanggalCh;
    public javax.swing.JTextField totalBukuTxt;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
