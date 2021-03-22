package com.restapi.tempservice;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.restapi.model.Employee;

@Component
public class TempService {
	private static List<Employee> list = new ArrayList<>();
	static {
		list.add(new Employee(1, "aamir khan", "mumbai", "sakinaka"));
		list.add(new Employee(2, "arman khan", "gao", "balaipur"));
		list.add(new Employee(3, "salman khan", "delhi", "govind"));
		list.add(new Employee(4, "furqan khan", "lucknow", "gomtinager"));
	}

	// get all details
	public List<Employee> getAllData() {
		return list;
	}

	// get details by id
	public Employee getByID(Integer id) {
		Employee employee = list.stream().filter(a -> a.getId() == id).findFirst().get();
		return employee;

	}
	// add details

	public Employee addDetails(Employee employee) {
		list.add(employee);
		return employee;

	}

}
