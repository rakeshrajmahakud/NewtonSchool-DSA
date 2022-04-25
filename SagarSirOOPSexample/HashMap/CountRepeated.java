package Introduction.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CountRepeated {
    public static void main(String[] args) {
        int input[] = {23, 19, 23, 21, 88, 46, 19, 99, 46};
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        int numberOfDuplicates = 0;

        for(int eachInput : input) {
            int frequency;
            if(frequencyMap.containsKey(eachInput)) {
                frequency = frequencyMap.get(eachInput);
                frequency = frequency + 1;

                numberOfDuplicates = numberOfDuplicates + 1;
            }
            else {
                frequency = 1;
            }
            frequencyMap.put(eachInput, frequency);
        }

        System.out.println("Number of Duplicates: " + numberOfDuplicates);

        System.out.println("Frequency Map: " + frequencyMap);
    }
}
