package ra.demo_joincolumn.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ra.demo_joincolumn.dao.CategoryDAO;
import ra.demo_joincolumn.entity.Category;

import java.util.List;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Category> getCategories() {
        Session session = sessionFactory.openSession();
        try {
            List list = session.createQuery("from Category ").list();
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
