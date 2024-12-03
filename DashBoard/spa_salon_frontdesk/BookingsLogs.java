
package spa_salon_frontdesk;

import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class BookingsLogs extends javax.swing.JFrame {

    public BookingsLogs() {
        initComponents();
        loadSalonTable();
        loadSpaTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalonTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        SpaTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        SalonTable.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        SalonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Day", "Total Price", "Services", "Assined Employee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SalonTable.setRowHeight(35);
        SalonTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(SalonTable);
        if (SalonTable.getColumnModel().getColumnCount() > 0) {
            SalonTable.getColumnModel().getColumn(0).setResizable(false);
            SalonTable.getColumnModel().getColumn(1).setResizable(false);
            SalonTable.getColumnModel().getColumn(2).setResizable(false);
            SalonTable.getColumnModel().getColumn(3).setResizable(false);
            SalonTable.getColumnModel().getColumn(4).setResizable(false);
            SalonTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jTabbedPane1.addTab("Salon", jScrollPane1);

        SpaTable.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        SpaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Day", "Total Price", "Services", "Assined Employee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SpaTable.setRowHeight(35);
        SpaTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(SpaTable);
        if (SpaTable.getColumnModel().getColumnCount() > 0) {
            SpaTable.getColumnModel().getColumn(0).setResizable(false);
            SpaTable.getColumnModel().getColumn(1).setResizable(false);
            SpaTable.getColumnModel().getColumn(2).setResizable(false);
            SpaTable.getColumnModel().getColumn(3).setResizable(false);
            SpaTable.getColumnModel().getColumn(4).setResizable(false);
            SpaTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jTabbedPane1.addTab("Spa", jScrollPane3);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 3, 36)); // NOI18N
        jLabel3.setText("Bookings Logs");

        btnClose.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnClose)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed
   
    private void loadSalonTable() {
    String query = "SELECT id, Name, Date, totalPrice, services, `Assigned Employee` FROM tableSalonBookingsLogs";

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spa_salon", "root", ""); 
         PreparedStatement pst = con.prepareStatement(query); 
         ResultSet rs = pst.executeQuery()) {

        // Get the table model for SalonTable
        DefaultTableModel model = (DefaultTableModel) SalonTable.getModel();

        // Clear existing rows
        model.setRowCount(0);

        // Populate rows from ResultSet
        while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("Name");
                Date date = rs.getDate("Date"); // Get the date from the result set
                double totalPrice = rs.getDouble("totalPrice");
                String services = rs.getString("services");
                String assignedEmployee = rs.getString("Assigned Employee");

                // Format services if necessary
                if (services != null && !services.isEmpty()) {
                    services = String.join(", ", services.split(","));
                }

                // Add row with the Date column
                model.addRow(new Object[]{id, name, date, totalPrice, services, assignedEmployee});
            }
        autoResizeSalonTableColumns(SalonTable);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error retrieving data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
     private void autoResizeSalonTableColumns(JTable SalonTable) {
        final int margin = 5;

        for (int column = 0; column < SalonTable.getColumnCount(); column++) {
            TableColumn tableColumn = SalonTable.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            TableCellRenderer headerRenderer = SalonTable.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(SalonTable, tableColumn.getHeaderValue(), false, false, 0, column);
            preferredWidth = Math.max(preferredWidth, headerComp.getPreferredSize().width);

            for (int row = 0; row < SalonTable.getRowCount(); row++) {
                TableCellRenderer cellRenderer = SalonTable.getCellRenderer(row, column);
                Component cellComp = cellRenderer.getTableCellRendererComponent(SalonTable, SalonTable.getValueAt(row, column), false, false, row, column);
                preferredWidth = Math.max(preferredWidth, cellComp.getPreferredSize().width + margin);

                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            tableColumn.setPreferredWidth(preferredWidth);
        }
    }
     
     private void loadSpaTable() {
    String query = "SELECT id, Name, Date, totalPrice, services, `Assigned Employee` FROM tableSpaBookingsLogs";

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spa_salon", "root", ""); 
         PreparedStatement pst = con.prepareStatement(query); 
         ResultSet rs = pst.executeQuery()) {

        // Get the table model for SalonTable
        DefaultTableModel model = (DefaultTableModel) SpaTable.getModel();

        // Clear existing rows
        model.setRowCount(0);

        // Populate rows from ResultSet
        while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("Name");
                Date date = rs.getDate("Date"); // Get the date from the result set
                double totalPrice = rs.getDouble("totalPrice");
                String services = rs.getString("services");
                String assignedEmployee = rs.getString("Assigned Employee");

                // Format services if necessary
                if (services != null && !services.isEmpty()) {
                    services = String.join(", ", services.split(","));
                }

                // Add row with the Date column
                model.addRow(new Object[]{id, name, date, totalPrice, services, assignedEmployee});
            }
        autoResizeSpaTableColumns(SpaTable);
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error retrieving data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
     private void autoResizeSpaTableColumns(JTable SpaTable) {
        final int margin = 5;

        for (int column = 0; column < SpaTable.getColumnCount(); column++) {
            TableColumn tableColumn = SpaTable.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            TableCellRenderer headerRenderer = SpaTable.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(SpaTable, tableColumn.getHeaderValue(), false, false, 0, column);
            preferredWidth = Math.max(preferredWidth, headerComp.getPreferredSize().width);

            for (int row = 0; row < SpaTable.getRowCount(); row++) {
                TableCellRenderer cellRenderer = SpaTable.getCellRenderer(row, column);
                Component cellComp = cellRenderer.getTableCellRendererComponent(SpaTable, SpaTable.getValueAt(row, column), false, false, row, column);
                preferredWidth = Math.max(preferredWidth, cellComp.getPreferredSize().width + margin);

                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            tableColumn.setPreferredWidth(preferredWidth);
        }
    }
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
            java.util.logging.Logger.getLogger(BookingsLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingsLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingsLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingsLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingsLogs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SalonTable;
    private javax.swing.JTable SpaTable;
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
