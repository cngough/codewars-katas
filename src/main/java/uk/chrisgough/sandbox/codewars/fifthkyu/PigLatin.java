package uk.chrisgough.sandbox.codewars.fifthkyu;

/**
 * Simple Pig Latin by user2505876
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f
 *
 * @author Chris Gough (https://www.chrisgough.uk)
 */
public class PigLatin {

    public static final String ALPHA_REGEX = "[A-Z-a-z]+";
    public static final String PIG_LATIN_EXTENSION = "ay";
    public static final String SPACE_REGEX = "\\s";
    public static final String SPACE_DELIMITER = " ";

    public static String pigIt(String str) {

        /* Split the String */
        String[] splitWords = str.split(SPACE_REGEX);

        /* Iterate and Pig Latinify all the input values */
        for (int i = 0; i < splitWords.length; i++) {
            if (splitWords[i].matches(ALPHA_REGEX) && splitWords[i].length() == 1) {
                /* If we have a single character - avoid OOB */
                splitWords[i] = splitWords[i] + PIG_LATIN_EXTENSION;
            } else if (splitWords[i].matches(ALPHA_REGEX)) {
                /* If we have an alphabetical String */
                splitWords[i] = splitWords[i].substring(1) + splitWords[i].charAt(0) + PIG_LATIN_EXTENSION;
            }
        }

        return String.join(SPACE_DELIMITER, splitWords);
    }
}