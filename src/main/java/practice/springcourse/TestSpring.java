package practice.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // положим в переменную, достаём из context наш Bean которому передали значение (id, class)
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        // после того как мы поработали с ApplicationContext мы обязательно должны его закрыть
        context.close();
    }
}
