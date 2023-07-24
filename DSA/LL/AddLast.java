import java.io.*;
class LL{
	Node  head;
	class Node{
		String data;
		Node next;

		public Node(String data){
			this.data = data;
			this.next = null;	
		}

	}

	public Node createNode(){
		System.out.print("Enter the data : ");
		String data = null;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			data= br.readLine();
		}catch(IOException e){
		
		}
		
		Node newNode = new Node(data);
		return newNode;
	}
	public void addFirst(){

		Node newNode = createNode();
		if(head  == null){
			head = newNode;
			return;	
		}

		newNode.next = head;
		head = newNode;
	
	}

	public void addLast(){
	
		Node newNode = createNode();
		if(head == null){
			head = newNode;
			return;
		}

		Node temp = head;

		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void  printll(){
		if(head == null){
			System.out.println("Empty LL");
			return;
		}
		Node temp = head;
		while(temp.next != null){
			System.out.print("["+temp.data+"]->");
			temp = temp.next;
		}
		System.out.print("["+temp.data+"]\n");
	
	}
	public static void main(String[] args) throws IOException{
		LL list = new LL();
		char ans = 'y';
		while(ans != 'n' || ans != 'N'){
			System.out.println("Enter your choice : \n 1.Add Node at first \n 2.Add Node at last \n 3.Print ll");
			int choice = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
		 	switch(choice){
	 			case 1 :
					list.addFirst();
					break;
				case 2 :
					list.addLast();
					break;
				case 3 :
					list.printll();
					break;
				default :
					System.out.println("Invalid Choice");
		 
			}
			System.out.println("Want to perform more operations ?");
			ans = (char)br.read();	
		}
	}
}
