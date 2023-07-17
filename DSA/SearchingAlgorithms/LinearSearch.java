public class LinearSearch {
	
	public static void main(String args[]) {
		int searchArray[]= {1,2,11,34,56,76,43,21,211,12,1234};
		Integer searchElement = 12;
		
		linearSearch(searchArray,searchElement);
	}
	private static void linearSearch(int searchArray[], Integer searchElement) {
		
		for(int i=0; i<searchArray.length;i++) {
		   if(searchElement.equals(searchArray[i])) {
			   System.out.println("Found at index : "+ i );
		   }
		}
	}
}
