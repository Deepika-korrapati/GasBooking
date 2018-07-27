package com.capgemini.core.lpg.model;

import java.util.List;

import com.capgemini.core.lpg.beans.GasCylinder;
import com.capgemini.core.lpg.exceptions.LPGException;

public interface GasCylinderDAO {
	
	public int updateCylinder(String str,int c)throws LPGException;
	public List<GasCylinder> getAllCylinders() throws LPGException;

}
