package Calculator.lv2rpoject;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Double> doubleList = new ArrayList<Double>();


    public double calculate(String operation, double num1, double num2) {
        double answer = 0;

        switch (operation) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("0으로 나눌수 없다.");
                }
                answer = num1 / num2;
            default:
                System.out.println("존재하지 않는 연산자 입니다.");
                break;

        }
        doubleList.add(answer);
        return answer;
    }
    public ArrayList<Double> getDoubleList() {
        return doubleList;
    }

    public void setDoubleList(ArrayList<Double> doubleList) {
        this.doubleList = doubleList;
    }

    public void removeAnswer() {
        doubleList.remove(0);

    }

}



