package com.cts.ms.location.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ms.location.bl.LocationConfigBL;
import com.cts.ms.location.bo.ExceptionBO;
import com.cts.ms.location.bo.LocationConfigBO;
import com.cts.ms.location.bo.LocationConfigs;
import com.cts.ms.location.constants.LocationConfigStatus;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RefreshScope
@RestController
@RequestMapping("/location")
@Api(value = "Location", description = "Operations pertaining to Location")
public class LoctionConfigController {

	@Autowired
	@Qualifier("springManagedLocationConfigBL")
	private LocationConfigBL locationConfigBL;

	@CrossOrigin
	@ApiOperation(value = "View Something the Specific info of the product", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "All Configurations Fetched Successfully", response = List.class),
			@ApiResponse(code = 500, message = "Error Fetching the reponse", response = ExceptionBO.class) })
	@RequestMapping(value = "/config", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> getAllConfig() throws Exception {
		LocationConfigs lconfigs = new LocationConfigs();
		lconfigs.getLocations().addAll(locationConfigBL.getAllLocationConfig());
		return new ResponseEntity<LocationConfigs>(lconfigs, HttpStatus.OK);

	}

}
