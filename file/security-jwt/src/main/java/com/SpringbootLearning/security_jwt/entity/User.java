package com.SpringbootLearning.security_jwt.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    private String userName;
    private String userFirstName;
    private String userLastname;
    private String userPassword;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",joinColumns = {
            @JoinColumn(name = "USER_ID")
    },
            inverseJoinColumns = {
            @JoinColumn(name = "ROLE_ID")
            }
    )
    private Set<Role> role;


}
