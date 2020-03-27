package com.ssh.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Shihb
 * On 3/27/2020.2:03 PM
 * @Data注解能自动生成get set tostring等方法不需要手动生成
 */
@Data
@Entity
@Table(name = "Person")
public class Person {

        @Id
        @GeneratedValue
        private Long id;

        @Column(name = "created")
        private Long created = System.currentTimeMillis();

        @Column(name = "username")
        private String username;

        @Column(name = "address")
        private String address;

        @Column(name = "phone")
        private String phone;

        @Column(name = "remark")
        private String remark;

}
