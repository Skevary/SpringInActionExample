package knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) throws QuestException {

	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
	Knight knight = (Knight) context.getBean("knight");
	knight.embarkOnQuest();

    }

}
