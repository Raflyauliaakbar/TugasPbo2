/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas2;
import javax.swing.JOptionPane;

import javax.swing.ButtonGroup;

/**
 *
 * @author SSD TURBO_BC
 */
public class AplikasiKonversiSuhu extends javax.swing.JFrame {

    private boolean konversiOtomatis = false;
    
    public AplikasiKonversiSuhu() {
        initComponents();
        txtInput.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
    @Override
    public void insertUpdate(javax.swing.event.DocumentEvent e) {
        konversiOtomatis();
    }

    @Override
    public void removeUpdate(javax.swing.event.DocumentEvent e) {
        konversiOtomatis();
    }

    @Override
    public void changedUpdate(javax.swing.event.DocumentEvent e) {
        konversiOtomatis();
    }
});

ComboBoxSkalaAkhir.addActionListener(e -> resetKonversiOtomatis());
Jfahreinheit2.addActionListener(e -> resetKonversiOtomatis());
jCelcius2.addActionListener(e -> resetKonversiOtomatis());
jReamur2.addActionListener(e -> resetKonversiOtomatis());
jKelvin2.addActionListener(e -> resetKonversiOtomatis());
        
        
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(Jfahreinheit2);
        buttonGroup.add(jCelcius2);
        buttonGroup.add(jReamur2);
        buttonGroup.add(jKelvin2);
        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
        txtInputKeyTyped(evt);
    }
    });
    }
    

    private void konversiOtomatis() {
    if (konversiOtomatis) {
        try {
            KonversiActionPerformed(null); // Panggil fungsi konversi otomatis
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error konversi otomatis: " + e.getMessage());
        }
    }
}

