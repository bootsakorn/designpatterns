package csku.statePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachine {
    private State ready;
    private State pay;
    private State end;

    public State getState() {
        return state;
    }

    private State state;

    private List<String> station = new ArrayList<String>(Arrays.asList(
            "Mo Chit","Saphan Khwai","Ari","Sanam Pao","Victory Monument","Phaya Thai","Ratchathewi"
            ,"Siam","Chit Lom","Phloen Chit","Nana","Khlong Toei","Asok","Phrom Phong","Thong Lo","Ekkamai"
            ,"Phra Khanong","On Nut","Bang Chak","Punnawithi","Udom Suk","Bang Na","Bearing","Samrong"));

    private String currentStation;
    private String destStation;
    private double currentCoin;

    public VendingMachine(String currentStation){
        ready = new ReadyState(this);
        pay = new PayState(this);
        end = new EndState(this);
        this.currentStation = currentStation;
        this.currentCoin = 0;
        this.state = ready;
    }

    public void pushStartBtn() {
        state.pushStartBtn();
    }
    public void chooseStation(String dest) {
        setDestStation(dest);
        state.chooseStation(destStation);
    }
    public void insertCoin(int coin) {
        state.insertCoin(coin);
    }

    public void setState(State state) {
        this.state = state;
    }
    public String getCurrentStation() {
        return currentStation;
    }
    public State getReady() {
        return ready;
    }
    public State getPay() {
        return pay;
    }
    public State getEnd() {
        return end;
    }
    public void setDestStation(String destStation) {
        this.destStation = destStation;
    }
    public double getPrice() {
        int startIndex = station.indexOf(currentStation);
        int destIndex = station.indexOf(destStation);
        double price = 16;
        if (Math.abs(startIndex-destIndex) == 1){return price;}
        else {
            for (int i = 0; i < Math.abs(startIndex-destIndex); i++) {
                if (i==2){price+=7;}
                else if (i==7||i==8||i==9||i==10||i==11||i==12||i==13||i==14||i==15||i==16){price=44;break;}
                else if (i==17||i==18||i==19||i==20||i==21){price=59;break;}
                else if (i%2 != 0){price+=3;}
                else if (i%2 == 0){price+=4;}
            }
            return price;
        }
    }
    public double getCurrentCoin() {
        return currentCoin;
    }
    public void setCurrentCoin(double currentCoin) {
        this.currentCoin += currentCoin;
    }
    public void resetCurrentCoin(double reset){
        this.currentCoin = reset;
    }
}