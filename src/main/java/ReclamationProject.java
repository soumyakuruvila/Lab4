// Auto-generated Javadoc
/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * The Class ReclamationProject.
 */
public class ReclamationProject {

    /**
     * Doit.
     *
     * @param a the a
     * @param b the b
     * @return the string
     */
    static String doit(final String a, final String b) {
        String r;
        String newA = "";
        String newB = "";
        if (a.length() > b.length()) {
            String c = a;
            newA = b;
            newB = c;
        } else {
            newA = a;
            newB = b;
        }
        if (newA.equals(newB)) {
            r = newA;
        } else {
            for (int i = 0; i < newA.length(); i++) {
                for (int j = newA.length() - i; j > 0; j--) {
                    for (int k = 0; k < newB.length() - j; k++) {
                        if (newA.regionMatches(i, newB, k, j) && j > r.length()) {
                            r = newA.substring(i, i + j);
                        }
                    }
               }
        }

            // Ah yeah
        }
        return r;
        }
}
