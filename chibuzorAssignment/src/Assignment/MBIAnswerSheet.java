package Assignment;

public class MBIAnswerSheet {
    private static int introvert;
    private static int extrovert;
    private static int sensing;
    private static int intuitive;
    private static int thinking;
    private static int feeling;
    private static int judging;
    private static int perceptive;
    private static int currentQuestion;
    private static int currentOption;
    private static boolean flag = true;

    private static final String [][]question = {
            {"A. expend energy, enjoy groups.", "B.conserve energy, enjoy one-on-one"},
            {"A. more outgoing, think out loud.", "B.more reserved, think to yourself"},
            {"A. seek many tasks, public activities,interaction with others.", "B.seek private, solitary activities with quiet to concentrate"},
            {"A. external communicative, express yourself.", "B. internal, reticent, keep to yourself"},
            {"A. active, initiate ", "B. reflective, deliberate"}
    };

    public static void extrovertQuestion(String answer){
//        while (flag){
            if (answer.equalsIgnoreCase("A")){
                System.out.println("E");
                extrovert++;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("I");
                introvert++;
            }
            else {
                System.out.println("Answers should be a or b");
            }
    }
}