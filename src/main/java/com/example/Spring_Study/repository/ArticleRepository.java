package com.example.Spring_Study.repository;

import com.example.Spring_Study.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository <Article, Long>{
}
