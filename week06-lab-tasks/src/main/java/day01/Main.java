package day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PositiveNumberContainer pnc = new PositiveNumberContainer();

        Scanner sc = new Scanner(System.in);

        double actual = sc.nextDouble();

        while (actual > 0){
            pnc.addNumber(actual);
            actual = sc.nextDouble();
        }

        System.out.println(pnc.getNumbers());
    }


}
