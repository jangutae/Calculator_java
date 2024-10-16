package Calculator.lv2rpoject;

import lv2rpoject.Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Calculator 인스턴스 생성
        Calculator.lv2rpoject.Calculator.lv2rpoject.Calculator calc = new Calculator.lv2rpoject.Calculator.lv2rpoject.Calculator();
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> setcheck = calc.getDoubleList();


        boolean flag = true;
        while (flag) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            double num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            double num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            String operation = sc.next();

            double result = calc.calculate(operation, num1, num2);
            System.out.println(" 결과 : " + result);


            System.out.println("저장 값 확인 = " + setcheck);


            System.out.println("더 계산하시겠습니까?");
            String keepGoing = sc.next();
            if (keepGoing.equals("yes")) {
                flag = true;
            } else if (keepGoing.equals("exit")) {
                flag = false;
            } else if (keepGoing.equals("remove")) {
                calc.removeAnswer();
            } 



        }
        for (int i=0; i<setcheck.size(); i++) {
            if (i == 2) {
                setcheck.set(i, setcheck.get(i)*2);
            }
        }
        System.out.println(setcheck);
    }
}
















