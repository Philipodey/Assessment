package chapterEight;

public class GreetingApplication{
    public static void main(String[] args) {
        User firstPerson = new User("Ogar");
        User secondPerson = new User("Mary");
        firstPerson.greet();
        secondPerson.greet();
    }
}
