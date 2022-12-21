package ArrayQueue;

public class User {

	private String UserName;
	private int UserId;
	
	
	public User(String userName, int userId) {
	
		UserName = userName;
		UserId = userId;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public int getUserId() {
		return UserId;
	}


	public void setUserId(int userId) {
		UserId = userId;
	}


	@Override
	public String toString() {
		return "User [UserName=" + UserName + ", UserId=" + UserId + "]";
	}
	
	
}
