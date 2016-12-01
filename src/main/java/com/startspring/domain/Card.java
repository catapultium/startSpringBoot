package com.startspring.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cardId = null;

    @OneToMany(mappedBy = "commentId")
    private List<Comment> commentList;

    @ManyToOne
    private Deck deck;
}