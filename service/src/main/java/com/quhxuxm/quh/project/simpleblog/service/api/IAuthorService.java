package com.quhxuxm.quh.project.simpleblog.service.api;

import com.quhxuxm.quh.project.simpleblog.domain.Authentication;
import com.quhxuxm.quh.project.simpleblog.service.api.exception.ServiceException;
import com.quhxuxm.quh.project.simpleblog.service.dto.AuthorDetail;

import java.util.Optional;
import java.util.OptionalLong;
import java.util.Set;

public interface IAuthorService {
    OptionalLong register(String token, String password, String nickName,
            Authentication.Type type) throws ServiceException;

    Optional<AuthorDetail> login(String token, String password,
            Authentication.Type type) throws ServiceException;

    void assignTagToAuthor(Long authorId, Set<String> tags)
            throws ServiceException;
}
