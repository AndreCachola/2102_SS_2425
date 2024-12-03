package spa_salon_frontdesk;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class BookFrame extends javax.swing.JFrame {

    public BookFrame() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableService = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnSalonServices = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSpaServices = new javax.swing.JButton();
        tfTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfCustomerName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfChange = new javax.swing.JTextField();
        tfCash = new javax.swing.JTextField();
        btnPay = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cbPrefGender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        btnClose = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tableService.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        tableService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service ID", "Service Name", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableService.setGridColor(new java.awt.Color(204, 204, 204));
        tableService.setRowHeight(35);
        tableService.setShowGrid(true);
        tableService.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableService);
        if (tableService.getColumnModel().getColumnCount() > 0) {
            tableService.getColumnModel().getColumn(0).setResizable(false);
            tableService.getColumnModel().getColumn(1).setResizable(false);
            tableService.getColumnModel().getColumn(1).setPreferredWidth(5);
            tableService.getColumnModel().getColumn(2).setResizable(false);
            tableService.getColumnModel().getColumn(2).setPreferredWidth(15);
            tableService.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSalonServices.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnSalonServices.setText("Spa Services");
        btnSalonServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalonServicesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel1.setText("Total:");

        btnSpaServices.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnSpaServices.setText("Salon Services");
        btnSpaServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpaServicesActionPerformed(evt);
            }
        });

        tfTotal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel2.setText("Customer Name:");

        tfCustomerName.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel10.setText("Change:");

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel3.setText("Cash:");

        tfChange.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        tfCash.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N

        btnPay.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnPay.setText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel13.setText("Prefered Gender:");

        cbPrefGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbPrefGender.setSelectedIndex(-1);

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel5.setText("Months:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnSpaServices)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalonServices, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCustomerName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(tfTotal, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfChange, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCash, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(cbPrefGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpaServices)
                    .addComponent(btnSalonServices))
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(tfCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPrefGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        btnClose.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 3, 36)); // NOI18N
        jLabel4.setText("Booking Service");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private boolean isSpaSelected = false;
    private boolean isSalonSelected = false;

    private void btnSalonServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalonServicesActionPerformed
        loadSpaServices();
        isSpaSelected = true;
        isSalonSelected = false;
    }//GEN-LAST:event_btnSalonServicesActionPerformed

    private void btnSpaServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpaServicesActionPerformed
        loadSalonServices();
        isSpaSelected = false;
        isSalonSelected = true;
    }//GEN-LAST:event_btnSpaServicesActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        try {
            // Get data from the text fields and JDateChooser
            String customer = tfCustomerName.getText().trim();
            String totalText = tfTotal.getText().trim();
            String cashText = tfCash.getText().trim();
            Date selectedDate = dateChooser.getDate(); // Assuming 'dateChooser' is the JDateChooser instance
            String preferredGender = (String) cbPrefGender.getSelectedItem();

            // Validate fields
            if (customer.isEmpty() || totalText.isEmpty() || cashText.isEmpty() || selectedDate == null || preferredGender == null) {
                JOptionPane.showMessageDialog(this, "All fields must be filled out!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Convert date to SQL format
            java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

            // Convert the total and cash values to double
            double total = Double.parseDouble(totalText);
            double cash = Double.parseDouble(cashText);

            // Check if the cash is sufficient
            if (cash < total) {
                JOptionPane.showMessageDialog(this, "Insufficient cash! Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Calculate change
            double change = cash - total;
            tfChange.setText(String.format("%.2f", change));  // Display the change

            // Prepare the list of selected services from the table
            StringBuilder selectedServices = new StringBuilder();
            DefaultTableModel model = (DefaultTableModel) tableService.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                boolean isSelected = (boolean) model.getValueAt(i, 0);  // Check the selection box
                if (isSelected) {
                    String serviceName = (String) model.getValueAt(i, 2);  // Get the service name
                    if (selectedServices.length() > 0) {
                        selectedServices.append(", "); // Append if there's already a service
                    }
                    selectedServices.append(serviceName); // Add the service name
                }
            }

            // Database connection details
            String url = "jdbc:mysql://localhost:3306/spa_salon";
            String dbUser = "root";
            String dbPassword = "";

            // Check if the date already has 5 bookings
            String checkSalonQuery = "SELECT COUNT(*) FROM tableSalonBookings WHERE Date = ?";
            int SalonbookingCount = 0;

            try (Connection con = DriverManager.getConnection(url, dbUser, dbPassword); PreparedStatement checkPst = con.prepareStatement(checkSalonQuery)) {
                checkPst.setDate(1, sqlDate); // Use the selected date for the query
                try (ResultSet rs = checkPst.executeQuery()) {
                    if (rs.next()) {
                        SalonbookingCount = rs.getInt(1); // Get the count of bookings for the date
                    }
                }
            }

            // Check if the date has reached the limit
            if (SalonbookingCount >= 5) {
                JOptionPane.showMessageDialog(this, "Booking limit reached for the selected date! Please choose a different date.", "Error", JOptionPane.ERROR_MESSAGE);
                tfCustomerName.setText("");
                tfTotal.setText("");
                tfCash.setText("");
                tfChange.setText("");
                dateChooser.setDate(null);
                cbPrefGender.setSelectedIndex(-1);
                
                for (int i = 0; i < model.getRowCount(); i++) {
                model.setValueAt(false, i, 0);
            }
                return; // Exit the method if the limit is exceeded
            }
            
             String checkSpaQuery = "SELECT COUNT(*) FROM tableSpaBookings WHERE Date = ?";
            int SpabookingCount = 0;

            try (Connection con = DriverManager.getConnection(url, dbUser, dbPassword); PreparedStatement checkPst = con.prepareStatement(checkSpaQuery)) {
                checkPst.setDate(1, sqlDate); // Use the selected date for the query
                try (ResultSet rs = checkPst.executeQuery()) {
                    if (rs.next()) {
                        SpabookingCount = rs.getInt(1); // Get the count of bookings for the date
                    }
                }
            }

            // Check if the date has reached the limit
            if (SpabookingCount >= 5) {
                JOptionPane.showMessageDialog(this, "Booking limit reached for the selected date! Please choose a different date.", "Error", JOptionPane.ERROR_MESSAGE);
                tfCustomerName.setText("");
                tfTotal.setText("");
                tfCash.setText("");
                tfChange.setText("");
                dateChooser.setDate(null);
                cbPrefGender.setSelectedIndex(-1);
                
                for (int i = 0; i < model.getRowCount(); i++) {
                model.setValueAt(false, i, 0);
            }
                return; // Exit the method if the limit is exceeded
            }
            
            // Insert query for booking data (spa or salon)
            String insertQuery = null;
            String bookingTableName = "";

            // Check if spa or salon is selected
            if (isSpaSelected) {
                insertQuery = "INSERT INTO tableSpaBookings (Name, Date, totalPrice, services, `Assigned Employee`) VALUES ( ?, ?, ?, ?, ?)";
                bookingTableName = "Spa";
            } else if (isSalonSelected) {
                insertQuery = "INSERT INTO tableSalonBookings (Name, Date, totalPrice, services, `Assigned Employee`) VALUES ( ?, ?, ?, ?, ?)";
                bookingTableName = "Salon";
            }

            // If no spa or salon service selected, show an error
            if (insertQuery == null) {
                JOptionPane.showMessageDialog(this, "Please select either spa or salon services.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Execute insert for booking data
            try (Connection con = DriverManager.getConnection(url, dbUser, dbPassword); PreparedStatement pst = con.prepareStatement(insertQuery)) {
                // Set parameters for the prepared statement for booking insertion
                pst.setString(1, customer);
                pst.setDate(2, sqlDate);
                pst.setDouble(3, total);
                pst.setString(4, selectedServices.toString());
                pst.setString(5, preferredGender);
                // Preferred Gender

                // Execute the insert query for booking data
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Booking details saved successfully to " + bookingTableName + " bookings!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error saving booking details.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Display receipt
            String receiptMessage = "********** RECEIPT **********\n"
                    + "Customer: " + customer + "\n"
                    + "Date: " + selectedDate + "\n"
                    + "Preferred Gender: " + preferredGender + "\n"
                    + "Selected Services:\n"
                    + selectedServices.toString() + "\n"
                    + "Booking Fee : php 50.00\n"
                    + "Total: php " + String.format("%.2f", total) + "\n"
                    + "Cash: php " + String.format("%.2f", cash) + "\n"
                    + "Change: php " + String.format("%.2f", change) + "\n"
                    + "****************************";

            // Show the receipt message
            JOptionPane.showMessageDialog(this, receiptMessage, "Receipt", JOptionPane.INFORMATION_MESSAGE);

            // Clear the fields after processing
            tfCustomerName.setText("");
            tfTotal.setText("");
            tfCash.setText("");
            tfChange.setText("");
            dateChooser.setDate(null);
            cbPrefGender.setSelectedIndex(-1);

            // Uncheck all services in the table
            for (int i = 0; i < model.getRowCount(); i++) {
                model.setValueAt(false, i, 0);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values for total and cash.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnPayActionPerformed

    private void loadSalonServices() {
        String url = "jdbc:mysql://localhost:3306/spa_salon";
        String user = "root";
        String password = "";

        try {
            // connection to the database
            Connection con = DriverManager.getConnection(url, user, password);

            // select services from the database
            String query = "SELECT * FROM salon_services";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Select", "ID", "Name", "Description", "Available", "Price"}, 0
            ) {
                @Override
                public Class<?> getColumnClass(int columnIndex) {

                    return (columnIndex == 0) ? Boolean.class : super.getColumnClass(columnIndex);
                }
            };

            // Load data from the database
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description"); // Retrieve description
                String available = rs.getString("available"); // Retrieve availability status (Yes/No)
                double price = rs.getDouble("price");

                // Add data to the table
                model.addRow(new Object[]{false, id, name, description, available, price}); // Initial checkbox state is false
            }

            tableService.setModel(model);
            autoResizeSalonTableColumns(tableService);

            tableService.getModel().addTableModelListener(e -> {
                int row = e.getFirstRow();
                int col = e.getColumn();
                if (col == 0) {
                    boolean isSelected = (Boolean) tableService.getValueAt(row, col);
                    String availability = (String) tableService.getValueAt(row, 4);
                    double price = (Double) tableService.getValueAt(row, 5);

                    // if yung no then uncheck 
                    if ("No".equals(availability) && isSelected) {

                        tableService.setValueAt(false, row, col); // Uncheck the box
                        JOptionPane.showMessageDialog(null, "Service Not Available", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // If a service is selected, deselect all other checkboxes
                        if (isSelected) {
                            for (int i = 0; i < model.getRowCount(); i++) {
                                if (i != row) {
                                    tableService.setValueAt(false, i, 0); // Uncheck all other checkboxes
                                }
                            }

                            // Update yung tf kasi additional 50
                            tfTotal.setText(String.format("%.2f", price + 50));
                        } else {
                            tfTotal.setText("");
                        }
                    }
                }
            });

            rs.close();
            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void autoResizeSalonTableColumns(JTable tableService) {
        final int margin = 5;

        for (int column = 0; column < tableService.getColumnCount(); column++) {
            TableColumn tableColumn = tableService.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            TableCellRenderer headerRenderer = tableService.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(tableService, tableColumn.getHeaderValue(), false, false, 0, column);
            preferredWidth = Math.max(preferredWidth, headerComp.getPreferredSize().width);

            for (int row = 0; row < tableService.getRowCount(); row++) {
                TableCellRenderer cellRenderer = tableService.getCellRenderer(row, column);
                Component cellComp = cellRenderer.getTableCellRendererComponent(tableService, tableService.getValueAt(row, column), false, false, row, column);
                preferredWidth = Math.max(preferredWidth, cellComp.getPreferredSize().width + margin);

                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            tableColumn.setPreferredWidth(preferredWidth);
        }
    }

    private void loadSpaServices() {
        String url = "jdbc:mysql://localhost:3306/spa_salon";
        String user = "root";
        String password = "";

        try {

            Connection con = DriverManager.getConnection(url, user, password);

            String query = "SELECT * FROM spa_services";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Select", "ID", "Name", "Description", "Available", "Price"}, 0
            ) {
                @Override
                public Class<?> getColumnClass(int columnIndex) {

                    return (columnIndex == 0) ? Boolean.class : super.getColumnClass(columnIndex);
                }
            };

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String available = rs.getString("available");
                double price = rs.getDouble("price");

                // Add data to the table
                model.addRow(new Object[]{false, id, name, description, available, price});
            }

            tableService.setModel(model);
            autoResizeSalonTableColumns(tableService);

            tableService.getModel().addTableModelListener(e -> {
                int row = e.getFirstRow();
                int col = e.getColumn();
                if (col == 0) {
                    boolean isSelected = (Boolean) tableService.getValueAt(row, col);
                    String availability = (String) tableService.getValueAt(row, 4);
                    double price = (Double) tableService.getValueAt(row, 5);

                    if ("No".equals(availability) && isSelected) {
                        tableService.setValueAt(false, row, col); // Uncheck the box
                        JOptionPane.showMessageDialog(null, "Service Not Available", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {

                        if (isSelected) {

                            for (int i = 0; i < model.getRowCount(); i++) {
                                if (i != row) {
                                    tableService.setValueAt(false, i, 0);
                                }
                            }

                            tfTotal.setText(String.format("%.2f", price + 50));
                        } else {
                            tfTotal.setText(""); // Clear tfTotal if unselected
                        }
                    }
                }
            });

            rs.close();
            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void autoResizeSpaTableColumns(JTable tableService) {
        final int margin = 5;

        for (int column = 0; column < tableService.getColumnCount(); column++) {
            TableColumn tableColumn = tableService.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            TableCellRenderer headerRenderer = tableService.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(tableService, tableColumn.getHeaderValue(), false, false, 0, column);
            preferredWidth = Math.max(preferredWidth, headerComp.getPreferredSize().width);

            for (int row = 0; row < tableService.getRowCount(); row++) {
                TableCellRenderer cellRenderer = tableService.getCellRenderer(row, column);
                Component cellComp = cellRenderer.getTableCellRendererComponent(tableService, tableService.getValueAt(row, column), false, false, row, column);
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
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSalonServices;
    private javax.swing.JButton btnSpaServices;
    private javax.swing.JComboBox<String> cbPrefGender;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableService;
    private javax.swing.JTextField tfCash;
    private javax.swing.JTextField tfChange;
    private javax.swing.JTextField tfCustomerName;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables

}
