package com.capgemini.core.lpg.view;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.capgemini.core.lpg.beans.GasCylinder;
import com.capgemini.core.lpg.exceptions.LPGException;
import com.capgemini.core.lpg.service.GasCylinderService;
import com.capgemini.core.lpg.service.GasCylinderServiceImpl;

public class Client {
	private GasCylinderService gascylinderService;
	//association
	public Client() {
	gascylinderService = new GasCylinderServiceImpl();
	}
	public void menu(){
		System.out.println("1) Get Cylinder list");
		System.out.println("2) Update the list");
		System.out.println("0) Exit Application");
		Scanner console = new Scanner(System.in);
		System.out.println("Please Select an Option:");
		int choice = console.nextInt();
		switch(choice) {
		case 1:try {
			List<GasCylinder> gascylinders = gascylinderService.getAllCylinders();
			Iterator<GasCylinder> it =gascylinders.iterator();
			System.out.println("Agency Name \tLocation \tCylinderCount");
			while(it.hasNext()) {
				GasCylinder gc = it.next();
				System.out.println(gc.getAgencyname() + "\t" + gc.getLocation() + "\t" +gc.getCylindercount());
			}
		} catch (LPGException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
			break;
		case 2:
			System.out.println("Enter Gas Agency to book cylinder");
			String name = console.next();
			System.out.println("Enter Location of Agency");
			String location = console.next();
			System.out.println("Enter the count of cylinders to be booked");
			int count = console.nextInt();
			try {
			int index=0;
			index = gascylinderService.updateCylinder(name, count);
			//System.out.println(index);
			if(index >=  0)
				System.out.println( "thankyou! Your id is" +gascylinderService.generateId());
			else
				System.out.println("Could not book a gas");
					
			} 
			catch (LPGException e) {
				e.printStackTrace();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 0:System.out.println("Goodbye");
				System.exit(0);
			break;
		default: System.out.println("Invalid Option");
		break;
		}
		
		}
	public static void main(String[] args) {
		Client client = new Client();
		//make sure application runs forever unless you close it
		while(true)
		client.menu();
	}
}
