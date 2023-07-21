package golde.comet.assessment.objects;

import java.lang.reflect.Field;
import java.util.Objects;

public class ObjectNullChecks {

    public static void main(String[] args) {
        Object objectNullChecks = new Object();
        System.out.println(referenceIsNull(objectNullChecks,"test"));

        Object objectNotNull= new Test();
        System.out.println(referenceIsNull(objectNotNull,"test"));
    }

    public static boolean referenceIsNull(Object obj,String referenceName) {
        if(Objects.isNull(obj)) {
            System.out.print(referenceName + " is null / ");
            return true;
        }
        try{
            obj.getClass().getDeclaredField(referenceName);
        } catch (NoSuchFieldException e) {
            System.out.print(referenceName + " is null /");
            return true;
        }
        System.out.print(referenceName + " is not null /");
        return false;
    }

    public static class Test {
        private String test;
    }
}
