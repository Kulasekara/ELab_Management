/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rad.demo.ui.reports;

import com.rad.demo.ui.utils.ColorPalette;
import com.rad.demo.ui.utils.Report;
import net.sf.jasperreports.engine.type.OrientationEnum;

/**
 *
 * @author BHARATHA
 */
public class ReportsView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReportsView
     */
    public ReportsView() {
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

        jPanel1 = new javax.swing.JPanel();
        pnlAvailableItemsBtn = new javax.swing.JPanel();
        btnAvailableItems = new javax.swing.JLabel();
        pnlNotRecivedBtn = new javax.swing.JPanel();
        btnNotRecived = new javax.swing.JLabel();
        pnlReplacementsBtn = new javax.swing.JPanel();
        btnReplacements = new javax.swing.JLabel();
        pnlAdminsBtn = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 212)));
        setClosable(true);
        setTitle("Reportes");

        btnAvailableItems.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAvailableItems.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAvailableItems.setText("Available Items");
        btnAvailableItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAvailableItemsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAvailableItemsMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAvailableItemsMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlAvailableItemsBtnLayout = new javax.swing.GroupLayout(pnlAvailableItemsBtn);
        pnlAvailableItemsBtn.setLayout(pnlAvailableItemsBtnLayout);
        pnlAvailableItemsBtnLayout.setHorizontalGroup(
            pnlAvailableItemsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAvailableItems, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlAvailableItemsBtnLayout.setVerticalGroup(
            pnlAvailableItemsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAvailableItemsBtnLayout.createSequentialGroup()
                .addComponent(btnAvailableItems, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnNotRecived.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNotRecived.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNotRecived.setText("Not Received");
        btnNotRecived.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNotRecivedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNotRecivedMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNotRecivedMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlNotRecivedBtnLayout = new javax.swing.GroupLayout(pnlNotRecivedBtn);
        pnlNotRecivedBtn.setLayout(pnlNotRecivedBtnLayout);
        pnlNotRecivedBtnLayout.setHorizontalGroup(
            pnlNotRecivedBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
            .addGroup(pnlNotRecivedBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnNotRecived, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
        );
        pnlNotRecivedBtnLayout.setVerticalGroup(
            pnlNotRecivedBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(pnlNotRecivedBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnNotRecived, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
        );

        btnReplacements.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReplacements.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReplacements.setText("Replacements");
        btnReplacements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReplacementsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReplacementsMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnReplacementsMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlReplacementsBtnLayout = new javax.swing.GroupLayout(pnlReplacementsBtn);
        pnlReplacementsBtn.setLayout(pnlReplacementsBtnLayout);
        pnlReplacementsBtnLayout.setHorizontalGroup(
            pnlReplacementsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReplacements, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlReplacementsBtnLayout.setVerticalGroup(
            pnlReplacementsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReplacements, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        btnAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdmin.setText("Admins");
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdminMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAdminMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlAdminsBtnLayout = new javax.swing.GroupLayout(pnlAdminsBtn);
        pnlAdminsBtn.setLayout(pnlAdminsBtnLayout);
        pnlAdminsBtnLayout.setHorizontalGroup(
            pnlAdminsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlAdminsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
        );
        pnlAdminsBtnLayout.setVerticalGroup(
            pnlAdminsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(pnlAdminsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlAvailableItemsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlReplacementsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlAdminsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(pnlNotRecivedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAvailableItemsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlNotRecivedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlReplacementsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlAdminsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvailableItemsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvailableItemsMouseEntered
        pnlAvailableItemsBtn.setBackground(ColorPalette.REPORTS_BTN_BG_1);
    }//GEN-LAST:event_btnAvailableItemsMouseEntered

    private void btnAvailableItemsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvailableItemsMouseExited
        pnlAvailableItemsBtn.setBackground(ColorPalette.REPORTS_BTN_BG_0);
    }//GEN-LAST:event_btnAvailableItemsMouseExited

    private void btnNotRecivedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotRecivedMouseEntered
        pnlNotRecivedBtn.setBackground(ColorPalette.REPORTS_BTN_BG_1);
    }//GEN-LAST:event_btnNotRecivedMouseEntered

    private void btnNotRecivedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotRecivedMouseExited
        pnlNotRecivedBtn.setBackground(ColorPalette.REPORTS_BTN_BG_0);
    }//GEN-LAST:event_btnNotRecivedMouseExited

    private void btnReplacementsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReplacementsMouseEntered
        pnlReplacementsBtn.setBackground(ColorPalette.REPORTS_BTN_BG_1);
    }//GEN-LAST:event_btnReplacementsMouseEntered

    private void btnReplacementsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReplacementsMouseExited
        pnlReplacementsBtn.setBackground(ColorPalette.REPORTS_BTN_BG_0);
    }//GEN-LAST:event_btnReplacementsMouseExited

    private void btnAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseEntered
        pnlAdminsBtn.setBackground(ColorPalette.REPORTS_BTN_BG_1);
    }//GEN-LAST:event_btnAdminMouseEntered

    private void btnAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseExited
        pnlAdminsBtn.setBackground(ColorPalette.REPORTS_BTN_BG_0);
    }//GEN-LAST:event_btnAdminMouseExited

    private void btnAvailableItemsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvailableItemsMouseReleased
        Report r = new Report();
        r.generateReport("AvailableItems.jrxml", null, OrientationEnum.PORTRAIT);
    }//GEN-LAST:event_btnAvailableItemsMouseReleased

    private void btnNotRecivedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotRecivedMouseReleased
        Report r = new Report();
        r.generateReport("NotReceived.jrxml", null, OrientationEnum.PORTRAIT);
    }//GEN-LAST:event_btnNotRecivedMouseReleased

    private void btnReplacementsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReplacementsMouseReleased
        Report r = new Report();
        r.generateReport("Replacements.jrxml", null, OrientationEnum.PORTRAIT);
    }//GEN-LAST:event_btnReplacementsMouseReleased

    private void btnAdminMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseReleased
        Report r = new Report();
        r.generateReport("Admins.jrxml", null, OrientationEnum.LANDSCAPE);
    }//GEN-LAST:event_btnAdminMouseReleased

    private void setAdminVisible(boolean b) {
        pnlAdminsBtn.setVisible(b);
    }

    public void initializeView(String title) {
        if (title.equals("Head")) {
            this.setAdminVisible(true);
        } else {
            this.setAdminVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdmin;
    private javax.swing.JLabel btnAvailableItems;
    private javax.swing.JLabel btnNotRecived;
    private javax.swing.JLabel btnReplacements;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlAdminsBtn;
    private javax.swing.JPanel pnlAvailableItemsBtn;
    private javax.swing.JPanel pnlNotRecivedBtn;
    private javax.swing.JPanel pnlReplacementsBtn;
    // End of variables declaration//GEN-END:variables
}
