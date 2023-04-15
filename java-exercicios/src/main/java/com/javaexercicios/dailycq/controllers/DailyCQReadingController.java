//package com.javaexercicios.dailycq.controllers;
//
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.domain.DailyCQ;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.domain.DailyCQReading;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.services.DailyCQReadingService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/dailycqreading")
//public class DailyCQReadingController {
//
//    private final DailyCQReadingService dailyCQReadingService;
//
//    public DailyCQReadingController(DailyCQReadingService dailyCQReadingService) {
//        this.dailyCQReadingService = dailyCQReadingService;
//    }
//
//    @GetMapping("/elements")
//    public ResponseEntity<Iterable<DailyCQReading>> listAll(){
//        return ResponseEntity.ok(dailyCQReadingService.listAllDailyCQReader());
//    }
//
//    @PostMapping
//    public ResponseEntity<DailyCQ> createDailyCQ(Long processId, ImputConfig imputConfig){
//
//        return ResponseEntity.ok(dailyCQReadingService.proceDailyCQ());
//    }
//
//
//}
