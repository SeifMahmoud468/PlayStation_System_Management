package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataBase {

    private static Connection c;
    private static String sql;
    private static PreparedStatement ss;
    private static ResultSet table;

    public static void connect() {
        try {
            c = DriverManager.getConnection("jdbc:sqlite:DataBase.db");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void disconnect() {
        try {
            c.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void readUser(ArrayList<Users> List, int selector) {
        connect();
        if (selector == 0) {
            sql = "Select * from Users Order by ID";
        } else if (selector == 1) {
            sql = "Select * from Admin Order by ID";
        }
        try {
            List.clear();
            ss = c.prepareStatement(sql);
            table = ss.executeQuery();
            while (table.next()) {
                String username = table.getString("Username");
                String password = table.getString("Password");
                Users newer = new Users(username, password);
                List.add(newer);
            }
            disconnect();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void insertUser(Users newer, int selector) {
        connect();
        if (selector == 0) {
            sql = "Insert into Users (Username,Password) values (?,?)";
        } else if (selector == 1) {
            sql = "Insert into Admin (Username,Password) values (?,?)";
        }
        try {
            ss = c.prepareStatement(sql);
            ss.setString(1, newer.getName());
            ss.setString(2, newer.getPassword());
            ss.execute();
            disconnect();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }

    public static void deleteUser(Users newer) {
        connect();
        sql = "delete from Users where Username = ?";
        try {
            ss = c.prepareStatement(sql);
            ss.setString(1, newer.getName());
            ss.execute();
            disconnect();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void updateUser(Users updated, Users Old) {
        connect();
        sql = "update Admin set Username=?,Password=? where Username=? and Password=?";
        try {
            ss = c.prepareStatement(sql);
            ss.setString(1, updated.getName());
            ss.setString(2, updated.getPassword());
            ss.setString(3, Old.getName());
            ss.setString(4, Old.getPassword());
            ss.execute();
            disconnect();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void createCashFlow(String Filename) {
        connect();
        sql = "CREATE TABLE " + Filename + " ("
                + "ID	INTEGER NOT NULL,"
                + "Reason	TEXT NOT NULL,"
                + "Money	REAL NOT NULL,"
                + "PRIMARY KEY(\"ID\" AUTOINCREMENT)"
                + ")";
        try {
            ss = c.prepareStatement(sql);
            ss.execute();
            disconnect();
            insertPayment(new Payments("Rooms", 0), Filename);
            insertPayment(new Payments("Cafe", 0), Filename);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void readCashFlow(ArrayList<Payments> payment, String tableName) {
        connect();
        sql = "select * from " + tableName;
        try {
            payment.clear();
            ss = c.prepareStatement(sql);
            ResultSet rs = ss.executeQuery();
            while (rs.next()) {
                String reason = rs.getString("Reason");
                double money = rs.getDouble("Money");
                Payments newer = new Payments(reason, money);
                payment.add(newer);
            }
            disconnect();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void insertPayment(Payments pay, String tableName) {
        connect();
        sql = "insert into " + tableName + " (Reason,Money) values(?,?)";
        try {
            ss = c.prepareStatement(sql);
            ss.setString(1, pay.getResone());
            ss.setDouble(2, pay.getMoney());
            ss.execute();
            disconnect();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }

    public static void updatePayment(double Money, int selector, String tableName) {
        connect();
        if (selector == 0) {
            sql = "update " + tableName + " set Money = ? where Reason = 'Rooms'";
        } else if (selector == 1) {
            sql = "update " + tableName + " set Money = ? where Reason = 'Cafe'";
        }
        try {
            ss = c.prepareStatement(sql);
            ss.setDouble(1, Money);
            ss.execute();
            disconnect();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void readPrices(ArrayList<Rooms> rooms) {
        connect();
        sql = "select * from Prices";
        try {
            rooms.clear();
            ss = c.prepareStatement(sql);
            ResultSet rs = ss.executeQuery();
            int counter = 0;
            while (rs.next()) {
                String roomNumber = rs.getString("RoomNO");
                double single = rs.getDouble("Single");
                double multi = rs.getDouble("Multi");
                Rooms newer = new Rooms(roomNumber, single, multi);
                newer.setRoomIndex(counter++);
                rooms.add(newer);
            }
            disconnect();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void updatePrice(Rooms updated) {
        connect();
        sql = "Update Prices set Single = ?,Multi = ? where RoomNO = ?";
        try {
            ss = c.prepareStatement(sql);
            ss.setDouble(1, updated.getValueSin());
            ss.setDouble(2, updated.getValueMulti());
            ss.setString(3, updated.roomNumber);
            ss.execute();
            disconnect();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void readGoods(ArrayList<DrinksAndFood> goods) {
        connect();
        sql = "select * from Cafetira Order by Name";
        try {
            goods.clear();
            ss = c.prepareStatement(sql);
            ResultSet rs = ss.executeQuery();
            while (rs.next()) {
                String name = rs.getString("Name");
                double value = rs.getDouble("Price");
                int stock = rs.getInt("Stock");
                int weekStock = rs.getInt("wStock");
                String Date = rs.getString("Date");
                DrinksAndFood.setWeekDate(Date);
                DrinksAndFood newer = new DrinksAndFood(name, value, stock, weekStock);
                goods.add(newer);
            }
            disconnect();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void insertGoods(DrinksAndFood newer){
        connect();
        sql = "insert into Cafetira(Name,Price,Stock,wStock,Date) values(?,?,?,?,?)";
        try {
            ss = c.prepareStatement(sql);
            ss.setString(1, newer.getName());
            ss.setDouble(2, newer.getValue());
            ss.setInt(3, newer.getStock());
            ss.setInt(4, newer.getWeekStock());
            ss.setString(5, DrinksAndFood.getWeekDate());
            ss.execute();
            disconnect();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public static void updateGoods(DrinksAndFood updated){
        connect();
        sql = "update Cafetira set Price=?,Stock=?,wStock=?,Date=? where Name=?";
        try {
            ss = c.prepareStatement(sql);
            ss.setDouble(1, updated.getValue());
            ss.setInt(2, updated.getStock());
            ss.setInt(3, updated.getWeekStock());
            ss.setString(4, DrinksAndFood.getWeekDate());
            ss.setString(5, updated.getName());
            ss.execute();
            disconnect();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static boolean tableExists(String tableName) {
        connect();
        try {
            sql = "select * from " + tableName;
            ss = c.prepareStatement(sql);
            ss.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            disconnect();
        }
    }
}
