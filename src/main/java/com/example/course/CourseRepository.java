package com.example.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Гунга on 31.05.2017.
 */
public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);

}
