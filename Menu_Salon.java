package front_desk.spa.and.salon;
import java.awt.event.*;
public class Menu_Salon extends javax.swing.JFrame {

    public Menu_Salon() {
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
        int panelWidth = SalonPanel.getPreferredSize().width;
        int panelHeight = SalonPanel.getPreferredSize().height;

        // Set the panel's position to the center of the frame
        int x = (frameWidth - panelWidth) / 2;
        int y = (frameHeight - panelHeight) / 2;

        SalonPanel.setLocation(x, y);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SalonPanel = new javax.swing.JPanel();
        lblSalon = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSalon.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSalon.setText("Salon Services");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SalonPanelLayout = new javax.swing.GroupLayout(SalonPanel);
        SalonPanel.setLayout(SalonPanelLayout);
        SalonPanelLayout.setHorizontalGroup(
            SalonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalonPanelLayout.createSequentialGroup()
                .addGroup(SalonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SalonPanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblSalon))
                    .addGroup(SalonPanelLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnBack)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        SalonPanelLayout.setVerticalGroup(
            SalonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalonPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblSalon)
                .addGap(46, 46, 46)
                .addComponent(btnBack)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SalonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SalonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JPanel SalonPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblSalon;
    // End of variables declaration//GEN-END:variables
}
