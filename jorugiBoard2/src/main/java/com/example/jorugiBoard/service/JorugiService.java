package com.example.jorugiBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.jorugiBoard.mapper.JorugiTableMapper;
import com.example.jorugiBoard.model.JorugiTable;

@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class JorugiService {
	
//	@Autowired
//	private JorugiBoardMapper jorugiBoardMapper;
	
	@Autowired
	private JorugiTableMapper jorugiTableMapper;
	
	public List<JorugiTable> getJorugiAll() {
		return jorugiTableMapper.getJorugiAll();
	}
	
//	public List<JorugiBoard> getJorugiBoardList() {
//		System.out.println(jorugiBoardMapper.getJorugiBoardList());
//		return jorugiBoardMapper.getJorugiBoardList();
//	}
}
