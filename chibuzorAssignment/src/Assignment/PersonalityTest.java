//package Assignment;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class PersonalityTest{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[][] extrovertVsIntrovert = new String[][]{
//                {"A. expend energy, enjoy groups."},{"B.conserve energy, enjoy one-on-one"},
//                {"A. more outgoing, think out loud."} ,{"B.more reserved, think to yourself"},
//                {"A. seek many tasks, public activities,interaction with others."}, {"B.seek private, solitary activities with quiet to concentrate"},
//                {"A. external communicative, express yourself."}, {"B. internal, reticent, keep to yourself"},
//                {"A. active, initiate "},{"B. reflective, deliberate"}
//        };
//        String[][] sensingVsIntuitive = new String[][]{
//                {"A. interpret literally "},{"B. look for meaning and possibilities"},
//                {"A. practical, realistic, experimental."}, {"B. imaginative, innovative, theoretical"},
//                {"A. standard, usual, conventional."},{"B. different, novel, unique"},
//                {"A. focus on here-and-now."}, {"B. look to the future, global perspective, big picture"},
//                {"A. facts, things, what is."}, {"B. ideas, dreams, what could be, philosophical"}
//        };
//        String[][] thinkingVsFeeling = new String[][]{
//                {"A. logical, thinking, questioning."}, {"B. empathetic, feeling, accommodating"},
//                {"A. candid, straight forward, frank."},{"B. tactful, kind, encouraging"},
//                {"A. firm, tend to criticise, hold the line."}, {"B. gentle, tend to appreciate, conciliate"},
//                {"A. tough-minded, just."}, {"B. tender-hearted, merciful"},
//                {"A. matter of facts, issue-oriented."},{" B. sensitive, people-oriented, compassionate"}
//        };
//        String[][] judgingVsPerceptive = new String[][]{
//                {"A. organised, orderly."},{" B. flexible, adaptable"},
//                {"A. plan, schedule."},{" B. unplanned, spontaneous"},
//                {"A. regulated, structured."},{" B. easy-going, live, and let live"},
//                {"A. preparation, plan ahead."},{"B. go with the flow, adapt as you go"},
//                {"A. control, govern."},{"B. latitude, freedom"}
//        };
//
//        String[] extrovertVsIntrovertAnswerBank = new String[5];
//        String[] sensingVsIntuitiveAnswerBank = new String[5];
//        String[] thinkingVsFeelingAnswerBank = new String[5];
//        String[] judgingVsPerceptiveAnswerBank = new String[5];
//        answersSave(extrovertVsIntrovert);
//        answersSave(sensingVsIntuitive);
//        answersSave(thinkingVsFeeling);
//        answersSave(judgingVsPerceptive);
//
//        StringBuilder inputCollected = new StringBuilder();
//
////        String extrovert = showQuestionsAndSaveAnswers(extrovertVsIntrovert, extrovertVsIntrovertAnswerBank);
////        String sensing = showQuestionsAndSaveAnswers(sensingVsIntuitive, sensingVsIntuitiveAnswerBank);
////        String thinking = showQuestionsAndSaveAnswers(thinkingVsFeeling, thinkingVsFeelingAnswerBank);
////        String judging = showQuestionsAndSaveAnswers(judgingVsPerceptive, judgingVsPerceptiveAnswerBank);
////        System.out.println(extrovert);
////        System.out.println(sensing);
////        System.out.println(thinking);
////        System.out.println(judging);
//
//        int extrovertVsIntrovertOptionCount = sumOption(extrovertVsIntrovertAnswerBank);
//        int sensingVsIntuitiveAnswerOptionCount = sumOption(sensingVsIntuitiveAnswerBank);
//        int thinkingVsFeelingAnswerOptionCount = sumOption(thinkingVsFeelingAnswerBank);
//        int judgingVsPerceptiveAnswerOptionCount = sumOption(judgingVsPerceptiveAnswerBank);
//
//        if(extrovertVsIntrovertOptionCount < 3 ){
//            inputCollected.append("I");
//        }
//        else {
//            inputCollected.append("E");
//        }
//        if (sensingVsIntuitiveAnswerOptionCount < 3){
//            inputCollected.append("N");
//        }
//        else inputCollected.append("S");
//        if (thinkingVsFeelingAnswerOptionCount < 3){
//            inputCollected.append("F");
//        }else inputCollected.append("T");
//        if (judgingVsPerceptiveAnswerOptionCount < 3){
//            inputCollected.append("P");
//        }else inputCollected.append("J");
//        int questionsNumbers = 1;
//        System.out.printf("""
//                 Options chosen by you
//                 |%4s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|
//                 %s%n
//
//
//                """," ","A","B"," ","A","B"," ","A","B"," ","A","B","_".repeat(74));
//        for (int count = 0; count < extrovertVsIntrovertAnswerBank.length; count++) {
//                System.out.printf("|%5s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%n",questionsNumbers++,
//                        takeNoteOfOptionPicked(extrovertVsIntrovertAnswerBank[count],1),
//                        takeNoteOfOptionPicked(extrovertVsIntrovertAnswerBank[count],2),questionsNumbers++,
//                        takeNoteOfOptionPicked(sensingVsIntuitiveAnswerBank[count], 1),
//                        takeNoteOfOptionPicked(sensingVsIntuitiveAnswerBank[count], 2),questionsNumbers++,
//                        takeNoteOfOptionPicked(thinkingVsFeelingAnswerBank[count],1),
//                        takeNoteOfOptionPicked(thinkingVsFeelingAnswerBank[count],2), questionsNumbers++,
//                        takeNoteOfOptionPicked(judgingVsPerceptiveAnswerBank[count],1),
//                        takeNoteOfOptionPicked(judgingVsPerceptiveAnswerBank[count],2));
//        }
//        System.out.printf("""
//                %n%s%n
//                %5s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|
//                %5s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|%3s|
//                Your personality type is %s
//                ""","_".repeat(74),
//                countNumberOfAnswers(extrovertVsIntrovertAnswerBank,1),
//                countNumberOfAnswers(extrovertVsIntrovertAnswerBank,0),"",
//                countNumberOfAnswers(sensingVsIntuitiveAnswerBank,1),
//                countNumberOfAnswers(sensingVsIntuitiveAnswerBank,0),"",
//                countNumberOfAnswers(thinkingVsFeelingAnswerBank,1),
//                countNumberOfAnswers(thinkingVsFeelingAnswerBank,0),"",
//                countNumberOfAnswers(judgingVsPerceptiveAnswerBank,1),
//                countNumberOfAnswers(judgingVsPerceptiveAnswerBank,0),"","I","E","",
//                "N","S","","T","F","","J","P","",inputCollected);
//    }
//    static int questionNumber = 1;
//    public static String showQuestionsAndSaveAnswers(String[] questions, int[] answers){
//        Scanner check =  new Scanner(System.in);
//        String option = null;
//        for (int count = 0; count < questions.length; count++) {
//            System.out.printf("Question\t%d%n", questionNumber++);
//            System.out.println(questions[count]);
//            System.out.println("Select an option: A or B ");
//            option = collectAnswers(check);
//
//
//
//            if((option.equalsIgnoreCase("A"))){
//                answers[count] = 1;
//            }
//        }
//        return option;
//
//    }
////    public static String c(){
////
////    }
//    public static void answersSave(String[][] array){
//        Scanner check = new Scanner(System.in);
//
//        for (int count = 0; count < array.length; count++) {
//            for (int counter = 0; counter < array[count].length; counter++) {
//                System.out.println(array[count][counter] + " ");
//                String answer = check.nextLine();
//            }
//        }
//    }
//    public static String collectAnswers(Scanner check){
//        String option;
//        while(true){
//            try{
//                option = check.nextLine();
//                if(option.trim().equalsIgnoreCase("a".trim()) || option.trim().equalsIgnoreCase("b")){
//                    return option;
//                }
//                else {
//                    throw new IllegalArgumentException("Wrong option:\nSelect A or B");
//                }
//            }catch (IllegalArgumentException ex){
//                System.err.println(ex.getMessage());
//            }
//
//        }
//    }
//    public static int sumOption(int[] questionAnswers){
//        int total = questionAnswers[0];
//        for (int count = 0; count < questionAnswers.length; count++) {
//          total += count;
//        }
//        return total;
//    }
//    public static String takeNoteOfOptionPicked(int count, int position){
//        return (count == 1 && position == 1) || (count == 0 && position == 2)?String.format("%c",'✓'):"";}
//    public static int countNumberOfAnswers(int[] array, int number){
//         int counter = 0;
//        for (int count = 0; count < array.length; count++) {
//            if (count == number) counter++;
//        }
//        return counter;
//    }
//}
