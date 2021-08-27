package dir;
abstract class human
{
	public abstract void eat();
	public void walk()
	{
		System.out.println("in walk");
	}
	
}
class man extends human
{
	public void eat()
	{
		System.out.println("in eat");
	}
	
}
public class abst {

	public static void main(String[] args) {
		human obj=new man();
		obj.eat();

	}

}
