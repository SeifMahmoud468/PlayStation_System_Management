package GUI.User;

import Classes.DrinksAndFood;
import Classes.Rooms;
import static GUI.User.UserHome.buttons;
import static GUI.User.UserHome.labels;
import static GUI.User.UserHome.rooms;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class changeRooms extends javax.swing.JFrame {

    ArrayList<Rooms> inUse = UserHome.inUse;
    ArrayList<Rooms> ArrRooms = UserHome.rooms;
    ArrayList<Rooms> displayed = new ArrayList<>();

    public changeRooms() {
        initComponents();
        displayed.clear();
        Image icon = new ImageIcon(this.getClass().getResource("/images.png")).getImage();
        this.setIconImage(icon);
        for (int i = 0; i < inUse.size(); i++) {
            Form.addItem(inUse.get(i).getRoomNumber());
            for (int j = 0; j < ArrRooms.size(); j++) {
                if (inUse.get(i).getRoomIndex() != ArrRooms.get(j).getRoomIndex()) {
                    to.addItem(ArrRooms.get(j).getRoomNumber());
                    displayed.add(ArrRooms.get(j));
                }
            }
        }

        if (inUse.size() == 1) {
            Form.setSelectedIndex(0);
            Form.setEnabled(false);
        }
    }

    void DoClick(int x) {
        switch (x) {
            case 1:
                UserHome.inUse.add(rooms.get(0));
                buttons.add(UserHome.Room1);
                labels.add(UserHome.status1);
                UserHome.Room1.setEnabled(false);
                UserHome.status1.setText("مستخدمة");
                break;
            case 2:
                UserHome.inUse.add(rooms.get(1));
                buttons.add(UserHome.Room2);
                labels.add(UserHome.status2);
                UserHome.Room2.setEnabled(false);
                UserHome.status2.setText("مستخدمة");
                break;
            case 3:
                UserHome.inUse.add(rooms.get(2));
                buttons.add(UserHome.Room3);
                labels.add(UserHome.status3);
                UserHome.Room3.setEnabled(false);
                UserHome.status3.setText("مستخدمة");
                break;
            case 4:
                UserHome.inUse.add(rooms.get(3));
                buttons.add(UserHome.Room4);
                labels.add(UserHome.status4);
                UserHome.Room4.setEnabled(false);
                UserHome.status4.setText("مستخدمة");
                break;
            case 5:
                UserHome.inUse.add(rooms.get(4));
                buttons.add(UserHome.Room5);
                labels.add(UserHome.status5);
                UserHome.Room5.setEnabled(false);
                UserHome.status5.setText("مستخدمة");
                break;
            case 6:
                UserHome.inUse.add(rooms.get(5));
                buttons.add(UserHome.Room6);
                labels.add(UserHome.status6);
                UserHome.Room6.setEnabled(false);
                UserHome.status6.setText("مستخدمة");
                break;
            case 7:
                UserHome.inUse.add(rooms.get(6));
                buttons.add(UserHome.Room7);
                labels.add(UserHome.status7);
                UserHome.Room7.setEnabled(false);
                UserHome.status7.setText("مستخدمة");
                break;
            case 8:
                UserHome.inUse.add(rooms.get(7));
                buttons.add(UserHome.Room8);
                labels.add(UserHome.status8);
                UserHome.Room8.setEnabled(false);
                UserHome.status8.setText("مستخدمة");
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Form = new javax.swing.JComboBox<>();
        to = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("نقل الغرفة ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("نقل لغرفة تانية ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("من غرفة :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("إلي غرفة :");

        Form.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Form.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                FormPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FormMouseClicked(evt);
            }
        });

        to.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        to.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                toPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        to.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toMouseClicked(evt);
            }
        });

        back.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        back.setText("رجوع");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("تم");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 89, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(to, 0, 135, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Form, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)))
                                .addGap(55, 55, 55))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Form, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.hide();
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selFrom = Form.getSelectedIndex();
        int selTo = to.getSelectedIndex();
        if (selFrom >= 0 && selTo >= 0) {
            Rooms exFrom = inUse.get(selFrom);
            inUse.remove(selFrom);
            UserHome.buttons.get(selFrom).setEnabled(true);
            UserHome.buttons.remove(selFrom);
            UserHome.labels.get(selFrom).setText("");
            UserHome.labels.remove(selFrom);
            Rooms exTo = displayed.get(selTo);
            DoClick(exTo.getRoomIndex() + 1);
            ArrayList<DrinksAndFood> caFoods = new ArrayList<>();
            exFrom.getCafetria(caFoods);
            exFrom.clear();
            exTo.setCafetria(caFoods);
            exTo.setStartTime(new Date(exFrom.getStartTime().getTime()));
            if (exFrom.getValue() == exFrom.getValueSin()) {
                exTo.setValue(exTo.getValueSin());
            } else {
                exTo.setValue(exTo.getValueMulti());
            }
            back.doClick();
        } else {
            JOptionPane.showMessageDialog(this, "برجاء اختيار الغرف", "خطاء", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FormPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_FormPopupMenuWillBecomeInvisible
        Form.setEnabled(false);
    }//GEN-LAST:event_FormPopupMenuWillBecomeInvisible

    private void toPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_toPopupMenuWillBecomeInvisible
        to.setEnabled(false);
    }//GEN-LAST:event_toPopupMenuWillBecomeInvisible

    private void FormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormMouseClicked
        if (!Form.isEnabled()) {
            int result = JOptionPane.showConfirmDialog(this, "هل انت متأكد من انك تريد تغير الغرفة؟", "تحذير", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                Form.setEnabled(true);
            }
        }
    }//GEN-LAST:event_FormMouseClicked

    private void toMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toMouseClicked
        if (!to.isEnabled()) {
            int result = JOptionPane.showConfirmDialog(this, "هل انت متأكد من انك تريد تغير الغرفة؟", "تحذير", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                to.setEnabled(true);
            }
        }
    }//GEN-LAST:event_toMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Form;
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> to;
    // End of variables declaration//GEN-END:variables
}
