
public class SwitchStatement {

	public static void main(String[] args) {
		int n=3;
		switch(n)
		{
		case 1:
			System.out.println("one");
			break; //if break is not used the  it will print 2two and three
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("Three");
		}
		char ch = 'A';
		switch(ch)
		{
		case 'A':
			System.out.println("A");
			break; //if break is not used the  it will print 2two and three
		case 'B':
			System.out.println("B");
			break;
		default:
			System.out.println("None");
		}
     String str = "abc";
     switch(str)
		{
		case "abc":
			System.out.println("abc");
			break; //if break is not used the  it will print 2two and three
		default:
			System.out.println("def");
		}
	}

}
