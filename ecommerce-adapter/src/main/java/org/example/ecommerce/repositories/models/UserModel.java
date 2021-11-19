package org.example.ecommerce.repositories.models;

import java.time.Instant;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserModel extends BaseModel{
    private String code;
    private String name;
    private String account;
    private String password;
    private String email;
    private String phoneNumber;
    private String gender;
    private Instant birthday;
    private String img;
    private Long roleId;
    private String roleCode;
    private int status;
}
