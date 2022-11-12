import entity.EngineeringstudentsEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManager manager = Persistence.createEntityManagerFactory("default").createEntityManager();

        manager.getTransaction().begin();

        EngineeringstudentsEntity entity = new EngineeringstudentsEntity();
        entity.setDept("CSE");
        entity.setStudentId(10217);
        entity.setFirstName("mukund");
        entity.setLastName("desai");
        entity.setPassOutYear(2023);
        entity.setUniversityRank(1200);

        //EngineeringstudentsEntity entity = manager.find(EngineeringstudentsEntity.class,10201);

        //System.out.println(entity);
        manager.persist(entity);

        manager.getTransaction().commit();

        EngineeringstudentsEntity find = manager.find(EngineeringstudentsEntity.class,10217);
        System.out.println(find);
    }
}
