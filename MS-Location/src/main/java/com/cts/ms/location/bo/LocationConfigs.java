package com.cts.ms.location.bo;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LOCATIONS")
public class LocationConfigs {
	
	private ArrayList<LocationConfigBO> locations=new  ArrayList<LocationConfigBO>();

	public ArrayList<LocationConfigBO> getLocations() {
		return locations;
	}

	public void setLocations(ArrayList<LocationConfigBO> locations) {
		this.locations = locations;
	}
}
