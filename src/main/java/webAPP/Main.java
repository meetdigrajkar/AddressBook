package webAPP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import webAPP.Models.*;

@SpringBootApplication
public class Main {

	private static final Logger log = LoggerFactory.getLogger(Main.class);


	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Bean
	public CommandLineRunner demo(repo repository) {
		return (args) -> {
			// save a few customers
			BuddyInfo meet = new BuddyInfo();
			meet.setAll("Meet","123-123-1234","meetdigrajkar@cmail.carleton.ca", "my house");
			BuddyInfo friend = new BuddyInfo("Friend");

			AddressBook a1 = new AddressBook();

			a1.addBuddy(meet);
			a1.addBuddy(friend);
			a1.setName("CoolBook");
			
			BuddyInfo MEMER = new BuddyInfo();
			BuddyInfo otherFriend = new BuddyInfo("Other Friend");

			AddressBook a2 = new AddressBook();
			
			a2.addBuddy(MEMER);
			a2.addBuddy(otherFriend);

			repository.save(a1);
			repository.save(a2);
		};
	}

}

