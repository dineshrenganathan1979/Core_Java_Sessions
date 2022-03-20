import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingComparator {

	public static void main(String[] args) {


		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell", 8, 800));
		laps.add(new Laptop("Apple", 16, 1000));
		laps.add(new Laptop("Acer", 16, 700));
		
		PriceComparator comp = new PriceComparator();
		Collections.sort(laps, comp);
		for(Laptop l: laps) {
			System.out.println(l.getPrice());
		}
      
      
      
	}

}

class PriceComparator implements Comparator<Laptop>
{
    public int compare(Laptop l1, Laptop l2)
    {
        if (l1.getPrice() < l2.getPrice()) return -1;
        if (l1.getPrice() > l2.getPrice()) return 1;
        else return 0;
    }
}
