package br.com.mesttra.mailsender.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class MailRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "time_sent")
    private LocalDateTime timeSent;

    private String destination;

    @Lob
    private String content;

}
