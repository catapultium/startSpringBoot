package com.startspring.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Deck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String deckId = null;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_deck_parent_id"))
    private Board board;

    @OneToMany(mappedBy = "cardId")
    private List<Card> cardList;

}
