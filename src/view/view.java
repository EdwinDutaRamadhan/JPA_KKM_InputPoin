/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import entity.PoinMahasiswa;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.DefaultTableModel;
import service.PoinMahasiswaService;

/**
 *
 * @author HP
 */
public class view extends javax.swing.JFrame {

    DefaultTableModel model;
    public view() {
        initComponents();
        startup();
        tampilkanDataPoinMahasiswa();
    }

    private void startup(){
        //Table Model Init
        String[] judulTable = {"NIM", "Nama", "OMB", "Profesional", "Kemanusiaan", "Penunjang"};
        model = new DefaultTableModel(judulTable, 0);
        tablePoin.setModel(model);
    }
    
    private void tampilkanDataPoinMahasiswa(){
        List<PoinMahasiswa> listPM = new PoinMahasiswaService().listPoinMahasiswa();
        String dataPoinMahasiswa[][] = new String[listPM.size()][6];
        for(int i = 0; i < listPM.size() ; i++){
            dataPoinMahasiswa[i][0] = listPM.get(i).getNim();
            dataPoinMahasiswa[i][1] = listPM.get(i).getNama();
            dataPoinMahasiswa[i][2] = Integer.toString(listPM.get(i).getOmb());
            dataPoinMahasiswa[i][3] = Integer.toString(listPM.get(i).getProfesional());
            dataPoinMahasiswa[i][4] = Integer.toString(listPM.get(i).getKemanusiaan());
            dataPoinMahasiswa[i][5] = Integer.toString(listPM.get(i).getPenunjang());
        }
        tablePoin.setModel(new DefaultTableModel(dataPoinMahasiswa, new String[]{"NIM", "Nama", "OMB", "Profesional", "Kemanusiaan", "Penunjang"}));
    }    
    
