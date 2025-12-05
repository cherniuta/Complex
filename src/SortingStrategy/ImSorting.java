package SortingStrategy;

import ComplexNumber.ComplexNumber;

public class ImSorting {
    public void sort(ComplexNumber[] complexNumbers,int size){
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (complexNumbers[j].getIm() > complexNumbers[j + 1].getIm()) {
                    ComplexNumber temp = complexNumbers[j];
                    complexNumbers[j] = complexNumbers[j + 1];
                    complexNumbers[j + 1] = temp;
                }
                else if (complexNumbers[j].getIm() == complexNumbers[j + 1].getIm()) {
                    if (complexNumbers[j].getRe() > complexNumbers[j + 1].getRe()) {
                        ComplexNumber temp = complexNumbers[j];
                        complexNumbers[j] = complexNumbers[j + 1];
                        complexNumbers[j + 1] = temp;
                    }
                }
            }
        }
    }
}
