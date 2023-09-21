package chibuzoAssignment;

import java.util.Scanner;

//public class NokiaMenuFunction {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("""
//                            Welcome to Nokia 3310
//                            Press 1: Phone book
//                            Press 2: Messages
//                            Press 3: Chat
//                            Press 4: Call regiter
//                            Press 5: Tones
//                            Press 6: Settings
//                            Press 7: Call divert
//                            Press 8: Games
//                            Press 9: Calculator
//                            Press 10: Reminders
//                            Press 11: Clock
//                            Press 12: Profiles
//                            Press 13: Sim services
//
//                """);
//
//        int userInput = scanner.nextInt();
//        while
//        switch (userInput) {
//            case 1:
//                System.out.println("Phone book");
//                System.out.println("""
//                                      Enter 1 for Search
//                                      Enter 2 for service Nos
//                                      Enter 3 to Add name
//                                      Enter 4 to Erase
//                                      Enter 5 to Edit
//                                      Enter 6 to Assign tone
//                                      Enter 7 to Send b'card
//                                      Enter 8 for options
//                                      Enter 9 for speed dials
//                                      Enter 10 for Voice tags
//                        """);
//                int searchInput = scanner.nextInt();
//                switch (searchInput) {
//                    case 1 -> System.out.println("Search");
//                    case 2 -> System.out.println("Service Nos");
//                    case 3 -> System.out.println("Add name");
//                    case 4 -> System.out.println("Erase");
//                    case 5 -> System.out.println("Edit");
//                    case 6 -> System.out.println("Assign tone");
//                    case 7 -> System.out.println("Send b'card");
//                    case 8 -> {
//                        System.out.println("Options");
//                        System.out.println("""
//                                button 1: Type of view
//                                button 2: Memory status
//                                """);
//                        System.out.print("Enter any number: ");
//                        int optionInput = scanner.nextInt();
//                        switch (optionInput) {
//                            case 1 -> System.out.println("Type of view");
//                            case 2 -> System.out.println("Memory status");
//                        }
//                    }
//                    case 9 -> System.out.println("Speed dials");
//                    case 10 -> System.out.println("Voice Tags");
//                }
//            case 2:
//                System.out.println("Messages");
//                System.out.println("""
//                        press button
//                        1. Write messages
//                        2. Inbox
//                        3. Outbox
//                        4. Picture messages
//                        5. Templates
//                        6. Smileys
//                        7. Messages settings
//                        """);
//
//                int messageInput = scanner.nextInt();
//                switch (messageInput) {
//                    case 1 -> System.out.println("Write messages");
//                    case 2 -> System.out.println("Inbox");
//                    case 3 -> System.out.println("Outbox");
//                    case 4 -> System.out.println("Picture messages");
//                    case 5 -> System.out.println("Templates");
//                    case 6 -> System.out.println("Smileys");
//                    case 7 -> {
//                        System.out.println("Messages settings");
//                        System.out.println("""
//                                Press button
//                                1. Set
//                                2.Common
//
//                                """);
//                        System.out.println("press button 1 0r 2: ");
//                        int messageSettingInput = scanner.nextInt();
//                        switch (messageSettingInput) {
//                            case 1 -> {
//                                System.out.println("Set");
//                                System.out.println("""
//                                                       Press button
//                                                       1. Message centre number
//                                                       2. Message sent as
//                                                       3. Message validity
//                                        """);
//                                int setInput = scanner.nextInt();
//                                switch (setInput) {
//                                    case 1 -> System.out.println("Messages sent as");
//                                    case 2 -> System.out.println("Message sent as");
//                                    case 3 -> System.out.println("Message validity");
//                                }
//
//                            }
//                            case 2 -> {
//                                System.out.println("Common");
//                                System.out.println("""
//                                        Press
//                                        1. Delivery reports
//                                        2. Reply via same centre
//                                        3. Character support
//                                        """);
//                                int commonInput = scanner.nextInt();
//                                switch (commonInput){
//                                    case 1-> System.out.println("Delivery reports");
//                                    case 2-> System.out.println("Reply via same centre");
//                                    case 3-> System.out.println("Character support");
//
//                    case 8-> System.out.println("Info service");
//                    case 9-> System.out.println("info mailbox number");
//                    case 10-> System.out.println("Service command editor");
//
//            case 3-> System.out.println("Chat");
//
//            case 4 -> {
//                  System.out.println("Call register");
//
//
//                  System.out.println("""
//                                         Press button
//                                         1. Missed calls
//                                         2. Recieved calls
//                                         3. dailled numbers
//                                         4. Erase recent call lists
//                                         5. Show call duration
//                                         6. Show call costs
//                                         7. Call costs settings
//                                         8. Prepaid credit""");
//                System.out.println("Press the button: ");
//                int callRegisterInput = scanner.nextInt();
//                switch(callRegisterInput){
//                    case 1-> System.out.println("Missed calls");
//                    case 2-> System.out.println("Recieved calls");
//                    case 3-> System.out.println("Dialled numbers");
//                    case 4-> System.out.println("Erase recent calls lists");
//                    case 5 -> {
//                        System.out.println("Show call duration");
//                        System.out.println("""
//                                               Press button
//                                               1. Last call duration
//                                               2. All calls' duration
//                                               3. Recieved call duration
//                                               4. Dialled calls duration
//                                               5. Clear timer
//                                """);
//                        System.out.println("Press the button");
//                        int showCallDuration = scanner.nextInt();
//                        switch(showCallDuration){
//                            case 1-> System.out.println("Last call cost");
//                            case 2-> System.out.println("All calls duration");
//                            case 3-> System.out.println("Recieved calls duration");
//                            case 4-> System.out.println("Dialled calls' duration");
//                            case 5-> System.out.println("Clear timers");
//                        }
//                    }
//
//                    case 6-> {
//                        System.out.println("Show call costs");
//
//                    }
//                    case 7-> System.out.println("Call costs settings");
//                    case 8-> System.out.println("");
//                }
//                }
//
//                                }
//                            }
//
//                        }
//
//                    }
//                }
//
//        }
//    }
//}
