package com.tr.checkpoint.cphistoryservices.service;

import com.tr.checkpoint.cphistoryservices.model.History;

import java.util.List;

public interface CPHistoryService {

  History save(History history);

  History update(History history);

  void delete(Long id);

  List<History> findAll();

  History getHistoryById(Long id) throws Exception;
}
