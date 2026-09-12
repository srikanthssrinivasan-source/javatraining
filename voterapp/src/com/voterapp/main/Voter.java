package com.voterapp.main;

import com.voterapp.exceptions.LocalityNotFoundException;
import com.voterapp.exceptions.NotEligibleException;
import com.voterapp.exceptions.UnderAgeException;
import com.voterapp.exceptions.VoterIdNotFoundException;
import com.voterapp.services.ElectionBoothImpl;
import com.voterapp.services.IElectionBooth;


public class Voter {

	public static void main(String[] args) {

		IElectionBooth electionbooth = new ElectionBoothImpl();
		try {
			boolean iseligible = electionbooth.checkEligibility(18, "HitechCity", 1000);
			if(iseligible) {
				System.out.println("You are eligible to vote");
			}
		}catch (UnderAgeException  | LocalityNotFoundException | VoterIdNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		catch (NotEligibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
