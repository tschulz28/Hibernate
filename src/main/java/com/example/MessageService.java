package com.example;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for managing Message entities.
 */
@Service
public class MessageService {
    /**
     * The Message repository.
     */
    private final MessageRepository repository;

    /**
     * Constructor for MessageService.
     */
    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    /**
     * Saves a new message.
     * @param text The message text to save and print
     * @return The resulting <code>Message</code> entity.
     */
    @Transactional
    public Message saveMessage(String text) {
        Message msg = new Message(text);

        // persist wird intern erledigt
        return repository.save(msg);
    }

    /**
     * Prints a message by its ID.
     * @param id The ID of the message to print.
     */
    @Transactional(readOnly = true)
    public void printMessage(Long id) {
        Message loaded = repository.findById(id).orElseThrow();
        System.out.println("\nGeladen: " + loaded.getText()+"\n");
    }
}
