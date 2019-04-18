
public class Assignment {

	public static void main(String[] args) {
		DoublyLinkedList m=new DoublyLinkedList ();
		m.add('k');
		m.add('m');
		m.add('n',2);
		m.add('l',2);
		m.add('o',0);
		Dnode head =m.head;
	
		System.out.println(m.get(3));
		DoublyLinkedList.print(head);
		System.out.println();
		System.out.println(m.size());
		if(m.contains('t'))System.out.println("yees");
		else {System.out.println("noo");}
	}

}
