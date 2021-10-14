import java.util.Comparator;
import com.cjss.training.model.EmployeeModel;
import com.cjss.training.model.ProductsModel;
import com.cjss.training.model.SkuModel;
import com.cjss.training.students.*;

import java.util.*;

public class MarksComparator implements Comparator<StudentMarks> {

	@Override
	public int compare(StudentMarks o1, StudentMarks o2) {
		// TODO Auto-generated method stub
		return o1.getYear().compareTo(o2.getYear());
	}

}
