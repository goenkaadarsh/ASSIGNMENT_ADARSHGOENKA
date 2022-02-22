abstract class Persistence{
	abstract public String persist();
}
class FilePersistence extends Persistence{

	@Override
	public String persist() {
		return "File Persistence Method";
	}
}
class DataBasePersistence extends Persistence{

	@Override
	public String persist() {
		return "Data Base Persistence Method";
	}
}
class Client {
	public static Persistence getPersistence()
	{
		return new FilePersistence();
		//return new DataBasePersistence();
	}

	
}
public class ASSIGNMENTQ6 {
	public static void main(String[] args)
	{
		Persistence Persis = Client.getPersistence();
		System.out.println(Persis.persist());
	}

}
