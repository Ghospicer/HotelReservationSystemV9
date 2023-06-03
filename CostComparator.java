import java.util.Comparator;

public class CostComparator implements Comparator<Services>{

	public CostComparator() {
		
		
	}	

	@Override
	public int compare(Services o1, Services o2) {
		
		if (o1.getCost()<o2.getCost()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
