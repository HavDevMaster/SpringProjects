package com.zoo.biz.controller;


import java.math.BigDecimal;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.zoo.biz.entity.Staff;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;


@Validated
@RequestMapping("/Staff")
@OpenAPIDefinition(info = @Info(title = "staff"), servers = {
    @Server(url = "http://localhost:8080", description = "Local server.")})
public interface zooBizController {

//need one of these for the different functions 
  //i.e. Deleting, Creating, etc.
  // @formatter:off
  @Operation(
      summary = "Returns a staff member",
      description = "Returns a staff given a first and last name",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "An Employee is returned",
              content = @Content(
                  mediaType = "application/json", 
                  schema = @Schema(implementation = Staff.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The request parameters are invalid",  
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "No Employees were found with the input criteria",  
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred.",  
              content = @Content(mediaType = "application/json"))
      },
      parameters = {
          @Parameter(name = "firstName", 
              allowEmptyValue = false, 
              required = false, 
              description = "The first name (i.e., 'Jojo')"),
          @Parameter(name = "lastName", 
          allowEmptyValue = false, 
          required = false, 
          description = "The last name (i.e., 'Mel')")
      }
  )
  //this is for gets not deletes, postmapping, deletemapping etc for the methods 
  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
  List<Staff> fetchStaff(
      @RequestParam(required = false)
      String firstName, 
      //@Pattern(regexp = "[\\w\\s]*")
      @RequestParam(required = false)
      String lastName);
  //@formatter:on


// /all 
// @formatter:off
@Operation(
    summary = "Returns all Employees",
    description = "Returns a List of Employees",
    responses = {
        @ApiResponse(
            responseCode = "200",
            description = "A List of all Employees is returned",
            content = @Content(
                mediaType = "application/json", 
                schema = @Schema(implementation = Staff.class))),
        @ApiResponse(
            responseCode = "400", 
            description = "The request parameters are invalid",  
            content = @Content(mediaType = "application/json")),
        @ApiResponse(
            responseCode = "404", 
            description = "No Employees were found with the input criteria",  
            content = @Content(mediaType = "application/json")),
        @ApiResponse(
            responseCode = "500", 
            description = "An unplanned error occurred.",  
            content = @Content(mediaType = "application/json"))
    }
)
//this is for gets not deletes, postmapping, deletemapping etc for the methods 
      @GetMapping("/all")
      @ResponseStatus(code = HttpStatus.OK)
      List<Staff> fetchAllEmployees();  
 //@formatter:on


//POST
//Create Method CreateEmployees
//createEmployee
// @formatter:off
@Operation(
    summary = "Returns a new staff",
    description = "Returns a staff given a first and last name",
    responses = {
        @ApiResponse(
            responseCode = "201", 
            description = "A new Employee has been created",
            content = @Content(
                mediaType = "application/json", 
                schema = @Schema(implementation = Staff.class))),
        @ApiResponse(
            responseCode = "400", 
            description = "The request parameters are invalid",  
            content = @Content(mediaType = "application/json")),
        @ApiResponse(
            responseCode = "404", 
            description = "No Employees component was not found with the input criteria",  
            content = @Content(mediaType = "application/json")),//maybe reword
        @ApiResponse(
            responseCode = "500", 
            description = "An unplanned error occurred.",  
            content = @Content(mediaType = "application/json"))
    },
    parameters = {
        @Parameter(name = "firstName", 
            allowEmptyValue = false, 
            required = false, 
            description = "The first name (i.e., 'Jojo')"),
        @Parameter(name = "lastName", 
        allowEmptyValue = false, 
        required = false, 
        description = "The last name (i.e., 'Mel')"),
         @Parameter(name = "phone", 
          allowEmptyValue = false, 
          required = false, 
          description = "phone (i.e., '555-555-5558')")
    }
    
)
//this is for gets not deletes, postmapping, deletemapping etc for the methods 
      @PostMapping
      @ResponseStatus(code = HttpStatus.CREATED)
      Staff createStaff(String firstName, String lastName, String phone);
//@formatter:on



//Deletes Employee 
//deleteEmployee
// @formatter:off
@Operation(
    summary = "Deletes an Employee",
    description = "Deletes an Employee given an id",
    responses = {
        @ApiResponse(
            responseCode = "200",
            description = "Employee was deleted",
            content = @Content(
                mediaType = "application/json", 
                schema = @Schema(implementation = Staff.class))),
        @ApiResponse(
            responseCode = "400", 
            description = "The request parameters are invalid",  
            content = @Content(mediaType = "application/json")),
        @ApiResponse(
            responseCode = "404", 
            description = "No Employees were found with the input criteria",  
            content = @Content(mediaType = "application/json")),
        @ApiResponse(
            responseCode = "500", 
            description = "An unplanned error occurred.",  
            content = @Content(mediaType = "application/json"))
    },
    parameters = {
        @Parameter(name = "employeePK", 
            allowEmptyValue = false, 
            required = false, 
            description = "employeePK (i.e., 3)"),
    }
)
//this is for gets not deletes, postmapping, deletemapping etc for the methods 
    @DeleteMapping("/staffPK")
    @ResponseStatus(code = HttpStatus.OK)
    void deleteEmployee(int deleteId); 
//    @RequestParam(required = false)
//    int employeePK, 

 //@formatter:on


//

//PUT Update 
//EmployeeUpdate
//updateEmployee
//@formatter:off
@Operation(
  summary = "Returns an updated Employee",
  description = "Returns a Employee to update given an id",
  responses = {
      @ApiResponse(
          responseCode = "200",
          description = "An updated Employee is returned",
          content = @Content(
              mediaType = "application/json", 
              schema = @Schema(implementation = Staff.class))),
      @ApiResponse(
          responseCode = "400", 
          description = "The request parameters are invalid",  
          content = @Content(mediaType = "application/json")),
      @ApiResponse(
          responseCode = "404", 
          description = "No Employees were found with the input criteria",  
          content = @Content(mediaType = "application/json")),
      @ApiResponse(
          responseCode = "500", 
          description = "An unplanned error occurred.",  
          content = @Content(mediaType = "application/json"))
  },
  /*
        parameters = {
        @Parameter(name = "firstName", 
          allowEmptyValue = false, 
          required = false, 
          description = "The first name (i.e., 'Jojo')"),
        @Parameter(name = "lastName", 
        allowEmptyValue = false, 
        required = false, 
        description = "The last name (i.e., 'Mel')"),
        @Parameter(name = "payRate", 
        allowEmptyValue = false, 
        required = false, 
        description = "Pay rate (i.e., '15')")
        */
  parameters = {
      @Parameter(name = "employeePK", 
          allowEmptyValue = false, 
          required = false, 
          description = "The Employee's Id within our database")
}
  
)
//this is for gets not deletes, postmapping, deletemapping etc for the methods 
@PutMapping
@ResponseStatus(code = HttpStatus.OK) //this may need to be tweaked a tad 
Staff updateStaff(
  int employeePK, 
   @RequestBody Staff updatedStaff);
  /*
  @RequestParam(required = false)
  String firstName, 
  //@Pattern(regexp = "[\\w\\s]*")
  @RequestParam(required = false)
  String lastName,
  @RequestParam(required = false)
  BigDecimal payRate);
  */
//@formatter:on


}
//
  
  

