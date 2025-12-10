package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Message} entities.
 * <p><b>Remark:</b> This interface extends <code>JpaRepository</code> from
 * Spring Data JPA.<br>
 * → The result for Spring Data JPA:
 * "I generate a class at runtime that implements all methods
 * and delegates the SQL statements to Hibernate."
 */
public interface MessageRepository extends JpaRepository<Message, Long> {
    // save, findAll, findById, delete usw. kommen automatisch
}
