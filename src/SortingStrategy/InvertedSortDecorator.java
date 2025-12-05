package SortingStrategy;

import ComplexNumber.ComplexNumber;

public class InvertedSortDecorator implements ISorting{
    private ISorting sortStrategy;

    public void InvertedSortDecorator(ISorting sortStrategy){
        this.sortStrategy=sortStrategy;
    }

    public void sort(ComplexNumber[] complexNumbers,int size){
        sortStrategy.sort(complexNumbers,size);
        for (int i=0;i<size;i++){
            ComplexNumber oldValue=complexNumbers[i];
            complexNumbers[i]=complexNumbers[size-i-1];
            complexNumbers[size-0-1]=oldValue;
        }
    }
}
