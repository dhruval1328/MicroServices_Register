package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.data.model.Student;

import jakarta.transaction.Transactional;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	@Transactional
	@Modifying
	@Query("update Student set pname=:pname where pid=:pid")
	public void updateDataByPath(int pid,String pname);
}
