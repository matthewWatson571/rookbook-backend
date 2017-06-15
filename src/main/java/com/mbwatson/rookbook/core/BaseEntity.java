package com.mbwatson.rookbook.core;

import javax.persistence.*;

/**
 * Created by Matthew.Watson on 6/13/17.
 */
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    @Version
    private Long version;

    protected BaseEntity() {
        id = null;
    }
}