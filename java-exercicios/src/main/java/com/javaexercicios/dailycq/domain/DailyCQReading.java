//package com.javaexercicios.dailycq.domain;
//
//import br.org.pti.gedt.xdose.core.badge.domain.entities.Badge;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.math.BigDecimal;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class DailyCQReading implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    private Badge badge;
//
//    @Enumerated(EnumType.STRING)
//    private LogicalIdentification logicalIdentification;
//
//    private BigDecimal elementeDetector1;
//    private BigDecimal elementeDetector2;
//    private BigDecimal elementeDetector3;
//    private BigDecimal elementeDetector4;
//
//    private BigDecimal elementeDetectorECF1;
//    private BigDecimal elementeDetectorECF2;
//    private BigDecimal elementeDetectorECF3;
//    private BigDecimal elementeDetectorECF4;
//
//    private BigDecimal elementeDetector1Avg;
//    private BigDecimal elementeDetector2Avg;
//    private BigDecimal elementeDetector3Avg;
//    private BigDecimal elementeDetector4Avg;
//
//}
