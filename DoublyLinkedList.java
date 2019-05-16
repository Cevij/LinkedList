package lab5;


public class DoublyLinkedList <Generic>{
	private DLNode firstNode;
	private DLNode lastNode;
	private int numberOfNodes;
	
	public DoublyLinkedList() {
		firstNode=null;
		lastNode=null;
		numberOfNodes=0;
		
	}
	private class DLNode
	{
		private Generic data;
		private DLNode first;
		private DLNode last;
		private DLNode(Generic dataPortion)
		{
			this(dataPortion,null,null);
		}
	private DLNode(Generic dataPortion, DLNode firstNode, DLNode lastNode)
		{
			this.data=dataPortion;
			this.first=firstNode;
			this.last=lastNode;
		}
	}
	
	public boolean addFirst(Generic newEntry) {
		DLNode newNode=new DLNode(newEntry);
		newNode.first=firstNode;
		firstNode=newNode;
		numberOfNodes++;
		return true;
		
	}
	
	public boolean addLast(Generic newEntry) {
		DLNode newNode=new DLNode(newEntry);
		newNode.last=lastNode;
		lastNode=newNode;
		numberOfNodes++;
		return true;
		
	}
	public boolean isEmpty() {
		
		
		return firstNode==null||lastNode==null;
	}
	
	public Generic removeFirst()
	{
		Generic result=null;
		if(firstNode !=null)
		{
			result=firstNode.data;
			firstNode=firstNode.first;
			numberOfNodes--;
		}
		return result;
	}
	
	public Generic removeLast()
	{
		Generic result=null;
		if(lastNode !=null)
		{
			result=lastNode.data;
			lastNode=lastNode.last;
			numberOfNodes--;
		}
		return result;
	}
	public boolean searchRemove(Generic newEntry)
	{
		boolean found=false;
		
			if(newEntry.equals(firstNode.data))
			{	
				found=true;
				removeFirst();
			}	
		
		return found;
	}
	
	public int getNumberOfEntries() {
		
		return numberOfNodes;
	}
	

}