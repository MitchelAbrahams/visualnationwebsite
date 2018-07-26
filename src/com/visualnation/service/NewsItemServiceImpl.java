package com.visualnation.service;

import com.visualnation.dao.NewsItemDao;
import com.visualnation.entities.NewsItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class NewsItemServiceImpl implements NewsItemService {

    @Autowired
    NewsItemDao newsItemDao;

    @Override
    @Transactional
    public List getNewsItems() {
        return newsItemDao.getNewsItems();
    }
}
