package com.geekbrains.market.repositories;


import com.geekbrains.market.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends CrudRepository<Course, Long> {
}
