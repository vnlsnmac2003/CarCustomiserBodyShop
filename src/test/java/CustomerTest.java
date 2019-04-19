/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.carcustomiserbodyshop.model.Users.Customer;
import com.carcustomiserbodyshop.model.Users.VinylWrapper;
import com.carcustomiserbodyshop.model.Users.Employee;
import com.carcustomiserbodyshop.model.job.Job;
import com.carcustomiserbodyshop.model.job.Task;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Personal
 */
public class CustomerTest {

    Customer john;
    ConcurrentHashMap<Integer, Job> johnsJobs;
    ArrayList<Employee> assignedEmployees;
    ArrayList<Task> tasks;
    Date date;
    Job firstJob;
    Task task;
    VinylWrapper wrapper;

    public CustomerTest() {
        johnsJobs = new ConcurrentHashMap<>();
        assignedEmployees = new ArrayList<>();
        tasks = new ArrayList<>();

        date = new Date();
        firstJob = new Job(date, assignedEmployees, tasks, "RA02 MSY", "VOLKSWAGEN", "GOLF", "3-DOOR HATCHBACK");
        task = new Task("Remove Wrap");
        wrapper = new VinylWrapper(1,"Cedric", "Owusu", "C1000", "pass", "10 Gretchin Lane", "", "London", "NW10 2PE");

        assignedEmployees.add(wrapper);
        tasks.add(task);
        johnsJobs.put(firstJob.getId(), firstJob);

        john = new Customer("John", "Wilkings", "John1000", "pass", "10 Galpins road", "", "London", "CR0 3PP", johnsJobs);
        
    }

    @BeforeClass
    public static void setUpClass() {
        
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        
    }

    @After
    public void tearDown() {

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void paidFor() {
        john.payForJob(firstJob.getId());
        assertEquals(true,firstJob.isPaidFor());
    }
    
    @Test
    public void paidForIncorrectId(){
        Job secondJob = new Job(date, assignedEmployees, tasks, "RA02 MSY", "VOLKSWAGEN", "GOLF", "3-DOOR HATCHBACK");
        john.payForJob(secondJob.getId());
        assertEquals(true,secondJob.isPaidFor());
    }
}
