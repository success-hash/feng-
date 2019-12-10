package yinhang;

import java.util.HashMap;

public class DBUtil {
	private static DBUtil instance = null;
	private HashMap<String,User> users = new HashMap<String,User>();
	
	private DBUtil(){
		
		User u1 = new User();
		u1.setCardId("10081");
		u1.setCardPwd("1111");
		u1.setUserName("小仙女");
		u1.setCall("13243127336");
		u1.setAccount(10000);
		users.put(u1.getCardId(), u1);
		
		User u2 = new User();
		u2.setCardId("10082");
		u2.setCardPwd("2222");
		u2.setUserName("小哥哥");
		u2.setCall("13243127337");
		u2.setAccount(20000);
		users.put(u2.getCardId(), u2);
		
		User u3 = new User();
		u3.setCardId("10083");
		u3.setCardPwd("3333");
		u3.setUserName("小提琴");
		u3.setCall("13243127338");
		u3.setAccount(30000);
		users.put(u3.getCardId(), u3);
	}
	//懒汉式单例模式
	public static DBUtil getInstance(){
		if(instance == null){
			synchronized(DBUtil.class){
				if(instance == null){
					instance = new DBUtil();
				}
			}
		}
		return instance;
	}
	//根据银行卡号获取对应单个账户的信息
	public User getUser(String cardId){
		User user = (User) users.get(cardId);
		return user;
	}
	//获取所有账户的信息
	public HashMap<String, User> getUsers(){
		return users;
	}

}
