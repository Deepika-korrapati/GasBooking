package com.capgemini.core.lpg.service;

import java.util.List;

import com.capgemini.core.lpg.beans.GasCylinder;
import com.capgemini.core.lpg.exceptions.LPGException;

public interface GasCylinderService {
	public int updateCylinder(String str,int c)throws LPGException;
	public List<GasCylinder> getAllCylinders() throws LPGException;
	public int generateId()  throws LPGException;
	boolean isValid(String str, int c) throws LPGException;


}
