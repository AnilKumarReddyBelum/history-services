package com.tr.checkpoint.cphistoryservices.service;

import com.tr.checkpoint.cphistoryservices.dao.CPHistoryRepository;
import com.tr.checkpoint.cphistoryservices.model.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class CPHistoryServiceImpl implements CPHistoryService {

  private CPHistoryRepository cpHistoryRepository;

  @Autowired
  public CPHistoryServiceImpl(CPHistoryRepository cpHistoryRepository) {
    this.cpHistoryRepository = cpHistoryRepository;
  }

  @Override
  public History save(History history) {
    history.setSearchedOn(new Date());
    return cpHistoryRepository.save(history);
  }

  @Override
  public History update(History history) {
    return cpHistoryRepository.save(history);
  }

  @Override
  public void delete(Long id) {
    cpHistoryRepository.deleteById(id);
  }

  @Override
  public List<History> findAll() {
    return cpHistoryRepository.findAll();
  }

  @Override
  public History getHistoryById(Long id) throws Exception {
    return cpHistoryRepository.findById(id).orElseThrow(Exception::new);
  }
}
