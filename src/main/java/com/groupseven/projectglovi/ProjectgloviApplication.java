package com.groupseven.projectglovi;

import com.groupseven.projectglovi.annotations.EnableSecurity;
import jakarta.persistence.Table;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SpringBootApplication
@EnableSecurity
public class ProjectgloviApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectgloviApplication.class, args);
	}

}
