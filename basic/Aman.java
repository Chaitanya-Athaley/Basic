package com.basic;

public interface Aman {
	
	//Ex
	public String girlFriend();
	
	public default void girlFriendSister(){
		System.out.println("girlFriendSister of Aman");
	}
	
	public static void girlFriendColour(){
		System.out.println("girlFriend Color is light yellow  (Aman)");
	}
}
