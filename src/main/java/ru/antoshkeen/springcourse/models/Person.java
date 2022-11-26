package ru.antoshkeen.springcourse.models;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "operationDate")
    private String operationDate;

    @Column(name = "cito")
    private String cito;


    @Column(name = "timeStart")
    private String timeStart;
    @Column(name = "timeFinish")
    private String timeFinish;

    @Column(name = "name")
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 3, max = 100, message = "Name should be between 3 and 100 characters")
    private String name;
    @Column(name = "region")
    private String region;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "department")
    private String department;

    @Column(name = "historyNumber")
    private int historyNumber;
    @Column(name = "timeDose")
    private String timeDose;

    @Column(name = "dose")
    @Min(value = 0, message = "This value should be greater than 0")
    private int dose;
    @Column(name = "stents")
    @Min(value = 0, message = "This value should be greater than 0")
    private int stents;

    @Column(name = "elevation")
    private String elevation;
   // private List<Operation> operationList;

    public Person(
                  String operationDate,
                  String cito,
                  String timeStart,
                  String timeFinish,
                  String name,
                  String region,
                  String birthday,
                  String department,
                  int historyNumber,
                  String timeDose,
                  int dose,
                  int stents,
                  String elevation) {
        this.operationDate = operationDate;
        this.cito = cito;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
        this.name = name;
        this.region = region;
        this.birthday = birthday;
        this.department = department;
        this.historyNumber = historyNumber;
        this.timeDose = timeDose;
        this.dose = dose;
        this.stents = stents;
        this.elevation = elevation;
       // this.operationList = operationList;
    }

   /* public List<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
    }*/


    public Person() {
        // Just an empty constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate;
    }

    public String getCito() {
        return cito;
    }

    public void setCito(String cito) {
        this.cito = cito;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeFinish() {
        return timeFinish;
    }

    public void setTimeFinish(String timeFinish) {
        this.timeFinish = timeFinish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getHistoryNumber() {
        return historyNumber;
    }

    public void setHistoryNumber(int historyNumber) {
        this.historyNumber = historyNumber;
    }

    public String getTimeDose() {
        return timeDose;
    }

    public void setTimeDose(String timeDose) {
        this.timeDose = timeDose;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public int getStents() {
        return stents;
    }

    public void setStents(int stents) {
        this.stents = stents;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }
}
