package org.example;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.example.config.HibernateConfig;
import org.example.domain.Status;
import org.example.domain.TaskEntity;
import org.example.domain.Type;
import org.example.domain.UserEntity;
import org.example.domain.dto.PersonSearchDto;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static antlr.Lookahead.of;
import static java.util.Objects.nonNull;
import static org.apache.commons.lang3.BooleanUtils.isFalse;
import static org.apache.commons.lang3.BooleanUtils.isTrue;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.example.domain.Status.IN_PROGRESS;
import static org.example.domain.Status.NEW;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateConfig.createSession();
        Transaction transaction = session.beginTransaction();

        var user1= UserEntity.builder()
                .name("Nick")
                .nickname("userMan")
                .email("test@mail.com")
                .isEnabled(true)
                .order(0)
                .type(Type.USER)
                .birthday(LocalDate.of(1980,05,22))
                .gender("male")
                .salary(1000L)
                .build();
        var user2= UserEntity.builder()
                .name("Ann")
                .nickname("adminMan")
                .email("test2@mail.com")
                .isEnabled(false)
                .order(1)
                .type(Type.SUPPORT)
                .birthday(LocalDate.of(1985,05,22))
                .gender("female")
                .salary(2000L)
                .build();
        var user3= UserEntity.builder()
                .name("Joe")
                .nickname("userGuest")
                .email("test3@yandex.ru")
                .isEnabled(true)
                .order(2)
                .type(Type.ADMIN)
                .birthday(LocalDate.of(1982,05,21))
                .gender("male")
                .salary(3000L)
                .build();
        var task1= TaskEntity.builder()
                .title("Repair")
                .description("troubleshooting heating system")
                .status(IN_PROGRESS)
                .build();
        var task2= TaskEntity.builder()
                .title("Сleaning")
                .description("workplace cleaning")
                .status(NEW)
                .build();
        var task3= TaskEntity.builder()
                .title("Сooking")
                .description("cooking delicious cookies ")
                .status(IN_PROGRESS)
                .build();


        user1.addTask(task1);
        user1.addTask(task2);

        user2.addTask(task2);
        user2.addTask(task3);



        Integer savedId=(Integer) session.save(user1);
        session.save(user1);
        session.save(user2);
        session.save(user3);


        transaction.commit();
        session.close();

            var search= PersonSearchDto.builder()
//                    .name("Joe")
//                    .email("test3@yandex.ru")
//                    .emailDomain("com")
//                    .isEnabled(false)
//                    .from(LocalDate.of(1980,02,22))
////                    .text("Guest")
////                    .orders(List.<Integer>of(1,3))
////                    .salaryFrom(1500L)
////                    .salaryTo(2500L)
////                    .notName("Ann")
                    .type(List.<Type>of(Type.ADMIN,Type.USER))
                    .build();

        Session session1 = HibernateConfig.createSession();
        Transaction transaction1 = session1.beginTransaction();


        Criteria criteria = session1.createCriteria(UserEntity.class,"ur");
        List result;

        if (search==null){
            result=criteria.list();
        }else {
            if (CollectionUtils.isNotEmpty(search.getType())){
                criteria.add(Restrictions.in("type",search.getType()));
            }
            if(nonNull(search.getFrom())){
                criteria.add(Restrictions.gt("birthday",search.getFrom()));
            }
//
//            if (isNotBlank(search.getText())){
//                criteria.add(Restrictions.or(Restrictions.like("name","%"+search.getText()+"%"),Restrictions.like("nickname","%"+search.getText()+"%")));
//            }
//            if (CollectionUtils.isNotEmpty(search.getOrders())){
//                criteria.add(Restrictions.in("order",search.getOrders()));
//            }
//            if (search.getSalaryFrom()!=null && search.getSalaryTo() != null ){
//                criteria.add(Restrictions.between("salary",search.getSalaryFrom(),search.getSalaryTo()));
//            }
//            if (isNotBlank(search.getNotName())){
//                criteria.add(Restrictions.not(Restrictions.eq("name",search.getNotName())));
//            }


        }
        Criteria tsk = criteria.createCriteria("ur.tasks", "tk");
        tsk.add(Restrictions.eq("tk.status", IN_PROGRESS));


        result = criteria.list();
        for (var userItem:result){
            System.out.println(userItem);
        }
// ----------------------------------------------------------


        transaction1.commit();
        session1.close();



    }
}