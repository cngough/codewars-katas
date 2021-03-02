package uk.chrisgough.sandbox.codewars.sixthkyu;

/**
 * Build a pile of Cubes by g964
 * https://www.codewars.com/kata/5592e3bd57b64d00f3000047
 *
 * @author Chris Gough (https://www.chrisgough.uk)
 */
public class ASum {

    public static long findNb(long m) {

        /* The total volume calculated so far */
        long volume = 0;
        /* For each cube we're adding work out the volume */
        for (long i = 0; i < m; i++) {
            volume += (long) Math.pow(i, 3);
            /* If it matches, return - otherwise keep going. If the volume goes over the input - break */
            if (volume == m) {
                return i;
            } else if (volume > m) {
                break;
            }
        }

        return -1;
    }

}
