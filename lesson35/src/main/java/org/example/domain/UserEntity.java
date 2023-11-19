package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Type type;
    private String dateOfBirth;
    private String gender;
    @OneToMany(mappedBy = "user",
//            ,fetch = FetchType.EAGER,
            cascade=CascadeType.ALL
    )
    private List<TaskEntity> tasks;

    public void addTask(TaskEntity task){
        if (tasks==null){
            tasks=new ArrayList<>();
        }
        tasks.add(task);
        task.setUser(this);
    }



    @CreationTimestamp
    private Date created;
    @UpdateTimestamp
    private Date updated;


}

