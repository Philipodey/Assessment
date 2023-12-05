package chapterEight.diary;

import static chapterEight.bank.main.BankMain.input;

public class DiaryMain {
    private static Diary myDiary;
    private static Entry entry;
    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        display();
        String userInput = input("choose an option: ");
        while (!userInput.matches("\\d")){
            userInput = input("Invalid input\nchoose an option between 1 and 3: ");
        }
        int newUserInput = Integer.parseInt(userInput);
        switch (newUserInput){
            case 1 -> createDiary();
            case 2 -> unlockDiary();
            case 3 -> System.exit(0);
            default -> mainMenu();
        }

    }

    private static void unlockDiary() {
        if (myDiary == null){
            System.out.println("Diary not created. Please create a diary first !");
            mainMenu();
        }
        String password = input("Enter password: ");
        try {
            myDiary.unlockDiary(password);
            diaryOptions();
        }
        catch (Exception exception){
            System.out.println("""
                    ================================
                        DIARY UNLOCK UNSUCCESSFUL
                    ================================
                    """);
            System.out.println(exception.getMessage());
            unlockDiary();
        }
        finally {
            System.out.println("""
                    =========================
                        DIARY UNLOCKED
                    =========================
                    """);
        }
    }

    private static void diaryOptions() {
        diaryOptionsDisplay();
        String optionInput = input("Choose an option: ");
        while(!optionInput.matches("\\d")){
            System.out.println("Invalid input try Again ! ");
            optionInput = input("Choose an option: ");
        }
        int convertOptionInput = Integer.parseInt(optionInput);
        switch (convertOptionInput){
            case 1 -> addEntry();
            case 2 -> findEntry();
            case 3 -> updateEntry();
            case 4 -> deleteEntry();
            case 5 -> lockEntry();
            case 6 -> optionExit();
            default -> {
                System.out.println("Wrong entry!!\n Enter a valid number between 1-5");
                diaryOptions();
            }
        }
    }

    private static void optionExit() {
        System.exit(7);
        System.out.println("""
        ===========================
            HAVE A WONDERFUL DAY
        ===========================
        """);
    }

    private static void lockEntry() {
        if (myDiary == null){
            System.out.println("Diary not created. Please create Diary!");
            mainMenu();
        }
        try {
            myDiary.lockDiary();
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            diaryOptions();
        }
        finally {
            System.out.println("""
                    ===============================
                        DIARY LOCKED SUCCESSFULLY
                    ===============================
                    """);
            diaryOptions();
        }

    }

    private static void updateEntry() {
        int id = getId();
        String title = input("Write the title of your message: ");
        String body = input("Compose your message: ");
        try { myDiary.updateEntry(id,title,body); }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            diaryOptions();}
        finally {
            System.out.println(entry);
            System.out.println("""
                    ==============================
                        DIARY UPDATE SUCCESSFUL
                    ==============================
                    """);
            diaryOptions();
        }


    }

    private static void deleteEntry() {
        int id = getId();
        String response = input("Are you sure you want to delete entry: ");
        while (!(response.equalsIgnoreCase("yes")|| response.equalsIgnoreCase("no"))){
            response = input("Invalid input\nPlease enter 'yes' or 'no' ");}
        if(response.equalsIgnoreCase("yes")){
        try { myDiary.deleteEntry(id);}
        catch (Exception exception){
            System.out.println(exception.getMessage());
            deleteEntry();
        }
        finally {
            System.out.println("""
                    ==============================
                        ENTRY DELETE SUCCESSFUL
                    ==============================
                    """);
            diaryOptions();
        }}
        else {
            System.out.println("""
                    ==========================
                        ENTRY NOT DELETED
                    =========================
                    """);
            diaryOptions();
        }
    }

    private static void findEntry() {
        int id = getId();
        try {myDiary.findEntryById(id);}
        catch (Exception exception){ System.out.println(exception.getMessage()); }
        finally {
            System.out.println("""
                    ========================
                        ENTRY FOUND
                    ========================
                    """);
            System.out.println(entry);diaryOptions(); }


    }

    private static int getId() {
        String identity = input("Enter Id: ");
        while(!identity.matches("\\d+")){
            identity = input("Enter Id: ");
        }
        int id = Integer.parseInt(identity);
        return id;
    }

    private static void addEntry() {
        String title = input("Write the title of your message: ").toUpperCase();
        String body = input("""
                Compose your message: 
                """);
        try {
        myDiary.createEntryFor(title, body);
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            addEntry();
        }
        finally {
            System.out.println("""
                        ================================
                            ENTRY CREATED SUCCESSFULLY
                        ================================
                                
                        """);
            diaryOptions();
        }
    }

    private static void diaryOptionsDisplay() {
        System.out.println("""
                ============================
                press 1 -> Add Entry
                press 2 -> Find Entry
                press 3 -> Update Entry
                press 4 -> Delete Entry
                press 5 -> lock Diary
                press 6 -> Back to Home page
                press 7 -> To exit
                ============================
                """);
    }

    private static void createDiary() {
       String username = input("Enter username: ");
       while(!username.matches(".*[a-z]*\\d.*") && username.length() < 6 || username.matches("^[0-9].*")){
           System.out.println("Username must consist of letters and digits,\nand the character must be greater than 5,\n and username should all be lowercase");
           username = input("Enter username: ");
       }
       String password = input("Enter password");
       while(!(password.matches(".+[A-Za-z].*\\d+")) && password.length() < 6){
           System.out.println("Password is weak, the length should be greater than 5\nUsername should contain a number: ");
           password = input("Enter password");
       }
       myDiary = new Diary(username,password);
        System.out.println("""
                ====================================
                    DIARY CREATED SUCCESSFULLY
                ====================================
                """);
        mainMenu();
    }

    private static void display() {
        System.out.printf("""
                %s
                        My Diary
                %s
                press 1 -> Create Diary
                press 2 -> Unlock Diary
                press 3 -> Exit
                %s
                ""","=".repeat(25),"=".repeat(25),"=".repeat(25));
    }

}
