package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


@RestController
public class CourseController {
	
	
	@GetMapping("/")
	public RedirectView index () {
		return new RedirectView("courses");
	}
	
	@GetMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course (1, "Learn AWS", "in28minutes"),
				new Course (2, "Learn DevOps", "Mary"),
				new Course (3, "Learn Azure", "John Doe"),
				new Course (3, "Learn GCP", "in28minutes")
				);
	}
	
	
}
