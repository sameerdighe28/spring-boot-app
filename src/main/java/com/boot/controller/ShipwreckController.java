package com.boot.controller;

import java.util.List;
import com.boot.model.Shipwreck;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {
	
	@RequestMapping(value = "shipwreck", method = RequestMethod.GET)
	public List<Shipwreck> list(){
		return null;
		
	}

}
