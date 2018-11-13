import java.rmi.*;

public class AdditionClient {

	public static void main (String[] args) {

    AdditionInterface hello;

    try {

      System.setSecurityManager(new RMISecurityManager());

      // Registry registry = LocateRegistry.createRegistry(1098);

      hello = (AdditionInterface)Naming.lookup("rmi://localhost/RMIServer");

      int result = hello.add(9,10);

      System.out.println("Result is :" + result);

		} catch (Exception e) {

			System.out.println("HelloClient exception: " + e);

		}
	}
}
