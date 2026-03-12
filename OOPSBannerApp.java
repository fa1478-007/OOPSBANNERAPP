/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * Uses String array and enhanced for loop.
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = {
            "  ***      ***    *****       ***** ",
            "**   **  **   **  **   **    **    ",
            "**   **  **   **  **    **  **    ",
            "**   **  **   **  **   **    **    ",
            "**   **  **   **  *****       ***** ",
            "**   **  **   **  **              **",
            "**   **  **   **  **                **",
            "**   **  **   **  **              **",
            "  ***      ***    **          *****"
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}