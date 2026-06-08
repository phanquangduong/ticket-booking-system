package com.infrastructure.persistence.mapper;

import com.domain.model.entity.TicketDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketDetailJPAMapper extends JpaRepository<TicketDetail, Long> {

    Optional<TicketDetail> findById(Long id);
}