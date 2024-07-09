//package za.co.bbd.cloneme.infrastructure.data.entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//@Data
//@Builder
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name="quote", schema="cloneme")
//public class QuoteDao {
//
//    @Id
//    @Column(name="id", nullable = false, updatable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "errand_id", nullable = false)
//    private Long errandId;
//
//    @Column(name = "cost")
//    private BigDecimal cost;
//
//    @Column(name = "distance_estimate")
//    private BigDecimal distanceEstimate;
//
//    @Column(name = "time_estimate")
//    private BigDecimal timeEstimate;
//
//    @CreationTimestamp
//    @Column(name = "date_created")
//    private LocalDateTime dateCreated;
//
//}
