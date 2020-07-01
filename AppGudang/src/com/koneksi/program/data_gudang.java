/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koneksi.program;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class data_gudang extends javax.swing.JFrame {

    private void form_kosong(){
        txtidbarang.setEditable(true);
        txtidbarang.setText(null);
        txtnama.setText(null);
        cbjenis.setSelectedItem(this);
        txtberat.setText(null);
        txttglmasuk.setText(null);
    }
    
    private void tampil_database(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("ID_Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jenis Barang");
        model.addColumn("Berat");
        model.addColumn("Tgl Keluar");
     
        try{
            int no = 1;
            String sql = "SELECT * FROM gudang_in";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
            tabelmasuk.setModel(model);
            
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    public data_gudang() {
        initComponents();
        tampil_database();
        form_kosong();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtidbarang = new javax.swing.JTextField();
        txtberat = new javax.swing.JTextField();
        txttglmasuk = new javax.swing.JTextField();
        cbjenis = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelmasuk = new javax.swing.JTable();
        btedit = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();
        btsimpan = new javax.swing.JButton();
        btbatal = new javax.swing.JButton();
        btkembali = new javax.swing.JButton();
        lblclose = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Manajemen Gudang");
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setOpacity(0.0F);
        setPreferredSize(new java.awt.Dimension(710, 510));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("BARANG MASUK GUDANG");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("ID_Barang");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nama Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Jenis Barang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Berat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Tgl Masuk");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 223, -1));
        getContentPane().add(txtidbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 223, -1));
        getContentPane().add(txtberat, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 194, -1));
        getContentPane().add(txttglmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 194, -1));

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dokumen", "Bahan Pokok", "Makanan", "Elektronik" }));
        getContentPane().add(cbjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 223, -1));

        jScrollPane2.setOpaque(false);

        tabelmasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelmasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelmasukMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelmasuk);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 348, 610, 90));

        btedit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btedit.setText("Edit Barang");
        btedit.setToolTipText("Edit Barang");
        btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditActionPerformed(evt);
            }
        });
        getContentPane().add(btedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 284, 107, -1));

        bthapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bthapus.setText("Hapus Barang");
        bthapus.setToolTipText("Hapus Barang");
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });
        getContentPane().add(bthapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 284, 107, -1));

        btsimpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btsimpan.setText("Simpan");
        btsimpan.setToolTipText("Simpan Barang");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 284, 107, -1));

        btbatal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btbatal.setText("Reset");
        btbatal.setToolTipText("Reset Kolom");
        btbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbatalActionPerformed(evt);
            }
        });
        getContentPane().add(btbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 284, 109, -1));

        btkembali.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btkembali.setText("Kembali");
        btkembali.setToolTipText("Kembali");
        btkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 284, 107, -1));

        lblclose.setIcon(new javax.swing.ImageIcon("D:\\DESIGN\\close1.png")); // NOI18N
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,80));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 660, 460));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\TEKNIK INFORMATIKA\\Algoritma II\\img\\1609.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbatalActionPerformed
        // TODO add your handling code here:
        form_kosong();
    }//GEN-LAST:event_btbatalActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        try{
            String sql = "INSERT INTO gudang_in VALUES ('"+txtidbarang.getText()+"','"+txtnama.getText()+"','"+cbjenis.getSelectedItem()+"','"+txtberat.getText()+"','"+txttglmasuk.getText()+"')";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Barang Berhasil Ditambahkan!");
            tampil_database();
            form_kosong();
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btsimpanActionPerformed

    private void tabelmasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelmasukMouseClicked
        int baris = tabelmasuk.rowAtPoint(evt.getPoint());
        String id = tabelmasuk.getValueAt(baris, 1).toString();
        txtidbarang.setText(id);
        
        String nama = tabelmasuk.getValueAt(baris, 2).toString();
        txtnama.setText(nama);
        
        String jenis = tabelmasuk.getValueAt(baris, 3).toString();
        cbjenis.setSelectedItem(jenis);
        
        String berat = tabelmasuk.getValueAt(baris, 4).toString();
        txtberat.setText(berat);
        
        String tglm = tabelmasuk.getValueAt(baris, 5).toString();
        txttglmasuk.setText(tglm);
    }//GEN-LAST:event_tabelmasukMouseClicked

    private void bteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditActionPerformed
        try{
            String sql = "UPDATE gudang_in SET id_barang='"+txtidbarang.getText()+"',nama_barang='"+txtnama.getText()+"',jenis_barang='"+cbjenis.getSelectedItem()+"',berat_barang='"+txtberat.getText()+"',tanggal_masuk='"+txttglmasuk.getText()+"' WHERE id_barang = '"+txtidbarang.getText()+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit data berhasil!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_database();
        form_kosong();
    }//GEN-LAST:event_bteditActionPerformed

    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
        try{
            String sql = "DELETE FROM gudang_in WHERE id_barang='"+txtidbarang.getText()+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus data berhasil!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_database();
        form_kosong();
    }//GEN-LAST:event_bthapusActionPerformed

    private void btkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkembaliActionPerformed
        this.dispose();
        new menu().setVisible(true);
    }//GEN-LAST:event_btkembaliActionPerformed

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblcloseMouseClicked

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
            java.util.logging.Logger.getLogger(data_gudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_gudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_gudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_gudang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_gudang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbatal;
    private javax.swing.JButton btedit;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btkembali;
    private javax.swing.JButton btsimpan;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JTable tabelmasuk;
    private javax.swing.JTextField txtberat;
    private javax.swing.JTextField txtidbarang;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttglmasuk;
    // End of variables declaration//GEN-END:variables
}
