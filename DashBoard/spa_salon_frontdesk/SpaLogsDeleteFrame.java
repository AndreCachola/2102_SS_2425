package spa_salon_frontdesk;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class SpaLogsDeleteFrame extends javax.swing.JFrame {

    public SpaLogsDeleteFrame() {
        initComponents();
        loadDatabaseToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSpaLogsUpdate = new javax.swing.JTable();
        btnClose5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableSpaLogsUpdate.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tableSpaLogsUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableSpaLogsUpdate.setRowHeight(35);
        tableSpaLogsUpdate.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableSpaLogsUpdate);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 688, 460));

        btnClose5.setText("Close");
        btnClose5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 3, 36)); // NOI18N
        jLabel1.setText("Spa Deleted log");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClose5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnClose5ActionPerformed
        private void loadDatabaseToTable() {
        String url = "jdbc:mysql://localhost:3306/spa_salon";
        String user = "root";
        String password = "";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            
            String fetchLogsQuery = "SELECT * FROM spa_logsDeleted";
            PreparedStatement fetchLogsStmt = con.prepareStatement(fetchLogsQuery);
            ResultSet rs = fetchLogsStmt.executeQuery();

           
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            
            Vector<String> columnNames = new Vector<>();
            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(metaData.getColumnName(i));
            }

          
            Vector<Vector<Object>> data = new Vector<>();
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                for (int i = 1; i <= columnCount; i++) {
                    row.add(rs.getObject(i));
                }
                data.add(row);
            }

           
            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            tableSpaLogsUpdate.setModel(model); 

            autoResizeTableColumns(tableSpaLogsUpdate);
            fetchLogsStmt.close();
            con.close();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "An error occurred while loading the table data.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void autoResizeTableColumns(JTable tableSalonLogsUpdate) {
        final int margin = 5; 

        for (int column = 0; column < tableSalonLogsUpdate.getColumnCount(); column++) {
            TableColumn tableColumn = tableSalonLogsUpdate.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

           
            TableCellRenderer headerRenderer = tableSalonLogsUpdate.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(tableSalonLogsUpdate, tableColumn.getHeaderValue(), false, false, 0, column);
            preferredWidth = Math.max(preferredWidth, headerComp.getPreferredSize().width);

          
            for (int row = 0; row < tableSalonLogsUpdate.getRowCount(); row++) {
                TableCellRenderer cellRenderer = tableSalonLogsUpdate.getCellRenderer(row, column);
                Component cellComp = cellRenderer.getTableCellRendererComponent(tableSalonLogsUpdate, tableSalonLogsUpdate.getValueAt(row, column), false, false, row, column);
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
            java.util.logging.Logger.getLogger(SpaLogsDeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpaLogsDeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpaLogsDeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpaLogsDeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpaLogsDeleteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSpaLogsUpdate;
    // End of variables declaration//GEN-END:variables
}
