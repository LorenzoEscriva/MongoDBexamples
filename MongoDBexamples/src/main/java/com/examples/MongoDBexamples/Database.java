package com.examples.MongoDBexamples;

import java.util.List;

public interface Database {

	public List<Student> getAllStudentsList();

	public Student findStudentById(String id);

	public void save(Student student);
}
