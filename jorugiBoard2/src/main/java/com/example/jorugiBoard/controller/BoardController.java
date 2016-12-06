package com.example.jorugiBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	
//	@Autowired
//	private JorugiService jorugiService;
//	
	@RequestMapping(value="/board", method = RequestMethod.GET)
    public String jorugi() {		
    	return  "hello";
    }
	
	@RequestMapping(value="/api/moveJorugiBoard", method = RequestMethod.GET)
    public String moveJorugiBoard() {		
    	return  "board/board_main";
    }

}

