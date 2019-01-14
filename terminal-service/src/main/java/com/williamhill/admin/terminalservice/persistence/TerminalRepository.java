package com.williamhill.admin.terminalservice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TerminalRepository extends JpaRepository<Terminal, UUID> {
}
