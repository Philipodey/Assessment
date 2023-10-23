package chapterFive;

public class PythagoreanTriple {
    public static void main(String[] args) {
        for (int opposite = 1; opposite < 20; opposite++) {
            for (int adjacent = opposite; adjacent < 20; adjacent++) {
                for (int hypotenuse = opposite; hypotenuse < 20; hypotenuse++) {
                    if(opposite*opposite + adjacent*adjacent == hypotenuse*hypotenuse)
                    System.out.printf("%-10s%-10s%-10s%n",opposite,adjacent,hypotenuse);
                }
            }
//            System.out.println();
        }
    }
}
