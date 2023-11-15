package chapterSeven.Main;

public class PixelQuantization {

    public static int[] compressValuesBetween0and20(int[] values) {
        for (int count = 0; count < values.length; count++) {
            if (values[count] >= 0 && values[count] < 21 ){
                values[count] = 10;
            }
        }
        return values;
    }

    public static int[] compressValuesBetween21And40(int[] values) {
        for (int count = 0; count < values.length; count++) {
            if (values[count] >= 21 && values[count] <= 40){
                values[count] = 30;
            }
        }
        return values;
    }
    public static int[] compressValuesBetween41And60(int[] values) {
        for (int count = 0; count < values.length; count++) {
            if (values[count] >= 41 && values[count] <= 60) {
                values[count] = 50;
            }
        }
        return values;
    }
    public static int[] compressValuesBetween61And80(int[] values) {
        for (int count = 0; count < values.length; count++) {
            if (values[count] >= 61 && values[count] <= 80){
                values[count] = 70;
            }
        }
        return values;
    }
    public static int[] compressValuesBetween81And100(int[] values) {
        for (int count = 0; count < values.length; count++) {
            if (values[count] >= 81 && values[count] <= 100){
                values[count] = 90;
            }
        }
        return values;
    }
    public static int[] compressValuesBetween101And120(int[] values) {
        for (int count = 0; count < values.length; count++) {
            if (values[count] >= 101 && values[count] <= 120){
                values[count] = 110;
            }
        }
        return values;
    }
    public static int[] compressValuesBetween121And140(int[] values) {
        for (int count = 0; count < values.length; count++) {
            if (values[count] >= 121 && values[count] <= 140){
                values[count] = 130;
            }
        }
        return values;
    }
    public static int[] compressValuesBetween141And160(int[] values) {
        for (int count = 0; count < values.length; count++) {
            if (values[count] >= 141 && values[count] <= 160){
                values[count] = 150;
            }
        }
        return values;
    }
    public static int[] compressValuesBetween161And180(int[] values) {
        for (int count = 0; count < values.length; count++) {
            if (values[count] >= 161 && values[count] <= 180){
                values[count] = 170;
            }
        }
        return values;
    }
    public static int[] compressValuesBetween181AndAbove(int[] values) {
        for (int count = 0; count < values.length; count++) {
            if (values[count] >= 181){
                values[count] = 190;
            }
        }
        return values;
    }
    public static int[] compress(int[] values) {
        for (int count = 0; count < values.length; count++) {

            if(values[count] >= 181){
                values[count] = 190;
            }
            else if(values[count] >= 161 && values[count] <= 180){
                values[count] = 170;
            }
            else if(values[count] >= 141 && values[count] <= 160){
                values[count] = 150;
            }
            else if (values[count] >= 121 && values[count] <= 140){
                values[count] = 130;
            }
            else if (values[count] >= 101 && values[count] <= 120){
                values[count] = 110;
            }
            else if (values[count] >= 81 && values[count] <= 100) {
                values[count] = 90;
            }
            else if (values[count] >= 61 && values[count] <= 80){
                values[count] = 70;
            }
            else if (values[count] >= 41 && values[count] <= 61){
                values[count] = 50;
            }
            else if (values[count] >= 21 && values[count] <= 40){
                values[count] = 30;
            }
            else {
                values[count] = 10;
            }


        }
        return values;
    }


}
