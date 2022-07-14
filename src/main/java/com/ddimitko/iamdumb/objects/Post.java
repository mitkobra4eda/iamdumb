package com.ddimitko.iamdumb.objects;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    @Size(min=2, max=20)
    @NotNull(message="Name cannot be null!")
    private String username;

    @Column(length = 1500)
    @Size(min=10, max=1500)
    @NotNull(message="Content cannot be null!")
    private String content;

    @Column(length = 1500)
    @Size(min = 3, max = 1500)
    private String answer;

    private LocalDateTime creationDate;

}
