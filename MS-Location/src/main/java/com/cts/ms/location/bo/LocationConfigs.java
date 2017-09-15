package com.cts.ms.location.bo;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LOCATIONCONFIGS")
public class LocationConfigs {

	private ArrayList<LocationConfigBO> locations = new ArrayList<LocationConfigBO>();

	public ArrayList<LocationConfigBO> getLocations() {
		return locations;
	}

	@XmlElement
	public void setLocations(ArrayList<LocationConfigBO> locations) {
		this.locations = locations;
	}
}
