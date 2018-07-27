package com.capgemini.core.lpg.util;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.core.lpg.beans.GasCylinder;

public class DBUtil {
	private List<GasCylinder> gascylinders = new ArrayList<GasCylinder>();
	{
	gascylinders.add(new GasCylinder("Jyoti","Mumbai",45));
	gascylinders.add(new GasCylinder("Hp","Pune",12));
	gascylinders.add(new GasCylinder("NewHp","chennai",34));

	
}
	public List<GasCylinder> getGascylinders() {
		return gascylinders;
	}
	public void setGascylinders(List<GasCylinder> gascylinders) {
		this.gascylinders = gascylinders;
	}
}