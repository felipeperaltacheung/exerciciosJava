//package com.javaexercicios.dailycq.controllers;
//
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.domain.DailyCQ;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.domain.DailyCQDTO;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.services.DailyCQReadingService;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.services.DailyCQService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/daily-cq")
//public class DailyCQController {
//
//    private final DailyCQService dailyCQService;
//    private final DailyCQReadingService dailyCQReadingService;
//
//    public DailyCQController(DailyCQService dailyCQService, DailyCQReadingService dailyCQReadingService) {
//        this.dailyCQService = dailyCQService;
//        this.dailyCQReadingService = dailyCQReadingService;
//    }
//
//    @GetMapping
//    public List<DailyCQ> listAll() {
//        return dailyCQService.listAllDailyCQ();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<DailyCQ> findById(@PathVariable Long id) {
//        return ResponseEntity.ok(dailyCQService.findCQbyId(id));
//    }
//
//    @PostMapping
//    public ResponseEntity<DailyCQ> create(@RequestBody DailyCQDTO dailyCQDTO) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(dailyCQService.saveDailyCQ(dailyCQDTO));
//    }
//
//    @DeleteMapping("{id}")
//    public ResponseEntity<DailyCQ> delete(@PathVariable Long id) {
//        return ResponseEntity.ok(dailyCQService.delete(id));
//    }
//
//    @PutMapping("{id}")
//    public ResponseEntity<DailyCQ> update(@RequestBody DailyCQDTO dailyCQDTO) {
//        return ResponseEntity.ok(dailyCQService.update(dailyCQDTO));
//    }
//
//    @PostMapping("/soma")
//    public void soma(@RequestBody DailyCQDTO dailyCQDTO){
//
//
//
//    }
//
//}
//
//
