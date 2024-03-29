package com.practise.reopsitory;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practise.entity.BookEntity;

@Repository
public interface BookRepo extends JpaRepository<BookEntity, Serializable> {

}
