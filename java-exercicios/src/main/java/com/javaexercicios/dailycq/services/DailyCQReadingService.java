//package com.javaexercicios.dailycq.services;
//
//import br.org.pti.gedt.xdose.core.badge.services.BadgeService;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.domain.DailyCQReading;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.domain.LogicalIdentification;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.repositories.DailyCQReadingRepository;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.repositories.DailyCQRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//@Slf4j
//public class DailyCQReadingService {
//
//    private final DailyCQReadingRepository dailyCQReadingRepository;
//    private final BadgeService badgeService;
//    private final DailyCQRepository dailyCQRepository;
//
//
//    public Iterable<DailyCQReading> listAllDailyCQReader() {
//        return dailyCQReadingRepository.findAll();
//    }
//
//    public List<DailyCQReading> listByLogicalIdentification(){
//        return dailyCQReadingRepository.findByLogicalIdentification(LogicalIdentification.UNIRR);
//    }
//
//}
