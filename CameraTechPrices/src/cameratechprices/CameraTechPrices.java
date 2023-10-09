/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cameratechprices;

/**
 *
 * @author applemac
 */
public class CameraTechPrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // List the mirrorless and DSLR camera manufacturers and their costs
        String[] manufacturers = {"CANON", "SONY", "NIKON"};
        int[][] prices = {
            {10500, 8500},
            {9500, 7200},
            {12000, 8000}
        };

        // Calculate and display the price difference for each manufacturer
        int maxDifference = 0;
        String manufacturerWithMaxDifference = "";

        // Display header for the camera technology report
        System.out.println("————————————————————————————————————————————");
        System.out.println("            CAMERA TECH REPORT");
        System.out.println("————————————————————————————————————————————");
        System.out.println("\t\t MIRRORLESS \t DSLR");

        for (int i = 0; i < manufacturers.length; i++) {
            String manufacturer = manufacturers[i];
            int mirrorlessPrice = prices[i][0];
            int dslrPrice = prices[i][1];
            int priceDifference = mirrorlessPrice - dslrPrice;

            // Display prices with formatting
            System.out.println(manufacturer + "\t R " + String.format("%.2f", (double)mirrorlessPrice) +
                               "\t\t R " + String.format("%.2f", (double)dslrPrice));

            // Update the manufacturer with the greatest cost difference
            if (priceDifference > maxDifference) {
                maxDifference = priceDifference;
                manufacturerWithMaxDifference = manufacturer;
            }
        }

           // Display the camera technology results header
           System.out.println("————————————————————————————————————————————");
           System.out.println("           CAMERA TECH RESULTS");
           System.out.println("————————————————————————————————————————————");

           // Calculate and display the total calculated difference for each manufacturer
           for (int i = 0; i < manufacturers.length; i++) {
            String manufacturer = manufacturers[i];
            int mirrorlessPrice = prices[i][0];
            int dslrPrice = prices[i][1];
            int priceDifference = mirrorlessPrice - dslrPrice;

                if (manufacturer.equals(manufacturerWithMaxDifference)) {
                // Add stars only for the manufacturer with the greatest cost difference
                System.out.println(manufacturer + " R " + String.format("%.2f", (double) priceDifference) + "***");
            } else {
                System.out.println(manufacturer + " R " + String.format("%.2f", (double) priceDifference));
            }
        }

            // Display the manufacturer with the greatest cost difference
            System.out.println("     \nCAMERA WITH THE MOST COST DIFFERENCE: " + manufacturerWithMaxDifference);
            System.out.println("————————————————————————————————————————————");
            System.out.println("");
    }
}

