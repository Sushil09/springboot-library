package com.sjsuhil09.dao;

import com.sjsuhil09.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
