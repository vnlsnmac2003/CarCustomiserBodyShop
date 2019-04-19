/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.model.job;

import com.carcustomiserbodyshop.model.Users.Employee;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Personal
 */
public class Job {
    
    private static int jobCounter;
    private final int id;
    private final Date date;
    private String status;
    private ArrayList<Task> tasks;
    private ArrayList<Employee> assignedEmployees;
    private String carRegistration;
    private String carMake;
    private String carModel;
    private String carType;
    private boolean paidFor;
    private int cost;
    
    public Job(Date date, ArrayList<Employee> assignedEmployees, ArrayList<Task> tasks,String carRegistration, 
            String carMake, String carModel, String carType){
        this.id = jobCounter;
        incrementJobCounter();
        this.date = date;
        this.assignedEmployees = assignedEmployees;
        this.tasks = tasks;
        this.carRegistration = carRegistration;
        this.carMake = carMake;
        this.carModel = carModel;
        this.carType = carType;
        this.paidFor = false;
        this.cost = 0;
    }
    
    public Job(Date date, ArrayList<Employee> assignedEmployees, ArrayList<Task> tasks,String carRegistration, 
            String carMake, String carModel, String carType, int cost){
        this.id = jobCounter;
        incrementJobCounter();
        this.date = date;
        this.assignedEmployees = assignedEmployees;
        this.tasks = tasks;
        this.carRegistration = carRegistration;
        this.carMake = carMake;
        this.carModel = carModel;
        this.carType = carType;
        this.paidFor = false;
        this.cost = cost;
    }
    
    
    public static int getJobCounter(){
        return jobCounter;
    }
    
    protected static void incrementJobCounter(){
        jobCounter += 1;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<Employee> getAssignedEmployees() {
        return assignedEmployees;
    }

    public void setAssignedEmployees(ArrayList<Employee> assignedEmployees) {
        this.assignedEmployees = assignedEmployees;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
    
    public void addTask(Task task){
        this.tasks.add(task);
    }

    public boolean isPaidFor() {
        return paidFor;
    }

    public void setPaidFor(boolean paidFor) {
        this.paidFor = paidFor;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
   
}
