package csku.statePattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        VendingMachine vm = new VendingMachine("Mo Chit");

        System.out.println(vm.getState());
        vm.chooseStation("Siam");
        vm.insertCoin(10);
        vm.insertCoin(10);
        vm.insertCoin(10);
        vm.insertCoin(10);
        vm.insertCoin(5);

        System.out.println("-----------------------");
        vm.pushStartBtn();
        vm.chooseStation("Ari");
        vm.insertCoin(5);
        vm.insertCoin(10);
        vm.insertCoin(10);
        System.out.println("-----------------------");

    }
}