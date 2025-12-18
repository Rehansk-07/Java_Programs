
interface NIT
{
	String myInterface();
}
public class Test {
	public static void main(String[] args) {
		NIT nit = () -> {return "NareshITechnologies";};
		System.out.println(nit.myInterface());
	}
}