package com_day10;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class SocialNetworkingUser {
      private String name;
	    private Set<String> interests;

	    public SocialNetworkingUser(String name) {
	        this.name = name;
	        this.interests = new HashSet<>();
	    }

	    public void addInterest(String interest) {
	        if (interests.add(interest)) {
	            System.out.println(interest + " added.");
	        } else {
	            System.out.println(interest + " is already in the list.");
	        }
	    }

	    public void showInterests() {
	        System.out.println(name + "'s interests: " + interests);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String userName = scanner.nextLine();
	        SocialNetworkingUser user = new SocialNetworkingUser(userName);

	        System.out.println("Enter your interests (type 'done' to finish):");
	        while (true) {
	            System.out.print("Interest: ");
	            String interest = scanner.nextLine();
	            if (interest.equalsIgnoreCase("done")) {
	                break;
	            }
	            user.addInterest(interest);
	        }

	        user.showInterests();
	        scanner.close();
	    }
	}


