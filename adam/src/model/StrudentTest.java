package model;

import org.apache.log4j.Logger;

public class StrudentTest {
	private static Logger log = Logger.getLogger(StrudentTest.class);
	public static void main(String[] args) {
		StudentModel stu = new StudentModel();
		stu.setname("lile");
		stu.setage(25);
		stu.setsex("famale");
		log.debug(stu.getname()+" age: "+stu.getage()+" " + "sex: " +stu.getsex());
	}
}
