/**
 * @author Arjun singh
 */
package com.arjun.core.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arjun.core.model.UserInformation;

public class SpringDependencyInjectionByCons {
   final static Logger logger = LoggerFactory.getLogger(SpringDependencyInjectionByCons.class);
  /**
   * @version 4.3.0
   * @since Aug 2016
   * @param args This is main method take string array argument args and return type void.
   */
  public static void main(final String[] args) {

    @SuppressWarnings("resource")
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("user-info.xml");
     UserInformation userInformation = (UserInformation) applicationContext.getBean("userIfo");
     System.out.println(userInformation.toString());
  }

}
