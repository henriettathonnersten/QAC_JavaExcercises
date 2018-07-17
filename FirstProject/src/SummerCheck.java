
public class SummerCheck {
 public boolean summerCheck(int temperature, boolean isSummer) {
	 if (isSummer) {
		 if (60 <= temperature && temperature <= 100)
			 return true;
		 else
			 return false;
	 }
	 else {
		 if (60 <= temperature && temperature <= 90)
			 return true;
		 else
			 return false;
	 }
	 
 }
}
