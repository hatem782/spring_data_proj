package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
@RequestMapping("/test")
public String test() {
	return "teeeest";
}
}
