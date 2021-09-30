public class SortingTechnique {
	public static void sorter(Shape shapes[]) {
		Shape holder;
		Shape front;
		for(int i=1; i < 6; i++) {
			for(int j=0; j  < i; j++) {
				if(shapes[i].compareTo(shapes[j]) < 0) {
					front = shapes[i]; 
					for(int k=j; k <= i; k++) {
						holder = shapes[k];
						shapes[k] = front;
						front = holder;
					}
					break;
				}
			}
			
		}
		
	}
}
