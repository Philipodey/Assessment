package ClassTask;

import java.util.ArrayList;

public class Person {

    private ArrayList<Problem> problems =  new ArrayList<>();
    public void addProblem(String name, Type type){
        Problem problem = new Problem(name,type);
        problems.add(problem);
    }
    public void add(Problem problem){
        problems.add(problem);
    }

    public void solve(Problem problem){
        problems.remove(problem);
    }
    public ArrayList<Problem> tellProblems(){
        return problems;
    }
}
