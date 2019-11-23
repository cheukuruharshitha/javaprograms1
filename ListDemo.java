import java.util.*;
public class ListDemo {
	public static void main(String []args)
	{
		ArrayList<String> l1=new ArrayList<>();
		l1.add("java");
		l1.add("sql");
		l1.add("apti");
		System.out.println(l1);
		System.out.println(l1.get(2));
		l1.set(1, "python");
		System.out.println(l1);
		System.out.println(l1.contains("python"));
		Collections.sort(l1);
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);
		for(int i=0;i<l1.size();i++)
		{
		System.out.println(l1.get(i));
		}
	}

}
