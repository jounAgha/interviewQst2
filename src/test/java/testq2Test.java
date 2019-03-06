import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class testq2Test {
    @Test
    public void q2Test() {

        q2CoupleOfItemsWhicheqaulsWithKey obj=new q2CoupleOfItemsWhicheqaulsWithKey();
        ArrayList<Integer> testList=new ArrayList<Integer>();
        int[] numbers={5,56,78,5,78,34,15,7};
        int key=20;
        int[] actual={5,15};
        int[] result={-1,-1};

        for(int element:numbers)
            testList.add(element);
        result =obj.FindbestCouple(testList,key);
        Assert.assertArrayEquals(actual,result);
    }

}