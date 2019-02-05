package com.codeclan.newsApp.newsApp.repositories.ArticleRepository;

import com.codeclan.newsApp.newsApp.models.Article;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class ArticleRepositoryImpl {
//
//    @Autowired
//    EntityManager entityManager;
////
////    @Transactional //criteria query
////    public List<Article> getAllJournalistByName(String name) {
////       List<Article> results = null;
////        Session session = entityManager.unwrap(Session.class);
////       try{
////        Criteria cr = session.createCriteria(Article.class);
////        cr.createAlias("journalist", "journalist");
////        cr.add(Restrictions.eq("journalist.name",name));
////        results = cr.list();
////       }catch (HibernateException e){
////           e.printStackTrace();
////       }
////       finally {
////           session.close();
////       }
////       return results;
////    }
}
