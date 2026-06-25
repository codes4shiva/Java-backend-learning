package com.shivanshu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Laptop lp = new Laptop();

    lp.setAid(16);
    lp.setBrandname("Asus");
    lp.setRamsize(32);

    Alien a1 = new Alien();
    a1.setAge(20);
    a1.setName("Shakal");
    a1.setRollNo(69);
    a1.setLaptop(lp);

        SessionFactory sf = new Configuration().configure()
                .addAnnotatedClass(Alien.class).buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction(); // necessary for merge and remove operations


   session.merge(a1);
        tx.commit(); // closing the transcation
        session.close(); // closing the session
        sf.close();

    }
}