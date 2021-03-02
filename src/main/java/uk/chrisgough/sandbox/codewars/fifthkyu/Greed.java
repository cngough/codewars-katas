package uk.chrisgough.sandbox.codewars.fifthkyu;

import java.util.HashMap;

/**
 * Greed is Good by JulianNicholls
 * https://www.codewars.com/kata/5270d0d18625160ada0000e4
 *
 * @author Chris Gough (https://www.chrisgough.uk)
 */
public class Greed {

    public static int greedy(int[] dice) {

        /* The calculated score */
        int score = 0;

        HashMap<Integer, Integer> valueCount = new HashMap<>();
        for (int i : dice) {
            if (valueCount.get(i) != null) {
                /* We can only have one set of 3s, calculate it here */
                if (valueCount.get(i) == 2) {
                    /* 1s score 1000 instead of 100 x dice value */
                    if (i == 1) {
                        score += 1000;
                    } else {
                        score += i * 100;
                    }
                    /* We've calculated the 3, remove count */
                    valueCount.remove(i);
                    continue;
                }
                valueCount.put(i, valueCount.get(i) + 1);
            } else {
                valueCount.put(i, 1);
            }
        }

        /* Calculate the leftover singles */
        if (valueCount.get(1) != null) {
            score += valueCount.get(1) * 100;
        }
        if (valueCount.get(5) != null) {
            score += valueCount.get(5) * 50;
        }

        return score;
    }

}
