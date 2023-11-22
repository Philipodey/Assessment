package classWork;

public class SwapElements {
    public static int[] swapElements(int[] elements) {
        int[] newElement = new int[elements.length];
        int count = 0;
        for (int counts = 0; counts < elements.length; counts++) {
            if (elements.length % 2 == 0) {
                if (count % 2 == 0) {
                    counts++;
                    newElement[count] = elements[counts];
                    counts--;
                } else {
                    counts--;
                    newElement[count] = elements[counts];
                    counts++;
                }
                count++;
            } else {
                if (count == elements.length - 1) {
                    newElement[count] = elements[counts];
                    break;
                }
                if (count % 2 == 0) {
                    counts++;
                    newElement[count] = elements[counts];
                    counts--;
                } else {
                    counts--;
                    newElement[count] = elements[counts];
                    counts++;
                }
                count++;
            }


        }

        return newElement;
    }

    public static int[] swapElement2(int[] elements) {
        int[] element = new int[elements.length];
        int counter = 0;
        for (int count = 0; count < elements.length; count++) {
            if (elements.length % 2 == 0) {
                if (count % 2 == 0) {if (count >= 0 && count < 2) element[counter] = elements[count];
                    else {
                        count++;
                        element[counter] = elements[count];
                        count--;
                    }
                } else {
                    if (count >= 0 && count < 2) element[counter] = elements[counter];
                    else {
                        count--;
                        element[counter] = elements[count];
                        count++;
                    }
                }

                counter++;
            } else {

                if (count == elements.length - 1) {
                    element[counter] = elements[count];
                    break;
                }
                if (count % 2 == 0) {
                    if (count >= 0 && count <2) element[counter] = elements[count];

                    else {
                        count++;
                        element[counter] = elements[count];
                        count--;
                    }
                } else {
                    if (count >= 0 && count < 2)element[counter] = elements[count];
                    else {
                        count--;
                        element[counter] = elements[count];
                        count++;
                    }
                }
                counter++;
            }
        }

        return element;
    }
}
