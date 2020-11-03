package QA.hsbc.Utilities;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class TaxCalculation {

	
	public float tax (int salary) {
		float t =0;
		if (salary>=2000) {
			t =(float)salary*25/100;
		}else {
			if (salary>=1000) {
			t =(float)salary*15/100;
		}else {
			t =0;
		}	
	
	}
		return t;
	}
}
