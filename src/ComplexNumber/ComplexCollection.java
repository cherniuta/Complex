package ComplexNumber;

import SortingStrategy.ISorting;

public class ComplexCollection {
    private int  size;
    private ComplexNumber[] complexNumber;

    public ComplexCollection(int size){
        this.size=size;
        complexNumber=new ComplexNumber[size];
    }

    public int getSize(){
        return this.size;
    }

    public void sort(ISorting iSorting){
        iSorting.sort(complexNumber,this.size);

    }

    public void add(int index,ComplexNumber value){
        complexNumber[index]=value;
    }


}
