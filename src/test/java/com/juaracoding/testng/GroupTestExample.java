package com.juaracoding.testng;

import com.juaracoding.one.MessageUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestExample {
    String message = "com";
     MessageUtil messageUtil = new MessageUtil(message);

     @Test(groups = {"functest", "cheackintest"})
    public void testPrintMessage(){
       System.out.println("Inside testPrintMessage()");
       message = "com";
       Assert.assertEquals(message, messageUtil.printMessage());
     }

     @Test(groups = { "cheackintest"})
    public void testSalutationMessage(){
         System.out.println("Inside testSalutation Message()");
         message = "tutorialspoint" + ".com";
         Assert.assertEquals(message, messageUtil.salutationMessage());
     }

     @Test(groups = { "functest"})
    public void testingExitMessage(){
         System.out.println("Inside test ExitMessage()");
         message = "www." + "tutorialspoint" + ".com";
         Assert.assertEquals(message, messageUtil.ExitMessage());
     }
}