package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Quiz1 {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	    private String title;

	    public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public List<Question> getQuestions() {
			return questions;
		}

		public void setQuestions(List<Question> questions) {
			this.questions = questions;
		}

		@ManyToMany
	    private List<Question> questions;

}
