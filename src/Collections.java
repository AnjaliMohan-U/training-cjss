import com.cjss.training.model.EmployeeModel;
import com.cjss.training.model.ProductsModel;
import com.cjss.training.model.SkuModel;
import com.cjss.training.students.*;

import java.util.*;

/**
 * ArrayList - To store collection of elements. Insertion order - same,
 * duplicates allowed HashSet - Insertion order - unordered HashMap - hash table
 * based implementation of Java Generics - Restrict the type of object that can
 * be stored in collection
 */
public class Collections {
	public static void main(String args[]) {

		List al1 = new ArrayList();
		al1.add("Rama");
		al1.add("test1");
		al1.add("test");
		al1.add("Rama");
		al1.add("10");
		al1.add("10.2");
		// al1.get(0);
		// al1.add(1, "newTest");
		// al1.set(2, "newTest");
		// remove()
		// set(0, "test")

//        System.out.println(al1);
//         for (Object o: al1) {
//            System.out.println(o);
//        }

		Set set1 = new HashSet();
		set1.add("Rama");
		set1.add("test1");
		set1.add("test");
		set1.add("Rama");
		set1.add("10");
		set1.add("10.2");

//        System.out.println(set1);

		Map map1 = new HashMap();
		map1.put("gmail", "g123");
		map1.put("mac", "m123");
		map1.put("hotmail", 123);

//        for (Object key: map1.keySet()) {
//            System.out.println("Key: " + key + " value: " + map1.get(key));
//        }

		List<Float> al2 = new ArrayList<>();
		al2.add(10f);
		al2.add(20f);

//         for (Float o: al2) {
//            System.out.println(o);
//        }

		Map<String, String> map2 = new HashMap<>();
		map2.put("gmail", "g123");
		map2.put("mac", "m123");
//        map2.put("hotmail", 123);

		// employeeNo,name,salary
		//

		List<EmployeeModel> employees = new ArrayList<>();
		EmployeeModel employee1 = new EmployeeModel("E101", "Name1", "10000");
		EmployeeModel employee2 = new EmployeeModel("E102", "Name2", "20000");
//        employee2.setEmployeeNo("E102");
//        employee2.setEmployeeName("Name2");
//        employee2.setSalary("20000");

		employees.add(employee1);
		employees.add(employee2);

		for (EmployeeModel employee : employees) {
			System.out.println(employee.getEmployeeNo() + " : " + employee.getEmployeeName());

		}

		// List of products (productId, productName)
		// skus - skuId, skuSize, price

		SkuModel sku1 = new SkuModel("sku1", "M", 200f);
		SkuModel sku2 = new SkuModel("sku2", "L", 210f);
		SkuModel sku3 = new SkuModel("sku3", "S", 190f);
		SkuModel sku4 = new SkuModel("sku4", "M", 300f);

		List<SkuModel> skus1 = new ArrayList<>();
		skus1.add(sku1);
		skus1.add(sku2);
		skus1.add(sku3);
		List<SkuModel> skus2 = new ArrayList<>();
		skus2.add(sku4);
		skus2.add(sku2);
		ProductsModel product1 = new ProductsModel("product1", "pName1", skus1);
		ProductsModel product2 = new ProductsModel("product2", "pName2", skus2);

		List<ProductsModel> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);

		// TODO: Print Product and SKU information
		for (ProductsModel product : products) {
//      	  System.out.println(product.getProductId() + " : " + product.getProductName() + product.getSkus() );
			System.out.println(product.toString());
		}

		System.out.println(
				"//-------------------------------------------Task1-------------------------------------------------//");
		List<Student> students = new ArrayList<>();
		Student student1 = new Student("01", "stu1", "cse", "1");
		Student student2 = new Student("02", "stu2", "eee", "1");
		Student student3 = new Student("03", "stu3", "civ", "4");
		Student student4 = new Student("04", "stu4", "civ", "2");

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		for (Student student : students) {
			if (student.getYear() == "1") {
				System.out.println(student.toString());
			}
		}

		// ---------------------------------------------------------------------------------------------//
		List<StudentFee> studentfees = new ArrayList<>();
		StudentFee fee1 = new StudentFee("01", 5500.0);
		StudentFee fee2 = new StudentFee("02", 6500.0);
		StudentFee fee3 = new StudentFee("03", 4500.0);
		StudentFee fee4 = new StudentFee("04", 3500.0);

