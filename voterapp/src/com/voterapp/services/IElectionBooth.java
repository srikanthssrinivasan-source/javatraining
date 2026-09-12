package com.voterapp.services;

import com.voterapp.exceptions.NotEligibleException;

public interface IElectionBooth {

	boolean checkEligibility(int age, String locality, long voterID) throws NotEligibleException;
}
