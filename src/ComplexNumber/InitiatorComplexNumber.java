package ComplexNumber;

import java.util.Random;

public class InitiatorComplexNumber {
    public static void filList(ComplexCollection collection,int maxValue){
        for (int i=0;i<collection.getSize();i++){
            Random random = new Random();
            int randomNumRe = random.nextInt(maxValue);
            int randomNumIm = random.nextInt(maxValue);

            ComplexNumber complexNumber=new ComplexNumber(randomNumIm,randomNumRe);
            collection.add(i,complexNumber);
        }
    }
}
