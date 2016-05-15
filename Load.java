import java.util.*;
public class Load {
	public static void main(String args[]){
		ArrayList<Packet> list = new ArrayList<Packet>();
		Scanner s = new Scanner(System.in);
		System.out.println("LOAD SHEDDING!!");
		boolean done = false;
		int ch;
		while(!done){
			System.out.println("\n1) Put packet\n2) Discard packet\n"+
		           "3) Display packets\n4) exit\n");
			System.out.println("enter your choice : ");
			ch = s.nextInt();
			switch(ch){
				case 1: 
					System.out.print("enter sequence no. : ");
					int seq_no = s.nextInt();
					System.out.print("enter priority : ");
					int priority = s.nextInt();
					Packet p = new Packet(seq_no,priority);
					list.add(p);
					break;
				case 2:
					Packet min_pac = list.get(0);
					for(Packet pac:list) {
						if(pac.priority < min_pac.priority){
							min_pac = pac;
						}
					}
					System.out.println("Packet with seq_no "+min_pac.seq_no+" is discarded");
					list.remove(min_pac);
					break;
				case 3:
					System.out.println("Seq_no	priority");
					for(Packet pac: list){
						System.out.println(pac.seq_no+"	"+pac.priority);
					}
					break;
				case 4:
					done = true;					
			}
		}
	}
}

class Packet
{
	int seq_no;
	int priority;
	Packet(int seq_no,int priority){
		this.seq_no = seq_no;
		this.priority = priority;
	}
}


