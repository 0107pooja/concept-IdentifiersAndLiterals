public class PerfectAge {
    public int getPersonAge(int age){
        if (age >= 18 && age <= 65) {
            System.out.println("You must be in good health at the time you donate");
        }
        else{
            System.out.println("Not in Good State to Donate");
        }
        return age;
    }
}