    private void resetTextField(){
        nimTextField.setText("NIM");
        namaTextField.setText("Nama");
        ombTextField.setText("");
        profesionalTextField.setText("");
        kemanusiaanTextField.setText("");
        penunjangTextField.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablePoin = new javax.swing.JTable();
        nimTextField = new javax.swing.JTextField();
        namaTextField = new javax.swing.JTextField();
        ombTextField = new javax.swing.JTextField();
        profesionalTextField = new javax.swing.JTextField();
        kemanusiaanTextField = new javax.swing.JTextField();
        penunjangTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        predikatLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arsip Poin KKM Mahasiswa FTI UKSW");

        tablePoin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "OMB", "Profesional", "Kemanusiaan", "Penunjang"
            }
        ));
        tablePoin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePoinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePoin);

        nimTextField.setText("NIM");
        nimTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nimTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nimTextFieldFocusLost(evt);
            }
        });

        namaTextField.setText("Nama");
        namaTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaTextFieldFocusLost(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOTAL");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OMB");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Min. Poin");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Rumpun");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("150");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Keterampilan Profesional");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("300");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Keterampilan Kemanusiaan");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("250");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Keterampilan Penunjang");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("0");

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Total");

        totalLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel.setText("0");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Predikat");

        predikatLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        predikatLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        predikatLabel.setText("Cukup");

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 23, Short.MAX_VALUE)
                                .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(penunjangTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(kemanusiaanTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(profesionalTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ombTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(predikatLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ombTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(profesionalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kemanusiaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(penunjangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(predikatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablePoinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePoinMouseClicked
        //Row Clicked Selected
        int rowSelected = tablePoin.getSelectedRow();
        int totalPoin = 0;
        nimTextField.setText(tablePoin.getValueAt(rowSelected, 0).toString());//NIM
        namaTextField.setText(tablePoin.getValueAt(rowSelected, 1).toString());//NAMA
        
        ombTextField.setText(tablePoin.getValueAt(rowSelected, 2).toString());
        totalPoin += Integer.parseInt(tablePoin.getValueAt(rowSelected, 2).toString());
        
        profesionalTextField.setText(tablePoin.getValueAt(rowSelected, 3).toString());
        totalPoin += Integer.parseInt(tablePoin.getValueAt(rowSelected, 3).toString());
        
        kemanusiaanTextField.setText(tablePoin.getValueAt(rowSelected, 4).toString());
        totalPoin += Integer.parseInt(tablePoin.getValueAt(rowSelected, 4).toString());
        
        penunjangTextField.setText(tablePoin.getValueAt(rowSelected, 5).toString());
        totalPoin += Integer.parseInt(tablePoin.getValueAt(rowSelected, 5).toString());
        
        //display total poin
        totalLabel.setText("" + totalPoin);
        
        //Predikat Algoritma
        algoritmaPredikatPoin(totalPoin);
    }//GEN-LAST:event_tablePoinMouseClicked
    
    private void algoritmaPredikatPoin(int poin){
        if (poin < 300 && poin > 0) {
            //Kurang
            predikatLabel.setText("Kurang");
        } else if(poin < 600 && poin >= 300){
            //Cukup
            predikatLabel.setText("Cukup");
        } else if(poin <900 && poin >= 600){
            //Bagus
            predikatLabel.setText("Bagus");
        }
    }
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        resetTextField();
    }//GEN-LAST:event_addButtonActionPerformed

    private void nimTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nimTextFieldFocusGained
        // Place Holder NIM TextField Focus Gained
        if(nimTextField.getText().equals("NIM")){
            nimTextField.setText("");
        }
     
    }//GEN-LAST:event_nimTextFieldFocusGained

    private void nimTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nimTextFieldFocusLost
        // Place Holder NIM TextField Focus Lost
        if(nimTextField.getText().equals("")){
            nimTextField.setText("NIM");
        }
    }//GEN-LAST:event_nimTextFieldFocusLost

    private void namaTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaTextFieldFocusGained
        // Place Holder Nama TextField Focus Gained
        if(namaTextField.getText().equals("Nama")){
            namaTextField.setText("");
        }
    }//GEN-LAST:event_namaTextFieldFocusGained

    private void namaTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaTextFieldFocusLost
        // Place Holder Nama TextField Focus Lost
        if(namaTextField.getText().equals("")){
            namaTextField.setText("Nama");
        }
    }//GEN-LAST:event_namaTextFieldFocusLost

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(!nimTextField.getText().equals("NIM") && !namaTextField.getText().equals("Nama")){
            //Aliasing Object Poin Mahasiswa
            PoinMahasiswa pm = new PoinMahasiswa();

            //Zero input protection
            String omb, profesional, kemanusiaan, penunjang;
            omb = (ombTextField.getText().isEmpty()) ? ("0") : (omb = ombTextField.getText());
            profesional = (profesionalTextField.getText().isEmpty()) ? ("0") : (profesional = profesionalTextField.getText());
            kemanusiaan = (kemanusiaanTextField.getText().isEmpty()) ? ("0") : (kemanusiaan = kemanusiaanTextField.getText());
            penunjang = (penunjangTextField.getText().isEmpty()) ? ("0") : (penunjang = penunjangTextField.getText());
            
            //Set Model with current Text Field Value
            pm.setNim(nimTextField.getText());
            pm.setNama(namaTextField.getText());
            pm.setOmb(Integer.parseInt(omb));
            pm.setProfesional(Integer.parseInt(profesional));
            pm.setKemanusiaan(Integer.parseInt(kemanusiaan));
            pm.setPenunjang(Integer.parseInt(penunjang));

            //Void Insert Data 
            new PoinMahasiswaService().createPoinMahasiswa(pm);

            JOptionPane.showMessageDialog(this, "Berhasil Simpan Data");
            tampilkanDataPoinMahasiswa();
            resetTextField();
        }else{
            JOptionPane.showMessageDialog(this, "Lengkapi NIM & nama terlebih dahulu");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        //True = 0
        if(!nimTextField.getText().equals("NIM") && !namaTextField.getText().equals("Nama")){
            int konfirmasi = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus", "Konfirmasi", YES_NO_OPTION);
            if(konfirmasi == 0){
                new PoinMahasiswaService().deletePoinMahasiswa(nimTextField.getText());
                JOptionPane.showMessageDialog(this, "Berhasil Menghapus Data");
                resetTextField();
                tampilkanDataPoinMahasiswa();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus");
        }
//        System.out.println());
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if(!nimTextField.getText().equals("NIM") && !namaTextField.getText().equals("Nama")){
            
            PoinMahasiswa pm = new PoinMahasiswa(nimTextField.getText(), namaTextField.getText(),Integer.parseInt(ombTextField.getText()), Integer.parseInt(profesionalTextField.getText()), Integer.parseInt(kemanusiaanTextField.getText()), Integer.parseInt(penunjangTextField.getText()));
            new PoinMahasiswaService().updatePoinMahasiswa(pm);
            resetTextField();
            tampilkanDataPoinMahasiswa();
            JOptionPane.showMessageDialog(this, "Berhasil Update Data");
        }else{
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin di update");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kemanusiaanTextField;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField nimTextField;
    private javax.swing.JTextField ombTextField;
    private javax.swing.JTextField penunjangTextField;
    private javax.swing.JLabel predikatLabel;
    private javax.swing.JTextField profesionalTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable tablePoin;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
