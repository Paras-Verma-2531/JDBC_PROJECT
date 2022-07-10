import java.sql.SQLOutput;
import java.util.Scanner;import com.app.StudentManagement.Students;
public class StudentManagementMain {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        while(true)
        {
            System.out.println("'1' to add new details\n'2' to delete details\n'3' update details\n'4' to display the details\n'5' to exit");
            int choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("enter the name of the student: ");
                    in.nextLine();
                    String name=in.nextLine();
                    System.out.print("enter the course name: ");
                    String course_name=in.nextLine();
                    System.out.print("enter the branch name: ");
                    String branch=in.nextLine();
                    System.out.print("enter the date of birth(dd/mm/yy): ");
                    String dob=in.nextLine();
                    System.out.print("enter the year of study: ");
                    int year=in.nextInt();
                    System.out.print("enter the semester: ");
                    int sems=in.nextInt();
                    System.out.print("enter the email id: ");
                    in.nextLine();
                    String email_id=in.nextLine();
                    System.out.print("enter the phone no: ");
                    String phn_no=in.nextLine();
                    Students student=new Students(name,course_name,branch,dob,year,sems,email_id,phn_no);
                   
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("please enter the valid input::");
            }
        }
    }
}
