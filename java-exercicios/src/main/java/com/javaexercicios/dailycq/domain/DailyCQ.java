//package com.javaexercicios.dailycq.domain;
//
//import br.org.pti.gedt.xdose.core.processes.domain.entities.CQProcess;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.time.LocalDate;
//import java.util.List;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class DailyCQ implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private LocalDate DateCQExecution;
//
//    @OneToOne
//    private CQProcess process;
//
//    private BigDecimal exposureLCMR;
//
//    @OneToMany
//    List<ReferenceValue> referenceValues;
//
//    private BigDecimal finalElementControl;
//
//    private BigDecimal fbcf;
//
//    private BigDecimal pbcf;
//
//    private BigDecimal rs;
//
//    private BigDecimal cali;
//
//    private BigDecimal homogeneity;
//
//    private BigDecimal meanByElement;
//
//    private BigDecimal  averageRating;
//
//    private BigDecimal deviationByMean;
//
//    private BigDecimal coefficientVariation;
//
//    private BigDecimal responseE2;
//
//    private BigDecimal individualResponses;
//
//    private String notes;
//
//    private String responsibleExecute;
//
//    private boolean cqResult;
//
//}
