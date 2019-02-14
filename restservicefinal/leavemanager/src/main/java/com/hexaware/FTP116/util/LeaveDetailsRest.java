package com.hexaware.FTP116.util;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import com.hexaware.FTP116.model.LeaveDetails;

/**
 * This class provides a REST interface for the employee entity.
 */
@Path("/leaveDetails")
public class LeaveDetailsRest {

  /**
   * Returns a list of all the employees.
   * @return a list of all the employees
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public final LeaveDetails[] leaveDetailsList() {
  //  System.out.println("Employees List");
    final LeaveDetails[] leaveDetails = LeaveDetails.listAll();
    //final Employee[] employees = Employee.listAll();
    return leaveDetails;
  }
  /**
   * @param empManagerId for input Employ Id.
   * @param e for input the leave details.
   * @param status for approval status.
   * @return the applied leave details.
   */
  @POST
  @Path("/approvedeny/{empManagerId}/{status}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public final String approvedenyRest(@PathParam("empManagerId") final int empManagerId,
             @PathParam("status") final String status, final LeaveDetails e) {
    String s = LeaveDetails.approveDeny(e.getLeaveId(), empManagerId, status,
                                            e.getLeaveMgrComments());
    return s;
  }
  /**
   * Returns a specific employee's details.
   * @param id the id of the employee
   * @return the employee details
   */
  @GET
  @Path("{id}")
  @Produces(MediaType.APPLICATION_JSON)
  //public final LeaveDetails[] listshowall()
  public final LeaveDetails leaveDetailsListById(@PathParam("id") final int id) {
    final LeaveDetails ld = LeaveDetails.listById1(id);
    if (ld == null) {
      throw new NotFoundException("No such Employee ID: " + id);
    }
    return ld;
  }
}




