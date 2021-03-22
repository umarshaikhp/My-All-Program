package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.Employee;
import com.restapi.tempservice.TempService;

/*
here RestController is use for the restapi
and if we are using restcontroller then we do not need to @responsebody*/

@RestController
public class EmployeeController {

	@Autowired
	private TempService tempService;

	// @RequestMapping(value = "/books", method = RequestMethod.GET)
	/*
	 * it is a combination of method=RequestMethod.GET if we write get mapping then
	 * we do not need like method=RequestMethod.GET
	 */
	/*
	 * @ResponseBody // response body is use for when i want to return as string on
	 * browser then use // this
	 */

	@GetMapping("/fetch")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Sarfraz khan");
		employee.setAddress("saki naka ");
		employee.setcity("Mumbai");
		return employee;
		/*
		 * this is not JSON here spring boot automatically convert employee object into
		 * JSON because jackson already exists in spring boot then jackson covert into
		 * JSON
		 */

	}

	@GetMapping("/employee")
	public List<Employee> getAllRecord() {
		return this.tempService.getAllData();

	}

	/*
	 * @PathVariable It is use for handle the template variable in the URI mapping.
	 */
	@GetMapping("/findbyId/{id}")
	public Employee getID(@PathVariable("id") Integer id) {
		return this.tempService.getByID(id);

	}

	/*
	 * here is the @RequestBody is use for transfer for domain when client add any
	 * value that value will be in key and value pair and hit controller
	 * then @RequestBody is injected that values inside the bean that's it
	 */
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e) {
		Employee addDetails = this.tempService.addDetails(e);
		return addDetails;
	}

}
