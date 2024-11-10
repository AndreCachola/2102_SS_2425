package front_desk.spa.and.salon;
import java.awt.event.*;
public class Menu_Spa extends javax.swing.JFrame {

    public Menu_Spa() {
        initComponents();
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                centerPanel();
            }
        });
    }
    private void centerPanel() {
        int frameWidth = getWidth();
        int frameHeight = getHeight();
        int panelWidth = SpaPanel.getPreferredSize().width;
        int panelHeight = SpaPanel.getPreferredSize().height;

        // Set the panel's position to the center of the frame
        int x = (frameWidth - panelWidth) / 2;
        int y = (frameHeight - panelHeight) / 2;

        SpaPanel.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SpaPanel = new javax.swing.JPanel();
        lblSpa = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSpa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSpa.setText("Spa Services");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SpaPanelLayout = new javax.swing.GroupLayout(SpaPanel);
        SpaPanel.setLayout(SpaPanelLayout);
        SpaPanelLayout.setHorizontalGroup(
            SpaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpaPanelLayout.createSequentialGroup()
                .addGroup(SpaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SpaPanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblSpa))
                    .addGroup(SpaPanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnBack)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        SpaPanelLayout.setVerticalGroup(
            SpaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpaPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblSpa)
                .addGap(44, 44, 44)
                .addComponent(btnBack)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       Front_Desk fd = new Front_Desk();
       fd.setVisible(true);
       fd.setLocationRelativeTo(null);
       fd.setExtendedState(MAXIMIZED_BOTH);
       this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SpaPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblSpa;
    // End of variables declaration//GEN-END:variables
}
