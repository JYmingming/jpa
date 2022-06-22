package hellojpa;

import javax.persistence.*;


@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private  Long id;

    @Column(name="USERNAME")
    private String name;

    @Column(name= "TEAM_ID")
    private Long teamId;

}

