package com.example.socialnetwork.repositories;

import com.example.socialnetwork.entities.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);

}
