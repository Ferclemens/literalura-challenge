package com.literalura.challenge.repository;

import com.literalura.challenge.model.Book;
import com.literalura.challenge.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IBookRepository extends JpaRepository<Book, Long> {

    List<Book> findByLanguage(Language language);

//    List<Book> findTop10By(Pageable pageable);

    List<Book> findTop10ByOrderByDownloadCountDesc();

    Optional<Object> findByTitle(String title);
}
