package chapterSeven.test;

import chapterSeven.Main.PixelQuantization;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPixelQuantization {
    @Test
    public void testCompressionOfValuesBetween0And20() {
        int[] values = {20, 2, 3, 6, 7, 19, 18, 17, 13, 10, 9, 16, 15, 14, 4, 1, 0, 0};
        int[] result = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] expected = PixelQuantization.compressValuesBetween0and20(values);
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(result, expected);
    }
    @Test
    public void testCompressionOfValuesBetween21And40() {
        int[] values = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
        int[] result = {30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
        int[] expected = PixelQuantization.compressValuesBetween21And40(values);
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(result, expected);
    }
    @Test
    public void testCompressionOfValuesBetween41And60(){
        int[] values = {41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60};
        int[] result = {50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
        int[] expected = PixelQuantization.compressValuesBetween41And60(values);
        assertArrayEquals(result, expected);
    }
    @Test
    public void testCompressionOfValuesBetween61And80(){
        int[] values = {61, 65, 75, 80, 63, 73};
        int[] result = {70, 70, 70, 70, 70, 70};
        int[] expected = PixelQuantization.compressValuesBetween61And80(values);
        assertArrayEquals(result, expected);
    }
    @Test
    public void testCompressionOfValuesBetween81And100(){
        int[] values = {81, 85, 85, 100, 95, 93, 87};
        int[] result = {90, 90, 90, 90, 90, 90, 90};
        int[] expected = PixelQuantization.compressValuesBetween81And100(values);
        assertArrayEquals(result, expected);
    }
    @Test
    public void testCompressionOfValuesBetween101And120(){
        int[] values = {101, 105, 105, 120, 110, 115, 113, 117};
        int[] result = {110, 110, 110, 110, 110, 110, 110, 110};
        int[] expected = PixelQuantization.compressValuesBetween101And120(values);
        assertArrayEquals(result, expected);
    }
    @Test
    public void testCompressionOfValuesBetween121And140(){
        int[] values = {121, 125, 127, 130, 134, 135, 133, 137};
        int[] result = {130, 130, 130, 130, 130, 130, 130, 130};
        int[] expected = PixelQuantization.compressValuesBetween121And140(values);
        assertArrayEquals(result, expected);
    }
    @Test
    public void testCompressionOfValuesBetween141And160(){
        int[] values = {141, 145, 147, 150, 154, 155, 153, 160};
        int[] result = {150, 150, 150, 150, 150, 150, 150, 150};
        int[] expected = PixelQuantization.compressValuesBetween141And160(values);
        assertArrayEquals(result, expected);
    }
    @Test
    public void testCompressionOfValuesBetween161And180(){
        int[] values = {161, 165, 167, 170, 174, 175, 173, 180};
        int[] result = {170, 170, 170, 170, 170, 170, 170, 170};
        int[] expected = PixelQuantization.compressValuesBetween161And180(values);
        assertArrayEquals(result, expected);
    }
    @Test
    public void testCompressionOfValuesBetween181AndAbove(){
        int[] values = {1811, 1025, 12767, 190, 1634, 1095, 193, 187};
        int[] result = {190, 190, 190, 190, 190, 190, 190, 190};
        int[] expected = PixelQuantization.compressValuesBetween181AndAbove(values);
        assertArrayEquals(result, expected);
    }
    @Test
    public void testCompressionOfPixelColors(){
        int[] values = {1811, 1025, 12767, 190, 1634, 1095, 193, 187,10, 10, 19, 20, 21, 30 , 39,41,50,55,60, 61, 70, 80, 81, 90, 100, 101, 110, 120, 121, 130, 140};
        int[] result = {190, 190, 190, 190, 190, 190, 190, 190,10,10,10,10,30,30,30, 50, 50, 50, 50, 70, 70, 70, 90, 90, 90, 110, 110, 110, 130, 130, 130};
        int[] expected = PixelQuantization.compress(values);
        assertArrayEquals(result, expected);
    }



}
