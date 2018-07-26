package com.visualnation.dao;

import com.visualnation.entities.NewsItem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewsItemDaoImpl implements NewsItemDao {

    //inject session factory
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<NewsItem> getNewsItems() {

        Session currentSession = sessionFactory.getCurrentSession();

        Query<NewsItem> itemQuery = currentSession.createQuery("from NewsItem ", NewsItem.class);

        List<NewsItem> newsItems = itemQuery.getResultList();

        return newsItems;
    }
}
