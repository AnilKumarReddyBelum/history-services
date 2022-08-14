package com.tr.checkpoint.cphistoryservices.controller;

import com.tr.checkpoint.cphistoryservices.model.History;
import com.tr.checkpoint.cphistoryservices.service.CPHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("history")
@Slf4j
public class CPHistoryController {

  private CPHistoryService cpHistoryService;

  @Autowired
  public CPHistoryController(CPHistoryService cpHistoryService) {
    this.cpHistoryService = cpHistoryService;
  }

  @PostMapping
  public History saveHistory(@RequestBody History history) {
    log.info("ENTER INTO saveHistory method");
    history = cpHistoryService.save(history);
    log.info("ENTER INTO saveHistory method completed id {}", history.getId());
    return history;
  }

  @PutMapping
  public History updateHistory(@RequestBody History history) {
    log.info("ENTER INTO updateHistory method");
    history = cpHistoryService.update(history);
    log.info("ENTER INTO updateHistory method completed id {}", history.getId());
    return history;
  }

  @GetMapping("{id}")
  public History getHistoryById(@PathVariable Long id) throws Exception {
    return cpHistoryService.getHistoryById(id);
  }

  @GetMapping
  public List<History> findAll() {
    return cpHistoryService.findAll();
  }

  @DeleteMapping("{id}")
  public void deleteById(@PathVariable Long id) {
    cpHistoryService.delete(id);
  }
}
