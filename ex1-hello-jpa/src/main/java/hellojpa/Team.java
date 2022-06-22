package hellojpa;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Team {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private  Long id;
    private  String name;

}
