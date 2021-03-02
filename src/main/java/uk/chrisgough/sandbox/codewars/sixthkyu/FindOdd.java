package uk.chrisgough.sandbox.codewars.sixthkyu;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the odd int by rbuckley
 * https://www.codewars.com/kata/54da5a58ea159efa38000836
 *
 * @author Chris Gough (https://www.chrisgough.uk)
 */
public class FindOdd {

    public static int findIt(int[] a) {

        /* Set up a map of the list of integers and occurrences */
        HashMap<Integer, Integer> parsedNumbers = new HashMap<>();

        /* We have to iterate over the whole list */
        for (int currNum : a) {
            /* If we have already seen this number, get and increment */
            if (parsedNumbers.containsKey(currNum)) {
                Integer count = parsedNumbers.get(currNum);
                count = count + 1;
                parsedNumbers.put(currNum, count);
            } else {
                parsedNumbers.put(currNum, 1);
            }
        }

        int toReturn = -1;
        /* Get the odd number, and return it */
        for (Map.Entry<Integer, Integer> entry : parsedNumbers.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                toReturn = entry.getKey();
            }
        }

        return toReturn;
    }
}
