package lab5;

public class DoublyLinkDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		DoublyLinkedList test=new DoublyLinkedList<>();
	
		String test1= "he";
		
		while(test.getNumberOfEntries()<5)
		{
		System.out.println(test.addFirst(test1));
		System.out.println(test.addLast(test1));
		}
		System.out.println(test.getNumberOfEntries());
		
		System.out.println(test.removeFirst());
		System.out.println(test.removeFirst());
		System.out.println(test.removeLast());
		
		System.out.println(test.getNumberOfEntries());
		

		if(test.isEmpty()) {
			System.out.println("The link list is empty");
		}
		
		while(test.getNumberOfEntries()>0)
		{
		System.out.println(test.removeFirst());
		System.out.println(test.removeLast());
		}
		
		if(test.isEmpty()) {
			System.out.println("The link list is empty");
		}
		
		System.out.println(test.getNumberOfEntries());
		
		while(test.getNumberOfEntries()<5)
		{
			System.out.println(test.addFirst(test1));
			System.out.println(test.addLast(test1));
		}
		
		System.out.println(test.getNumberOfEntries());
		
		
		System.out.println(test.searchRemove(test1));
		
		
		System.out.println(test.getNumberOfEntries());
		
		
	}

}