package com.example.demo.SeatConfigService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SeatConfigController {
	
	@Autowired
	private SeatConfigService SeatConfigService ;
	
	/*@RequestMapping("/seatconfig")
	public SeatConfig getAll()
	{
		return SeatConfigService.getAll();
		
	}
	*/
	@RequestMapping("/seatconfig/{id}")
	public String getAll(@PathVariable String id)
	{
		return SeatConfigService.getseat(id);
		
	}
	
}


