/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rad.demo.ui.issue;

import com.rad.demo.ui.DashBoardView;
import com.rad.demo.ui.utils.ColorPalette;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author BHARATHA
 */
public class StudentLogInView extends javax.swing.JInternalFrame {

    private int adminId;

    /**
     * Creates new form StudentLogIn
     */
    public StudentLogInView() {
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
        pnlLogIn = new javax.swing.JPanel();
        lblIndexNo = new javax.swing.JLabel();
        txtIndexNo = new javax.swing.JTextField();
        pnlLogInBtn = new javax.swing.JPanel();
        btnLogIn = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 212)));
        setClosable(true);
        setTitle("Log In");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        pnlLogIn.setBackground(new java.awt.Color(36, 36, 36));

        lblIndexNo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblIndexNo.setForeground(new java.awt.Color(255, 255, 255));
        lblIndexNo.setText("Index no :");

        txtIndexNo.setBackground(new java.awt.Color(66, 66, 66));
        txtIndexNo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtIndexNo.setForeground(new java.awt.Color(255, 255, 255));
        txtIndexNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 212)));
        txtIndexNo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIndexNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIndexNoKeyReleased(evt);
            }
        });

        pnlLogInBtn.setBackground(new java.awt.Color(0, 108, 190));

        btnLogIn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogIn.setText("Log In");
        btnLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogInMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLogInMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlLogInBtnLayout = new javax.swing.GroupLayout(pnlLogInBtn);
        pnlLogInBtn.setLayout(pnlLogInBtnLayout);
        pnlLogInBtnLayout.setHorizontalGroup(
            pnlLogInBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        pnlLogInBtnLayout.setVerticalGroup(
            pnlLogInBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlLogInLayout = new javax.swing.GroupLayout(pnlLogIn);
        pnlLogIn.setLayout(pnlLogInLayout);
        pnlLogInLayout.setHorizontalGroup(
            pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogInLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblIndexNo)
                .addGap(10, 10, 10)
                .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLogInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlLogInLayout.setVerticalGroup(
            pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogInLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIndexNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIndexNo))
                .addGap(18, 18, 18)
                .addComponent(pnlLogInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(pnlLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(pnlLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseReleased
        try {
            logInAction();
        } catch (SQLException ex) {
            Logger.getLogger(StudentLogInView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLogInMouseReleased

    private void btnLogInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseEntered
        pnlLogInBtn.setBackground(ColorPalette.LOGIN_BTN_BG_1);
    }//GEN-LAST:event_btnLogInMouseEntered

    private void btnLogInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseExited
        pnlLogInBtn.setBackground(ColorPalette.LOGIN_BTN_BG_0);
    }//GEN-LAST:event_btnLogInMouseExited

    private void txtIndexNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndexNoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                logInAction();
            } catch (SQLException ex) {
                Logger.getLogger(StudentLogInView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtIndexNoKeyReleased

    public void initializeView() {
        txtIndexNo.setText("");
    }

    private void logInAction() throws SQLException {
        String index = txtIndexNo.getText().trim();
        Pattern indexP = Pattern.compile("([1]+\\d{5})*");
        Matcher m = indexP.matcher(index);
        if (index.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter index number");
        } else if (!m.matches()) {
            JOptionPane.showMessageDialog(this, "Enter valid index number");
            initializeView();
        } else {
            if (!DashBoardView.indexes.contains(index)) {
                DashBoardView.indexes.add(index);
                IssueView issueView = new IssueView();
                //issueView.dispose();
                DashBoardView.DesktopPane.remove((Component) issueView);
                DashBoardView.DesktopPane.add((Component) issueView);
                issueView.initializeView(index);
                issueView.setAdminId(adminId);
                issueView.setLocation((int) ((DashBoardView.DesktopPane.getSize().width - issueView.getSize().width) / 2), (int) ((DashBoardView.DesktopPane.getSize().height - issueView.getSize().height) / 2));
                this.dispose();
                issueView.setVisible(true);
            } else {
                this.dispose();
            }
        }
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLogIn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIndexNo;
    private javax.swing.JPanel pnlLogIn;
    private javax.swing.JPanel pnlLogInBtn;
    private javax.swing.JTextField txtIndexNo;
    // End of variables declaration//GEN-END:variables
}
