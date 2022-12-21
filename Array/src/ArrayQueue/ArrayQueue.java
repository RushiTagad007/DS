package ArrayQueue;

public class ArrayQueue {

	public static void main(String[] args) {

		MyUser M = new MyUser(5);

		
		User u1= new User("Rushi",1);
		User u2= new User("Hitesh",2);
		User u3= new User("Rahul",3);
		User u4= new User("Rohan",4);
		
		M.AddUser(u1);
		M.AddUser(u2);
		M.AddUser(u3);
		M.AddUser(u4);
		
		M.showQueue();
		
		M.deleteUser();
		
		M.showQueue();
		
		
		
		
	}

}
