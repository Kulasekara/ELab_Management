/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rad.demo.ui.lists;

import com.rad.demo.database.AdminsSQL;
import com.rad.demo.database.ApparatusSQL;
import com.rad.demo.database.ListSQL;
import com.rad.demo.entities.Apparatus;
import com.rad.demo.entities.ListItems;
import com.rad.demo.ui.DashBoardView;
import static com.rad.demo.ui.DashBoardView.DesktopPane;
import java.awt.Component;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BHARATHA
 */
public class ListItemsView extends javax.swing.JInternalFrame {

    private DefaultTableModel dtmList;
    private int adminId;
    private int listId;
    private String index;
    private ListsView view;

    public void setView(ListsView view) {
        this.view = view;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    /**
     * Creates new form ListItemsView
     */
    public ListItemsView() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        spinnerQty = new javax.swing.JSpinner();
        lblBrokenQty = new javax.swing.JLabel();
        lblListID = new javax.swing.JLabel();
        lblIndex = new javax.swing.JLabel();
        lblListID1 = new javax.swing.JLabel();
        lblIndex1 = new javax.swing.JLabel();
        btnCompleted = new javax.swing.JButton();
        btnMLAC = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 212)));
        setClosable(true);
        setTitle("List Items");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblList.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Group", "Family", "Component", "Qty.", "Status", "Received Date", "Admin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblList.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblList);
        if (tblList.getColumnModel().getColumnCount() > 0) {
            tblList.getColumnModel().getColumn(0).setMinWidth(0);
            tblList.getColumnModel().getColumn(0).setPreferredWidth(90);
            tblList.getColumnModel().getColumn(0).setMaxWidth(90);
            tblList.getColumnModel().getColumn(3).setMinWidth(0);
            tblList.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblList.getColumnModel().getColumn(3).setMaxWidth(60);
            tblList.getColumnModel().getColumn(4).setMinWidth(0);
            tblList.getColumnModel().getColumn(4).setPreferredWidth(90);
            tblList.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, 847, 256));

        spinnerQty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spinnerQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerQtyStateChanged(evt);
            }
        });
        jPanel1.add(spinnerQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 310, 56, -1));

        lblBrokenQty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBrokenQty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrokenQty.setText("Broken qty.");
        jPanel1.add(lblBrokenQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 310, 79, 26));

        lblListID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(lblListID, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 11, 90, 21));

        lblIndex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(lblIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 11, 91, 21));

        lblListID1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblListID1.setText("List ID :");
        jPanel1.add(lblListID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 56, 21));

        lblIndex1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIndex1.setText("Index :");
        jPanel1.add(lblIndex1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 11, 49, 21));

        btnCompleted.setText("Completed");
        btnCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompleted, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, -1, 30));

        btnMLAC.setText("Mark list as completed");
        btnMLAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMLACActionPerformed(evt);
            }
        });
        jPanel1.add(btnMLAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spinnerQtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerQtyStateChanged
        if (Integer.parseInt(spinnerQty.getValue().toString()) < 0) {
            spinnerQty.setValue(0);
        }
    }//GEN-LAST:event_spinnerQtyStateChanged

    private void btnCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletedActionPerformed
        int count = tblList.getSelectedRowCount();
        switch (count) {
            case 0:
                JOptionPane.showMessageDialog(this, "Select the component you want to mark as completed", "", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                int input = JOptionPane.showConfirmDialog(this, "Do you want to mark this item as completed?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (input == JOptionPane.YES_OPTION) {
                    try {
                        int row = tblList.getSelectedRow();
                        if (row >= 0) {

                            String status = tblList.getValueAt(row, 4).toString();

                            if (status.equals("Not Completed")) {
                                String component = tblList.getValueAt(row, 2).toString();
                                Apparatus temp = ApparatusSQL.getComponentDetails(component);
                                int cID = temp.getId();
                                int qtyStock = temp.getQty();
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                Date date = new Date();

                                int qtyList = Integer.parseInt(tblList.getValueAt(row, 3).toString());
                                int qtyBroken = Integer.parseInt(spinnerQty.getValue().toString());

                                if (qtyList >= qtyBroken) {
                                    int newQty = qtyStock + (qtyList - qtyBroken);

                                    ListSQL.setListItemAsCompleted(listId, cID, sdf.format(date), adminId);
                                    ListSQL.setQty(cID, newQty);
                                    if (qtyBroken > 0) {
                                        ListSQL.addBrokenListItems(listId, cID, qtyBroken);
                                    }
                                    JOptionPane.showMessageDialog(this, "The component was marked as completed", "", JOptionPane.INFORMATION_MESSAGE);
                                    this.dispose();
                                    tblList.removeAll();
                                    DashBoardView.DesktopPane.remove((Component) this);
                                    DashBoardView.DesktopPane.add((Component) this);
                                    this.initializeView(Integer.toString(listId));
                                    this.setAdminId(adminId);
                                    spinnerQty.setValue(0);
                                    this.setLocation((int) ((DesktopPane.getSize().width - this.getSize().width) / 2), (int) ((DesktopPane.getSize().height - this.getSize().height) / 2));
                                    this.setVisible(true);
                                } else {
                                    JOptionPane.showMessageDialog(this, "Check the number of broken components", "", JOptionPane.INFORMATION_MESSAGE);
                                    spinnerQty.setValue(0);
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "This component was already marked as completed", "", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ListItemsView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            default:
                JOptionPane.showMessageDialog(this, "Select one component at a time", "", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }//GEN-LAST:event_btnCompletedActionPerformed

    private void btnMLACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMLACActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to mark the list as completed?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (input == JOptionPane.YES_OPTION) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date();
                ListSQL.setListAsCompleted(listId, sdf.format(date), adminId);
                JOptionPane.showMessageDialog(this, "The list was marked as completed", "", JOptionPane.INFORMATION_MESSAGE);
                view.dispose();
                DashBoardView.DesktopPane.remove((Component) view);
                DashBoardView.DesktopPane.add((Component) view);
                view.initializeView();
                view.setAdminId(adminId);
                view.setLocation((int) ((DesktopPane.getSize().width - view.getSize().width) / 2), (int) ((DesktopPane.getSize().height - view.getSize().height) / 2));
                view.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(ListItemsView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnMLACActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompleted;
    private javax.swing.JButton btnMLAC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBrokenQty;
    private javax.swing.JLabel lblIndex;
    private javax.swing.JLabel lblIndex1;
    private javax.swing.JLabel lblListID;
    private javax.swing.JLabel lblListID1;
    private javax.swing.JSpinner spinnerQty;
    private javax.swing.JTable tblList;
    // End of variables declaration//GEN-END:variables

    public void initializeView(String id) throws SQLException {
        lblListID.setText(Integer.toString(listId));
        lblIndex.setText(index);
        setListId(Integer.parseInt(id));
        spinnerQty.setValue(0);
        addToTable(id);
    }

    private void addToTable(String id) throws SQLException {
        setDtmList();
        List<ListItems> list = ListSQL.getAllListItems(id);
        list.forEach((ListItems listItems) -> {
            try {
                Apparatus temp = ApparatusSQL.searchById(Integer.toString(listItems.getApparatusApparatusId()));

                int qty = listItems.getQty();
                int status = listItems.getReceived();
                String receivedDate = listItems.getReceivedDate();
                int admin = listItems.getAdminsAdminId();

                String group = temp.getGroup();
                String family = temp.getFamily();
                String component = temp.getComponent();

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
                dtmList.addRow(new Object[]{group, family, component, qty, statusStr, receivedDateStr, adminStr});
            } catch (SQLException ex) {
                Logger.getLogger(ListsView.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    private void setDtmList() {
        dtmList = (DefaultTableModel) this.tblList.getModel();
        dtmList.getDataVector().removeAllElements();
        dtmList.fireTableDataChanged();
    }
}
