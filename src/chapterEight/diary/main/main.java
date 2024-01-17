package chapterEight.diary.main;

import chapterEight.diary.Diaries;
import chapterEight.diary.Diary;

import static chapterEight.bank.main.BankMain.input;

public class main {
    private static Diaries myDiaries;
    private static Diary myDiary;

    public static void main(String[] args) {
        mainMenuPage();
    }

    private static void mainMenuPage() {
        displayPage();
        String userInput = input("choose an option: ");
        while (!userInput.matches("\\d")){
            userInput = input("Invalid input\nchoose an option between 1 and 3: ");
        }
        int newUserInput = Integer.parseInt(userInput);
        switch (newUserInput) {
            case 1 -> addDiary();
            case 2 -> findDiary();
            case 3 -> deleteDiary();
            case 4 -> unlockDiary();
            case 5 -> Exit();
        }

    }

    private static void Exit() {
    }

    private static void unlockDiary() {
        if (myDiary == null){
            System.out.println("Diary not created. Please create a diary first !");
            mainMenuPage();
        }
        String password = input("Enter password: ");
        try {
            myDiary.unlockDiary(password);
            diaryOptionsMenu();
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

    private static void diaryOptionsMenu() {
        diaryOptionsMenuDisplay();
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
                diaryOptionsMenu();
            }
        }
    }

    private static void updateEntry() {
    }

    private static void optionExit() {

    }

    private static void lockEntry() {

    }

    private static void deleteEntry() {

    }

    private static void findEntry() {

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
            diaryOptionsMenu();
        }
    }

    private static void diaryOptionsMenuDisplay() {
    }

    private static void deleteDiary() {
    }

    private static void findDiary() {

    }

    private static void addDiary() {
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
        try {
            myDiaries.add(username, password);
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            addDiary();
        }
        finally {
            System.out.println("""
                    ====================================
                        DIARY ADDED SUCCESSFULLY
                    ====================================
                    """);
            mainMenuPage();
        }
    }

    private static void displayPage() {
        System.out.printf("""
                %s
                press 1 -> Add Diary
                press 2 -> Find Diary
                press 3 -> Delete diary
                press 4 -> Unlock diary
                press 5 -> Exit
                %s
                ""","=".repeat(30), "=".repeat(30));
    }
}
