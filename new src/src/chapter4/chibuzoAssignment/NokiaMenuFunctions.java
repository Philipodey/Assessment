package chibuzoAssignment;

import java.util.Scanner;


public class NokiaMenuFunctions {
   static Scanner scanner = new Scanner(System.in);
    public static void menuFunction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                                **********************
                                1. PhoneBook
                                2. Messages
                                3. Chats
                                4. Call register
                                5. Tones
                                6. Settings
                                7. Call divert
                                8. Games
                                9. Calculator
                                10. Reminders
                                11. Clock
                                12. Profiles
                                13. Sim services
                                ************************
                
                """);
        System.out.println("Press any button: ");
        int mainMenu = scanner.nextInt();
        switch(mainMenu){
            case 1-> phoneBook();
            case 2-> messages();
            case 3-> chat();
            case 4-> callRegister();
            case 5-> tones();
            case 6-> settings();
            case 7-> callDivert();
            case 8-> games();
            case 9-> calculator();
            case 10-> reminders();
            case 11-> clock();
            case 12-> profiles();
            case 13-> simServices();
        }
    }
    public static void phoneBook(){
        System.out.println("PhoneBook");
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                                ************
                                1. Search
                                2. Service Nos
                                3. Add name
                                4. Erase
                                5. Edit
                                6. Assign tone
                                7. Send b'caed
                                8. Options
                                9. Speed dials
                                10. Voice tags
                                11.go back to menu
                                **************
                """);
        System.out.println("Press the button: ");
        int phoneBook = scanner.nextInt();
        switch(phoneBook){
            case 1-> System.out.println("Search");
            case 2-> System.out.println("Service Nos.");
            case 3-> System.out.println("Add name");
            case 4-> System.out.println("Erase");
            case 5-> System.out.println("Edit");
            case 6-> System.out.println("Assign tone");
            case 7-> System.out.println("Send b'card");
            case 8 -> {
                System.out.println("Options");
                System.out.println("""
                                    ***************
                                    1. Type of view
                                    2. Memory status
                                    3. go back to phonebook
                                    4. go back to menu
                                    ****************
                        """);

                int optionInput = scanner.nextInt();
                switch (optionInput){
                    case 1-> System.out.println("Type of view");
                    case 2-> System.out.println("Memory status");
                    case 3 -> phoneBook();
                    case 4 -> menuFunction();
                }
            }
            case 9-> System.out.println("Speed dials");
            case 10-> System.out.println("Voice tags");
            case 11 -> menuFunction();
        }

    }
    public static void messages(){
        System.out.println("Messages");
        System.out.println("""
                                **************************
                                1. Write messages
                                2. Inbox
                                3. Outbox
                                4. Picture messages
                                5. Templates
                                6. Smileys
                                7. Messages settings
                                8. Info service
                                9. Voice mailbox number
                                10. Service command editor
                                11. Back to menu
                                **************************
                """);
        System.out.println("Enter option: ");
        int messages = scanner.nextInt();
        switch(messages){
            case 1-> System.out.println("Write mesages");
            case 2-> System.out.println("Inbox");
            case 3-> System.out.println("Outbox");
            case 4-> System.out.println("Picture messages");
            case 5-> System.out.println("Templates");
            case 6-> System.out.println("Smileys");
            case 7 -> {
                System.out.println("Message settings");
                System.out.println("""
                                       *******************
                                       1. Set
                                       2. Common
                                       3. Back to messages
                                       4. Back to main menu
                                       ********************
                        """);
                System.out.println("Select option: ");
                int messageSetting = scanner.nextInt();
                switch(messageSetting){
                    case 1 -> {
                        System.out.println("Set");
                        System.out.println("""
                                                *************************
                                                1. Message centre number
                                                2. Messages sent as
                                                3. Message validit
                                                4. BacK to Messages
                                                5. Back to main menu
                                               ************************
                                """);
                        System.out.println("Choose option: ");
                        int setInput = scanner.nextInt();
                        switch(setInput){
                            case 1-> System.out.println("Message centre number");
                            case 2-> System.out.println("Message sent as");
                            case 3-> System.out.println("Message Validity");
                            case 4-> messages();
                            case 5-> menuFunction();
                        }
                    }
                    case 2 -> {
                        System.out.println("Common");
                        System.out.println("""
                                              *************************
                                              1. Delivery
                                              2. Reply via same centre
                                              3. Character support
                                              4. Back to messages
                                              5. Back to main menu
                                              *************************
                                """);
                        System.out.println("Choose option: ");
                        int commonInput = scanner.nextInt();
                        switch(commonInput){
                            case 1 -> System.out.println("Delivery");
                            case 2 -> System.out.println("Reply via same centre");
                            case 3 -> System.out.println("Character support");
                            case 4 -> messages();
                            case 5 -> menuFunction();
                        }
                    }

                }
            }
            case 8 -> System.out.println("Info service");
            case 9 -> System.out.println("Voice mailbox number");
            case 10 -> System.out.println("Service command editor");
            case 11 -> menuFunction();
        }

    }

    public static void chat(){
        System.out.println("Chat");
        System.out.println("""
                               ****************
                               1. Back to menu
                               ***************
                               
        """);
        int chatInput = scanner.nextInt();
        switch (chatInput){
            case 1 -> menuFunction();
        }
    }

    public static void callRegister(){
        System.out.println("Call Register");
        System.out.println("""
                              **************************
                              1. Missed calls
                              2. Recieved calls
                              3. Recieved calls
                              4. Dialled numbers
                              5. Erase Show call duration
                              6. Show call cost
                              7. Call cost settings
                              8. Prepaid credit
                              9. Back to menu
                              ************************
                """);
        System.out.println("Select an option: ");
        int callRegister = scanner.nextInt();
        switch(callRegister){
            case 1 -> System.out.println("Missed calls");
            case 2 -> System.out.println("Recieved calls");
            case 3 -> System.out.println("Dialled numbers");
            case 4-> System.out.println("Erase recent call lists");
            case 5 -> {
                System.out.println("Show call duration");
                System.out.println("""
                                      *****************************
                                      1. Last call duration
                                      2. All calls' duration
                                      3. Recieved calls' duration
                                      4. Dialled calls' duration
                                      5. Cleat timer
                                      6. Back to call register
                                      7. Back to menu
                                      *****************************
                        """);
                System.out.println("Choose an option: ");
                int callDuration = scanner.nextInt();
                switch (callDuration){
                    case 1 -> System.out.println("Last call duration");
                    case 2 -> System.out.println("All calls' duration");
                    case 3 -> System.out.println("Recieved calls' duration");
                    case 4 -> System.out.println("Dialled calls' duration");
                    case 5 -> System.out.println("Clear timers");
                    case 6 -> callRegister();
                    case 7 -> menuFunction();

                }
            }
            case 6 -> {
                System.out.println("Show call costs");
                System.out.println("""
                                       ************************
                                       1. Last call cost
                                       2. All calls' cost
                                       3. Clear counters
                                       4. Back to call register
                                       5. Back to main menu
                                       ************************
                        """);
                System.out.println("Choose an option: ");
                int callCost = scanner.nextInt();
                switch(callCost){
                    case 1 -> System.out.println("Last call cost");
                    case 2 -> System.out.println("All calls cost");
                    case 3 -> System.out.println("Clear counters");
                    case 4 -> callRegister();
                    case 5 -> menuFunction();
                }
            }
            case 7 -> {
                System.out.println("Call cost settings");
                System.out.println("""
                                      ************************
                                      1. Call cost limit
                                      2. Show costs in
                                      3. Back to call register
                                      4. Back to menu
                                      ************************
                        """);
                System.out.println("Select an option: ");
                int costSettings = scanner.nextInt();
                switch(costSettings){
                    case 1 -> System.out.println("call cost limit");
                    case 2 -> System.out.println("Show cost in");
                    case 3 -> callRegister();
                    case 4-> menuFunction();
                }
            }
            case 8 -> System.out.println("Prepaid credit");
            case 9 -> menuFunction();

        }

    }
    public static void tones(){
        System.out.println("Tones");
        System.out.println("""
                              ***************************
                              1. Ringing tone
                              2. Ringing volume
                              3. Incoming call divert
                              4. Composer
                              5. Messages alert tone
                              6. Keypad tones
                              7. Warning and game tones
                              8. Vibrating alert
                              9. Screen saver
                              10. Back to menu
                              *************************
                """);
        System.out.println("Choose an option: ");
        int tones = scanner.nextInt();
        switch(tones){
            case 1 -> System.out.println("Ringing tone");
            case 2 -> System.out.println("Ringing volume");
            case 3 -> System.out.println("Incoming call divert");
            case 4 -> System.out.println("Composer");
            case 5 -> System.out.println("Message alert tone");
            case 6 -> System.out.println("Keypad tones");
            case 7 -> System.out.println("Warning and game tones");
            case 8 -> System.out.println("Vibrating alert");
            case 9 -> System.out.println("Screen saver");
            case 10 -> menuFunction();
        }
    }
    public static void settings(){
        System.out.println("Settings");
        System.out.println("""
                              *****************************
                              1. Call settings
                              2. Phone settings
                              3. Security settings
                              4. Restore factory settings
                              5. Back to menu
                              *******************************
                """);
        System.out.println("Choose an option: ");
        int settings = scanner.nextInt();
        switch(settings){
            case 1 -> {
                System.out.println("Call settings");
                System.out.println("""
                                      *****************************
                                       1. Automatic redial
                                      2. Speed dailling
                                      3. call waiting options
                                      4. Own number sending
                                      5. Phone line in use
                                      6. Automatic answer
                                      7. Back to settings
                                      8. Back to menu
                                      ******************************
                        """);
                System.out.println("Choose an option: ");
                int callSettings = scanner.nextInt();
                switch(callSettings){
                    case 1 -> System.out.println("Automatic redial");
                    case 2 -> System.out.println("Speed dialling");
                    case 3 -> System.out.println("Calls waiting options");
                    case 4 -> System.out.println("Own number sending");
                    case 5 -> System.out.println("Phone line in use");
                    case 6 -> System.out.println("Automatic answer");
                    case 7 -> settings();
                    case 8 -> menuFunction();
                }
            }
            case 2 -> {
                System.out.println("Phone settings");
                System.out.println("""
                                      *******************************
                                      1. Language
                                      2. Cell info display
                                      3. Welcome note
                                      4. Network selection
                                      5. Lights
                                      6. Confirm SIM service answer
                                      7. Back to settings
                                      8. back to menu
                                      *******************************
                        """);
                System.out.println("Choose an option: ");
                int phoneSettings = scanner.nextInt();
                switch(phoneSettings){
                    case 1 -> System.out.println("Language");
                    case 2 -> System.out.println("Cell info display");
                    case 3 -> System.out.println("Welcome note");
                    case 4 -> System.out.println("Network selection");
                    case 5 -> System.out.println("Lights");
                    case 6 -> System.out.println("Confirm SIM service answer");
                    case 7 -> settings();
                    case 8 -> menuFunction();
                }
            }
            case 3 -> {
                System.out.println("Security settings");
                System.out.println("""
                                      ************************
                                      1. Pin code request
                                      2. Call barring service
                                      3. Fixed dialling
                                      4. Closed user group
                                      5. Phone security
                                      6. Change access codes
                                      7. Back to settings
                                      8. Back to menu
                                      ***********************
                        """);
                System.out.println("Choose an option: ");
                int securitySettings = scanner.nextInt();
                switch(securitySettings){
                    case 1 -> System.out.println("Pin code request");
                    case 2 -> System.out.println("Call barring service");
                    case 3 -> System.out.println("Fixed dialling");
                    case 4 -> System.out.println("Closed user group");
                    case 5 -> System.out.println("Phone security");
                    case 6 -> System.out.println("Change access codes");
                    case 7 -> settings();
                    case 8 -> menuFunction();
                }
            }
            case 4 -> System.out.println("Restore factory settings");
            case 5 -> menuFunction();

        }
    }

    public static void callDivert(){
        System.out.println("Call divert");
        System.out.println("""
                              ****************
                              1. Back to menu
                              ****************
                """);
        System.out.println("Choose an option: ");
        int divertInput = scanner.nextInt();
        switch(divertInput){
            case 1 -> menuFunction();
        }
    }

    public static void games(){
        System.out.println("Games");
        System.out.println("""
                              ****************
                              1. Back to menu
                              ***************
                """);
        int gameInput = scanner.nextInt();
        switch(gameInput){
            case 1 -> menuFunction();
        }
    }

    public static void calculator(){
        System.out.println("Calculator");
        System.out.println("""
                              ****************
                              1. Back to menu
                              ****************
                              
                """);
        System.out.println("Choose option: ");
        int calculatorInput = scanner.nextInt();
        switch (calculatorInput){
        case 1 -> menuFunction();
        }
    }

    public static void reminders(){
        System.out.println("Reminders");
        System.out.println("""
                              *****************
                              1. Back to menu
                              *****************
                """);
        System.out.println("Choose an option: ");
        int remindersInput = scanner.nextInt();
        switch(remindersInput){
        case 1 -> menuFunction();
        }
    }

    public static void clock(){
        System.out.println("Clock");
        System.out.println("""
                              *******************************
                              1. Alarm clock
                              2. Clock settings
                              3. Date settings
                              4. Stopwatch
                              5. Countdown timer
                              6. Auto update of date and time
                              7. Back to Clock
                              8. Back to menu
                              *********************************
                """);
        System.out.println("Choose an option: ");
        int clockInput = scanner.nextInt();
        switch (clockInput){
            case 1 -> System.out.println("Alarm clock");
            case 2 -> System.out.println("Clock settings");
            case 3 -> System.out.println("Date settings");
            case 4 -> System.out.println("Stopwatch");
            case 5 -> System.out.println("Countdown timer");
            case 6 -> System.out.println("Auto update of date and time");
            case 7 -> clock();
            case 8 -> menuFunction();
        }
    }

    public static void profiles(){
        System.out.println("Profiles");
        System.out.println("""
                              ****************
                              1. Back to menu
                              ****************
                    """);
        int profile = scanner.nextInt();
        switch (profile){
            case 1 -> menuFunction();
        }

    }

    public static void simServices(){
        System.out.println("SIM services");
        System.out.println("""
                              ****************
                              1. Back to menu
                              ****************
                """);
        int simService = scanner.nextInt();
        switch (simService){
            case 1 -> menuFunction();
        }
    }


}
