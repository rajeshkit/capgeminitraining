package com.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Player;

@Controller
public class PlayerController {
	@RequestMapping(value = "/")
	@ResponseBody
	public String welcome() {
		return "welcome to player";
	}
	
	@RequestMapping(value = "/player", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Player player() {
		return new Player(7,"Dhoni","CSK");
	}
	@RequestMapping(value = "/playerxml", produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public Player playerXml() {
		return new Player(7,"Dhoni","CSK");
	}
	@RequestMapping(value = "/players", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Player> players() {
		return Arrays.asList(new Player(7,"Dhoni","CSK"),
				new Player(24,"Rohit","MI"),
				new Player(10,"Kholi","RC"));
	}
	@RequestMapping(value = "/playersxml", produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public List<Player> playersXml() {
		return Arrays.asList(new Player(7,"Dhoni","CSK"),
				new Player(24,"Rohit","MI"),
				new Player(10,"Kholi","RC"));
	}
}
