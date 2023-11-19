package com.Adept.Java;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StudioGrapheneAssignment {

	public static void main(String[] args) {
				
		int minAge = 16;
        int maxAge = 85;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Date of Birth (yyyy-MM-dd): ");
        String dobStr = scanner.nextLine();
        
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dob = dateFormat.parse(dobStr);
            
            // Calculate the age
            Calendar dobCalendar = Calendar.getInstance();
            dobCalendar.setTime(dob);
            Calendar currentCalendar = Calendar.getInstance();
            currentCalendar.setTime(new Date());
            int age = currentCalendar.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);

            // Check if the age is within the specified range
            if (age < minAge) {
                System.out.println("You must be at least 16 years old.");
            } else if (age > maxAge) {
                System.out.println("You cannot be older than 85 years.");
            } else {
                System.out.println("Age is within the allowed range."); // You can proceed with other actions.
            }
        } catch (Exception e) {
            System.out.println("Invalid Date of Birth format.");
        }
		
		
	}

}
