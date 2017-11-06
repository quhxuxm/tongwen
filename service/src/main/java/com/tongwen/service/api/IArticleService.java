package com.tongwen.service.api;

import com.tongwen.domain.*;
import com.tongwen.service.exception.ServiceException;

import java.util.List;
import java.util.Map;

public interface IArticleService {
    void create(Article article, Author author) throws ServiceException;

    Article get(long id) throws ServiceException;

    void update(Article article, Author author) throws ServiceException;

    ArticleDetail viewDetail(long id) throws ServiceException;

    long praiseArticle(long id) throws ServiceException;

    long bookmarkArticle(long id) throws ServiceException;

    List<ArticleSummary> getSummariesOrderByPublishDate(int start,
            boolean isDesc) throws ServiceException;

    ArticleAdditionalInfo getAdditionalInfo(long articleId)
            throws ServiceException;

    Map<Long, ArticleAdditionalInfo> getAdditionalInfoList(List<ArticleSummary> articleSummaries)
            throws ServiceException;

    String extractArticleContentPlainText(String content)
            throws ServiceException;
}