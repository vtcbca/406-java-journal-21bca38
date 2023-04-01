import java.util.Scanner;

public class Employee{

public static void main(String[] args) 
{

        String[] name=new String[5];
        double[] salary=new double[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {

            System.out.print("Enter Emp  Name : ");
            name[i] = sc.nextLine();
            System.out.print("Enter Emp Salary : ");
            salary[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println();
        }
        for(int i=0;i<5;i++)
        {
            try 
            {
                System.out.print("\nName: " + name[i] + "\nSalary:" + salary[i]);
                Thread.sleep(10000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }
}