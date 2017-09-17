package com.cts.ms.location.bo;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LOCATIONS")
public class Locations {
	private ArrayList<LocationBO> locations = new ArrayList<LocationBO>();

	public ArrayList<LocationBO> getLocations() {
		return locations;
	}

	@XmlElement(name="LOCATION")
	public void setLocations(ArrayList<LocationBO> locations) {
		this.locations = locations;
	}
	
	
}