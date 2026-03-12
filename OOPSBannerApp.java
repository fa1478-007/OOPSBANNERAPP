/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 * @author Developer
 * @version 5.0
 */

public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Define and populate String array at declaration using String.join()
        // Each array element represents one horizontal line of the banner
        // Letters: O, O, P, S (displayed side by side)
        
        String[] lines = {

            String.join("     ",
                    "  ****  ",
                    "  ****  ",
                    "******  ",
                    " ****** "),

            String.join("     ",
                    " **  ** ",
                    " **  ** ",
                    "**   ** ",
                    "**      "),

            String.join("     ",
                    "**    **",
                    "**    **",
                    "**   ** ",
                    " ****** "),

            String.join("     ",
                    "**    **",
                    "**    **",
                    "******  ",
                    "      **"),

            String.join("     ",
                    "**    **",
                    "**    **",
                    "**      ",
                    "**    **"),

            String.join("     ",
                    " **  ** ",
                    " **  ** ",
                    "**      ",
                    " ****** ")
        };

        // Print each line using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}