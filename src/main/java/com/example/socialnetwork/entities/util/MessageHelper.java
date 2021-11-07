package com.example.socialnetwork.entities.util;

import com.example.socialnetwork.entities.User;

public abstract class MessageHelper {
    public static String getAuthorName(User author) {
        return author != null ? author.getUsername() : "<None>";
    }
}
