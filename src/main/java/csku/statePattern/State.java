package csku.statePattern;

public interface State {
    void pushStartBtn();
    void chooseStation(String dest);
    void insertCoin(int coin);
}