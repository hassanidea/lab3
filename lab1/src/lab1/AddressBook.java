package lab1;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	private List<BuddyInfo> buddyInfos;
	
	public AddressBook() {
		this.buddyInfos = new ArrayList<>();
	}
	
	
	
	public void addBuddy(BuddyInfo bi){
		this.buddyInfos.add(bi);
	}
	
	public void removeBuddy(int index){
		this.buddyInfos.remove(index);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Address Book");
		System.out.println("yes");
		
		AddressBook ab = new AddressBook();
		
		BuddyInfo bi = new BuddyInfo("Hassan","Hassan", 12345678);
		
		ab.addBuddy(bi);
		
		ab.removeBuddy(0);
		
		
	}

}
