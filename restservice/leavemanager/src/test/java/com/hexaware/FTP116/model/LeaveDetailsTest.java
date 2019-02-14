package com.hexaware.FTP116.model;

//import com.hexaware.FTP116.model.LeaveDetails;

import com.hexaware.FTP116.persistence.LeaveDetailsDAO;
import com.hexaware.FTP116.persistence.EmployeeDAO;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.text.ParseException;

import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import java.util.Date;


import mockit.Expectations;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Mock;
import mockit.integration.junit4.JMockit;

import java.util.ArrayList;

/**
 * Test class for Employee.
 */
@RunWith(JMockit.class)
public class LeaveDetailsTest {

  /**
   * setup method.
   */
  @Before
  public void initInput() {

  }
/**
 *test for default constructor.
 */
  @Test
  public final void testDefaultConstructor() {
    LeaveDetails l1 = null;
    assertNull(l1);
    LeaveDetails l2 = new LeaveDetails();
    assertNotNull(l2);
  }

/**
 *test for Param constructor.
 *@throws ParseException for checking date parsing values.
 */
  @Test
  public final void testParamConstructor() throws ParseException {
    SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-MM-dd");
    String s1 = "2019-02-07";
    SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd");
    String s2 = "2019-02-07";
    SimpleDateFormat sdf3 = new SimpleDateFormat("YYYY-MM-dd");
    String s3 =  "2019-02-06";
    Date sdate = sdf1.parse(s1);
    Date edate = sdf2.parse(s2);
    Date adate = sdf3.parse(s3);
    LeaveDetails l3 = new LeaveDetails(1000, 1, LeaveType.ML, sdate, edate, adate, "sick", 1,
        LeaveStatus.PENDING, "get well soon");
    assertEquals(1000, l3.getLeaveEmpId());
    assertEquals(1, l3.getLeaveId());
    assertEquals(LeaveType.ML, l3.getLeaveType());
    assertEquals(sdate, l3.getLeaveStartDate());
    assertEquals(edate, l3.getLeaveEndDate());
    assertEquals(adate, l3.getLeaveAppliedOn());
    assertEquals("sick", l3.getLeaveReason());
    assertEquals(1, l3.getLeaveNumOfDays());
    assertEquals(LeaveStatus.PENDING, l3.getLeaveStatus());
    assertEquals("get well soon", l3.getLeaveMgrComments());
    LeaveDetails l1 = new LeaveDetails();
    l1.setLeaveEmpId(2000);
    assertEquals(2000, l1.getLeaveEmpId());
    l1.setLeaveId(2);
    assertEquals(2, l1.getLeaveId());
    l1.setLeaveType(LeaveType.PL);
    assertEquals(LeaveType.PL, l1.getLeaveType());
    l1.setLeaveStartDate(sdate);
    assertEquals(sdate, l1.getLeaveStartDate());
    l1.setLeaveEndDate(edate);
    assertEquals(edate, l1.getLeaveEndDate());
    l1.setLeaveAppliedOn(adate);
    assertEquals(adate, l1.getLeaveAppliedOn());
    l1.setLeaveReason("home town");
    assertEquals("home town", l1.getLeaveReason());
    l1.setLeaveNumOfDays(1);
    assertEquals(1, l1.getLeaveNumOfDays());
    l1.setLeaveStatus(LeaveStatus.APPROVED);
    assertEquals(LeaveStatus.APPROVED, l1.getLeaveStatus());
    l1.setLeaveMgrComments("Enjoy your journey");
    assertEquals("Enjoy your journey", l1.getLeaveMgrComments());

    LeaveDetails l2 = new LeaveDetails(2000, 3, LeaveType.ML, sdate, edate, adate, "sick", 1,
        LeaveStatus.APPROVED, "get well soon");
    LeaveDetails l4 =  new LeaveDetails(2000, 3, LeaveType.ML, sdate, edate, adate, "sick", 1,
        LeaveStatus.APPROVED, "get well soon");
    assertEquals(l2.hashCode(), l4.hashCode());
    String res = "leaveEmpId:2000 leaveId:3 leaveType:ML leaveStartDate:2018-12-30"
        + " leaveEndDate:2018-12-30 leaveAppliedOn:2018-12-30 leaveReason:sick leaveNumOfDays:1"
        + " leaveStatus:APPROVED leaveMgrComments:get well soon";
    assertEquals(res, l2.toString());
    LeaveDetailsDAO ldo = LeaveDetails.dao();
    assertNotNull(ldo);
    EmployeeDAO ledo = LeaveDetails.edao();
    assertNotNull(ledo);
    assertEquals(l2, l4);
    assertNotEquals(l2, l1);
    Employee e7 = new Employee();
    assertNotEquals(l2, e7);



    LeaveDetails l5 = null;
    assertNotEquals(l2, l5);
    Employee em = new Employee();
    assertNotEquals(l2, em);
    assertEquals(l2, l4);
  }
  /**
   *@param dao leave details pending.
   */
  @Test
public final void testPending(@Mocked final LeaveDetailsDAO dao) {
    new Expectations() {
      {
        dao.pending(100);
        result = new ArrayList<LeaveDetails>();
      }
    };
    new MockUp<LeaveDetails>() {
      @Mock
    LeaveDetailsDAO dao() {
        return dao;
      }
    };
    LeaveDetails[] es = LeaveDetails.listPending(100);
    assertEquals(0, es.length);
  }
  /**
   *Tests that a list with some employees is handled correctly.
   *@param edao mocking the dao class.
   *@param ldao mocking the dao class.
   *@throws ParseException for values.
   */
  @Test
public final void  testListApplyLeave(@Mocked final EmployeeDAO edao, @Mocked final LeaveDetailsDAO ldao)
                                       throws ParseException {
    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    final  String s2 = "2019-03-07";
    final  Date doj = sdf.parse(s2);
    final  Date today = new Date();
    final String strToday = sdf.format(today);
    final Employee e100 = new Employee(100, "Niru", "Dotnet@gmail.com", "12345677", doj, "Programmer", 4, 200);
    final Employee e101 = new Employee(101, "mika", "mika@gmail.com", "12345678", doj, "tester", 5, 100);

    new Expectations() {
      {

        ldao.count(100, "2019-03-30", "2019-03-30");
        result = 0;
        ldao.count(100, "2019-03-29", "2019-03-30");
        result = 1;

      }
      };
    new MockUp<LeaveDetails>() {
        @Mock
        LeaveDetailsDAO dao() {
            return ldao;
        }
    };
    LeaveDetails[] lsr1 = LeaveDetails.listAll(1);
    assertNotEquals(3, lsr1.length);
    LeaveDetails[] lsr2 = LeaveDetails.listAll(2);
    assertNotEquals(2, lsr2.length);
  }
/**
 *@param edao for EmployeeDAO.
 *@param ldao for LeaveDetailsDAO.
 *@throws ParseException for converting date to string.
 */
  @Test
  public final void testApplyLeave(@Mocked final EmployeeDAO edao, @Mocked final LeaveDetailsDAO ldao)
  throws ParseException {
    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    final String s1 = "1998-12-12";
    final Date doj = sdf.parse(s1);
    final Date today = new Date();
    final String strToday = sdf.format(today);
    final Employee e1 = new Employee(100, "2019-04-16", "2019-04-17");
   // final Employee e101 = new Employee(101, "2019-04-28", "2019-04-29");
    new Expectations() {
          {
            edao.count(100, "2019-04-16", "2019-04-17"); result = 1;
            //ldao.count(100, "2019-04-30", "2019-04-30"); result = 0;
            edao.count(100, "2019-04-30", "2019-04-30"); result = 0;
          }
      };
    new Expectations() {
          {
            edao.insert("2019-04-20", "2019-04-21", 2, strToday, "sick", 100, LeaveStatus.APPROVED, LeaveType.ML);
            //ldao.insert("2019-04-30", "2019-04-30", 1, "2019-02-08", "sick", 200, LeaveStatus.APPROVED, LeaveType.ML);
          }
      };
    new Expectations() {
      {
        edao.find(100);
        result = e1;
        // edao.find(101);
        // result = e101;
        edao.find(-1);
        result = null;
      }
    };
    new MockUp<LeaveDetails>() {
      @Mock
    LeaveDetailsDAO dao() {
        return ldao;
      }
      };
    new MockUp<Employee>() {
      @Mock
    EmployeeDAO dao() {
        return edao;
      }
    };
    String res1 = LeaveDetails.applyLeave("2019-03-17", "2019-03-16", 2, "sick", 100, LeaveType.EL);
    assertEquals(res1, "Enter correct number of days as 0");
    String res2 = LeaveDetails.applyLeave("2019-04-20", "2019-04-21", 5, "sick", 100, LeaveType.EL);
    assertEquals(res2, "insufficient leave balance..");
    String res3 = LeaveDetails.applyLeave("2019-04-20", "2019-04-21", 2, "sick", 100, LeaveType.EL);
    assertEquals(res3, "leave Applied successfully...");
    String res4 = LeaveDetails.applyLeave("2019-04-20", "2019-04-21", 2, "sick", 100, LeaveType.EL);
    assertEquals(res4, "leave Applied successfully...");
    String res5 = LeaveDetails.applyLeave("2019-04-26", "2019-04-26", 1, "sick", 100, LeaveType.EL);
    assertEquals(res5, "leave Applied successfully...");
    String res6 = LeaveDetails.applyLeave("2019-03-30", "2019-03-30", 0, "sick", 100, LeaveType.EL);
    assertEquals(res6, "Enter correct number of days as 1");
    String res7 = LeaveDetails.applyLeave("2019-04-20", "2019-04-20", 1, "sick", 100, LeaveType.EL);
    assertEquals(res7, "leave Applied successfully...");
    String res8 = LeaveDetails.applyLeave("2019-04-20", "2019-04-21", 2, "sick", -1, LeaveType.EL);
    assertEquals(res8, "Employee id not found");

    //Employee[] es = Employee.listAll();
    //assertEquals(2, es.length);
    //assertEquals(new LeaveDetails(1), es[1]);
    //.assertEquals(new LeaveDetails(4), es[2]);
  /**
   *@param dao leave details pending.
   */
//   @Test
//  public final void testPending(@Mocked final LeaveDetailsDAO dao) {
//      new Expectations() {
//        {
//          dao.pending(100);
//          result = new ArrayList<LeaveDetails>();
//        }
//      };
//      new MockUp<LeaveDetails>() {
//        @Mock
//      LeaveDetailsDAO dao() {
//          return dao;
//        }
//    };
    LeaveDetails[] es = LeaveDetails.listPending(100);
    assertEquals(0, es.length);
  }
  /**
   *@param dao for leaveDetails.
   *@throws ParseException for null values.
   */
  @Test
        public final void testListApplyPending(@Mocked final LeaveDetailsDAO dao) throws ParseException {
    new Expectations() {
      {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      }
    };
  }
}






