package com.company.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {

		@RequestMapping("/empSelect")
		public String select() {
			//조회
			return "emp/select";
		}
		
		@GetMapping("/empinsertForm")
		public String insertForm() {
			return "emp/insert";
		}
		@PostMapping("/empInsert")
		public String insert() {
			//등록처리
			//조회로
			return "redirect:/empSelect";
		}
}
