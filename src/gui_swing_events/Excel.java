package gui_swing_events;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excel {
    private ArrayList<Double> numbers;


    public Excel(ArrayList<Double> arrayList) {
        this.numbers = arrayList;
    }

    
    public Excel(String numbersString) {
        String[] strNumArray = numbersString.split(" ");
        List<String> strNumList = Arrays.asList(strNumArray);
        ArrayList<Double> strNumArrayList = new ArrayList<>();

        strNumList.forEach(num -> strNumArrayList.add(Double.parseDouble(num)));
        this.numbers = strNumArrayList;
    }


    public double FindTotal() {
        double total = 0;
        for (Double number : numbers) {
            total += number;
        }
        return total;
    }


    public double FindAvg() {
        return FindTotal() / numbers.size();
    }

    public double FindMax() {
        double max = Double.MIN_VALUE;
        for (Double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public double FindMin() {
        double min = Double.MAX_VALUE;
        for (Double number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}