
class SingletonInheritanceCheck{
	private static SingletonInheritanceCheck sInstance = null;
    public String m;
	private SingletonInheritanceCheck()
	{
		m = "Singleton Test";
	}
	public static SingletonInheritanceCheck getInstance()
	{
		if (sInstance == null)
		sInstance = new SingletonInheritanceCheck();
		return sInstance;
	}
}
public class ASSIGNMENTQ1 {
	public static void main(String[] args) {
		SingletonInheritanceCheck ob = SingletonInheritanceCheck.getInstance();
		System.out.println(ob.m);
		}
	}


