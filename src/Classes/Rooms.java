package Classes;
import java.util.ArrayList;
import java.util.Date;

public class Rooms {
    private double valueSin,valueMulti,value;
    int roomIndex;
    String roomNumber;
    boolean used;
    Date startTime;
    ArrayList<DrinksAndFood> Cafetria=new ArrayList<>();

    public Rooms(String roomNumber,double single, double multi) {
        this.roomNumber = roomNumber;
        valueSin=single;
        valueMulti=multi;
    }
    public double getValueSin() {
        return valueSin;
    }
    public void setValueSin(double valueSin) {
        this.valueSin = valueSin;
    }
    public double getValueMulti() {
        return valueMulti;
    }
    public void setValueMulti(double valueMulti) {
        this.valueMulti = valueMulti;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    
    public int getRoomIndex() {
        return roomIndex;
    }
    public void setRoomIndex(int roomIndex) {
        this.roomIndex = roomIndex;
    }
    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public boolean isUsing() {
        return used;
    }
    public void setUsing(boolean using) {
        this.used = using;
    }
    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    
    public void getCafetria(ArrayList<DrinksAndFood> Cafetria) {
        Cafetria.addAll(this.Cafetria);
    }

    public void setCafetria(ArrayList<DrinksAndFood> Cafetria) {
        this.Cafetria.addAll(Cafetria);
    }
    public void addItems(DrinksAndFood ex){
        this.Cafetria.add(ex);
    }
    public void clear(){
        this.Cafetria.clear();
    }
    public boolean empty(){
        return this.Cafetria.isEmpty();
    }
}
