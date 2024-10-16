package Calculator.lv1project;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 양의 정수(0 포함)를 입려받기

        boolean flag = true;
        while (flag) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int number1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int number2 = sc.nextInt();
            double result = 0;
            // 사직연산 기호 ('-' , '+', '*', '/')

            System.out.print("사칙연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0);

            // 양의 정수 2개와 사칙연산 기호를 사용하여 연산 진행 후 결과값 츨력
            switch (operator) {
                case '+':
                    double result1 = number1 + number2;
                    System.out.println("결과: " + result1);
                    break;
                case '-':
                    double result2 = number1 - number2;
                    System.out.println("결과: " + result2);
                    break;
                case '*':
                    double result3 = number1 * number2;
                    System.out.println("결과: " + result3);
                    break;
                case '/':
                    if (number2 == 0) {
                        System.out.println("0으로 나눌수 없다.");
                    }
                    double result4 = number1 / number2;
                    System.out.println("결과: " + result4);
                    break;
                default:
                    System.out.println("존재하지 않는 연산자 입니다.");
                    break;
            }

            System.out.println("더 계산하시겠습니까?");
            String keepGoing = sc.next();
            if (keepGoing.equals("yes")) {
                flag = true;
            } else if (keepGoing.equals("exit")) {
                flag = false;
            }

        }


    }
}






