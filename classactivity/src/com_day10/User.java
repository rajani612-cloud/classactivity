package com_day10;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class User {

    private String name;
    private Set<String> interests;
    private Set<Integer> mobileNumber;
    private Set<String> mailId;

    public User(String name) {
        this.name = name;
        this.interests = new LinkedHashSet<>();
        this.mobileNumber = new LinkedHashSet<>();
        this.mailId = new LinkedHashSet<>();
    }

    public void addInterest(String interest) {
        if (interests.add(interest)) {
            System.out.println(interest + " added.");
        } else {
            System.out.println(interest + " is already in the list.");
        }
    }

    public void addNumber(int num) {
        if (mobileNumber.add(num)) {
            System.out.println(num + " added.");
        } else {
            System.out.println(num + " is already present.");
        }
    }

    public void addMail(String mailid) {
        if (mailId.add(mailid)) {
            System.out.println(mailid + " added.");
        } else {
            System.out.println(mailid + " is already present.");
        }
    }

    public void showInterests() {
        System.out.println(name + "'s interests in order: " + interests);
        System.out.println("Mobile numbers: " + mobileNumber);
        System.out.println("Mail IDs: " + mailId);
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = ob.nextLine();
        User user = new User(userName);

        System.out.println("Enter your interests (type 'done' to finish):");
        while (true) {
            System.out.print("Interest: ");
            String interest = ob.nextLine();
            if (interest.equalsIgnoreCase("done")) {
                break;
            }
            user.addInterest(interest);
        }

        System.out.print("Enter your mail ID: ");
        String mailid = ob.nextLine();
        user.addMail(mailid);

        System.out.print("Enter your mobile number: ");
        int num = ob.nextInt();
        user.addNumber(num);

        user.showInterests();
        ob.close();
    }
}

