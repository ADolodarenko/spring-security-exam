package org.dav.learn.enterprise.securespring.service;

import org.dav.learn.enterprise.securespring.entity.User;

public interface UserService {
    User getUser(String login);
}
