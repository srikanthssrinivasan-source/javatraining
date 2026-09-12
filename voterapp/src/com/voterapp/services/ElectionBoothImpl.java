package com.voterapp.services;

import com.voterapp.exceptions.LocalityNotFoundException;
import com.voterapp.exceptions.NotEligibleException;
import com.voterapp.exceptions.UnderAgeException;
import com.voterapp.exceptions.VoterIdNotFoundException;

public class ElectionBoothImpl implements IElectionBooth {

	@Override
	public boolean checkEligibility(int age, String locality, long voterID) throws NotEligibleException {
		if (checkAge(age) && checkLocality(locality) && checkVoterId(voterID)) {
			return true;
		}
		return false;
	}
	
	private boolean checkAge(int age) throws UnderAgeException {
		//if age < 18 throw exception
		if(age < 18) {
			throw new UnderAgeException("You are under age");
		}
		return true;
	}
	
	private boolean checkLocality(String locality) throws LocalityNotFoundException{
		
		String[] localities = new String[] {"Madhapur","HitechCity","Durgam Cheruvu"};
		
		for(String loc:localities) {
			if(loc.equalsIgnoreCase(locality)) {
				return true;
			}
		}
		throw new LocalityNotFoundException("You location is not under this booth");
		//check if locality is same. If not then exception
		
	}
	
	private boolean checkVoterId(long voterId) throws VoterIdNotFoundException{
		//check if id is between 1000-10000 if not throw exception
		if(voterId >= 1000 && voterId <= 10000) {
			return true;
		}
		throw new VoterIdNotFoundException("Invalid Voter ID");
	}

}
