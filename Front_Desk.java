package front_desk.spa.and.salon;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class Front_Desk extends javax.swing.JFrame {

    public Front_Desk() {
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
        int panelWidth = Front_Desk_Panel.getPreferredSize().width;
        int panelHeight = Front_Desk_Panel.getPreferredSize().height;

        // Set the panel's position to the center of the frame
        int x = (frameWidth - panelWidth) / 2;
        int y = (frameHeight - panelHeight) / 2;

        Front_Desk_Panel.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Front_Desk_Panel = new javax.swing.JPanel();
        lbl_Welcome = new javax.swing.JLabel();
        SpaOption = new javax.swing.JRadioButton();
        SalonOption = new javax.swing.JRadioButton();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Welcome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Welcome.setText("Welcome to Spa & Salon Front Desk");

        SpaOption.setText("Spa");
        SpaOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpaOptionActionPerformed(evt);
            }
        });

        SalonOption.setText("Salon");
        SalonOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalonOptionActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Front_Desk_PanelLayout = new javax.swing.GroupLayout(Front_Desk_Panel);
        Front_Desk_Panel.setLayout(Front_Desk_PanelLayout);
        Front_Desk_PanelLayout.setHorizontalGroup(
            Front_Desk_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Front_Desk_PanelLayout.createSequentialGroup()
                .addGroup(Front_Desk_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Front_Desk_PanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbl_Welcome))
                    .addGroup(Front_Desk_PanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(SpaOption, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Front_Desk_PanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(SalonOption, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Front_Desk_PanelLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnConfirm)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        Front_Desk_PanelLayout.setVerticalGroup(
            Front_Desk_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Front_Desk_PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_Welcome)
                .addGap(18, 18, 18)
                .addComponent(SpaOption)
                .addGap(6, 6, 6)
                .addComponent(SalonOption, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnConfirm)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(Front_Desk_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(Front_Desk_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (SpaOption.isSelected()) {
            Menu_Spa Mspa = new Menu_Spa();
            Mspa.setVisible(true);
            Mspa.setLocationRelativeTo(null);
            Mspa.setExtendedState(MAXIMIZED_BOTH);
            this.dispose();
        }
        else if (SalonOption.isSelected()) {
            Menu_Salon  Msalon = new Menu_Salon();
            Msalon.setVisible(true);
            Msalon.setLocationRelativeTo(null);
            Msalon.setExtendedState(MAXIMIZED_BOTH);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select an option: Spa or Salon.", "Selection Required", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void SalonOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalonOptionActionPerformed
        if (SalonOption.isSelected()) {
            SpaOption.setSelected(false);
        }
    }//GEN-LAST:event_SalonOptionActionPerformed

    private void SpaOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpaOptionActionPerformed
        if (SpaOption.isSelected()) {
            SalonOption.setSelected(false);
        }
    }//GEN-LAST:event_SpaOptionActionPerformed

    
    public static void main(String args[]) {
        Front_Desk fd = new Front_Desk();      
        fd.setVisible(true);
        fd.setLocationRelativeTo(null);
        fd.setExtendedState(MAXIMIZED_BOTH);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Front_Desk_Panel;
    private javax.swing.JRadioButton SalonOption;
    private javax.swing.JRadioButton SpaOption;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel lbl_Welcome;
    // End of variables declaration//GEN-END:variables
}
