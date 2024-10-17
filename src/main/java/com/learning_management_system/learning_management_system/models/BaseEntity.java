package com.learning_management_system.learning_management_system.models;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Column(name = "public_id")
    private UUID publicId;

    @Column(name = "deleted")
    private boolean deleted = false;


    //each entity will have a unique id across

    @PrePersist
    public void prePersist() {
        this.publicId = UUID.randomUUID();

    }

}
