package GUI.User;

import Classes.DataBase;
import Classes.DrinksAndFood;
import Classes.Payments;
import Classes.Rooms;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class inRoom extends javax.swing.JFrame {

    ArrayList<DrinksAndFood> list = UserHome.goodList;
    ArrayList<Rooms> inUse = UserHome.inUse;
    ArrayList<Double> taken = new ArrayList<>();
    ArrayList<DrinksAndFood> tooklist = new ArrayList<>();
    ArrayList<Integer> updated = new ArrayList<>();
    DefaultTableModel model;
    DecimalFormat format = new DecimalFormat("0.00");
    int selectedRoom = -1;
    int inputQuantity, stock;
    
    public inRoom() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/images.png")).getImage();
        this.setIconImage(icon);
        this.model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < list.size(); i++) {
            goods.addItem(list.get(i).getName());
        }
        if (!list.isEmpty() && goods.getItemCount() > 0) {
            goods.setSelectedIndex(0);
        }
        for (int i = 0; i < inUse.size(); i++) {
            rooms.addItem(inUse.get(i).getRoomNumber());
        }
        if (!inUse.isEmpty()) {
            rooms.setSelectedIndex(0);
        }
        if (inUse.size() == 1) {
            selectedRoom = 0;
            rooms.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        goods = new javax.swing.JComboBox<>();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pay = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rooms = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("إضافة إلي الفرف");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setText("إضافة للغرفة");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setLabelFor(goods);
        jLabel3.setText("الاصناف");

        goods.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Add.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Add.setText("إضاف");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Delete.setText("حذف");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اسعر", "الكمية", "المنتج"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        pay.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        pay.setText("تم");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        back.setText("رجوع");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("الكمية");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.setText("1");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/889372_barista_coffee_espresso machine_portafilter_tamper_icon.png"))); // NOI18N

        rooms.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rooms.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                roomsPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        rooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomsMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("الغرفة رقم :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pay)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Add)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(goods, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {back, pay});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(goods, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Delete)
                    .addComponent(Add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pay)
                    .addComponent(back))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {back, pay});

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

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        try {
            inputQuantity = Integer.parseInt(jTextField1.getText());
            stock = list.get(goods.getSelectedIndex()).getStock();
            if (stock - inputQuantity >= 0) {
                list.get(goods.getSelectedIndex()).setStock(stock - inputQuantity);
                double moneys = inputQuantity * list.get(goods.getSelectedIndex()).getValue();
                taken.add(moneys);
                String name = list.get(goods.getSelectedIndex()).getName();
                DrinksAndFood drink = new DrinksAndFood(name, moneys, inputQuantity);
                tooklist.add(drink);
                updated.add(goods.getSelectedIndex());
                Object[] row = new Object[]{format.format(moneys), jTextField1.getText(), name};
                model.insertRow(model.getRowCount(), row);
            } else {
                JOptionPane.showMessageDialog(this, "عفوا الكمية المتاحة هي " + Integer.toString(stock), "خطاء", JOptionPane.ERROR_MESSAGE);
                jTextField1.setText("");
                jTextField1.grabFocus();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "برجاء ادخال كمية صحيحة", "خطاء", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int selected = jTable1.getSelectedRow();
        if (selected >= 0) {
            String name = tooklist.get(selected).getName();
            for (int i = 0; i < list.size(); i++) {
                if (name.equals(list.get(i).getName())) {
                    list.get(i).setStock(list.get(i).getStock() + tooklist.get(selected).getStock());
                    break;
                }
            }
            tooklist.remove(selected);
            taken.remove(selected);
            model.removeRow(selected);
            updated.remove(selected);
            jTextField1.grabFocus();
        } else {
            JOptionPane.showMessageDialog(this, "برجاء اختيار صنف من الجدول", "خطاء", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        if (selectedRoom >= 0) {
            if (!taken.isEmpty()) {
                double falos = 0.00;
                for (int i = 0; i < taken.size(); i++) {
                    falos = falos + taken.get(i);
                }
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
                String tableName = "Day_" + dateFormat.format(new Date(System.currentTimeMillis()));
                Payments cafe = UserHome.cashflows.get(1);
                DataBase.updatePayment(falos + cafe.getMoney(), 1, tableName);
                for (int i = 0; i < updated.size(); i++) {
                    DataBase.updateGoods(list.get(updated.get(i)));
                }
                inUse.get(selectedRoom).setCafetria(tooklist);
                taken.clear();
                tooklist.clear();
                JOptionPane.showMessageDialog(this, "تم الإضافة للغرفة رقم " + inUse.get(selectedRoom).getRoomNumber());
                this.hide();
            } else {
                JOptionPane.showMessageDialog(this, "لم يتم إضافت اي منتاجات", "خطاء", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "لم يتم اختيار غرفة", "خطاء", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_payActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (taken.isEmpty()) {
            this.hide();
        } else {
            JOptionPane.showMessageDialog(this, "برجاء افراغ الجدول للخروج", "خطاء", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_backActionPerformed

    private void roomsPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_roomsPopupMenuWillBecomeInvisible
        selectedRoom = rooms.getSelectedIndex();
        rooms.setEnabled(false);
    }//GEN-LAST:event_roomsPopupMenuWillBecomeInvisible

    private void roomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseClicked
        if (!rooms.isEnabled()) {
            int result = JOptionPane.showConfirmDialog(this, "هل انت متأكد من انك تريد تغير الغرفة؟", "تحذير", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                rooms.setEnabled(true);
            }
        }
    }//GEN-LAST:event_roomsMouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            Add.doClick();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> goods;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton pay;
    private javax.swing.JComboBox<String> rooms;
    // End of variables declaration//GEN-END:variables
}