		studentfees.add(fee1);
		studentfees.add(fee2);
		studentfees.add(fee3);
		studentfees.add(fee4);

//        for(Object fee: studentfees) {
//      	  System.out.println(studentfees.toString() );
//        }

		// -------------------------------------------------Task-2---------------------------------------------//
		// Task 2: Print all students rno, name, branch, amount, date
		System.out.println(
				"//-------------------------------------------Task2-------------------------------------------------//");

		for (Student student : students) {
			for (StudentFee fee : studentfees) {
				if (student.getRno() == fee.getRno()) {
					System.out.println("rno=" + student.getRno() + " name=" + student.getName() + " branch="
							+ student.getBranch() + " amount=" + fee.getAmount());
				}
			}
		}

		// ---------------------------------------------Task3-------------------------------------------------//
		Map<String, String> subjects = new HashMap<>();
		subjects.put("1", "english");
		subjects.put("2", "maths");
		subjects.put("3", "science");

		System.out.println("//-------------------------------------Task-3---------------------------------------");
		List<StudentMarks> student1marks = new ArrayList<>();
		StudentMarks student11 = new StudentMarks("01", "1", "1", "98");
		StudentMarks student12 = new StudentMarks("01", "1", "2", "95");
		StudentMarks student13 = new StudentMarks("01", "1", "3", "90");

		student1marks.add(student11);
		student1marks.add(student12);
		student1marks.add(student13);

		List<StudentMarks> student2marks = new ArrayList<>();
		StudentMarks student21 = new StudentMarks("02", "1", "1", "50");
		StudentMarks student22 = new StudentMarks("02", "1", "2", "67");
		StudentMarks student23 = new StudentMarks("02", "1", "3", "91");

		student2marks.add(student21);
		student2marks.add(student22);
		student2marks.add(student23);

		List<StudentMarks> student3marks = new ArrayList<>();
		StudentMarks student31 = new StudentMarks("03", "4", "1", "40");
		StudentMarks student32 = new StudentMarks("03", "4", "2", "72");
		StudentMarks student33 = new StudentMarks("03", "4", "3", "41");

		student3marks.add(student31);
		student3marks.add(student32);
		student3marks.add(student33);

		StudentMarks student41 = new StudentMarks("04", "2", "1", "40");
		StudentMarks student42 = new StudentMarks("04", "2", "2", "40");
		StudentMarks student43 = new StudentMarks("04", "2", "3", "40");
		List<StudentMarks> student4marks = Arrays.asList(student41, student42, student43);

		List<StudentMarks> allstudents = new ArrayList<>();
		allstudents.addAll(student1marks);
		allstudents.addAll(student2marks);
		allstudents.addAll(student3marks);
		allstudents.addAll(student4marks);

		for (Student s : students) {
			System.out.println("\n");
			for (StudentMarks m : allstudents) {
				if (s.getRno() == m.getRno()) {
					for (Object key : subjects.keySet()) {
						if (key == m.getSubjectNo()) {
							System.out.println("rno= " + s.getRno() + " sname=" + s.getName() + " subject= "
									+ subjects.get(key) + " marks= " + m.getMarks());
						}

					}
				}
			}
		}
		System.out.println("\n"
				+ "-----------------------StudentsMarks in sorted order based on year-----------------------------");
		allstudents.sort(new MarksComparator());
		for (StudentMarks s : allstudents) {
			System.out.println(s.toString());

		}
	}
}

//System.out.println("-----------------------Students in sorted order based on year-----------------------------");
//students.sort(new YearComparator());
//for(Student s: students) {
//  System.out.println(s);
//}
//

/*
 * Task ---- Define below classes Student (rno, name, branch, year) StudentFee
 * (rno, amount, date) Subjects(subjectNo, subjectName) StudentMarks(rno, year,
 * subjectNo, marks) Task 1: Print student rno, name, branch of 1st year
 * students Task 2: Print all students rno, name, branch, amount, date Task 3:
 * Print all students rno, name, subjectName, marks Task 3: Print all students
 * rno, name, subjectName, marks order by year Note: To take input use Scanner
 * as per https://www.javatpoint.com/how-to-get-input-from-user-in-java
 */