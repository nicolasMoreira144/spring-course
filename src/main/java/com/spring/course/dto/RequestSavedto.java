package com.spring.course.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.spring.course.domain.Request;
import com.spring.course.domain.RequestStage;
import com.spring.course.domain.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class RequestSavedto {
	
	@NotBlank(message = "Subject required")
	private String subject;
	
	private String description;
	
	@NotNull(message = "Owner required")
	private User owner;
	
	private List<RequestStage> stages = new ArrayList<>();

	public Request transformToRequest() {
		Request request = new Request(null, this.subject, this.description, null, null, this.owner, this.stages);
		return request;
	}
}
