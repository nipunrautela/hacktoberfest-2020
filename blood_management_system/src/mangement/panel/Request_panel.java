
package mangement.panel;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import mangement.MySqlConnect;

public class Request_panel extends javax.swing.JPanel {
    
    private Cursor cursor;

    /**
     * Creates new form request_panel
     */
    public Request_panel() {
        initComponents();
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new cambodia.raven.DateChooser();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        phone_Number = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quentity_blood = new javax.swing.JComboBox<>();
        bloodGroup = new javax.swing.JComboBox<>();
        request = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        show_date = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        date = new javax.swing.JButton();

        dateChooser1.setBackground(new java.awt.Color(204, 204, 255));

        setBackground(new java.awt.Color(51, 0, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Request Panel");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 577, 55));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 62, 370, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your Phone Number");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 140, 50));

        phone_Number.setBackground(new java.awt.Color(51, 0, 51));
        phone_Number.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        phone_Number.setForeground(new java.awt.Color(255, 255, 255));
        phone_Number.setBorder(null);
        add(phone_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 230, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 230, 10));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select your location");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 140, 50));

        name.setBackground(new java.awt.Color(51, 0, 51));
        name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(null);
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 230, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 182, 230, 10));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quentity of Blood");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 200, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Your Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, 60));

        quentity_blood.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        quentity_blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 bag", "2 bag", "3 bag", "4 bag ", "5 bag" }));
        add(quentity_blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 190, 30));

        bloodGroup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A (+)", "A (-)", "B (+)", "B (-)", "AB (+)", "AB (-)", "O (+)", "O (-)" }));
        add(bloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 190, 30));

        request.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        request.setForeground(new java.awt.Color(0, 0, 51));
        request.setText("Request ");
        request.setBorder(null);
        request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                requestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                requestMouseExited(evt);
            }
        });
        add(request, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 180, 50));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Select when you need Blood");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 200, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Select Blood group you need");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 200, 40));

        location.setBackground(new java.awt.Color(51, 0, 51));
        location.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        location.setForeground(new java.awt.Color(255, 255, 255));
        location.setBorder(null);
        add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 230, 30));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 230, 10));

        show_date.setBackground(new java.awt.Color(51, 0, 51));
        show_date.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        show_date.setForeground(new java.awt.Color(255, 255, 255));
        show_date.setBorder(null);
        add(show_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 230, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 230, 10));

        date.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 51));
        date.setText("Date");
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dateMouseExited(evt);
            }
        });
        add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void requestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseEntered
        
        request.setBackground(new Color(101, 79, 161));
        request.setForeground(new Color(255,255,255));
        request.setCursor(cursor);
        
    }//GEN-LAST:event_requestMouseEntered

    private void requestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseExited
       
        request.setBackground(new Color(240,240,240));
        request.setForeground(new Color(0,0,51));
    }//GEN-LAST:event_requestMouseExited

    private void dateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseEntered
        
        date.setBackground(Color.darkGray);
        date.setForeground(Color.WHITE);
        date.setCursor(cursor);
    }//GEN-LAST:event_dateMouseEntered

    private void dateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseExited
        date.setBackground(Color.white);
        date.setForeground(new Color(0, 0, 51));
    }//GEN-LAST:event_dateMouseExited

     private boolean validateField(){
        
        
        if (name.getText().isEmpty() || phone_Number.getText().isEmpty() || location.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Please Fill up all Requirements Correctly","Warning",JOptionPane.PLAIN_MESSAGE);
            
            return false;
        }
        
        return true;
    }
    

    private void requestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseClicked
        
        if (validateField()){
        
        try
            {
                Connection conn= MySqlConnect.ConnectDB();
                String sql="INSERT INTO blood_management_system.request_for_blood(name,phoneNumber,location,bloodGroup,amount_of_blood) value (?,?,?,?,?)";
                PreparedStatement  pst=conn.prepareStatement(sql);
                pst.setString(1,name.getText());
                pst.setString(2,phone_Number.getText());
                pst.setString(3, location.getText());
              
                String bloodgroup;
                
                bloodgroup = bloodGroup.getSelectedItem().toString();
                pst.setString(4,bloodgroup);
              
                String quentity_Blood = quentity_blood.getSelectedItem().toString();
                pst.setString(5, quentity_Blood);
                
                 
                pst.execute();
                 
                 JOptionPane.showMessageDialog(null, "You will get right donar at time","Success",JOptionPane.PLAIN_MESSAGE);
                 conn.close();
       
       }
       catch(Exception e)
       {
         
            JOptionPane.showMessageDialog(null, "Request Failed","ERROR",JOptionPane.PLAIN_MESSAGE);
           
            }
        }
    }//GEN-LAST:event_requestMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bloodGroup;
    private javax.swing.JButton date;
    private cambodia.raven.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField location;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone_Number;
    private javax.swing.JComboBox<String> quentity_blood;
    private javax.swing.JButton request;
    private javax.swing.JTextField show_date;
    // End of variables declaration//GEN-END:variables
}
