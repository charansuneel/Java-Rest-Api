package com.example.taskmanager.contract;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
public class Task {
    @Id
    private String id;
    private String name;
    private String assignee;
    private String project;
    private String startTime;
    private String charanSuneelProperty = "crnSl";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getCharanSuneelProperty() {
        return charanSuneelProperty;
    }

    public void setCharanSuneelProperty(String charanSuneelProperty) {
        this.charanSuneelProperty = charanSuneelProperty;
    }
}
