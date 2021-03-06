package org.fasttrackit;

import org.fasttrackit.domain.User;
import org.fasttrackit.service.UserService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

//    private Vehicle[] competitors = new Vehicle[10];

    private UserService userService = new UserService();
    private List<Vehicle> competitorsList = new ArrayList<>();
    private Track track;

//    public void addCompetitor(int index) {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Golf");
//
//        // interacting with a specific position from the array
//        competitors[index] = vehicle;
//    }

    public void addCompetitorToList() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Golf");

        // adding something to the list
        competitorsList.add(vehicle);

        User user = new User();
        user.setName(vehicle.getName());
        userService.createUser(user);
    }


    public void start() throws Exception {
//        addCompetitor(0);
//        addCompetitor(1);

//        addCompetitorToList();
//        addCompetitorToList();

//        printWelcomeMessage();

//        printWelcomeMessageFromList();
//

        // Default track but you can let the user decide what track to use
        track = new Track();
        track.setName("Default Track");
        track.setLenght(100);

        int numberOfPlayers = getPlayerCountFromUser();

        for (int i = 0; i < numberOfPlayers; i++) {
            addCompetitorToList();
        }

        printWelcomeWithEnhancedFor();

        boolean noWinnerYet = true;
        int roundNumber = 1;

//
//        do {
        // with do-while you are sure that the 'do' block is executed at least one time
//            System.out.println("Message to be repeated");
//        } while (noWinnerYet);

        while (noWinnerYet) {
            System.out.println("Round " + roundNumber);
            for (Vehicle vehicle : competitorsList) {
                double speed = getAccelerationSpeedFromUser();
                vehicle.accelerate(speed);

                if (vehicle.getTraveledDistance() >= track.getLenght()) {
                    System.out.println("Congrats! Vehicle " + vehicle.getName() + " won the race!");
                    noWinnerYet = false;
                    break;
                }
            }

            roundNumber++;
        }

    }

//    private void printWelcomeMessage() {
//        // for loop made of 3 components:
//        // initialization, exit condition (termination), increment
//        for (int i = 0; i < competitors.length; i++) {
//            // Make sure to avoid NPE (NullPointerException)
//            // When the array is created, all positions are populated by default with null value
//            if (competitors[i] != null) {
//                System.out.println("Welcome, " + competitors[i].getName());
//            }
//        }
//    }

    private void printWelcomeMessageFromList() {
        // for loops work exactly the same with lists and with arrays
        // the focus here are the size() and get() methods
        for (int i = 0; i < competitorsList.size(); i++) {
            if (competitorsList.get(i) != null) {
                System.out.println("Welcome, " + competitorsList.get(i).getName());
            }
        }
    }

    private void printWelcomeWithEnhancedFor() {
        // enhanced for (or foreach)
        // implicit protection against IndexOutOfBounds exceptions and infinite loops
        for (Vehicle vehicle : competitorsList) {
            if (vehicle != null) {
                System.out.println("Welcome, " + vehicle.getName());
            }
        }
    }

    private int getPlayerCountFromUser() throws Exception {
        System.out.println("Please enter the number of players... We beg of thee");
        // user's input from the keyboard
        Scanner scanner = new Scanner(System.in);

        int userInput = 0;

        try {
            userInput = scanner.nextInt();
        } catch (NullPointerException exception) {
            // you can have as many catch blocks as you need
            System.out.println("Test");

            // example of throwing a checked exception and declaring it in the method signature
            throw new Exception("We don't tolerate NPEs");
        } catch (InputMismatchException exception) {
            System.out.println("Please enter a valid integer number.");

            // example of recursion (a method calling itself)
            userInput = getPlayerCountFromUser();
        } finally {
            // finally block is optional and will always be executed at the end
            System.out.println("Something always executed at the end");
        }

        System.out.println("Your selected number of players: " + userInput);

        return userInput;
    }

    private double getAccelerationSpeedFromUser() {
        System.out.println("Please enter the acceleration speed.");
        Scanner scanner = new Scanner(System.in);

        double userInput;

        try {
            userInput = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Please enter a valid decimal numbre.");
            userInput = getAccelerationSpeedFromUser();
        }

        System.out.println("Your acceleration speed: " + userInput);
        return userInput;
    }

}
