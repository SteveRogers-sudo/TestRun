package com.cg.iter.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.iter.test.entities.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, String>{

	java.util.Optional<Test> findBycentreNameAndTestName(String centreName, String testName);
	void deleteBytestId(String testId);

}
