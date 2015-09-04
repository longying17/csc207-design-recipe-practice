
public class DesignRecipe {

	public static String[] intersperse(String s, String[] arr) {
		if(s == null || arr == null){
			return null;
		} else if (arr.length < 2){
			return arr;
		} else {
			String[] ret = new String[2 * arr.length - 1];
			for (int i = 0; i < arr.length - 1; i++) {
				ret[2 * i] = arr[i];
				ret[2 * i + 1] = s;
			}
			ret[ret.length - 1] = arr[arr.length - 1];
			return ret;
		}	
	}
	
	static String arrToString (String[] arr) {
		if (arr == null)
			return "null";
		else {
			String str = "{";
			for (int i = 0; i < arr.length; i++) {
				str += "\"" + arr[i] + "\"";
				if (!(i == arr.length - 1))
					str += ", ";
			}
			str += "}";
			return str;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] empArr = new String[0];
		String[] arr1 = {"1"};
		String[] arr2 = {"1", "2"};
		String[] arr3 = {"1", "2", "3"};
		System.out.println("Calling intersperse(null, null) returns " + 
				arrToString(intersperse(null, null)));
		System.out.println("Calling intersperse(null, {}) returns " + 
				arrToString(intersperse(null, empArr)));		
		System.out.println("Calling intersperse(\"Hi\", null) returns " + 
				arrToString(intersperse("Hi", null)));
		System.out.println("Calling intersperse(\"Hi\", {\"1\"}) returns " + 
				arrToString(intersperse("Hi", arr1)));
		System.out.println("Calling intersperse(\"Hi\", {\"1\", \"2\"}) returns " + 
				arrToString(intersperse("Hi", arr2)));
		System.out.println("Calling intersperse(\"Hi\", {\"1\", \"2\", \"3\"}) returns " + 
				arrToString(intersperse("Hi", arr3)));
	}
}
