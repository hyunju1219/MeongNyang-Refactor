package com.meongnyang.shop.entity;

import com.meongnyang.shop.security.principal.PrincipalUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private int membershipLevelId;
    private LocalDateTime createDate;
    private String provider;

    private Membership membership;
    private Set<UserRole> userRoles;

    public PrincipalUser toPrincipal() {
        return PrincipalUser.builder()
                .id(id)
                .username(username)
                .password(password)
                .userRoles(userRoles)
                .build();
    }
}
