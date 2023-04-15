//package com.javaexercicios.dailycq.services;
//
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.domain.DailyCQ;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.domain.DailyCQDTO;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.domain.DailyCQReading;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.domain.LogicalIdentification;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.repositories.DailyCQReadingRepository;
//import br.org.pti.gedt.xdose.core.qualitycontrol.dailycq.repositories.DailyCQRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.modelmapper.ModelMapper;
//import org.springframework.stereotype.Service;
//
//import java.math.BigDecimal;
//import java.util.List;
//
//@Service
//@Slf4j
//public class DailyCQService {
//
//    private final DailyCQRepository dailyCQRepository;
//    private final DailyCQReadingRepository dailyCQReadingRepository;
//
//    private final ModelMapper modelMapper;
//
//    public DailyCQService(DailyCQRepository dailyCQRepository, DailyCQReadingRepository dailyCQReadingRepository, ModelMapper modelMapper) {
//        this.dailyCQRepository = dailyCQRepository;
//        this.dailyCQReadingRepository = dailyCQReadingRepository;
//        this.modelMapper = modelMapper;
//    }
//
//    public List<DailyCQ> listAllDailyCQ(){
//        return dailyCQRepository.findAll();
//    }
//
//    public DailyCQ findCQbyId(Long id) {
//        return dailyCQRepository.findById(id).orElseThrow(() -> {
//           log.error("Daily CQ not found");
//           return new RuntimeException("Daily CQ not found by id " + id);
//        });
//    }
//
//    public DailyCQ saveDailyCQ(DailyCQDTO dailyCQDTO){
//        DailyCQ dailyCQ = modelMapper.map(dailyCQDTO, DailyCQ.class);
//        return dailyCQRepository.save(dailyCQ);
//    }
//
//    public DailyCQ delete(Long id){
//        DailyCQ dailyCQ = dailyCQRepository.findById(id).orElseThrow(() -> {
//            log.error("Daily CQ not found by id {} ", id);
//            return new RuntimeException("Daily CQ not found by id {} " + id);
//        });
//        dailyCQRepository.delete(dailyCQ);
//        return dailyCQ;
//    }
//
//    public DailyCQ update(DailyCQDTO dailyCQDTO){
//        DailyCQ dailyCQ = modelMapper.map(dailyCQDTO, DailyCQ.class);
//        return dailyCQRepository.save(dailyCQ);
//    }
//
//
//    public List<DailyCQReading> calculateSumElementUNIRR() {
//
//        List<DailyCQReading> dailyCQReadingList = dailyCQReadingRepository.findByLogicalIdentification(LogicalIdentification.UNIRR);
//
//        BigDecimal sum1 = BigDecimal.ZERO;
//        BigDecimal sum2 = BigDecimal.ZERO;
//        BigDecimal sum3 = BigDecimal.ZERO;
//        BigDecimal sum4 = BigDecimal.ZERO;
//
//        for (DailyCQReading d: dailyCQReadingList) {
//            System.out.println(d);
//        }
//
//        return dailyCQReadingList;
//
//    }
//
//}
