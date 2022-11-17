package ru.antoshkeen.springcourse.models;

public class Person {
    private int id;
    private String operationDate;
    private boolean cito;
    private String timeStart;
    private String timeFinish;
    private String name;

    private String region;
    private String birthday;
    private String department;
    private int historyNumber;
    private String timeDose;
    private int dose;
    private int stents;
    private boolean elevation;


    public Person() {
        // Just an empty constructor
    }

    public Person(int id,
                  String operationDate,
                  boolean cito,
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
                  boolean elevation) {
        this.id = id;
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

    public boolean getCito() {
        return cito;
    }

    public void setCito(boolean cito) {
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

    public boolean getElevation() {
        return elevation;
    }

    public void setElevation(boolean elevation) {
        this.elevation = elevation;
    }
}
