public class ArrayOps {
    public static void main(String[] args) {
        int[] array1 = {7,5,4,3,-12};
        int[] array2 = {1,2,3};
        int[] array3 = {1, -2, 3};
        int[] array4 = {1, 1, 500};
        int[] array5 = {1, 3, 2};
        System.out.println(isSorted(array1));
        System.out.println(isSorted(array2));
        System.out.println(isSorted(array3));
        System.out.println(isSorted(array4));
        System.out.println(isSorted(array5));
    }
    
    public static int findMissingInt (int [] array) {
        int len = array.length;
        int predictSum = (len * (len + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < len; i++){
            actualSum += array[i];
        }
        int missingInt = predictSum - actualSum;
        return missingInt;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secondMax = minValue(array);
        for (int i = 1; i < array.length; i++){
            if (array[i] >= max){
                secondMax = max;
                max = array[i];
            }
            else{
                if (array[i] >= secondMax && array[i] != max){
                    secondMax = array[i];
                }
            }
        }
        return secondMax;
    }

    public static int minValue(int [] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean isTheSame1 = false;
        boolean isTheSame2 = false;
        for (int i = 0; i < array1.length; i++){
            isTheSame1 = false;
            for (int j = 0; j < array2.length; j++){
                if (array1[i] == array2[j]){
                    isTheSame1 = true;
                    break;
                }
            }
            if (isTheSame1 == false){
                break;
            }
        }
        for (int j = 0; j < array2.length; j++){
            isTheSame2 = false;
            for (int i = 0; i < array1.length; i++){
                if (array2[j] == array1[i]){
                    isTheSame2 = true;
                    break;
                }
            }
            if (isTheSame2 == false){
                break;
            }
        }
        if (isTheSame1 == true && isTheSame2 == true){
            return true;
        }
        return false;
    }

    public static boolean isSorted(int [] array) {
        boolean isIncreased = true;
        boolean isDecreased = true;
        for (int i = 1; i < array.length ; i++){
            if (array[i] < array[i - 1]){
                isIncreased = false;
                break;
            }
        }
        for (int i = 1; i < array.length ; i++){
            if (array[i] > array[i - 1]){
                isDecreased = false;
                break;
            }
        }

        if (isIncreased == true || isDecreased == true){
            return true;
        }
        return false;
    }

}
