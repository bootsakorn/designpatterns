package csku.statePattern;

public class EndState implements State {
    private VendingMachine vm;

    public EndState(VendingMachine vm){
        this.vm = vm;
    }
    public void pushStartBtn() {
        vm.setDestStation("");
        vm.resetCurrentCoin(0);
        vm.setState(vm.getReady());
    }
    public void chooseStation(String dest) {
        System.out.println("Please, Push Start Button");
    }
    public void insertCoin(int coin) {
        System.out.println("Please, Push Start Button");
    }
}