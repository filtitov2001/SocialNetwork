package com.example.socialnetwork.entities;

import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;

    private String text;

    private String tag;

    public Message() {}

    public Message(String text, String tag) {
        this.text = text;
        this.tag = tag;
    }

    public String getMessage() {
        return text;
    }

    public void setMessage(String message) {
        this.text = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
