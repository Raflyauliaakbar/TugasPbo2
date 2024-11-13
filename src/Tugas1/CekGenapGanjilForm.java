/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas1;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.awt.event.FocusListener;  
import java.awt.event.FocusEvent;     
/**
 *
 * @author SSD TURBO_BC
 */
public class CekGenapGanjilForm extends javax.swing.JFrame {

    /**
     * Creates new form CekGenapGanjilForm
     */
    public CekGenapGanjilForm() {
        initComponents();
        // Tambahkan FocusListener ke inputTextField
        inputTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Bersihkan text field saat mendapat fokus
                inputTextField.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Jika diperlukan, tambahkan logika saat fokus hilang
                if (inputTextField.getText().trim().isEmpty()) {
                    inputTextField.setText("Masukkan angka");
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hasilLabel = new javax.swing.JLabel();
        inputTextField = new javax.swing.JTextField();
        cekButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Cek Ganjil/Genap");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setName("Ganjil/Genap"); // NOI18N

        hasilLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hasilLabel.setText("Masukkan Angka :");

        inputTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputTextFieldFocusGained(evt);
            }
        });
        inputTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputTextFieldKeyPressed(evt);
            }
        });

        cekButton.setText("Cek");
        cekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(hasilLabel)
                .addGap(18, 18, 18)
                .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cekButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cekButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hasilLabel))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("APILIKASI CEK NOMER GANJIL/GENAP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekButtonActionPerformed
        try {
            // Ambil nilai dari JTextField input dan konversi ke integer
            String input = inputTextField.getText().trim();
            
            // Cek apakah input kosong atau masih berisi text default
            if (input.isEmpty() || input.equals("Masukkan angka")) {
                JOptionPane.showMessageDialog(this, "Silakan masukkan angka!", "Input Kosong", JOptionPane.WARNING_MESSAGE);
                inputTextField.requestFocus();
                return;
            }
            
            int angka = Integer.parseInt(input);

            // Buat StringBuilder untuk menyusun pesan
            StringBuilder hasil = new StringBuilder();
            
            // Cek genap/ganjil
            if (angka % 2 == 0) {
                hasil.append("Angka ").append(angka).append(" adalah Genap");
            } else {
                hasil.append("Angka ").append(angka).append(" adalah Ganjil");
            }
            
            // Cek bilangan prima
            if (isPrima(angka)) {
                hasil.append(" dan merupakan Bilangan Prima");
            } else {
                hasil.append(" dan bukan Bilangan Prima");
            }

            // Tampilkan hasil
            JOptionPane.showMessageDialog(this, hasil.toString(), "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
            
            // Reset text field setelah menampilkan hasil
            inputTextField.setText("Masukkan angka");
            
        } catch (NumberFormatException e) {
            // Tampilkan pesan error jika input bukan angka
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Input Tidak Valid", JOptionPane.ERROR_MESSAGE);
            inputTextField.requestFocus();  // Kembalikan fokus ke JTextField
        }
        

    }//GEN-LAST:event_cekButtonActionPerformed

    private void inputTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTextFieldKeyPressed
        char c = evt.getKeyChar();
    
    // Validasi hanya angka yang bisa dimasukkan
    if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
        evt.consume(); // Mengabaikan karakter jika bukan angka atau backspace
        JOptionPane.showMessageDialog(this, "Hanya angka yang diperbolehkan!", "Input Salah", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_inputTextFieldKeyPressed

    private void inputTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTextFieldFocusGained
       
    }//GEN-LAST:event_inputTextFieldFocusGained

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
            java.util.logging.Logger.getLogger(CekGenapGanjilForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CekGenapGanjilForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CekGenapGanjilForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekGenapGanjilForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CekGenapGanjilForm().setVisible(true);
            }
        });
    }
    private boolean isPrima(int angka) {
        // Bilangan 1 bukan bilangan prima
        if (angka <= 1) {
            return false;
        }
        
        // Cek apakah angka bisa dibagi dengan bilangan dari 2 sampai akar dari angka
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cekButton;
    private javax.swing.JLabel hasilLabel;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}