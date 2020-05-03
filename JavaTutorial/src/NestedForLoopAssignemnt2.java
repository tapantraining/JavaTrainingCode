
public class NestedForLoopAssignemnt2 {

	public static void main(String[] args) {
		//char ch = 'A';
		int num=65;
		for(int i = 0;i<3;i++)
		{
		  for(int j=0;j<=i;j++)
		  {
			char ch = (char)(num+j);
		   System.out.print(ch);
		  }
		  System.out.println();
		}

	}

}
