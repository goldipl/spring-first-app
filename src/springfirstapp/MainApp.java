package springfirstapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		// load the spring configuration file named 'appxmlfile.xml'
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("appxmlfile.xml");
		
		Trainer theTrainer = context.getBean("myTrainer", Trainer.class);
		
		System.out.println(theTrainer.getDailyWorkout());
		
		context.close();
	}

}
