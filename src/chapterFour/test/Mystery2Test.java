package chapterFour.test;

public class Mystery2Test {
    public String divisible(int number) {
        int count = 1;
        String tet = null;
        while (count <= 20) {
            tet = (count % 2 == 1 ? "########" : "++++++++++");
            return (tet);
        }
        return tet;

    }


}

