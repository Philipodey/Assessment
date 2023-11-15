package ClassTask.test;

import ClassTask.Person;
import ClassTask.Problem;
import ClassTask.Type;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem {
    @Test
    public void testAddProblem(){
        String name = "lackOfFinance";
        Type type = Type.FINANCIAL;
        Person person = new Person();
        person.addProblem(name,type);
        Problem problem = new Problem(name, type);
//        assertEquals(, person.tellProblems().getFirst());
    }
}
