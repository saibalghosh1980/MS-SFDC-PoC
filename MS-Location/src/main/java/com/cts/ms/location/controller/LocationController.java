package com.cts.ms.location.controller;

import java.util.List;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ms.location.bo.ExceptionBO;
import com.cts.ms.location.bo.LocationBO;
import com.cts.ms.location.bo.LocationConfigs;
import com.cts.ms.location.bo.Locations;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RefreshScope
@RestController
@RequestMapping("/location")
@Api(value = "Location", description = "Operations pertaining to Location")
public class LocationController {

	@CrossOrigin
	@ApiOperation(value = "Search locationby status", response = Locations.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Locations by Status fetched Successfully", response = Locations.class),
			@ApiResponse(code = 500, message = "Error Fetching the reponse", response = ExceptionBO.class) })
	@RequestMapping(value = "/searchByStatus", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> getAllLocationsByStatus(@RequestParam String status) throws Exception {
		try {
			Locations matchedLocations = new Locations();
			return new ResponseEntity<Locations>(matchedLocations, HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

	@CrossOrigin
	@ApiOperation(value = "Update Location Status", response = LocationBO.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Location Status Updated Successfully", response = LocationBO.class),
			@ApiResponse(code = 500, message = "Error Fetching the reponse", response = ExceptionBO.class) })
	@RequestMapping(value = "/{locId}/changeStatus", method = RequestMethod.PUT, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> changeStatus(@PathVariable String locId, @RequestParam String status) throws Exception {
		try {
			LocationBO updatedLocation = new LocationBO();
			return new ResponseEntity<LocationBO>(updatedLocation, HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}
}