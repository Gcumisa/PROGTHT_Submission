/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agentmain;

import java.util.Scanner;

/**
 *
 * @author applemac
 */
public class AgentMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current estate agent name: ");
        String agentName = scanner.nextLine();

        System.out.print("Enter property price: ");
        double propertyPrice = scanner.nextDouble();

        EstateAgentSales agent = new EstateAgentSales(agentName, propertyPrice);
        agent.printPropertyReport();
    }
}
