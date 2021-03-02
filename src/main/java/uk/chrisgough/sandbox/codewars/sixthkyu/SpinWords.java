package uk.chrisgough.sandbox.codewars.sixthkyu;

/**
 * Stop gninnipS My sdroW! by xDranik
 * https://www.codewars.com/kata/5264d2b162488dc400000001
 *
 * @author Chris Gough (https://www.chrisgough.uk)
 */
public class SpinWords {

    public static String spinWords(String sentence) {

        /* Split the String */
        String[] splitSentence = sentence.split("\\s");

        /* Iterate over it */
        for (int i = 0; i < splitSentence.length; i++) {
            String s = splitSentence[i];

            /* For strings with 5 or more characters, reverse it */
            if (s.length() >= 5) {
                StringBuffer sb = new StringBuffer(s);
                sb.reverse();
                splitSentence[i] = sb.toString();
            } else {
                continue;
            }
        }

        /* Build it again */
        return String.join(" ", splitSentence);
    }
}