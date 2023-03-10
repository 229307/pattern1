import java.util.*;
public class LambdaLoop
{
	public static void main(String args[])
	{	
		List<Integer>student1=new ArrayList<Integer>();
		student1.add(50);
		student1.add(60);
		student1.add(70);
		student1.add(80);
		student1.add(90);		
		System.out.println("The marks of each subject of student1:");
		student1.forEach((x)->System.out.println(x));

		List<Integer>student2=new ArrayList<Integer>();
		student2.add(90);
		student2.add(80);
		student2.add(70);
		student2.add(60);
		student2.add(50);		
		System.out.println("The marks of each subject of student2:");
		student2.forEach((x)->System.out.println(x));
	}
};

