package csku.statePattern;
public class PayState implements State {
    private VendingMachine vm;

    public PayState(VendingMachine vm){
        this.vm = vm;
    }
    public void pushStartBtn() {
        System.out.println("Please, Insert Coin.");
    }
    public void chooseStation(String dest) {
        System.out.println("Please, Insert coin.");
    }
    public void insertCoin(int coin) {
        vm.setCurrentCoin(coin);
        System.out.println("Price : " + vm.getPrice());
        System.out.println("Your Current Coin : " + vm.getCurrentCoin());
        if (vm.getCurrentCoin()>vm.getPrice()){
            System.out.println("You change : "+(vm.getCurrentCoin()-vm.getPrice()));
            System.out.println("This is your ticket. Have FUN!");
            vm.setState(vm.getEnd());
        }else if (vm.getCurrentCoin()==vm.getPrice()){
            System.out.println("This is your ticket. Have FUN!");
            vm.setState(vm.getEnd());
        }else{
            System.out.println("Please, Insert more coin.");
            vm.setState(vm.getPay());
        }
    }
}