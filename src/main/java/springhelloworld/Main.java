package springhelloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhelloworld.model.Country;
import springhelloworld.model.StringHolder;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Country countryBean = (Country) ac.getBean("country");
        String name = countryBean.getName();
        System.out.println("Country name: " + name);
        long population = countryBean.getPopulation();
        System.out.println("Country population: " + population);

        StringHolder holder = (StringHolder) ac.getBean("stringHolder");
        System.out.println("Word: " + holder.getValue());

        holder = (StringHolder) ac.getBean("stringHolder");
        System.out.println("Word: " + holder.getValue());

        ac.close();
    }
}
