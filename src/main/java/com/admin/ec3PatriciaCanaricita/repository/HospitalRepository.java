package com.admin.ec3PatriciaCanaricita.repository;

import com.admin.ec3PatriciaCanaricita.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
}
