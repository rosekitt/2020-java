public class WrapperInteger {
	public static void main(String[] args) {
		Integer age= new Integer(21);
		Integer snum = new Integer("20202254");
		
		System.out.println("나이 : " + age.intValue());
		System.out.println("학번: " + snum.intValue());
		System.out.println(age.equals(snum));
		
		System.out.println(Integer.parseInt("24567"));
		System.out.println(Integer.parseInt("ff",16));
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toString(255, 16));
	}
}
