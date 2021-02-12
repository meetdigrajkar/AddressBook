package webAPP.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class AddressBook {

	private List<BuddyInfo> buddies = new ArrayList<BuddyInfo>();
	private Long id;
    private String name;
    
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	public List<BuddyInfo> getBuddies() {
		return buddies;
	}

	public void setBuddies(List<BuddyInfo> buddies) {
		this.buddies = buddies;
	}
	
	public void addBuddy(BuddyInfo newBuddy)
	{
		if (newBuddy != null)
		{
			buddies.add(newBuddy);
		}
	}
	public void removeBuddy(int index)
	{
		if(index >= 0 && index < buddies.size())
		{
			buddies.remove(index);  
		}
	}
	public void clear()
	{
		while(buddies.size() > 0)
		{
			removeBuddy(0);
		}
	}
	public int size()
	{
		return buddies.size();
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo meet = new BuddyInfo();
		meet.setAll("meet","101041284","meetdigrajkar@cmail.carleton.ca", "my house");
		BuddyInfo puneet = new BuddyInfo("Puneet");

		AddressBook book = new AddressBook();
		
		book.addBuddy(meet);
		book.addBuddy(puneet);

		System.out.println("Address book contains: " + book.getBuddies());

	}
	   public String getName() {
	        return name;
	    }
	 public void setName(String name) {
	        this.name = name;
	    }
}
