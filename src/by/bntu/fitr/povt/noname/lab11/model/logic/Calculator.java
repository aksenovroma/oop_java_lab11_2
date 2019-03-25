package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Vector;

public class Calculator {
    public static double sumOfNegativeElem(Vector vector){
        double sum = 0.0;

        if (vector != null && vector.getElements() != null && vector.size() > 0){
            for (double d : vector.getElements()){
                if (d < 0){
                    sum += d;
                }
            }
        }
        return sum;
    }

    public static double prodOfElemBetweenMinAndMax(Vector vector){
        double prodOfElem = 1;

        if (vector != null && vector.getElements() != null){
            int indexMax = indexOfMaxElem(vector);
            int indexMin = indexOfMinElem(vector);

            if (indexMax != -1 && indexMin != -1){
                if (indexMax > indexMin){
                    for (int i = indexMin + 1; i < indexMax; i++){
                        prodOfElem *= vector.getElements()[i];
                    }

                } else if (indexMax < indexMin){
                    for (int i = indexMax + 1; i < indexMin; i++){
                        prodOfElem *= vector.getElements()[i];
                    }

                } else {
                    prodOfElem = vector.getElements()[indexMax];
                }
            }
        }
        return prodOfElem;
    }

    public static int indexOfMaxElem(Vector vector){
        int indexMax = -1;

        if (vector != null && vector.getElements() != null && vector.size() > 0){
            double max = vector.getElements()[0];
            indexMax = 0;

            for (int i = 0; i < vector.size(); i++){
                if (vector.getElements()[i] > max){
                    max = vector.getElements()[i];
                    indexMax = i;
                }
            }
        }
        return indexMax;
    }

    public static int indexOfMinElem(Vector vector){
        int indexMin = -1;

        if (vector != null && vector.getElements() != null && vector.size() > 0) {
            double min = vector.getElements()[0];
            indexMin = 0;

            for (int i = 0; i < vector.size(); i++){
                if (vector.getElements()[i] < min){
                    min = vector.getElements()[i];
                    indexMin = i;
                }
            }
        }
        return indexMin;
    }
}
