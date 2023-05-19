package Classes;
// masaryf al youmaya al atsarft al nahrda
public class Payments {

    private String resone; // al sabab aw al asm al tal3lo al falos
    private double money;  // al falos alm tal3t


    public String getResone() {
        return resone;
    }

    public void setResone(String resone) {
        this.resone = resone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Payments(String resone, double money) {
        this.resone = resone;
        this.money = money;
    }
    
    @Override
    public String toString() {
        String line = resone+","+Double.toString(money)+"\n";
        return line;
    }
    
}
