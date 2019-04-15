package com.mhoveidafar.visa.authentication.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * To manage the persistence layer of ApplicationUser entity, an interface which
 * is an extension of JpaRepository—which gives access to some common methods
 * like save— will be created.
 * 
 * @author Mohamad
 *
 */

// Type of primary key (id) is long
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

	ApplicationUser findByUsername(String username);

}
