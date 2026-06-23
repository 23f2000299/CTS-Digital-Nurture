package dataStructuresAndAlgorithms.ex7Recursion;

public class Main {


    public static void main(String[] args) {


        double currentValue = 1000;

        double growthRate = 0.10;


        int years = 3;


        double result =
        FinancialForecast.calculateFutureValue(
                currentValue,
                growthRate,
                years
        );


        System.out.println("Future Value: " + result);

    }

}
