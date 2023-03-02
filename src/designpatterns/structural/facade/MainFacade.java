package designpatterns.structural.facade;

import java.util.Scanner;

public class MainFacade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("select company");
        System.out.println("1. Black berry \n 2. Nokia \n 3. Samsung  ");
        ShopKeeper shopKeeper=new ShopKeeper();
        int company= scanner.nextInt();

        switch (company)
        {
            case 1 :
                shopKeeper.saleBlackBerry();
                break;

            case 2 :
                shopKeeper.saleNokia();
                break;
            case 3 :
                shopKeeper.saleSamsung();
                break;
            default:break;
        }
    }
}
