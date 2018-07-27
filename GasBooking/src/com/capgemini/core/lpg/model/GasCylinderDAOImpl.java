package com.capgemini.core.lpg.model;

import java.util.List;
import com.capgemini.core.lpg.util.DBUtil;

import com.capgemini.core.lpg.beans.GasCylinder;
import com.capgemini.core.lpg.exceptions.LPGException;

public class GasCylinderDAOImpl implements GasCylinderDAO {
	private List<GasCylinder> gascylinders;
	private DBUtil dbUtil = new DBUtil();

	
	//GasCylinder obj = new GasCylinder();
	

	public GasCylinderDAOImpl() {
		gascylinders = dbUtil.getGascylinders();
		// TODO Auto-generated constructor stub
}
	

	@Override
	public int updateCylinder(String str,int c) throws LPGException {
		int index = gascylinders.indexOf(new GasCylinder(str));
		//System.out.println(index);
		GasCylinder ind = gascylinders.get(index);
		if(index != -1)
		{
			int oldcount = ind.getCylindercount();
			//System.out.println(oldcount);
			if(c<=oldcount) {
				oldcount-=c;
				ind.setCylindercount(oldcount);	
			}
			else
				throw new LPGException("Not Valid");
			
		}
		else
			System.out.println("Required Agency is unavialble");
	
return  ind.getCylindercount();
	}

	@Override
	public List<GasCylinder> getAllCylinders() throws LPGException {
		// TODO Auto-generated method stub
		return gascylinders;
	}

}
