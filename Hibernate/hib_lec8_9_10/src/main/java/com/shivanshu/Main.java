package com.shivanshu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(21);
        s1.setName("Shivanshu");
        s1.setRollNo(3);

        Student s3 = new Student();
        s3.setAge(25);
        s3.setRollNo(5);
        s3.setName("Hella");

        Student s2 = null;

        SessionFactory sf = new Configuration().configure()
                .addAnnotatedClass(com.shivanshu.Student.class).buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction(); // necessary for merge and remove operations

        s2 = session.find(Student.class,2); // fetching the object student where primarykey id = 2

        System.out.println(s2.getAge()); // printing that object age

        session.remove(s2); // removing the fetched object from the database

        session.merge(s3); // adding new student object in table

        session.merge(s1); // for updating the existing data using merge

        tx.commit(); // closing the transcation
        session.close(); // closing the session
        sf.close();

    }
}