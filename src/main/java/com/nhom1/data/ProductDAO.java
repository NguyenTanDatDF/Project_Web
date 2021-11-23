package com.nhom1.data;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nhom1.data.HibernateUtil;

import com.nhom1.model.Product;


public class ProductDAO {

 
	
	
    @SuppressWarnings("unchecked")
    public List<Product> listAllProduct() {
        try {
      
        	return HibernateUtil.getSessionFactory().openSession().createQuery("SELECT a FROM Product a", Product.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
    }
    
    
    
    public void saveProduct(Product product) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(product);
            // commit transaction
            transaction.commit();
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
}
       
    public void updateProduct(Product product) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(product);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public void deleteProduct(int id) {

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // Delete a user object
            Product product = session.get(Product.class, id);
            if (product != null) {
                session.delete(product);
                System.out.println("user is deleted");
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}