/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niken.indocyber.game;

import id.co.indocyber.game.GuessNumber;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class GuessNumGame extends javax.swing.JFrame {

    /**
     * Creates new form GuessNumGame
     */
    public GuessNumGame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonRandom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputAngka = new javax.swing.JTextField();
        buttonCek = new javax.swing.JButton();
        cekHasil = new javax.swing.JLabel();
        cekHasil2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        buttonRandom.setBackground(new java.awt.Color(102, 102, 102));
        buttonRandom.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buttonRandom.setText("MULAI RANDOM ANGKA");
        buttonRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRandomActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\logo_game_guessnum.jpg")); // NOI18N
        jLabel1.setText("GAME TEBAK ANGKA");

        jLabel2.setText("Angka Tebakan Kamu");

        inputAngka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAngkaActionPerformed(evt);
            }
        });

        buttonCek.setBackground(new java.awt.Color(102, 102, 102));
        buttonCek.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        buttonCek.setText("Cek Tebakannya");
        buttonCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cekHasil2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cekHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonRandom)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(inputAngka, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(buttonCek))))
                .addGap(0, 73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(buttonRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputAngka, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCek))
                .addGap(18, 18, 18)
                .addComponent(cekHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cekHasil2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRandomActionPerformed
        // TODO add your handling code here:
            guess = new GuessNumber();
    }//GEN-LAST:event_buttonRandomActionPerformed

    private void inputAngkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAngkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAngkaActionPerformed

    private void buttonCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCekActionPerformed
        // TODO add your handling code here:
        //boolean mainLagi = true;

        //while (true) {
        try{
        String inputAngka = this.inputAngka.getText();
        int gamerNumber = Integer.parseInt(inputAngka);
        boolean correct = guess.isGuessTrue(gamerNumber);
            
                if (correct) {
                cekHasil.setText("SELAMAT KAMU MENANG!!");
                cekHasil2.setText("PECOBAAN YANG KAMU LAKUKAN SEBANYAK "
                        + guess.getBanyakTebakan() + " KALI");
            } else {
                if (guess.isLebihBesar()) {
                    cekHasil.setText("TEBAKAN KAMU SALAH, COBA ANGKA YANG LEBIH KECIL");
                } else {
                    cekHasil.setText("TEBAKAN KAMU SALAH, COBA ANGKA YANG LEBIH BESAR");
                }
           }
        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane, "ANDA HARUS MEMASUKAN ANGKA");
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "ANDA BELUM MENENTUKAN ANGKA RANDOM");
        }
    }//GEN-LAST:event_buttonCekActionPerformed

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
            java.util.logging.Logger.getLogger(GuessNumGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessNumGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessNumGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessNumGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessNumGame().setVisible(true);
            }
        });
    }
    GuessNumber guess;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCek;
    private javax.swing.JButton buttonRandom;
    private javax.swing.JLabel cekHasil;
    private javax.swing.JLabel cekHasil2;
    private javax.swing.JTextField inputAngka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
