package chapterSix;

public class Scope {

    private static int x = 1;

    public static void main(String[] args){
        int x = 5;
        System.out.printf("Local x in main is %d%n",x);
        useLocalVariable();
        useField();
        useLocalVariable();
        useField();

        System.out.printf("%nlocal x in main is %d%n",x);

    }
    public static void useLocalVariable(){
        int x = 25;
        System.out.printf("%nLocal x on entering method useLocalVariable is %d%n", x);
        ++x;
        System.out.printf("Local x before exiting method useLocalVariable is %d%n",x);

    }
    public static void useField(){
        System.out.printf("%nField x on entering method useField is %d%n", x);
        x *= 10;
        System.out.printf("%nField x on exiting method useField is %d%n", x);

    }

}
