package www.kodnest.springframework.SpringPrject01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        Student stobj=(Student)ctx.getBean("st");
        System.out.println(stobj);
        
        JavaTeacher jtobj=(JavaTeacher)ctx.getBean("jt");
        System.out.println(jtobj);
        
        SqlTeacher sqtobj=(SqlTeacher)ctx.getBean("sqt");
        System.out.println(sqtobj);
        
        PythonTeacher ptobj=(PythonTeacher)ctx.getBean("pt");
        System.out.println(ptobj);
        
        
    }
}
