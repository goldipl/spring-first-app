package springfirstapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

//		load the spring configuration xml file
//		ClassPathXmlApplicationContext context =
//				new ClassPathXmlApplicationContext("appxmlfile.xml");
		
		// load the spring configuration java file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		
		Trainer theTrainer = context.getBean("myTrainer", Trainer.class);
		
		System.out.println(theTrainer.getDailyWorkout());
		
		context.close();
	}

}
