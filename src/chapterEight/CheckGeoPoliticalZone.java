package chapterEight;

import java.util.Arrays;

public class CheckGeoPoliticalZone {
    public static void main(String[] args) {
        String states = "Kwara";
        String state = getGeopoliticalZone(states);
        System.out.println(state);
    }

    public static String getGeopoliticalZone(String states){
        GeoPoliticalZone[][] politicalZone = new GeoPoliticalZone[][]{GeoPoliticalZone.values()};
        for (int count = 0; count < politicalZone.length; count++) {
            GeoPoliticalZone politicalZone1 = GeoPoliticalZone.values()[count];
            for (int counter = 0; counter < politicalZone1.getStates().length; counter++) {
                if (states.equals(politicalZone1.getStates()[counter])){
                    return politicalZone1.name();
                }
            }
        }
        return "state not found";
    }
}
