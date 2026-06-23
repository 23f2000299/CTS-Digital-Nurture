package dataStructuresAndAlgorithms.ex7Recursion;

public class FinancialForecast {


    public static double calculateFutureValue(
            double currentValue,
            double growthRate,
            int years) {


        // Base condition
        if(years == 0) {

            return currentValue;

        }


        // Recursive call
        return calculateFutureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1
        );

    }


}
