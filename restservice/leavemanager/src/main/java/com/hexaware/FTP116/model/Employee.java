package com.hexaware.FTP116.model;

import com.hexaware.FTP116.persistence.DbConnection;
import com.hexaware.FTP116.persistence.EmployeeDAO;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.List;
import java.util.Date;
/**
 * Employee class to store employee personal details.
 * @author hexware
 */
public class Employee {
  /**
   * empId to store employee id.
   * empFullName to store employee name.
   * empEmailId to store employee email id.
   * empMobileNo to store employee moblie no.
   * empdateOfJoining to store employee date of joining.
  
   * empBalancee1 to store the employ leave balance.
      * empBalancep1 to store the employ leave balance.
     * empBalancem1 to store the employ leave balance.
   * empManagerId to store manager id.
    * empDepartment to store employee department;
   */
  private int empId;
  private String empFullName;
  private String empMobileNo;
  private Date empDateOfJoining;
//  private int empLeaveBalance;
  private int empManagerId;
  private String empEmailId;
    private int balanceEl;
  private int balancePl;
    private int balanceMl;
    private String empDepartment;
/**
 * Default Constructer.
 */
  public Employee() {

  }


  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Employee emp = (Employee) obj;
    if (Objects.equals(empId, emp.empId)
        && Objects.equals(empFullName, emp.empFullName)
        && Objects.equals(empMobileNo, emp.empMobileNo)
        && Objects.equals(empDateOfJoining, emp.empDateOfJoining)
       // && Objects.equals(empLeaveBalance, emp.empLeaveBalance)
        && Objects.equals(empManagerId, emp.empManagerId)
        && Objects.equals(empEmailId, emp.empEmailId)
         && Objects.equals(balanceEl, emp.balanceEl)
          && Objects.equals(balancePl, emp.balancePl)
         && Objects.equals(balanceMl, emp.balanceMl)
        && Objects.equals(empDepartment, emp.empDepartment)) {
      return true;
    }
    return false;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(empId, empFullName, empMobileNo, empDateOfJoining, empManagerId,
                        empEmailId, balanceEl, balancePl, balanceMl ,empDepartment);
  }
  @Override
  public final String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dj = sdf.format(empDateOfJoining);
    return "empId:" + empId + " empFullName:" + empFullName + " empMobileNo:" + empMobileNo + " empDateOfJoining:"
          + dj +" empManagerId:" + empManagerId
          + " empEmailId:" + empEmailId +"emeregency leave" +balanceEl+ "personal leave"+ balancePl +"meternal leave" +
           balanceMl + " empDepartment:" + empDepartment;
  }
  /**
   * @param argEmpId to initialize employee id.
   * @param argEmpFullName to initialize employee fullname.
   * @param argEmpEmailId to initialize employee email id.
   * @param argEmpMobileNo to initialize employee mobile no.
   * @param argEmpDateOfJoining to initialize employee date of joining.
    * @param argBalanceEl to initialize employee leave balance.
   * @param argBalancePl to initialize employee leave balance.
   * @param argBalanceMl to initialize employee leave balance.
   * @param argEmpManagerId to initialize employee manager id.
     * @param argEmpDepartment to initialize employee department.
   */
  public Employee(final int argEmpId, final String argEmpFullName, final String argEmpEmailId,
                  final String argEmpMobileNo, final Date argEmpDateOfJoining,
                  final int argBalanceEl,final int argBalancePl,final int argBalanceMl, final int argEmpManagerId
                  , final String argEmpDepartment) {
    this.empId = argEmpId;
    this.empFullName = argEmpFullName;
    this.empEmailId = argEmpEmailId;
    this.empMobileNo = argEmpMobileNo;
    this.empDateOfJoining = argEmpDateOfJoining;

        this.balanceEl = argBalanceEl;
        this.balancePl = argBalancePl;
            this.balanceMl = argBalanceMl;
    this.empManagerId = argEmpManagerId;
        this.empDepartment = argEmpDepartment;
  }

  /**
   * Gets the EmployeeId.
   * @return this Employee's ID.
   */
  public final int getEmpId() {
    return empId;
  }
  /**
   *
   * @param argEmpId to set employee id.
   */
  public final void setEmpId(final int argEmpId) {
    this.empId = argEmpId;
  }
  /**
   * Gets the Employee Name.
   * @return this Employee's name.
   */
  public final String getEmpFullName() {
    return empFullName;
  }
  /**
   * @param argEmpFullName to set employee name.
   */
  public final void setEmpFullName(final String argEmpFullName) {
    this.empFullName = argEmpFullName;
  }
  /**
   * gets the employee mobile no.
   * @return this employee's mobile no.
   */
  public final String getEmpMobileNo() {
    return empMobileNo;
  }
  /**
   * @param argEmpMobileNo to set employee mobile no.
   */
  public final void setEmpMobileNo(final String argEmpMobileNo) {
    this.empMobileNo = argEmpMobileNo;
  }
  
  
  /**
   * gets the employee date of joining.
   * @return this employee's date of joining.
   */
  public final Date getEmpDateOfJoining() {
    return empDateOfJoining;
  }
  /**
   * @param argEmpDateOfJoining to set employee date of joining.
   */
  public final void setEmpDateOfJoining(final Date argEmpDateOfJoining) {
    this.empDateOfJoining = argEmpDateOfJoining;
  }
  /**
   * gets the employee manager id.
   * @return this employee's manager id.
   */
  public final int getEmpManagerId() {
    return empManagerId;
  }
  /**
   * @param argEmpManagerId to set employee's manager id.
   */
  public final void setEmpManagerId(final int argEmpManagerId) {
    this.empManagerId = argEmpManagerId;
  }
  /**
   * Gets the Employee email id.
   * @return this Employee's email id.
   */
  public final String getEmpEmailId() {
    return empEmailId;
  }

  /**
   * @param argEmpEmailId to set employee email id.
   */
  public final void setEmpEmailId(final String argEmpEmailId) {
    this.empEmailId = argEmpEmailId;
  }
  /**
   * gets the employee leave details.
   * @return this employee's leave details.
   */
  public final int getBalanceEl() {
    return balanceEl;
  }
  /**
   * @param argBalanceEl to set Leave Status.
   */
  public final void setBalanceEl(final int argBalanceEl) {
    this.balanceEl = argBalanceEl;
  }

public final int getBalancePl() {
    return balancePl;
  }
  /**
   * @param argBalanceMl to set Leave Status.
   */
  public final void setBalancePl(final int argBalancePl) {
    this.balancePl = argBalancePl;
  }

  /**
   * Gets the Manager Comments on Leave.
   * @return this Manager Comments on Leave.
   */
  public final int getBalanceMl() {
    return balanceMl;
  }
   public final void setBalanceMl(final int argBalanceMl) {
    this.balanceMl = argBalanceMl;
  }

    /**
   * gets the employee department.
   * @return this employee's department.
   */
  public final String getEmpDepartment() {
    return empDepartment;
  }
  /**
   * @param argEmpDepartment to set employee department.
   */
  public final void setEmpDepartment(final String argEmpDepartment) {
    this.empDepartment = argEmpDepartment;
  }

  /**
   * the dao for class employee.
   * @return employeedao.
   */
  public static EmployeeDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployeeDAO.class);
  }
  /**
   * list all employee details.
   * @return all employees' details
   */
  public static Employee[] listAll() {
    List<Employee> es = dao().list();
    return es.toArray(new Employee[es.size()]);
  }
  /**
   * list employee details by id.
   * @param empID id to get employee details.
   * @return Employee
   */
  public static Employee listById(final int empID) {
    return dao().find(empID);
  }

}
