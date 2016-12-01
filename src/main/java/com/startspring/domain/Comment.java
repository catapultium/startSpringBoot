package com.startspring.domain;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String commentId = null;

    @ManyToOne
    private Card card;
}
