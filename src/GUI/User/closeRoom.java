package GUI.User;

import Classes.DataBase;
import Classes.DrinksAndFood;
import Classes.Payments;
import Classes.Printer;
import Classes.Rooms;
import java.awt.Image;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class closeRoom extends javax.swing.JFrame {

    ArrayList<Rooms> inUse = UserHome.inUse;
    double totalMoney = 0;
    String today;
    int selectedRoom = -1;
    ArrayList<DrinksAndFood> cafeteria = new ArrayList<>();
    DrinksAndFood  play;
    DefaultTableModel model;
    double cashes = 0, hour;
    long time;
    SimpleDateFormat timeFormate = new SimpleDateFormat("hh:mm aa");
    DecimalFormat dec = new DecimalFormat("0.00");

    private void printing() {
        Printer printer = new Printer(cafeteria, cashes+totalMoney);
        printer.print();
    }

    private void view(int RoomNumber) {
        Rooms ex = inUse.get(RoomNumber);
        time = System.currentTimeMillis() - ex.getStartTime().getTime();
        hour = Math.abs(time * 1.0 / (1000 * 60 * 60));
        String different = timeDisplay(hour * 60);
        cashes = 0;
        if (hour > 0.08333333333) {
            String value = dec.format(hour * ex.getValue());
            cashes = Double.parseDouble(value);
        }
        Object[] row = new Object[]{dec.format(cashes), different, dec.format(ex.getValue()), "جهاز البلايستيشن"};
        play = new DrinksAndFood("جهاز البلايستيشن", cashes, (int) ex.getValue());
        model.insertRow(model.getRowCount(), row);
        ex.getCafetria(cafeteria);
        totalMoney = 0;
        if (!cafeteria.isEmpty()) {
            for (int i = 0; i < cafeteria.size(); i++) {
                DrinksAndFood drink = cafeteria.get(i);
                Object[] rows = new Object[]{dec.format(drink.getValue()),
                    dec.format(drink.getStock()), dec.format(drink.getValue() / drink.getStock()), drink.getName()};
                totalMoney = totalMoney + drink.getValue();
                model.insertRow(model.getRowCount(), rows);
            }
        }
        Total.setText(dec.format(cashes + totalMoney) + " " + "جنية");
    }

    private String timeDisplay(double time) {
        int mins = (int) (time % 60);
        int hours = (int) ((time - mins) / 60);
        String timeTaken;
        if (mins < 10) {
            timeTaken = Integer.toString(hours) + ":0" + Integer.toString(mins);
        } else {
            timeTaken = Integer.toString(hours) + ":" + Integer.toString(mins);
        }
        return timeTaken;
    }

    public closeRoom(String today) {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/images.png")).getImage();
        this.setIconImage(icon);
        model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < inUse.size(); i++) {
            rooms.addItem(inUse.get(i).getRoomNumber());
        }
        if (!inUse.isEmpty()) {
            rooms.setSelectedIndex(0);
        }
        if (inUse.size() == 1) {
            selectedRoom=0;
            rooms.setEnabled(false);
            view(0);
        }
        this.today=today;
    }

    private void remove() {
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        cafeteria.clear();
        cashes = 0;
        Total.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rooms = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("اغلاق حساب");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("اغلاق حساب");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("غرفة رقم :");

        rooms.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rooms.setMaximumRowCount(10);
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

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الثمن", "الكمية", "سعر", "المنتج"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("الاجمالي");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/6330635_advertisement_advertising_announcement_billboard_closed_icon.png"))); // NOI18N

        Total.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Total.setLabelFor(jLabel3);

        close.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        close.setText("اغلاق");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        back.setText("رجوع");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {back, close});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(back))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {back, close});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        if (selectedRoom >= 0) {
            double roomsMoneny = UserHome.cashflows.get(0).getMoney();
            DataBase.updatePayment(cashes+roomsMoneny, 0,today);
            UserHome.buttons.get(selectedRoom).setEnabled(true);
            UserHome.buttons.remove(selectedRoom);
            UserHome.labels.get(selectedRoom).setText("");
            UserHome.labels.remove(selectedRoom);
            UserHome.inUse.get(selectedRoom).clear();
            UserHome.inUse.remove(selectedRoom);
            String lines = "المبلغ الكلي للطلابات " + Total.getText();
            lines = lines + "\n" + "هل تريد طباعة الحساب ؟";
            int result = JOptionPane.showConfirmDialog(this, lines, "طباعة", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                cafeteria.add(play);
                printing();
            }
            this.hide();
        } else
            JOptionPane.showMessageDialog(this, "برجاء اختيار غرفة", "خطاء", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_closeActionPerformed
    private void roomsPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_roomsPopupMenuWillBecomeInvisible
        selectedRoom = rooms.getSelectedIndex();
        if (selectedRoom >= 0) {
            view(selectedRoom);
            rooms.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "برجاء اختيار غرفة", "خطاء", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_roomsPopupMenuWillBecomeInvisible
    private void roomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseClicked
        if (!rooms.isEnabled()) {
            int result = JOptionPane.showConfirmDialog(this, "هل انت متأكد من انك تريد تغير الغرفة؟", "تحذير", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                rooms.setEnabled(true);
                remove();
            }
        }
    }//GEN-LAST:event_roomsMouseClicked
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.hide();
    }//GEN-LAST:event_backActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Total;
    private javax.swing.JButton back;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> rooms;
    // End of variables declaration//GEN-END:variables
}
