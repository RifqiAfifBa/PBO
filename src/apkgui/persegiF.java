/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package apkgui;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class persegiF extends javax.swing.JInternalFrame {

    /**
     * Creates new form persegi
     */
    public persegiF() {
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

        panelPersegi = new javax.swing.JPanel();
        hitung = new javax.swing.JButton();
        input = new javax.swing.JTextField();
        sisiPersegi = new javax.swing.JLabel();
        luasPersegi = new javax.swing.JLabel();
        kelilingPersegi = new javax.swing.JLabel();
        hasilLuas = new javax.swing.JLabel();
        hasilKeliling = new javax.swing.JLabel();
        LuPersegi = new javax.swing.JTextField();
        KelPersegi = new javax.swing.JTextField();
        close = new javax.swing.JButton();

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        sisiPersegi.setText("Sisi");

        luasPersegi.setText("Luas ");

        kelilingPersegi.setText("Keliling");

        javax.swing.GroupLayout panelPersegiLayout = new javax.swing.GroupLayout(panelPersegi);
        panelPersegi.setLayout(panelPersegiLayout);
        panelPersegiLayout.setHorizontalGroup(
            panelPersegiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersegiLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelPersegiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPersegiLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(hitung)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPersegiLayout.createSequentialGroup()
                        .addGroup(panelPersegiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPersegiLayout.createSequentialGroup()
                                .addGap(0, 117, Short.MAX_VALUE)
                                .addGroup(panelPersegiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelPersegiLayout.createSequentialGroup()
                                        .addComponent(sisiPersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelPersegiLayout.createSequentialGroup()
                                        .addComponent(hasilKeliling)
                                        .addGap(70, 70, 70))))
                            .addGroup(panelPersegiLayout.createSequentialGroup()
                                .addGroup(panelPersegiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(luasPersegi)
                                    .addComponent(kelilingPersegi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hasilLuas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPersegiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LuPersegi, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(KelPersegi))))
                        .addGap(31, 31, 31))))
        );
        panelPersegiLayout.setVerticalGroup(
            panelPersegiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPersegiLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelPersegiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sisiPersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(hitung)
                .addGap(2, 2, 2)
                .addGroup(panelPersegiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luasPersegi)
                    .addComponent(hasilLuas)
                    .addComponent(LuPersegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelPersegiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kelilingPersegi)
                    .addComponent(KelPersegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(hasilKeliling)
                .addGap(134, 134, 134))
        );

        close.setText("CLOSE");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPersegi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPersegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed

    }//GEN-LAST:event_inputActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        double luas, keliling, sisi;
        sisi = Double.parseDouble(input.getText());
        luas = sisi * sisi;
        keliling = 4 * sisi;
        LuPersegi.setText(String.valueOf(luas));
        KelPersegi.setText(String.valueOf(keliling));
    }//GEN-LAST:event_hitungActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField KelPersegi;
    private javax.swing.JTextField LuPersegi;
    private javax.swing.JButton close;
    private javax.swing.JLabel hasilKeliling;
    private javax.swing.JLabel hasilLuas;
    private javax.swing.JButton hitung;
    private javax.swing.JTextField input;
    private javax.swing.JLabel kelilingPersegi;
    private javax.swing.JLabel luasPersegi;
    private javax.swing.JPanel panelPersegi;
    private javax.swing.JLabel sisiPersegi;
    // End of variables declaration//GEN-END:variables
}
