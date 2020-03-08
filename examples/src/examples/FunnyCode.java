package examples;

public class FunnyCode {
	
	//newbie, 11 lines
		public static String getSexA(int num) 
		{
			if(num==0) 
			{
				return "Female";
			}
			else 
			{
				return "Maile";
			}
		}
		// 1 year later , 6 lines
		public static String getSexB(int num) {
			if(num==0) {
				return "Female";
			}
			return "Maile";
		}
		// 2 year later , 4 lines
		public static String getSexC(int num) {
			if(num==0) return "Female";
			return "Male";
		}
		// 3 years later and lazy writing, 3 lines
		public static String getSexD(int num) {
			return num==0 ? "Female" : "Male";
		}

}
