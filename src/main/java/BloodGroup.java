

import java.util.Objects;

public class BloodGroup {

    public String getBlood(String bloodGroup) {
        if (Objects.equals(bloodGroup, "A+")) {
            System.out.println("Person can donate blood to the  person who is having A+ and AB+");
            System.out.println("Person can receive blood from  the  person who is having A+, A-, O+, and O-");
        }


        if(Objects.equals(bloodGroup, "A-")){
            System.out.println("Person can donate blood to the  person who is having A+, B+, AB+, O+");
            System.out.println("Person can receive blood from  the  person who is having A-, and O-");
        }
        if(Objects.equals(bloodGroup, "O+")){
            System.out.println("Person can donate blood to the  person who is having O+, A+, B+, AB+");
            System.out.println("Person can receive blood from  the  person who is having O+, and O-");
        }

        if(Objects.equals(bloodGroup, "O-")){
            System.out.println("Person can donate blood to the all the groups ");
            System.out.println("Person can receive blood from  the  person who is having B-, and O-");
            System.out.println("they are called Universal Donor");
        }

        if(Objects.equals(bloodGroup, "B+")){
            System.out.println("Person can donate blood to the  person who is having B+ and AB+");
            System.out.println("Person can receive blood from  the  person who is having B+, B-, O+, and O-");
        }

        if(Objects.equals(bloodGroup, "B-")){
            System.out.println("Person can donate blood to the  person who is having B+, B-, AB+, AB-");
            System.out.println("Person can receive blood from  the  person who is having B-, and O-");
        }

        if(Objects.equals(bloodGroup, "AB+")){
            System.out.println("Person can donate blood to the  person who is having AB+");
            System.out.println("Person can receive blood from All the blood Groups");
            System.out.println("they are called Universal Receiver");
        }

        if(Objects.equals(bloodGroup, "AB-")){
            System.out.println("Person can donate blood to the  person who is having AB+ and AB-");
            System.out.println("Person can receive blood from  the  person who is having A-, B-, AB-, and O-");
        }
        return bloodGroup;
    }
}

