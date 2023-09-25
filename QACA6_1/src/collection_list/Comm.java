package collection_list;

import java.util.Comparator;

public class Comm implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.comm>e2.comm) {
			return 1;
		}
		else if(e1.comm<e2.comm) {
			return -1;
		}
		else
			return 0;
	}
	
}
