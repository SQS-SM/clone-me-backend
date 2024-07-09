//package za.co.bbd.cloneme.infrastructure.data.entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//import za.co.bbd.cloneme.model.ErrandStatus;
//
//import java.time.LocalDateTime;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@Entity
//@Table(name = "errand", schema = "cloneme")
//public class ErrandDao {
//
//    @Id
//    @Column(name = "id", nullable = false, updatable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "voice_note_id")
//    private String voicenoteId;
//
//    @Column(name = "status")
//    @Enumerated(EnumType.STRING)
//    private ErrandStatus status;
//
//    @CreationTimestamp
//    @Column(name = "date_created")
//    private LocalDateTime dateCreated;
//
//}
