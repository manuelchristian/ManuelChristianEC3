
package com.idat.idatapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.idatapirest.model.Cliente;
import com.idat.idatapirest.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

	
}
