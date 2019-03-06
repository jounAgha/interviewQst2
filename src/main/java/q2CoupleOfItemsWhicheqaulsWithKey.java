/**
 * <h1>Finding good couple of items</h1>
 *This code find two items in given unordered list which is equal key
 *
 * @author  Aplicant
 * @version 1.0
 */
import java.util.*;

public class q2CoupleOfItemsWhicheqaulsWithKey {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] result = {-1, -1};
        int key = ran.nextInt(20);
        ArrayList<Integer> mainList = new ArrayList<Integer>();
        for (int i = 0; i <= 40; i++)
            mainList.add(ran.nextInt(10));
        q2CoupleOfItemsWhicheqaulsWithKey obj = new q2CoupleOfItemsWhicheqaulsWithKey();
        result = obj.FindbestCouple(mainList, key);
        System.out.print(Arrays.toString(result) + "," + key);
    }

    /*
    find two items in list which is equal key
    @param: unordered list and  a key
    @return: An array with 2 member, there is no couple item if members equal -1
     */
    public int[] FindbestCouple(ArrayList<Integer> l1, int key) {
        Collections.sort(l1);
        int[] result = {-1, -1};
        int i = 0;
        int j = l1.size() - 1;
        int temp;
        while (j >= i) {
            temp = l1.get(i) + l1.get(j);
            if (key == temp) {
                result[0] = l1.get(i);
                result[1] = l1.get(j);
                break;
            }
            if (key < temp)
                j--;
            else if (key > temp)
                i++;
        }

        return result;
    }
}
