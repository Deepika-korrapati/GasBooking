package com.capgemini.core.lpg.service;

import java.util.List;

import com.capgemini.core.lpg.beans.GasCylinder;
import com.capgemini.core.lpg.exceptions.LPGException;
import com.capgemini.core.lpg.model.GasCylinderDAO;
import com.capgemini.core.lpg.model.GasCylinderDAOImpl;

public class GasCylinderServiceImpl implements GasCylinderService {
	private GasCylinderDAO gasDAO;
	private int gasId=100;
	public GasCylinderServiceImpl() {
		//association
	gasDAO = new GasCylinderDAOImpl();
	}
	public int generateId() {
		return ++gasId;
		}

	@Override
	public int updateCylinder(String str,int c) throws LPGException {
		int availablecount=0;
		if(isValid(str,c))
			availablecount=gasDAO.updateCylinder(str, c);
		return availablecount;
		
	}
	

	@Override
	public List<GasCylinder> getAllCylinders() throws LPGException {
		List<GasCylinder> gascylinders = null;
		gascylinders = gasDAO.getAllCylinders();
		return gascylinders;
	}

	@Override
	public boolean isValid(String str,int c) throws LPGException {
		// TODO Auto-generated method stub
		return true;
	}

}
