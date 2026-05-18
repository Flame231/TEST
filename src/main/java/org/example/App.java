package org.example;

import lombok.SneakyThrows;
import org.example.dao.MyClassDAO;
import org.example.dao.MyClassDAOImpl;
import org.example.model.MyClass;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        MyClassDAO myClassDAO = new MyClassDAOImpl();
        MyClass myClass = myClassDAO.get(1);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                MyClassDAO myClassDAO = new MyClassDAOImpl();
                myClassDAO.getEntityManager().getTransaction().begin();
                MyClass myClass = myClassDAO.get(1);
                System.out.println(myClass);
                try {
                    Thread.currentThread().sleep(8000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                myClassDAO.getEntityManager().refresh(myClass);
                System.out.println(myClass);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        Thread.currentThread().sleep(1000);
        myClassDAO.getEntityManager().getTransaction().begin();
        myClass.setName("333");
        myClassDAO.getEntityManager().flush();
        myClassDAO.getEntityManager().getTransaction().commit();

    }
}
