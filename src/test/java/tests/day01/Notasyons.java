package tests.day01;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Notasyons {

    @Test (priority = -2)
    public void Zeynep(){
        System.out.println("Zeynep Hasret KIRBAŞ");
    }

    @Test @Ignore
    public void Ceren(){
        System.out.println("Ceren KILIÇ");
    }

    @Test (dependsOnMethods = "Zeynep")
    public void Asuman(){
        System.out.println("Asuman ");
    }

    @Test
    public void Murat(){
        System.out.println("Murat BABAYİĞİT");
    }

}
