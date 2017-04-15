package com.htisolutions.jsonparser.models;

import java.util.List;

/**
 * A model to represent a single module
 */
public class Module {

    private String code;

    private String name;

    private List<Assessment> assessments;


    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Assessment> getAssessments() {
        return this.assessments;
    }

    public void setAssessments(List<Assessment> assessments) {
        this.assessments = assessments;
    }
}
