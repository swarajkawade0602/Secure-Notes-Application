package com.secure.notes.repositories;

import com.secure.notes.models.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuditLogRepository extends JpaRepository<AuditLog, Integer> {

    List<AuditLog> findByNoteId(Long id);
}
