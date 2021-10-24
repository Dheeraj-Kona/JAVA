 class LinkedList {

	Node head; 

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	//INSERTION OPERATION
	public static LinkedList insert(LinkedList list, int data)
	{
		Node new_node = new Node(data);
		new_node.next = null;
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	//DISPLAY OPERATION
	public static void printList(LinkedList list)
	{
		Node currNode = list.head;
	
		System.out.print("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}
	//DELETE BY KEY AND TRAVERSING THROUGH LINKED LIST
	public static LinkedList deleteByKey(LinkedList list,
	int key)
{

Node currNode = list.head, prev = null;
if (currNode != null && currNode.data == key) {
list.head = currNode.next; // Changed head
System.out.println(key + " found and deleted");
return list;
}
while (currNode != null && currNode.data != key) {
prev = currNode;
currNode = currNode.next;
}
if (currNode != null) {
prev.next = currNode.next;
System.out.println(key + " found and deleted");
}
if (currNode == null) {

System.out.println(key + " not found");
}

return list;
}
public static LinkedList deleteAtPosition(LinkedList list, int index)
{
	Node currNode = list.head, prev = null;
	if (index == 0 && currNode != null) {
		list.head = currNode.next; 
		System.out.println(
			index + " position element deleted");
		return list;
	}
	int counter = 0;
	while (currNode != null) {

		if (counter == index) {
			prev.next = currNode.next;
			System.out.println(
				index + " position element deleted");
			break;
		}
		else {
			prev = currNode;
			currNode = currNode.next;
			counter++;
		}
	}
	if (currNode == null) {
		System.out.println(
			index + " position element not found");
	}
	return list;
}
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		//INSERTING ELEMENTS
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		printList(list);
		System.out.println();
		//DELETEING BY KEY
		deleteByKey(list, 1);	
        printList(list);
		System.out.println();
		//DELETING BY POSITION
        deleteAtPosition(list, 2);
        printList(list);
		System.out.println();
		//DELETE OPERATION IF POSITION OR KEY 
        deleteByKey(list, 10);
        printList(list);
	}
}
