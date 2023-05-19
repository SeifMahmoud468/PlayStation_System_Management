package GUI.Admins;

import Classes.DataBase;
import Classes.Rooms;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Price extends javax.swing.JFrame {

    ArrayList<Rooms> list = new ArrayList<>();
    int index = -1;
    int access;

    public Price(int x) {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/images.png")).getImage();
        this.setIconImage(icon);
        access = x;
        DataBase.readPrices(list);
        for (int i = 0; i < 8; i++) {
            jComboBox1.addItem(list.get(i).getRoomNumber());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Single = new javax.swing.JRadioButton();
        Multi = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("قائمة الاسعار");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 30)); // NOI18N
        jLabel1.setText("قائمة الاسعار");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/3339029_business tools_price_tag_fashion_price card_icon.png"))); // NOI18N

        back.setText("رجوع");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jComboBox1.setMaximumRowCount(10);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "غرقة رقم" }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        Single.setBackground(new java.awt.Color(255, 255, 255));
        Single.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Single.setText("Single");
        Single.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SingleMouseClicked(evt);
            }
        });

        Multi.setBackground(new java.awt.Color(255, 255, 255));
        Multi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Multi.setText("Multi");
        Multi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MultiMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel2.setText("سعر الساعة");

        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceKeyPressed(evt);
            }
        });

        save.setText("حفظ");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
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
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Single)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Multi))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Multi, Single});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Single)
                    .addComponent(Multi)
                    .addComponent(save)
                    .addComponent(back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Multi, Single});

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
        AdminHome window = new AdminHome(access);
        window.setVisible(true);
        this.hide();
    }//GEN-LAST:event_backActionPerformed

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        index = jComboBox1.getSelectedIndex() - 1;
        if (Single.isSelected()) {
            price.setText(Double.toString(list.get(index).getValueSin()));
        }
        if (Multi.isSelected()) {
            price.setText(Double.toString(list.get(index).getValueMulti()));
        }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void SingleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SingleMouseClicked
        if (index >= 0) {
            price.setText(Double.toString(list.get(index).getValueSin()));
        }
        Multi.setSelected(false);
    }//GEN-LAST:event_SingleMouseClicked

    private void MultiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MultiMouseClicked
        if (index >= 0) {
            price.setText(Double.toString(list.get(index).getValueMulti()));
        }
        Single.setSelected(false);
    }//GEN-LAST:event_MultiMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (index >= 0) {
            try {
                double x = Double.parseDouble(price.getText());
                if (Single.isSelected()) {
                    list.get(index).setValueSin(x);
                }
                if (Multi.isSelected()) {
                    list.get(index).setValueMulti(x);
                }
                DataBase.updatePrice(list.get(index));
                int result = JOptionPane.showConfirmDialog(this, "تم الحفظ\n هل تريد تغير غرفة اخرى ؟", "استكمال العملية", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    Single.setSelected(false);
                    Multi.setSelected(false);
                    jComboBox1.setSelectedIndex(0);
                    price.setText("");
                } else {
                    back.doClick();
                }
            } catch (HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "برجاء ادخال قيمة صحيحة", "خطاء", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "برجاء اختيار الغرفة", "خطاء", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            save.doClick();
        }
    }//GEN-LAST:event_priceKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Multi;
    private javax.swing.JRadioButton Single;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField price;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
