package com.mipresupuesto.personalbudget.infrastructure.repository.interfaces;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mipresupuesto.personalbudget.entity.BudgetEntity;


@Repository
public interface BudgetRepository extends JpaRepository<BudgetEntity, UUID>{
	

//	@Query("SELECT b FROM Budget b WHERE b.idPerson = :idPerson and b.idYear = :idYear")
//	@Query("SELECT b FROM Budget b WHERE b.idPerson = :? and b.idYear = ?2")
	@Query(value = "SELECT * FROM Budget u WHERE u.idPerson = ?1 and u.idYear = ?2", nativeQuery = true)
	Optional<BudgetEntity> findByPersonAndYear(UUID idPerson, UUID idYear);
	
//	@Query(
//			value = 
//			"SELECT * FROM Budget b left join Person p on b.idPerson = p.id left join Year y on b.idYear = y.id where idYear",
//			nativeQuery = true)
//	Optional<BudgetEntity> findBudget(UUID idPerson, UUID idYear);

//	BudgetIsForNextYearSpecification


}
