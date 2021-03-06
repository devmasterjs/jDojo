package br.eti.gregori.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by encef on 17/12/2016.
 */
@Data
@Entity
public class Dojo {
    private @Id @GeneratedValue Long Id;
    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private String street;
    @SuppressWarnings("unused")
    private String city;
    @SuppressWarnings("unused")
    private String state;
    @SuppressWarnings("unused")
    private int number;
    @SuppressWarnings("unused")
    private Long cep;
    
    @OneToMany(mappedBy = "dojo")
    private Set<User> users;
    @OneToMany(mappedBy = "dojo")
    private Set<Presence> presences;
    @OneToMany(mappedBy = "dojo")
    private Set<ClassEvent> classes;

    @CreatedDate
    private LocalDateTime createdDate;
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String lastModifiedBy;
}
