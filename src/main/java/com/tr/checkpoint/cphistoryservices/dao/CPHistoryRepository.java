package com.tr.checkpoint.cphistoryservices.dao;

import com.tr.checkpoint.cphistoryservices.model.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CPHistoryRepository extends JpaRepository<History, Long> {}
