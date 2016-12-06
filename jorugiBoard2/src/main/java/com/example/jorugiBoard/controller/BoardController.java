package com.example.jorugiBoard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.jorugiBoard.model.JorugiTable;
import com.example.jorugiBoard.service.JorugiService;

@Controller
public class BoardController {
	
	@Autowired
	private JorugiService jorugiService;


	@RequestMapping(value="/board", method = RequestMethod.GET)
    public String jorugi() {		
    	return  "hello";
    }
	
	@RequestMapping(value="/api/moveJorugiBoard", method = RequestMethod.GET)
    public String moveJorugiBoard() {		
    	return  "board/board_main";
    }
	
	@ResponseBody
	@RequestMapping(value="/api/jorugi", method = RequestMethod.POST)
    public List<JorugiTable> getJorugiTableList() {		
		System.out.println("getJorugiTableList");
		List<JorugiTable> jorugiTableList = jorugiService.getJorugiAll();
		return jorugiTableList;	
    }	

}

