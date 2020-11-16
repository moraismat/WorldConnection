package com.world.worldconnection.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DataSchool implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String gradeSchool;
    private String course;
    private String educationalTeaching;
    private String conclusionYear;

    @OneToOne(mappedBy = "dataSchool", cascade = CascadeType.ALL)
    private User user;

    public DataSchool(){}
    public DataSchool(Integer id, String gradeSchool, String course, String educationalTeaching, String conclusionYear) {
        this.id = id;
        this.gradeSchool = gradeSchool;
        this.course = course;
        this.educationalTeaching = educationalTeaching;
        this.conclusionYear = conclusionYear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getGradeSchool() {
        return gradeSchool;
    }

    public void setGradeSchool(String gradeSchool) {
        this.gradeSchool = gradeSchool;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEducationalTeaching() {
        return educationalTeaching;
    }

    public void setEducationalTeaching(String educationalTeaching) {
        this.educationalTeaching = educationalTeaching;
    }

    public String getConclusionYear() {
        return conclusionYear;
    }

    public void setConclusionYear(String conclusionYear) {
        this.conclusionYear = conclusionYear;
    }

}
