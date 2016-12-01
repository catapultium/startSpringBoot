package com.startspring.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String boardId = null;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @OneToMany(mappedBy = "deckId")
    private List<Deck> deckList;

}
