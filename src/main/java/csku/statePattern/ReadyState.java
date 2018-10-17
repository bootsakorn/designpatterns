package csku.statePattern;
public class ReadyState implements State {
    private VendingMachine vm;

    public ReadyState(VendingMachine vm){
        this.vm = vm;
    }
    public void pushStartBtn() {
        System.out.println("Please, Select your Destination.");
    }
    public void chooseStation(String dest) {
        System.out.println("~Welcome~");
        System.out.println("Now you at "+ vm.getCurrentStation());
        System.out.println("Your destination: " + dest);
        vm.setState(vm.getPay());
    }
    public void insertCoin(int coin) {
        System.out.println("Please, Select your Destination.");
    }
}