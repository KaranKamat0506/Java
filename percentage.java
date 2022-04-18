import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        float totalmarks=500;
        float marks=0;
        float percentage=0;
        System.out.println("******Board Percentage*****");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter Maths Marks:");
        float maths = sc.nextFloat();
        System.out.println("Enter English Marks:");
        float eng = sc.nextFloat();
        System.out.println("Enter Science Marks:");
        float sci = sc.nextFloat();
        System.out.println("Enter Civics Marks:");
        float civ = sc.nextFloat();
        System.out.println("Enter Geography Marks:");
        float geo = sc.nextFloat();

        marks=maths+eng+sci+civ+geo;
        percentage=(marks/totalmarks)*100;
        System.out.println("Marks Obtained:" + marks);
        System.out.println("Total Marks:" + totalmarks);
        System.out.println("Final Percentage:" + percentage);

        
        

    }
}
