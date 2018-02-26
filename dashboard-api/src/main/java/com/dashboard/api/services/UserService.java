package com.dashboard.api.services;

import com.dashboard.core.model.user.User;

import javax.validation.constraints.NotEmpty;

/**
 * @author Leboc Philippe.
 */
public interface UserService extends DefaultService<User, Integer> {
    User findByUsername(@NotEmpty String username);
}
