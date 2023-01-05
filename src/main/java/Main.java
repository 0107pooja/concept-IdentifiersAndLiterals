
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PerfectAge perfectAge =new PerfectAge();

        Scanner sc= new Scanner(System.in);

        BloodGroup group =new BloodGroup();
        PersonData personData= new PersonData();

        System.out.println(" Enter the Name");
        String personName=sc.nextLine();
        personData.setName(personName);

        System.out.println(" Enter the Blood Group");
        String bloodGroup = sc.nextLine();
        personData.setBloodGroup(bloodGroup);

        System.out.println(" Enter the Age");
        int personAge=sc.nextInt();
        personData.setAge(personAge);

        System.out.println(" Enter the Height");
        float personHeight=sc.nextFloat();
        personData.setHeight(personHeight);

        System.out.println(" Enter the Weight");
        float personWeight=sc.nextFloat();
        personData.setWeight();

        perfectAge.getPersonAge(personAge);
        group.getBlood(bloodGroup);



    }
}