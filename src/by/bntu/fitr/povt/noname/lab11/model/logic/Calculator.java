package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Vector;

public class Calculator {
    public static double sumOfNegativeElem(Vector vector){
        double sum = 0.0;

        if (vector == null){
            return sum;
        }

        double[] doubleArray = vector.getElements();

        if (doubleArray == null){
            return sum;
        }

        for (double d : doubleArray){
            if (d < 0){
                sum += d;
            }
        }
        return sum;
    }

    public static double prodOfElemBetweenMinAndMax(Vector vector){
        double prodOfElem = 1;

        if (vector == null){
            return prodOfElem;
        }

        double[] doubleArray = vector.getElements();

        if (doubleArray == null){
            return prodOfElem;
        }

        int indexMax = indexOfMaxElem(vector);
        int indexMin = indexOfMinElem(vector);

        if (indexMax == -1 || indexMin == -1){
            return prodOfElem;
        }

        if (indexMax > indexMin){
            for (int i = indexMin + 1; i < indexMax; i++){
                prodOfElem *= doubleArray[i];
            }

        } else if (indexMax < indexMin){
            for (int i = indexMax + 1; i < indexMin; i++){
                prodOfElem *= doubleArray[i];
            }

        } else {
            prodOfElem = doubleArray[indexMax];
        }

        return prodOfElem;
    }

    public static int indexOfMaxElem(Vector vector){
        int indexMax = -1;

        if (vector == null){
            return indexMax;
        }

        double[] doubleArray = vector.getElements();

        if (doubleArray == null || doubleArray.length < 1){
            return indexMax;
        }

        double max = doubleArray[0];
        indexMax = 0;

        for (int i = 0; i < doubleArray.length; i++){
            if (doubleArray[i] > max){
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static int indexOfMinElem(Vector vector){
        int indexMin = -1;

        if (vector == null){
            return indexMin;
        }

        double[] doubleArray = vector.getElements();

        if (doubleArray == null || doubleArray.length < 1){
            return indexMin;
        }

        double min = doubleArray[0];
        indexMin = 0;

        for (int i = 0; i < doubleArray.length; i++){
            if (doubleArray[i] < min){
                indexMin = i;
            }
        }
        return indexMin;
    }
}
