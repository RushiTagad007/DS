package ArrayQueue;

public class MyUser {

	   
        User MyUsers[];
        int index;
     	public MyUser(int Size) {
		MyUsers = new User [Size] ;
	}
     	void AddUser (User NewUser) {
     		if(index<MyUsers.length) {
         	  if(MyUsers[index]==null) {
     		  
     		  System.out.println("Adding User");
     		  MyUsers[index]=NewUser;
     		  index++;
     		  
     		  
     	  }
 
     		
     	}else {
     		System.out.println("Queue is fullcant cant Users");
     	}
}
     	
     	void showQueue() {
     	
     		try {
				for(int i=0;i<MyUsers.length;i++) {

					
					System.out.println(MyUsers[i].toString());
				}
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
			     System.out.println("You can add more user");
			}
     		
     		
     	}
     	User[] MyUsers2 = new User[index];
     	int	deleteindex=0;
     	
     	void deleteUser() {
     		
        	
        	if(deleteindex<=index)
     		System.out.println("Deleted the User"+MyUsers[deleteindex].toString());
                  for(int i=0;i<=index+2;i++) {
                	  MyUsers[i]=MyUsers[i+1];
                  }
        	deleteindex++;
        	
     	
     		System.out.println("Learning Git ");
     	}
}
