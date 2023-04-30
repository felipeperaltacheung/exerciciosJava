//package com.javaexercicios.xdoseExercises.cq.services;
//
//
//
//import br.org.pti.gedt.xdose.core.processes.services.ProcessService;
//import br.org.pti.gedt.xdose.core.qualitycontrol.domain.entities.CalculationMemoryDailyCQ;
//import br.org.pti.gedt.xdose.core.qualitycontrol.repositories.CalculationMemoryDailyCQRepository;
//import br.org.pti.gedt.xdose.core.reading.domain.entities.ElementDetector;
//import br.org.pti.gedt.xdose.core.reading.services.ReadingHandle;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.stereotype.Service;
//
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//@Log4j2
//@RequiredArgsConstructor
//public class CalculationMemoryDailyCQService {
//
//    private final CalculationMemoryDailyCQRepository calculationMemoryDailyCQRepository;
//    private final ProcessService processService;
//
//
//    public List<CalculationMemoryDailyCQ> findAll(){
//        return calculationMemoryDailyCQRepository.findAll();
//    }
//
//
//    BigDecimal sumElement1 = BigDecimal.ZERO;
//    BigDecimal sumElement2 = BigDecimal.ZERO;
//    BigDecimal sumElement3 = BigDecimal.ZERO;
//    BigDecimal sumElement4 = BigDecimal.ZERO;
//
//    BigDecimal r_E1 = BigDecimal.ZERO;
//    BigDecimal r_E2 = BigDecimal.ZERO;
//    BigDecimal r_E3 = BigDecimal.ZERO;
//    BigDecimal r_E4 = BigDecimal.ZERO;
//
//    BigDecimal avgElement1 = BigDecimal.ZERO;
//    BigDecimal avgElement2 = BigDecimal.ZERO;
//    BigDecimal avgElement3 = BigDecimal.ZERO;
//    BigDecimal avgElement4 = BigDecimal.ZERO;
//
//    final BigDecimal ECFE1 = BigDecimal.valueOf(1.006);
//    final BigDecimal ECFE2 = BigDecimal.valueOf(0.921);
//    final BigDecimal ECFE3 = BigDecimal.valueOf(1.009);
//    final BigDecimal ECFE4 = BigDecimal.valueOf(1.047);
//
//    List<BigDecimal> E1ListWithECF = new ArrayList<>();
//    List<BigDecimal> E2ListWithECF = new ArrayList<>();
//    List<BigDecimal> E3ListWithECF = new ArrayList<>();
//    List<BigDecimal> E4ListWithECF = new ArrayList<>();
//
//
//
//    public List<BigDecimal> sumOfelementsSameType(Long id) {
//
//        ReadingHandle readingHandle = new ReadingHandle();
//
//        List<ElementDetector> listElementNumber1 =
//                readingHandle.getAllElementsPosistionByProcess(processService.findProcessById(id), 1);
//        List<ElementDetector> listElementNumber2 =
//                readingHandle.getAllElementsPosistionByProcess(processService.findProcessById(id), 2);
//        List<ElementDetector> listElementNumber3 =
//                readingHandle.getAllElementsPosistionByProcess(processService.findProcessById(id), 3);
//        List<ElementDetector> listElementNumber4 =
//                readingHandle.getAllElementsPosistionByProcess(processService.findProcessById(id), 4);
//
//        log.info("lista de elementos numero 1 sem ECF: " + listElementNumber1);
//        log.info("lista de elementos numero 2 sem ECF: " + listElementNumber2);
//        log.info("lista de elementos numero 3 sem ECF: " + listElementNumber3);
//        log.info("lista de elementos numero 4 sem ECF: " + listElementNumber4);
//
//        //aplicar ecf
//        for (ElementDetector e: listElementNumber1) {
//            BigDecimal E1 = e.getExposure().getValue().divide(ECFE1, 4, RoundingMode.HALF_UP);
//            E1ListWithECF.add(E1);
//        } log.info("lista do E1 com ecf: " + E1ListWithECF);
//
//        for (ElementDetector e: listElementNumber2) {
//            BigDecimal E2 = e.getExposure().getValue().divide(ECFE2, 4, RoundingMode.HALF_UP);
//            E2ListWithECF.add(E2);
//        } log.info("lista do E2 com ecf: " + E2ListWithECF);
//
//        for (ElementDetector e: listElementNumber3) {
//            BigDecimal E3 = e.getExposure().getValue().divide(ECFE3, 4, RoundingMode.HALF_UP);
//            E3ListWithECF.add(E3);
//        } log.info("lista do E3 com ecf: " + E3ListWithECF);
//
//        for (ElementDetector e: listElementNumber4) {
//            BigDecimal E4 = e.getExposure().getValue().divide(ECFE4, 4, RoundingMode.HALF_UP);
//            E4ListWithECF.add(E4);
//        } log.info("lista do E4 ecf: " + E4ListWithECF);
//
//        // aplicar soma na lista elementos do mesmo tipo corrigido por ecf
//        for(BigDecimal E1 : E1ListWithECF){
//            r_E1 = r_E1.add(E1);
//        }  log.info("soma dos elementos 1 com ecf: " + r_E1);
//
//        for(BigDecimal E2 : E2ListWithECF){
//            r_E2 = r_E2.add(E2);
//        }  log.info("soma dos elementos 2 com ecf: " + r_E2);
//
//        for(BigDecimal E3 : E3ListWithECF){
//            r_E3 = r_E3.add(E3);
//        }  log.info("soma dos elementos 3 com ecf: " + r_E3);
//
//        for(BigDecimal E4 : E4ListWithECF){
//            r_E4 = r_E4.add(E4);
//        }  log.info("soma dos elementos 4 com ecf: " + r_E4);
//
//        List<BigDecimal> sumOfElements = new ArrayList<>();
//        sumOfElements.add(r_E1);
//        sumOfElements.add(r_E2);
//        sumOfElements.add(r_E3);
//        sumOfElements.add(r_E4);
//
//        return sumOfElements;
//    }
//
//}