private void resetKonversiOtomatis() {
    konversiOtomatis = false;
    txtInput.setText(""); // Hapus input suhu
    jTextField2.setText(""); // Hapus hasil konversi
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Jfahreinheit2 = new javax.swing.JRadioButton();
        jCelcius2 = new javax.swing.JRadioButton();
        jReamur2 = new javax.swing.JRadioButton();
        jKelvin2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ComboBoxSkalaAkhir = new javax.swing.JComboBox<>();
        txtInput = new javax.swing.JTextField();
        Konversi = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Hasil = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Konversi Suhu");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        buttonGroup.add(Jfahreinheit2);
        Jfahreinheit2.setText("Fahreinheit");

        buttonGroup.add(jCelcius2);
        jCelcius2.setText("Celcius");

        buttonGroup.add(jReamur2);
        jReamur2.setText("Reamur");

        buttonGroup.add(jKelvin2);
        jKelvin2.setText("Kelvin");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel6.setText("PILIH SUHU YANG INGIN DI KONVERSI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jKelvin2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jReamur2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCelcius2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jfahreinheit2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(Jfahreinheit2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCelcius2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jReamur2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jKelvin2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        ComboBoxSkalaAkhir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahreinheit", "Reamur", "Kelvin" }));
        ComboBoxSkalaAkhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSkalaAkhirActionPerformed(evt);
            }
        });

        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInputKeyTyped(evt);
            }
        });

        Konversi.setText("Konvesi");
        Konversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KonversiActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel2.setText("PILIH SUHU :");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("INPUT NILAI SUHU");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Konversi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxSkalaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboBoxSkalaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(Konversi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Hasil.setBackground(new java.awt.Color(255, 153, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 14)); // NOI18N
        jLabel1.setText("HASIL NILAI KONVERSI SUHU");

        javax.swing.GroupLayout HasilLayout = new javax.swing.GroupLayout(Hasil);
        Hasil.setLayout(HasilLayout);
        HasilLayout.setHorizontalGroup(
            HasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HasilLayout.createSequentialGroup()
                .addGroup(HasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HasilLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HasilLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HasilLayout.setVerticalGroup(
            HasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HasilLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Hasil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KonversiActionPerformed
     try {
         konversiOtomatis = true;
        double input = Double.parseDouble(txtInput.getText());
        double hasil = 0;
        String skalaAkhir = ComboBoxSkalaAkhir.getSelectedItem().toString();

        // Tentukan skala suhu awal berdasarkan radio button yang dipilih
        String skalaAwal = "";
        if (Jfahreinheit2.isSelected()) {
            skalaAwal = "Fahrenheit";
        } else if (jCelcius2.isSelected()) {
            skalaAwal = "Celsius";
        } else if (jReamur2.isSelected()) {
            skalaAwal = "Reamur";
        } else if (jKelvin2.isSelected()) {
            skalaAwal = "Kelvin";
        } else {
            JOptionPane.showMessageDialog(this, "Pilih skala suhu awal!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Lakukan konversi suhu
        switch (skalaAwal) {
            case "Celcius":
                switch (skalaAkhir) {
                    case "Fahrenheit":
                        hasil = (input * 9/5) + 32;
                        break;
                    case "Reamur":
                        hasil = input * 4/5;
                        break;
                    case "Kelvin":
                        hasil = input + 273.15;
                        break;
                    default: // Celsius
                        hasil = input;
                        break;
                }
                break;

            case "Fahrenheit":
                switch (skalaAkhir) {
                    case "Celcius": 
                        hasil = (input - 32) * 5/9;
                        break;
                    case "Reamur":
                        hasil = (input - 32) * 4/9;
                        break;
                    case "Kelvin":
                        hasil = ((input - 32) * 5/9) + 273.15;
                        break;
                    default: // Fahrenheit
                        hasil = input;
                        break;
                }
                break;

            case "Reamur":
                switch (skalaAkhir) {
                    case "Celcius": 
                        hasil = input * 5/4;
                        break;
                    case "Fahrenheit":
                        hasil = (input * 9/4) + 32;
                        break;
                    case "Kelvin":
                        hasil = (input * 5/4) + 273.15;
                        break;
                    default: // Reamur
                        hasil = input;
                        break;
                }
                break;

            case "Kelvin":
                switch (skalaAkhir) {
                    case "Celcius": 
                        hasil = input - 273.15;
                        break;
                    case "Fahrenheit":
                        hasil = ((input - 273.15) * 9/5) + 32;
                        break;
                    case "Reamur":
                        hasil = (input - 273.15) * 4/5;
                        break;
                    default: // Kelvin
                        hasil = input;
                        break;
                }
                break;
        }

        // Tampilkan hasil konversi dengan 2 angka desimal
        jTextField2.setText(String.format("%.2f°%s", hasil, skalaAkhir.charAt(0)));
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Input tidak valid! Masukkan angka yang benar.", "Error", JOptionPane.ERROR_MESSAGE);
        txtInput.setText("");
    }
    }//GEN-LAST:event_KonversiActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
    txtInput.setText("");
    jTextField2.setText("");
    buttonGroup.clearSelection();
    ComboBoxSkalaAkhir.setSelectedIndex(0);
    }//GEN-LAST:event_ClearActionPerformed

    private void ComboBoxSkalaAkhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSkalaAkhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSkalaAkhirActionPerformed

    private void txtInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputKeyTyped
    char c = evt.getKeyChar();
    String currentText = txtInput.getText();
    
    if (Character.isDigit(c)) {
        return; // Izinkan angka
    } else if (c == '-' && currentText.isEmpty()) {
        return; // Izinkan tanda minus hanya di awal
    } else if (c == '.' && !currentText.contains(".") && !currentText.isEmpty()) {
        return; // Izinkan satu titik desimal
    } else {
        JOptionPane.showMessageDialog(this, 
            "Hanya boleh memasukkan angka, tanda minus (-) di awal, dan titik desimal (.)", 
            "Input Tidak Valid", 
            JOptionPane.WARNING_MESSAGE);
        evt.consume(); // Blokir karakter yang tidak valid
    }
    }//GEN-LAST:event_txtInputKeyTyped

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
            java.util.logging.Logger.getLogger(AplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiKonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JComboBox<String> ComboBoxSkalaAkhir;
    private javax.swing.JPanel Hasil;
    private javax.swing.JRadioButton Jfahreinheit;
    private javax.swing.JRadioButton Jfahreinheit1;
    private javax.swing.JRadioButton Jfahreinheit2;
    private javax.swing.JButton Konversi;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton jCelcius;
    private javax.swing.JRadioButton jCelcius1;
    private javax.swing.JRadioButton jCelcius2;
    private javax.swing.JRadioButton jKelvin;
    private javax.swing.JRadioButton jKelvin1;
    private javax.swing.JRadioButton jKelvin2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jReamur;
    private javax.swing.JRadioButton jReamur1;
    private javax.swing.JRadioButton jReamur2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}