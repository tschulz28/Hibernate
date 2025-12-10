package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * A simple Message entity for Hibernate ORM.
 */
@Entity
public class Message {
    /**
     * The unique identifier for the message.
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * The text content of the message.
     */
    private String text;

    /**
     * Default constructor required by JPA.
     */
    public Message() {}

    /**
     * Constructor with text parameter.
     * @param text The message text.
     */
    public Message(String text) { this.text = text; }

    /**
     * Gets the ID of the message.
     * @return The message ID of type Long.
     */
    public Long getId() { return id; }

    /**
     * Gets the text of the message.
     * @return The message text of type String.
     */
    public String getText() { return text; }

    /**
     * Sets the text of the message.
     * @param text The message text to set.
     */
    public void setText(String text) { this.text = text; }
}
