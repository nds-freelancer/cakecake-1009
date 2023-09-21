package com.marufhassan.cmsshoppingcart.models;

import com.marufhassan.cmsshoppingcart.models.data.Product;
import com.marufhassan.cmsshoppingcart.models.data.Question;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuestionRepository extends JpaRepository<Question, Integer> {
	Page<Question> findAll(Pageable pageable);
	
	List<Question> findAllBySlug(String type);

}
