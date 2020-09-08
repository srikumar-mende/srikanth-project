package com.slokam.SpringBoot1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.SpringBoot1.MathPojo;
import com.slokam.SpringBoot1.StudenPojo;

@RestController
public class StudentController {
	/*@GetMapping("getData")
	public void getData(@RequestParam String name) {
		System.out.println("name::"+name);
	}
	
	@PostMapping("getAdd")
	public int  getAdd(@RequestBody MathPojo p ) {
		System.out.println("addition");
		int result = p.getA()/p.getB();
		return result;
	}
*/
    @Autowired
	private StudenPojo studentpojo;
	
    @Lookup
    private StudenPojo getStudentPojo() {
		return null;
    }
}