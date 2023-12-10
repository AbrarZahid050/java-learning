import java.util.ArrayList;
import ArrayListCollection.ArrayListCollection;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<ArrayListCollection> items = new ArrayList<>();
        ArrayListCollection myObj1 = new ArrayListCollection();
        ArrayListCollection myObj2 = new ArrayListCollection();

        myObj2.setNumber(100);

        items.add(myObj1);
        items.add(myObj2);

        for (ArrayListCollection object : items) {
            System.out.println(object.getNumber());
        }
    }
}
