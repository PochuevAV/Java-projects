package ru.stars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.stars.model.Page;

@Repository
public interface PageRepository extends JpaRepository<Page, Integer>{
    Page findByCode(String code);
}
