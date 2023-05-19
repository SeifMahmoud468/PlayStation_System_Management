package GUI.User;

import Classes.DataBase;
import Classes.DrinksAndFood;
import Classes.Payments;
import Classes.Rooms;
import Classes.Users;
import GUI.AdminLogin;
import GUI.Interface;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UserHome extends javax.swing.JFrame {

    static ArrayList<Rooms> inUse = new ArrayList<>();
    static ArrayList<DrinksAndFood> goodList = new ArrayList<>();
    static ArrayList<javax.swing.JButton> buttons = new ArrayList<>();
    static ArrayList<javax.swing.JLabel> labels = new ArrayList<>();
    static ArrayList<Payments> cashflows = new ArrayList<>();
    static ArrayList<Rooms> rooms = new ArrayList<>();
    static UserHome Single = new UserHome();
    SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd_MM_yyyy");
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat timeDateFormat = new SimpleDateFormat("hh:mm aa");
    String today;

    public static UserHome getSingle() {
        return Single;
    }

    public static ArrayList<Rooms> getInUse() {
        return inUse;
    }

    private UserHome() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/images.png")).getImage();
        this.setIconImage(icon);
        DataBase.readGoods(goodList);
        DataBase.readPrices(rooms);
        Date todayDate = new Date(System.currentTimeMillis());
        today = "Day_" + dateFormat1.format(todayDate);
        if (DataBase.tableExists(today)) {
            DataBase.readCashFlow(cashflows, today);
        } else {
            DataBase.createCashFlow(today);
        }
        try {
            Date week = dateFormat.parse(DrinksAndFood.getWeekDate());
            if (week.getDay() + 7 <= todayDate.getDay()) {
                rewrite();
            }
        } catch (ParseException ex) {
            System.err.println("Error In Parsing " + ex.getMessage());
        }

    }

    private void rewrite() {
        DrinksAndFood.setWeekDate(dateFormat.format(new Date(System.currentTimeMillis())));
        for (int i = 0; i < goodList.size(); i++) {
            DrinksAndFood ex = goodList.get(i);
            ex.setWeekStock(ex.getStock());
            DataBase.updateGoods(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Room1 = new javax.swing.JButton();
        status1 = new javax.swing.JLabel();
        Room2 = new javax.swing.JButton();
        status2 = new javax.swing.JLabel();
        Room3 = new javax.swing.JButton();
        status3 = new javax.swing.JLabel();
        Room4 = new javax.swing.JButton();
        status4 = new javax.swing.JLabel();
        Room5 = new javax.swing.JButton();
        status5 = new javax.swing.JLabel();
        Room6 = new javax.swing.JButton();
        status6 = new javax.swing.JLabel();
        Room7 = new javax.swing.JButton();
        status7 = new javax.swing.JLabel();
        Room8 = new javax.swing.JButton();
        status8 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        usingList = new javax.swing.JButton();
        cafe = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("قائمة المستخدم");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Room1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Room1.setText("Room 1");
        Room1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room1ActionPerformed(evt);
            }
        });

        status1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Room2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Room2.setText("Room 2");
        Room2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room2ActionPerformed(evt);
            }
        });

        status2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Room3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Room3.setText("Room 3");
        Room3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room3ActionPerformed(evt);
            }
        });

        status3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Room4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Room4.setText("Room 4");
        Room4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room4ActionPerformed(evt);
            }
        });

        status4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Room5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Room5.setText("Room 5");
        Room5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room5ActionPerformed(evt);
            }
        });

        status5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Room6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Room6.setText("Room 6");
        Room6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room6ActionPerformed(evt);
            }
        });

        status6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Room7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Room7.setText("Room 7");
        Room7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room7ActionPerformed(evt);
            }
        });

        status7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Room8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Room8.setText("Room 8");
        Room8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room8ActionPerformed(evt);
            }
        });

        status8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        close.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        close.setText("اغلاق حساب");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        usingList.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        usingList.setText("قائمة  الغرف");
        usingList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usingListActionPerformed(evt);
            }
        });

        cafe.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        cafe.setText("كافيتريا و مأكولات");
        cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafeActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        logout.setText("خروج");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButton2.setText("مدير");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 42)); // NOI18N
        jLabel3.setText("قائمة المستخدم");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Eng: Seif Eldin Mahmoud");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButton1.setText("الخارج");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButton3.setText("تبديل و نقل");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Kick off png logo (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(status1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Room1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(status2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(status3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Room2)
                            .addComponent(Room3)
                            .addComponent(Room4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(status4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(status5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Room7)
                                    .addComponent(Room8)
                                    .addComponent(Room6)
                                    .addComponent(Room5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(status6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(status7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(status8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(usingList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(close))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(91, 91, 91)))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addContainerGap())))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cafe, close, jButton1, jButton2, jButton3, logout, usingList});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Room1, Room2, Room3, Room4, Room5, Room6, Room7, Room8});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Room1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Room5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Room2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Room3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Room4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Room6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Room7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Room8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status8)))
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cafe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(usingList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {status1, status2, status3, status4, status5, status6, status7, status8});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cafe, close, jButton1, jButton2, jButton3, usingList});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Room1, Room2, Room3, Room4, Room5, Room6, Room7, Room8});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void Room1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room1ActionPerformed
        startTime window = new startTime(rooms.get(0));
        rooms.get(0).clear();
        if (rooms.get(0).empty()) {
            inUse.add(rooms.get(0));
            buttons.add(Room1);
            labels.add(status1);
            Room1.setEnabled(false);
            status1.setText("مستخدمة");
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "خطاء", "خطاء اثناء فتح الغرفة", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Room1ActionPerformed

    private void Room2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room2ActionPerformed
        startTime window = new startTime(rooms.get(1));
        rooms.get(1).clear();
        if (rooms.get(1).empty()) {
            inUse.add(rooms.get(1));
            buttons.add(Room2);
            labels.add(status2);
            Room2.setEnabled(false);
            status2.setText("مستخدمة");
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "خطاء", "خطاء اثناء فتح الغرفة", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Room2ActionPerformed

    private void Room3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room3ActionPerformed
        startTime window = new startTime(rooms.get(2));
        rooms.get(2).clear();
        if (rooms.get(2).empty()) {
            inUse.add(rooms.get(2));
            buttons.add(Room3);
            labels.add(status3);
            Room3.setEnabled(false);
            status3.setText("مستخدمة");
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "خطاء", "خطاء اثناء فتح الغرفة", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Room3ActionPerformed

    private void Room4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room4ActionPerformed
        startTime window = new startTime(rooms.get(3));
        rooms.get(3).clear();
        if (rooms.get(3).empty()) {
            inUse.add(rooms.get(3));
            buttons.add(Room4);
            labels.add(status4);
            Room4.setEnabled(false);
            status4.setText("مستخدمة");
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "خطاء", "خطاء اثناء فتح الغرفة", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Room4ActionPerformed

    private void Room5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room5ActionPerformed
        startTime window = new startTime(rooms.get(4));
        rooms.get(4).clear();
        if (rooms.get(4).empty()) {
            inUse.add(rooms.get(4));
            buttons.add(Room5);
            labels.add(status5);
            Room5.setEnabled(false);
            status5.setText("مستخدمة");
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "خطاء", "خطاء اثناء فتح الغرفة", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Room5ActionPerformed

    private void Room6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room6ActionPerformed
        startTime window = new startTime(rooms.get(5));
        rooms.get(5).clear();
        if (rooms.get(5).empty()) {
            inUse.add(rooms.get(5));
            buttons.add(Room6);
            labels.add(status6);
            Room6.setEnabled(false);
            status6.setText("مستخدمة");
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "خطاء", "خطاء اثناء فتح الغرفة", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Room6ActionPerformed

    private void Room7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room7ActionPerformed
        startTime window = new startTime(rooms.get(6));
        rooms.get(6).clear();
        if (rooms.get(6).empty()) {
            inUse.add(rooms.get(6));
            buttons.add(Room7);
            labels.add(status7);
            Room7.setEnabled(false);
            status7.setText("مستخدمة");
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "خطاء", "خطاء اثناء فتح الغرفة", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Room7ActionPerformed

    private void Room8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room8ActionPerformed
        startTime window = new startTime(rooms.get(7));
        rooms.get(7).clear();
        if (rooms.get(7).empty()) {
            inUse.add(rooms.get(7));
            buttons.add(Room8);
            labels.add(status8);
            Room8.setEnabled(false);
            status8.setText("مستخدمة");
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "خطاء", "خطاء اثناء فتح الغرفة", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Room8ActionPerformed

    private void cafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafeActionPerformed
        DataBase.readCashFlow(cashflows, today);
        DataBase.readGoods(goodList);
        DataBase.readPrices(rooms);
        cafeteria window = new cafeteria();
        window.setVisible(true);
    }//GEN-LAST:event_cafeActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        if (inUse.isEmpty()) {
            Interface window = new Interface();
            window.setVisible(true);
            this.hide();
        } else {
            JOptionPane.showMessageDialog(this, "برجاء غلاق جميع الغرف اولا", "خطاء", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void usingListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usingListActionPerformed
        if (!inUse.isEmpty()) {
            DataBase.readCashFlow(cashflows, today);
            workingRooms window = new workingRooms();
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "برجاء تشغيل الغرفة اولا", "خطاء", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_usingListActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        if (!inUse.isEmpty()) {
            DataBase.readCashFlow(cashflows, today);
            DataBase.readGoods(goodList);
            DataBase.readPrices(rooms);
            closeRoom window = new closeRoom(today);
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "برجاء تشغيل الغرفة اولا", "خطاء", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_closeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<Users> Admins = new ArrayList<>();
        DataBase.readUser(Admins, 1);
        AdminLogin window = new AdminLogin(2,Admins);
        window.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Paying window = new Paying();
        window.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!inUse.isEmpty()) {
            DataBase.readCashFlow(cashflows, today);
            DataBase.readGoods(goodList);
            DataBase.readPrices(rooms);
            Switching window = new Switching();
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "برجاء تشغيل الغرفة اولا", "خطاء", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Room1;
    public static javax.swing.JButton Room2;
    public static javax.swing.JButton Room3;
    public static javax.swing.JButton Room4;
    public static javax.swing.JButton Room5;
    public static javax.swing.JButton Room6;
    public static javax.swing.JButton Room7;
    public static javax.swing.JButton Room8;
    private javax.swing.JButton cafe;
    private javax.swing.JButton close;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    public static javax.swing.JLabel status1;
    public static javax.swing.JLabel status2;
    public static javax.swing.JLabel status3;
    public static javax.swing.JLabel status4;
    public static javax.swing.JLabel status5;
    public static javax.swing.JLabel status6;
    public static javax.swing.JLabel status7;
    public static javax.swing.JLabel status8;
    private javax.swing.JButton usingList;
    // End of variables declaration//GEN-END:variables
}
