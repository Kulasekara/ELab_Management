/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rad.demo.ui.lists;

import com.rad.demo.database.AdminsSQL;
import com.rad.demo.database.ListSQL;
import com.rad.demo.entities.ApparatusList;
import com.rad.demo.ui.DashBoardView;
import static com.rad.demo.ui.DashBoardView.DesktopPane;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BHARATHA
 */
public class ListsView extends javax.swing.JInternalFrame {

    private boolean flagNotCompleted;
    private boolean flagAll;
    private DefaultTableModel dtmList;
    private int adminId;
    private final ListItemsView liv = new ListItemsView();

    /**
     * Creates new form NotCompletedList
     */
    public ListsView() {
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
        pnlTabs = new javax.swing.JPanel();
        pnlNotCompletedTab = new javax.swing.JPanel();
        tabNotCompleted = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlAllTab = new javax.swing.JPanel();
        tabAll = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ScrollPaneList = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        lblIndexNo = new javax.swing.JLabel();
        txtIndexNo = new javax.swing.JTextField();
        pnlSearchBtn = new javax.swing.JPanel();
        btnSearch = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 212)));
        setClosable(true);
        setTitle("Lists");

        pnlTabs.setLayout(new java.awt.GridLayout(1, 0));

        tabNotCompleted.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabNotCompleted.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tabNotCompleted.setText("Not Completed");
        tabNotCompleted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabNotCompletedMouseReleased(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 120, 212));

        javax.swing.GroupLayout pnlNotCompletedTabLayout = new javax.swing.GroupLayout(pnlNotCompletedTab);
        pnlNotCompletedTab.setLayout(pnlNotCompletedTabLayout);
        pnlNotCompletedTabLayout.setHorizontalGroup(
            pnlNotCompletedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabNotCompleted, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNotCompletedTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        pnlNotCompletedTabLayout.setVerticalGroup(
            pnlNotCompletedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotCompletedTabLayout.createSequentialGroup()
                .addComponent(tabNotCompleted, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlTabs.add(pnlNotCompletedTab);

        tabAll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabAll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tabAll.setText("All");
        tabAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabAllMouseReleased(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 120, 212));

        javax.swing.GroupLayout pnlAllTabLayout = new javax.swing.GroupLayout(pnlAllTab);
        pnlAllTab.setLayout(pnlAllTabLayout);
        pnlAllTabLayout.setHorizontalGroup(
            pnlAllTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAllTabLayout.createSequentialGroup()
                .addComponent(tabAll, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlAllTabLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAllTabLayout.setVerticalGroup(
            pnlAllTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAllTabLayout.createSequentialGroup()
                .addComponent(tabAll, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlTabs.add(pnlAllTab);

        tblList.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "List ID", "Index no.", "Issued Date", "Status", "Received Date", "Administor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblList.getTableHeader().setReorderingAllowed(false);
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblListMouseReleased(evt);
            }
        });
        ScrollPaneList.setViewportView(tblList);
        if (tblList.getColumnModel().getColumnCount() > 0) {
            tblList.getColumnModel().getColumn(0).setMinWidth(0);
            tblList.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblList.getColumnModel().getColumn(0).setMaxWidth(60);
            tblList.getColumnModel().getColumn(1).setMinWidth(0);
            tblList.getColumnModel().getColumn(1).setPreferredWidth(60);
            tblList.getColumnModel().getColumn(1).setMaxWidth(60);
            tblList.getColumnModel().getColumn(3).setMinWidth(0);
            tblList.getColumnModel().getColumn(3).setPreferredWidth(90);
            tblList.getColumnModel().getColumn(3).setMaxWidth(90);
        }

        lblIndexNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIndexNo.setText("Index no :");

        txtIndexNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIndexNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIndexNoKeyReleased(evt);
            }
        });

        pnlSearchBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 212)));

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rad/demo/icons/InternalFrames/Search-icon.png"))); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSearchMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchBtnLayout = new javax.swing.GroupLayout(pnlSearchBtn);
        pnlSearchBtn.setLayout(pnlSearchBtnLayout);
        pnlSearchBtnLayout.setHorizontalGroup(
            pnlSearchBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlSearchBtnLayout.setVerticalGroup(
            pnlSearchBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSearch))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIndexNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollPaneList, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearchBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIndexNo)
                        .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(ScrollPaneList, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabNotCompletedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabNotCompletedMouseReleased
        try {
            initializeView();
        } catch (SQLException ex) {
            Logger.getLogger(ListsView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabNotCompletedMouseReleased

    private void tabAllMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAllMouseReleased
        try {
            tabAllAction();
        } catch (SQLException ex) {
            Logger.getLogger(ListsView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabAllMouseReleased

    private void tblListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseReleased
        if (evt.getButton() == 1) {
            if (evt.getClickCount() == 2) {
                int row = tblList.getSelectedRow();
                if (row >= 0 && flagNotCompleted) {
                    try {
                        String id = tblList.getValueAt(row, 0).toString();
                        String index = tblList.getValueAt(row, 1).toString();
                        liv.dispose();
                        liv.initializeView(id);
                        liv.setVisible(true);
                        liv.dispose();
                        DashBoardView.DesktopPane.remove((Component) liv);
                        DashBoardView.DesktopPane.add((Component) liv);
                        liv.setIndex(index);
                        liv.setAdminId(adminId);
                        liv.setView(this);
                        liv.initializeView(id);
                        liv.setLocation((int) ((DesktopPane.getSize().width - liv.getSize().width) / 2), (int) ((DesktopPane.getSize().height - liv.getSize().height) / 2));
                        liv.setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(ListsView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_tblListMouseReleased

    private void txtIndexNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndexNoKeyReleased
        String index = txtIndexNo.getText().trim();
        if (index.equals("")) {
            if (flagNotCompleted) {
                try {
                    initializeView();
                } catch (SQLException ex) {
                    Logger.getLogger(ListsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (flagAll) {
                try {
                    tabAllAction();
                } catch (SQLException ex) {
                    Logger.getLogger(ListsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                try {
                    searchAction(index);
                } catch (SQLException ex) {
                    Logger.getLogger(ListsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_txtIndexNoKeyReleased

    private void btnSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseReleased
        String index = txtIndexNo.getText().trim();
        if (!index.equals("")) {
            try {
                searchAction(index);
            } catch (SQLException ex) {
                Logger.getLogger(ListsView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSearchMouseReleased

    public void initializeView() throws SQLException {
        this.flagNotCompleted = true;
        this.flagAll = false;
        jSeparator1.setVisible(true);
        jSeparator2.setVisible(false);
        txtIndexNo.setText("");
        setDtmList();
        List<ApparatusList> list = ListSQL.getNotCompletedLists();
        list.forEach((ApparatusList apparatusList) -> {
            int status = apparatusList.getReceived();
            String receivedDate = apparatusList.getReceivedDate();
            int admin = apparatusList.getAdminsAdminId();

            String statusStr = null;
            if (status == 0) {
                statusStr = "Not Completed";
            } else if (status == 1) {
                statusStr = "Completed";
            }

            String receivedDateStr;
            if (receivedDate.equals("0000-00-00 00:00:00")) {
                receivedDateStr = "";
            } else {
                receivedDateStr = receivedDate;
            }

            String adminStr = null;
            try {
                adminStr = AdminsSQL.getAdminName(admin);
            } catch (SQLException ex) {
                Logger.getLogger(ListsView.class.getName()).log(Level.SEVERE, null, ex);
            }

            dtmList.addRow(new Object[]{apparatusList.getListId(), apparatusList.getStudentRegNo(), apparatusList.getIssuedDate(), statusStr, receivedDateStr, adminStr});
        });
    }

    private void setDtmList() {
        dtmList = (DefaultTableModel) this.tblList.getModel();
        dtmList.getDataVector().removeAllElements();
        dtmList.fireTableDataChanged();
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    private void tabAllAction() throws SQLException {
        flagNotCompleted = false;
        flagAll = true;
        jSeparator2.setVisible(true);
        jSeparator1.setVisible(false);
        
        txtIndexNo.setText("");
        setDtmList();
        List<ApparatusList> list = ListSQL.getAllLists();
        list.forEach((ApparatusList apparatusList) -> {
            int status = apparatusList.getReceived();
            String receivedDate = apparatusList.getReceivedDate();
            int admin = apparatusList.getAdminsAdminId();

            String statusStr = null;
            if (status == 0) {
                statusStr = "Not Completed";
            } else if (status == 1) {
                statusStr = "Completed";
            }

            String receivedDateStr;
            if (receivedDate.equals("0000-00-00 00:00:00")) {
                receivedDateStr = "";
            } else {
                receivedDateStr = receivedDate;
            }

            String adminStr = null;
            try {
                adminStr = AdminsSQL.getAdminName(admin);
            } catch (SQLException ex) {
                Logger.getLogger(ListsView.class.getName()).log(Level.SEVERE, null, ex);
            }

            dtmList.addRow(new Object[]{apparatusList.getListId(), apparatusList.getStudentRegNo(), apparatusList.getIssuedDate(), statusStr, receivedDateStr, adminStr});
        });
    }

    private void searchAction(String index) throws SQLException {
        Pattern indexP = Pattern.compile("([1]+\\d{5})*");
        Matcher m = indexP.matcher(index);
        if (!m.matches()) {
            JOptionPane.showMessageDialog(this, "Enter valid index number");
            txtIndexNo.setText("");
            if (flagNotCompleted) {
                initializeView();
            } else if (flagAll) {
                tabAllAction();
            }
        } else {
            List<ApparatusList> list = null;
            if (flagNotCompleted) {
                list = ListSQL.getNotCompletedListsByRegNo(index);
            } else if (flagAll) {
                list = ListSQL.getAllListsByRegNo(index);
            }
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lists are not found for index number " + index);
                txtIndexNo.setText("");
                if (flagNotCompleted) {
                    initializeView();
                } else if (flagAll) {
                    tabAllAction();
                }
            } else {
                setDtmList();
                list.forEach((ApparatusList apparatusList) -> {
                    try {
                        int status = apparatusList.getReceived();
                        String receivedDate = apparatusList.getReceivedDate();
                        int admin = apparatusList.getAdminsAdminId();

                        String statusStr = null;
                        if (status == 0) {
                            statusStr = "Not Completed";
                        } else if (status == 1) {
                            statusStr = "Completed";
                        }

                        String receivedDateStr;
                        if (receivedDate.equals("0000-00-00 00:00:00")) {
                            receivedDateStr = "";
                        } else {
                            receivedDateStr = receivedDate;
                        }

                        String adminStr = AdminsSQL.getAdminName(admin);
                        dtmList.addRow(new Object[]{apparatusList.getListId(), apparatusList.getStudentRegNo(), apparatusList.getIssuedDate(), statusStr, receivedDateStr, adminStr});
                    } catch (SQLException ex) {
                        Logger.getLogger(ListsView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneList;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIndexNo;
    private javax.swing.JPanel pnlAllTab;
    private javax.swing.JPanel pnlNotCompletedTab;
    private javax.swing.JPanel pnlSearchBtn;
    private javax.swing.JPanel pnlTabs;
    private javax.swing.JLabel tabAll;
    private javax.swing.JLabel tabNotCompleted;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtIndexNo;
    // End of variables declaration//GEN-END:variables
}
