package com.domain.respository;

import com.domain.model.entity.TicketDetail;

import java.util.Optional;

public interface TicketDetailRepository {

    Optional<TicketDetail> findById(Long id);
}
