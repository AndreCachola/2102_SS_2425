package spa_salon_frontdesk;

import java.awt.Component;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class Bookings extends javax.swing.JFrame {

    public Bookings() {
        initComponents();
        loadTableSalonBookings();
        loadTableSpaBookings();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBookingsSalon = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBookingsSpa = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(180, 181, 181));
        jButton5.setFont(new java.awt.Font("Book Antiqua", 3, 16)); // NOI18N
        jButton5.setText("About us");
        jButton5.setBorder(null);
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, 90, 30));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1204, 1));

        jButton2.setBackground(new java.awt.Color(180, 181, 181));
        jButton2.setFont(new java.awt.Font("Book Antiqua", 3, 16)); // NOI18N
        jButton2.setText("Log out");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, -1, 30));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 140, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, -1, 180));

        tableBookingsSalon.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tableBookingsSalon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Day", "Time", "Assined Employee", "Total Price", "Services"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBookingsSalon.setRowHeight(35);
        tableBookingsSalon.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableBookingsSalon);
        if (tableBookingsSalon.getColumnModel().getColumnCount() > 0) {
            tableBookingsSalon.getColumnModel().getColumn(0).setResizable(false);
            tableBookingsSalon.getColumnModel().getColumn(1).setResizable(false);
            tableBookingsSalon.getColumnModel().getColumn(2).setResizable(false);
            tableBookingsSalon.getColumnModel().getColumn(3).setResizable(false);
            tableBookingsSalon.getColumnModel().getColumn(4).setResizable(false);
            tableBookingsSalon.getColumnModel().getColumn(5).setResizable(false);
            tableBookingsSalon.getColumnModel().getColumn(6).setResizable(false);
        }

        jTabbedPane1.addTab("Salon", jScrollPane1);

        tableBookingsSpa.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tableBookingsSpa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Day", "Time", "Assined Employee", "Total Price", "Services"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBookingsSpa.setRowHeight(35);
        tableBookingsSpa.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableBookingsSpa);
        if (tableBookingsSpa.getColumnModel().getColumnCount() > 0) {
            tableBookingsSpa.getColumnModel().getColumn(0).setResizable(false);
            tableBookingsSpa.getColumnModel().getColumn(1).setResizable(false);
            tableBookingsSpa.getColumnModel().getColumn(2).setResizable(false);
            tableBookingsSpa.getColumnModel().getColumn(3).setResizable(false);
            tableBookingsSpa.getColumnModel().getColumn(4).setResizable(false);
            tableBookingsSpa.getColumnModel().getColumn(5).setResizable(false);
            tableBookingsSpa.getColumnModel().getColumn(6).setResizable(false);
        }

        jTabbedPane1.addTab("Spa", jScrollPane2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1150, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1200, 560));

        btnClose.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 3, 36)); // NOI18N
        jLabel3.setText("Bookings");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        JTable selectedTable = null;
        String logTableName = null;
        String sourceTableName = null;

        // Check which table is selected
        if (tableBookingsSalon.getSelectedRow() != -1) {
            selectedTable = tableBookingsSalon;
            logTableName = "tableSalonBookingsLogs";
            sourceTableName = "tableSalonBookings";
        } else if (tableBookingsSpa.getSelectedRow() != -1) {
            selectedTable = tableBookingsSpa;
            logTableName = "tableSpaBookingsLogs";
            sourceTableName = "tableSpaBookings";
        }

        if (selectedTable == null) {
            JOptionPane.showMessageDialog(this, "Please select a booking to remove!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Retrieve the selected row
        int selectedRow = selectedTable.getSelectedRow();

        // Retrieve data from the selected row
        String id = selectedTable.getValueAt(selectedRow, 0).toString(); // Assuming the first column is the ID
        String name = selectedTable.getValueAt(selectedRow, 1).toString(); // Name
        String date = selectedTable.getValueAt(selectedRow, 2).toString(); // Date
        String totalPrice = selectedTable.getValueAt(selectedRow, 3).toString(); // Total Price
        String services = selectedTable.getValueAt(selectedRow, 4).toString(); // Services
        String assignedEmployee = selectedTable.getValueAt(selectedRow, 5).toString(); // Assigned Employee

        // Prepare SQL queries
        String insertQuery = "INSERT INTO " + logTableName + " (id, Name, Date, totalPrice, services, `Assigned Employee`) VALUES (?, ?, ?, ?, ?, ?)";
        String deleteQuery = "DELETE FROM " + sourceTableName + " WHERE id = ?";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spa_salon", "root", ""); PreparedStatement insertStmt = con.prepareStatement(insertQuery); PreparedStatement deleteStmt = con.prepareStatement(deleteQuery)) {

            // Set parameters for the insert statement
            insertStmt.setString(1, id);
            insertStmt.setString(2, name);
            insertStmt.setString(3, date);
            insertStmt.setString(4, totalPrice);
            insertStmt.setString(5, services);
            insertStmt.setString(6, assignedEmployee);

            // Execute the insert statement
            int rowsInserted = insertStmt.executeUpdate();
            if (rowsInserted > 0) {
                // Set parameter for the delete statement
                deleteStmt.setString(1, id);

                // Execute the delete statement
                int rowsDeleted = deleteStmt.executeUpdate();
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "Booking successfully moved to logs!", "Success", JOptionPane.INFORMATION_MESSAGE);

                    // Remove the row from the table view
                    DefaultTableModel model = (DefaultTableModel) selectedTable.getModel();
                    model.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete booking from " + sourceTableName + ".", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Failed to move booking to logs.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void loadTableSalonBookings() {
        String url = "jdbc:mysql://localhost:3306/spa_salon";
        String user = "root";
        String password = "";

        // Updated query to include the Date column
        String query = "SELECT * FROM tableSalonBookings";

        try (
                Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {
            // Updated table model with the Date column
            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"ID", "Name", "Date", "Total Price", "Services", "Assigned Employee"}, 0
            );

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

            // Set the model to the table
            tableBookingsSalon.setModel(model);

            // Adjust column widths dynamically
            autoResizeSalonTableColumns(tableBookingsSalon);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error loading data from database.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void autoResizeSalonTableColumns(JTable tableBookings) {
        final int margin = 5;

        for (int column = 0; column < tableBookings.getColumnCount(); column++) {
            TableColumn tableColumn = tableBookings.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            TableCellRenderer headerRenderer = tableBookings.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(tableBookings, tableColumn.getHeaderValue(), false, false, 0, column);
            preferredWidth = Math.max(preferredWidth, headerComp.getPreferredSize().width);

            for (int row = 0; row < tableBookings.getRowCount(); row++) {
                TableCellRenderer cellRenderer = tableBookings.getCellRenderer(row, column);
                Component cellComp = cellRenderer.getTableCellRendererComponent(tableBookings, tableBookings.getValueAt(row, column), false, false, row, column);
                preferredWidth = Math.max(preferredWidth, cellComp.getPreferredSize().width + margin);

                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            tableColumn.setPreferredWidth(preferredWidth);
        }
    }

    private void loadTableSpaBookings() {
        String url = "jdbc:mysql://localhost:3306/spa_salon";
        String user = "root";
        String password = "";

        // Updated query to include the Date column
        String query = "SELECT * FROM tableSpaBookings";

        try (
                Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {
            // Updated table model with the Date column
            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"ID", "Name", "Date", "Total Price", "Services", "Assigned Employee"}, 0
            );

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

            // Set the model to the table
            tableBookingsSpa.setModel(model);

            // Adjust column widths dynamically
            autoResizeSpaTableColumns(tableBookingsSpa);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error loading data from database.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void autoResizeSpaTableColumns(JTable tableBookingsSpa) {
        final int margin = 5;

        for (int column = 0; column < tableBookingsSpa.getColumnCount(); column++) {
            TableColumn tableColumn = tableBookingsSpa.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            TableCellRenderer headerRenderer = tableBookingsSpa.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(tableBookingsSpa, tableColumn.getHeaderValue(), false, false, 0, column);
            preferredWidth = Math.max(preferredWidth, headerComp.getPreferredSize().width);

            for (int row = 0; row < tableBookingsSpa.getRowCount(); row++) {
                TableCellRenderer cellRenderer = tableBookingsSpa.getCellRenderer(row, column);
                Component cellComp = cellRenderer.getTableCellRendererComponent(tableBookingsSpa, tableBookingsSpa.getValueAt(row, column), false, false, row, column);
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
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Bookings bs = new Bookings();
        bs.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableBookingsSalon;
    private javax.swing.JTable tableBookingsSpa;
    // End of variables declaration//GEN-END:variables
}
