/*

    * Name: Joshan, Lucamayan A.
    * Course/Year: DIT first year
    * Subject: Computer Programming
    * Date: Sat, Nov 9 2024
    * File Name: PreFinalExam.java
 
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String name;
    private int pinCode;
    private double balance;

    public User(String name, int pinCode, double balance) {
        this.name = name;
        this.pinCode = pinCode;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getPinCode() {
        return pinCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class PreFinalExam {

    static ArrayList<User> users = new ArrayList<>();
    
    public static void main(String[] args) {
        int choice = 0;
        
        do {
            try {
                
                Menu();
                choice = scInt();
                if (choice >= 1 && choice <= 5) {
                    switch (choice) {
                        case 1:
                            ManageAccount();
                            break;
                        case 2:
                            Withdraw();
                            break;
                        case 3:
                            Deposit();
                            break;
                        case 4:
                            CheckBalance();
                            break;
                        case 5:
                            soutln("Thank you for using this program.");
                            break;
                    }
                } else {
                    soutln("Invalid option! Please choose a valid option between 1-5.");
                }
            } catch (Exception e) {
                soutln("Error: Exiting due to an unexpected issue.");
                break;
            }
        } while (choice != 5);
    }

    public static void soutln(String x) {
        System.out.println(x);
    }

    public static void sout(String x) {
        System.out.print(x);
    }

    public static int scInt() {
        Scanner sc = new Scanner(System.in);
        int x;
        while (!sc.hasNextInt()) {
            soutln("Invalid input. Please Try again!");
            sout("- > ");
            sc.next();
        }
        x = sc.nextInt();
        return x;
    }

    public static String scStr() {
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.nextLine();
        return x;
    }

    public static String formatCase(String name) {
        String[] words = name.split("\\s+");
        StringBuilder formattedName = new StringBuilder();
        for (String word : words) {
            formattedName.append(Character.toUpperCase(word.charAt(0)))
                          .append(word.substring(1).toLowerCase())
                          .append(" ");
        }
        return formattedName.toString().trim();
    }

    public static void Menu() {
        soutln("1. Manage Account");
        soutln("2. Withdraw");
        soutln("3. Deposit");
        soutln("4. Check balance");
        soutln("5. Exit");
    }

    public static void ManageAccount() {
        int choice = 0;
        do {
            try {
                soutln("1. Add New Account");
                soutln("2. Edit Account");
                soutln("3. Search Account");
                soutln("4. Delete Account");
                choice = scInt();
                if (choice >= 1 && choice <= 4) {
                    switch (choice) {
                        case 1:
                            AddNewAccount();
                            break;
                        case 2:
                            EditAccount();
                            break;
                        case 3:
                            SearchAccount();
                            break;
                        case 4:
                            DeleteAccount();
                            break;
                    }
                } else {
                    soutln("Invalid choice! Please select a valid option between 1-4.");
                }
            } catch (Exception e) {
                soutln("Error: Exiting Due to an unexpected issue.");
                break;
            }
        } while (choice < 1 || choice > 4);
    }

    public static void AddNewAccount() {
        soutln("Add new Account");

        sout("Name: ");
        String name = scStr();
        String newName = formatCase(name);

        int pinCode;
        do {
            sout("Enter 4-digit PIN code: ");
            pinCode = scInt();

            if (String.valueOf(pinCode).length() != 4) {
                soutln("Please enter a valid 4-digit PIN code.");
            }
        } while (String.valueOf(pinCode).length() != 4);
        
        sout("Initial Balance: ");
        int balance = scInt();

        User newUser = new User(newName, pinCode, balance);
        users.add(newUser);

        soutln("Account Added Successfully!");
    }

    public static void EditAccount() {
    sout("Enter the PIN code to edit the account: ");
    int enteredPin = scInt();
        
    User currentUser = null;
    for (User user : users) {
        if (user.getPinCode() == enteredPin) {
            currentUser = user;
            break;
        }
    }

    if (currentUser == null) {
        soutln("Account not found with that PIN code.");
        return;
    }

    int choice;
    do {
        try {
            soutln("What would you like to edit?");
            soutln("1. Name");
            soutln("2. PIN Code");
            choice = scInt();
            if (choice >= 1 && choice <= 2) {
                EditAccountCase(choice, currentUser);
            }
            else {
                soutln("Invalid choice! Please select a valid option between 1-2.");
            }
            
        } catch (Exception e) {
            soutln("Error: Exiting due to an unexpected issue.");
            break;
        }
    } while (choice < 1 || choice > 2);
        
    }

    public static void EditAccountCase(int x, User currentUser) {
        switch (x) {
        case 1:
            soutln("Your current name: " + currentUser.getName());
            sout("Enter new name: ");
            String newName = scStr();
            String caseName = formatCase(newName);
            currentUser.setName(caseName);
            soutln("Name updated successfully!");
            break;
        case 2:
            soutln("Your current PIN code: " + currentUser.getPinCode());
            int newPinCode;
            do {
                sout("Enter 4-digit PIN code: ");
                newPinCode = scInt();
                if (String.valueOf(newPinCode).length() != 4) {
                    soutln("Please enter a valid 4-digit PIN code.");
                }
            } while (String.valueOf(newPinCode).length() != 4);
            currentUser.setPinCode(newPinCode);
            soutln("PIN code updated successfully!");
            break;
        }
    }


    public static void SearchAccount() {
        sout("Enter the name to search: ");
        String nameToSearch = scStr();
        String fnameToSearch = formatCase(nameToSearch);

        for (User user : users) {
            if (user.getName().equalsIgnoreCase(fnameToSearch)) {
                soutln("Account found!");
                soutln("Name: " + user.getName());
                soutln("Balance: $" + user.getBalance());
                return;
            }
        }

        soutln("Account not found with name: " + fnameToSearch);
    }

    public static void DeleteAccount() {
        sout("Enter the PIN code of the account to delete: ");
        int pinToDelete = scInt();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getPinCode() == pinToDelete) {
                soutln("Are you sure you want to delete your account?");
                soutln("1. Yes");
                soutln("2. No");
                int deleteChoice = scInt();

                if (deleteChoice == 1) {
                    users.remove(i);
                    soutln("Your account has been deleted successfully.");
                }
                else {
                    soutln("Account deletion canceled.");
                }
                return;
            }
        }

        soutln("Account not found with that PIN code.");
    }

    public static void Withdraw() {
        try {
            sout("Enter your PIN code: ");
            int enteredPin = scInt();

            User currentUser = null;
            for (User user : users) {
                if (user.getPinCode() == enteredPin) {
                    currentUser = user;
                    break;
                }
            }

            if (currentUser == null) {
                soutln("Account not found with that PIN code.");
                return;
            }

            sout("Enter the amount to withdraw: ");
            int withdrawalAmount = scInt();

            if (withdrawalAmount > currentUser.getBalance()) {
                soutln("Sorry. You have insufficient funds available.");
            }
            else {
                double newBalance = currentUser.getBalance() - withdrawalAmount;
                currentUser.setBalance(newBalance);

                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String formattedDateTime = now.format(formatter);
                soutln("---------------------------------");
                soutln("Withdraw successfully!");
                soutln("Name: " + currentUser.getName());
                soutln("Date & Time: " + formattedDateTime);
                soutln("Amount: $" + withdrawalAmount);
                soutln("New balance: $" + newBalance);
                soutln("This is your record. Thank you.");
                soutln("---------------------------------");
            }
        } catch (Exception e) {
            soutln("Error: Exiting due to an unexpected issue during withdrawal.");
        }
    }

    public static void Deposit() {
        try {
            sout("Enter your PIN code: ");
            int enteredPin = scInt();

            User currentUser = null;
            for (User user : users) {
                if (user.getPinCode() == enteredPin) {
                    currentUser = user;
                    break;
                }
            }

            if (currentUser == null) {
                soutln("Account not found with that PIN code.");
                return;
            }

            sout("Enter the amount to deposit: ");
            int depositAmount = scInt();

            double newBalance = currentUser.getBalance() + depositAmount;
            currentUser.setBalance(newBalance);

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);
                
            soutln("---------------------------------");
            soutln("Deposit successfully!");
            soutln("Name: " + currentUser.getName());
            soutln("Deposit time: " + formattedDateTime);
            soutln("Amount: $" + depositAmount);
            soutln("New balance: $" + newBalance);
            soutln("This is your record. Thank you.");
            soutln("---------------------------------");
            
        } catch (Exception e) {
            soutln("Error: Exiting due to an unexpected issue during deposit.");
        }
    }

    public static void CheckBalance() {
        try {
            sout("Enter your PIN code: ");
            int enteredPin = scInt();

            User currentUser = null;
            for (User user : users) {
                if (user.getPinCode() == enteredPin) {
                    currentUser = user;
                    break;
                }
            }

            if (currentUser == null) {
                soutln("Account not found with that PIN code.");
                return;
            }

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);
            soutln("---------------------------------");
            soutln("Name: " + currentUser.getName());
            soutln("Current Date & Time: " + formattedDateTime);
            soutln("Current Balance: $" + currentUser.getBalance());
            soutln("---------------------------------");
        } catch (Exception e) {
            soutln("Error: Exiting due to an unexpected issue while checking balance.");
        }
    }
}
