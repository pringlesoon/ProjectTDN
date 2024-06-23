package ReadTDN;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.ResultSet;


public class JFramePemilihanBuku extends JDialog { //Inheritance mewarisi sifat-sifat dari kelas JDialog, yang berarti kelas ini memperoleh semua fungsi dan properti dari JDialog.
    protected Database db = new Database();
    
    private String bukuID = ""; //Enkapsulasi, dideklarasikan sebagai private, yang berarti mereka hanya dapat diakses dan diubah langsung dari dalam kelas JFramePemilihanBuku ini.
    private String valLokasi = ""; //Enkapsulasi, dideklarasikan sebagai private, yang berarti mereka hanya dapat diakses dan diubah langsung dari dalam kelas JFramePemilihanBuku ini.

    //Konstruktor
    public JFramePemilihanBuku() { 
        initComponents();
        setModal(true);
        showTable("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBuku = new javax.swing.JTable();
        bookSearchTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pilihBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        jLabel1.setFont(new java.awt.Font("Trajan Pro 3", 1, 48)); // NOI18N
        jLabel1.setText("READTDN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("SMART-LIBRARY");

        tabelBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "buku_id", "Nama Buku", "Pengarang", "Penerbit", "Tahun", "Kategori", "Lokasi"
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

        bookSearchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookSearchTxtActionPerformed(evt);
            }
        });
        bookSearchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bookSearchTxtKeyTyped(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cari Buku :");

        pilihBtn.setText("Pilih");
        pilihBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bookSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pilihBtn)
                                .addGap(18, 18, 18)
                                .addComponent(cancelBtn)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(191, 191, 191))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilihBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pilihBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihBtnActionPerformed
        //https://stackoverflow.com/questions/29345792/java-jtable-getting-the-data-of-the-selected-row
        int row = tabelBuku.getSelectedRow();
        bukuID = String.valueOf(tabelBuku.getValueAt(row, 0));
        valLokasi = String.valueOf(tabelBuku.getValueAt(row, 6));
        new JFramePinjamanBuku().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pilihBtnActionPerformed

    private void bookSearchTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookSearchTxtKeyTyped
        String bookSearch = bookSearchTxt.getText();
        showTable(bookSearch);
    }//GEN-LAST:event_bookSearchTxtKeyTyped

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void tabelBukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelBukuKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelBukuKeyTyped

    private void bookSearchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookSearchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookSearchTxtActionPerformed
    
    public String[] getInfo() { //Polymorphism,  method ini bisa mengembalikan hasil yang berbeda tergantung pada data aktual dari objek, method yang mengembalikan array String yang berisi bukuID dan valLokasi. 
        String hasil[] = {bukuID, valLokasi};
        return hasil;
    }
    
    private void showTable(String string) {
        try {
            DefaultTableModel tblModel =(DefaultTableModel) tabelBuku.getModel();
            tblModel.setRowCount(0);
            
            String sql = "SELECT * FROM buku WHERE judul LIKE '%" + string + "%'";
            ResultSet rs = (ResultSet) db.getRS(sql);
            while (rs.next()) {
                String id = rs.getString("buku_id");
                String judul = rs.getString("judul");
                String pengarang = rs.getString("pengarang");
                String penerbit = rs.getString("penerbit");
                String tahun = rs.getString("tahun");
                String kategori = rs.getString("kategori");
                String lokasi = rs.getString("lokasi");
                tblModel.addRow(new Object[]{id, judul, pengarang, penerbit, tahun, kategori, lokasi});

            }
        } catch (Exception e) {
            
        }
    }
    
    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePemilihanBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookSearchTxt;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pilihBtn;
    private javax.swing.JTable tabelBuku;
    // End of variables declaration//GEN-END:variables
}

//Program ini menunjukkan penggunaan dasar dari konsep-konsep OOP seperti inheritance, enkapsulasi, dan polymorphism dalam konteks pengembangan aplikasi GUI Java dengan koneksi ke database.