import java.util.*;
class Maker{
	String name;
	int lowest, highest;
}
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int tests = sc.nextInt();
	while(tests-->0) {
		TreeMap<Integer, Maker> tree = new TreeMap<Integer, Maker>();
		tree.clear();
		int data = sc.nextInt();
		for(int i=0; i<data; i++) {
			Maker m = new Maker();
			m.name=sc.next();
			m.lowest=sc.nextInt();
			m.highest=sc.nextInt();
			tree.put(i, m);
		}
		int q = sc.nextInt();
		int count=0;
		String manufacturer="";
		while(q-->0) {
			int n = sc.nextInt();
			for (int i=0; i<tree.size(); i++) {
				if(n>=tree.get(i).lowest&&n<=tree.get(i).highest) {
					if(count==0) {
						count++;
						manufacturer= tree.get(i).name;
					}else {
						count++;
						break;
					}
				}
			}
			if(count==1) {
				System.out.println(manufacturer);
			}else {
				System.out.println("UNDETERMINED");
			}
			count=0;
			manufacturer="";
		}
		if(tests>1) {
			System.out.println();
		}
	}
}
}
