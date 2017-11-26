
package tracker;
import java.io.*;
import java.util.*;

public class Tracker {

    static double interest;
    static double finalV;
    static double convertRate;
    
    public static void main(String[] args) throws Exception{
     boolean loop = true;  
     
     
        
     Scanner sc = new Scanner(System.in);
     java.io.File info = new java.io.File("Tracker.txt");
     
     PrintWriter pw = new PrintWriter(info);
     
     Info name = new Info();
     Info date = new Info();
     Info planName = new Info();
     Info initialD = new Info();
     Info monthlyD = new Info();
     Info months = new Info();
     
        
        System.out.println("Welcome to the tracker");
        System.out.println("\n");
        while (loop){
        System.out.println("Select Options\n1:Enter user's info to tracker\t2:Back\n");
        System.out.print("Option: ");
        int option = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        
        if (option == 1){
            System.out.println("Enter the following information\n");
            System.out.print("Name: ");
            String Nm = sc2.nextLine();
            name.setName(Nm);
            pw.println("Name: "+name.getName());
            
            System.out.print("Date(dd-MM-YYYY): ");
            date.setDate(sc2.nextLine());
            pw.println("Date: "+date.getDate());
            
            System.out.println("Enter which plan chosen\n");
            System.out.println("1.  Emergency Savings Plans");
            System.out.println("2.  Short-Term Retirement Savings Plans");
            System.out.println("3.  Jumbo Savings Plan");
            System.out.println("4.  Jom Belajar! Junior College Fund");
            System.out.println("5.  Bukit In Progress Junior Savers");
            System.out.print("Option: ");
            
            Scanner sc3 = new Scanner(System.in);
            int option2 = (sc3.nextInt());
            
            while (option2 < 1 || option > 5){
                System.out.println("Invalid input. Please try again");
                System.out.print("Option: ");
                option = sc.nextInt();
                
            }
            
            double DA = 0;
            double MA = 0;
            int CT;
            
            switch(option2){
                case 1:
                    System.out.println("you have selected Emergency Savings Plans");
                    System.out.println("Interest: 0.5% per annum");
                    interest = 0.005;
                    System.out.println("Minimum Deposit: 500 MYR");
                    planName.setPlanName("Savings Plan: Emergency Savings Plans\tInterest: 0.5% per annum");
                    pw.println(planName.getPlanName());
                    
                    System.out.println("Tracker will convert the deposited currency into MYR currency");
                    System.out.println("Select the original type of currency deposited");
                    System.out.println("1: MYR\t2: USD\t3: EUR\t4: GBP");
                    System.out.print("Option: ");
                    
                    
                    CT = sc2.nextInt();
                    while (CT < 1 || CT > 4){
                        
                        System.out.println("Invalid input. Please try again");
                        System.out.print("Option: ");
                        CT = sc2.nextInt();
                        }
                    
                    switch (CT){
                        case 1:
                            
                            convertRate = 1;
                            System.out.println("Enter your initial deposit amount(MYR)");
                            DA =(sc3.nextDouble());
                            break;
                         
                        case 2:
                            convertRate = 4.11;
                            System.out.println("Enter your initial deposit amount(USD)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                            
                        case 3:
                            convertRate = 4.91;
                            System.out.println("Enter your initial deposit amount(EUR)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                            
                        case 4:
                            convertRate = 5.49;
                            System.out.println("Enter your initial deposit amount(GBP)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                    }
                    
                    while (DA < 500){
                        System.out.println("\nThe minimum deposit amount is not met");
                        System.out.println("Please reenter amount");
                        System.out.print("Amount: ");
                              DA =(sc3.nextDouble()); 
                              DA = DA*convertRate;
                              
                    }
                    initialD.setInitialD(DA);
                    pw.print("Initial deposit: ");
                    pw.printf("%.2f", initialD.getInitialD());
                    break;
                    
                case 2:
                    System.out.println("you have selected Short-Term Retirement Savings Plans");
                    System.out.println("Interest: 1% per annum");
                    interest = 0.001;
                    System.out.println("Minimum Deposit: 1000 MYR");
                    planName.setPlanName("Savings Plan: Short-Term Retirement Savings Plans\tInterest: 1% per month");
                    pw.println(planName.getPlanName());
                    
                    System.out.println("Tracker will convert the deposited currency into MYR currency");
                    System.out.println("Select the original type of currency deposited");
                    System.out.println("1: MYR\t2: USD\t3: EUR\t4: GBP");
                    System.out.print("Option: ");
                    
                    
                    CT = sc2.nextInt();
                    while (CT < 1 || CT > 4){
                        
                        System.out.println("Invalid input. Please try again");
                        System.out.print("Option: ");
                        CT = sc2.nextInt();
                        }
                    
                    switch (CT){
                        case 1:
                            
                            convertRate = 1;
                            System.out.println("Enter your initial deposit amount(MYR)");
                            DA =(sc3.nextDouble());
                            break;
                         
                        case 2:
                            convertRate = 4.11;
                            System.out.println("Enter your initial deposit amount(USD)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                            
                        case 3:
                            convertRate = 4.91;
                            System.out.println("Enter your initial deposit amount(EUR)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                            
                        case 4:
                            convertRate = 5.49;
                            System.out.println("Enter your initial deposit amount(GBP)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                    }
                    
                    while (DA < 1000){
                        System.out.println("The minimum deposit amount is not met");
                        System.out.println("Please reenter amount");
                        System.out.print("Amount: ");
                              DA =(sc3.nextDouble()); 
                              DA = DA*convertRate;
                    }
                    initialD.setInitialD(DA);
                    pw.print("Initial deposit: ");
                    pw.printf("%.2f", initialD.getInitialD());
                    break;
                    
                case 3:
                    System.out.println("you have selected Jumbo Savings Plan");
                    System.out.println("Interest: 2.2% per annum");
                    interest = 0.022;
                    System.out.println("Minimum Deposit: 100000 MYR");
                    planName.setPlanName("Savings Plan: Jumbo Savings Plan\tInterest: 2.2% per month");
                    pw.println(planName.getPlanName());
                    
                    System.out.println("Tracker will convert the deposited currency into MYR currency");
                    System.out.println("Select the original type of currency deposited");
                    System.out.println("1: MYR\t2: USD\t3: EUR\t4: GBP");
                    System.out.print("Option: ");
                    
                    
                    CT = sc2.nextInt();
                    while (CT < 1 || CT > 4){
                        
                        System.out.println("Invalid input. Please try again");
                        System.out.print("Option: ");
                        CT = sc2.nextInt();
                        }
                    
                    switch (CT){
                        case 1:
                            
                            convertRate = 1;
                            System.out.println("Enter your initial deposit amount(MYR)");
                            DA =(sc3.nextDouble());
                            break;
                         
                        case 2:
                            convertRate = 4.11;
                            System.out.println("Enter your initial deposit amount(USD)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                            
                        case 3:
                            convertRate = 4.91;
                            System.out.println("Enter your initial deposit amount(EUR)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                            
                        case 4:
                            convertRate = 5.49;
                            System.out.println("Enter your initial deposit amount(GBP)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                    }
                    
                    
                    while (DA < 100000){
                        System.out.println("The minimum deposit amount is not met");
                        System.out.println("Please reenter amount");
                        System.out.print("Amount: ");
                              DA =(sc3.nextDouble());  
                              DA = DA*convertRate;
                    }
                    initialD.setInitialD(DA);
                    pw.print("Initial deposit: ");
                    pw.printf("%.2f", initialD.getInitialD());
                    break;
                    
                case 4:
                    System.out.println("you have selected Jom Belajar! Junior College Fund");
                    System.out.println("Interest: 0.7% per annum");
                    interest = 0.007;
                    System.out.println("Minimum Deposit: 1000 MYR");
                    planName.setPlanName("Savings Plan: Jom Belajar! Junior College Fund\tInterest: 0.7% per month");
                    pw.println(planName.getPlanName());
                    
                    System.out.println("Tracker will convert the deposited currency into MYR currency");
                    System.out.println("Select the original type of currency deposited");
                    System.out.println("1: MYR\t2: USD\t3: EUR\t4: GBP");
                    System.out.print("Option: ");
                    
                    
                    CT = sc2.nextInt();
                    while (CT < 1 || CT > 4){
                        
                        System.out.println("Invalid input. Please try again");
                        System.out.print("Option: ");
                        CT = sc2.nextInt();
                        }
                    
                    switch (CT){
                        case 1:
                            
                            convertRate = 1;
                            System.out.println("Enter your initial deposit amount(MYR)");
                            DA =(sc3.nextDouble());
                            break;
                         
                        case 2:
                            convertRate = 4.11;
                            System.out.println("Enter your initial deposit amount(USD)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                            
                        case 3:
                            convertRate = 4.91;
                            System.out.println("Enter your initial deposit amount(EUR)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                            
                        case 4:
                            convertRate = 5.49;
                            System.out.println("Enter your initial deposit amount(GBP)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                    }
                    
                   
                    while (DA < 1000){
                        System.out.println("The minimum deposit amount is not met");
                        System.out.println("Please reenter amount");
                        System.out.print("Amount: ");
                              DA =(sc3.nextDouble());  
                              DA = DA*convertRate;
                    }
                    initialD.setInitialD(DA);
                    pw.print("Initial deposit: ");
                    pw.printf("%.2f", initialD.getInitialD());
                    
                    break;
                    
                case 5:
                    System.out.println("you have selected Bukit In Progress Junior Savers");
                    System.out.println("Interest: 0.5% per annum");
                    interest = 0.005;
                    System.out.println("Minimum Deposit: 10 MYR");
                    planName.setPlanName("Savings Plan: Bukit In Progress Junior Savers\tInterest: 0.5% per month");
                    pw.println(planName.getPlanName());
                    
                    System.out.println("Tracker will convert the deposited currency into MYR currency");
                    System.out.println("Select the original type of currency deposited");
                    System.out.println("1: MYR\t2: USD\t3: EUR\t4: GBP");
                    System.out.print("Option: ");
                    
                    
                    CT = sc2.nextInt();
                    while (CT < 1 || CT > 4){
                        
                        System.out.println("Invalid input. Please try again");
                        System.out.print("Option: ");
                        CT = sc2.nextInt();
                        }
                    
                    switch (CT){
                        case 1:
                            
                            convertRate = 1;
                            System.out.println("Enter your initial deposit amount(MYR)");
                            DA =(sc3.nextDouble());
                            break;
                         
                        case 2:
                            convertRate = 4.11;
                            System.out.println("Enter your initial deposit amount(USD)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                            
                        case 3:
                            convertRate = 4.91;
                            System.out.println("Enter your initial deposit amount(EUR)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                            
                        case 4:
                            convertRate = 5.49;
                            System.out.println("Enter your initial deposit amount(GBP)");
                            DA =(sc3.nextDouble());
                            DA = DA*convertRate;
                            break;
                    }
                    
                    
                    while (DA < 10){
                        System.out.println("The minimum deposit amount is not met");
                        System.out.println("Please reenter amount");
                        System.out.print("Amount: ");
                              DA =(sc3.nextDouble());  
                              DA = DA*convertRate;
                    }
                    initialD.setInitialD(DA);
                    pw.print("Initial deposit: ");
                    pw.printf("%.2f", initialD.getInitialD());
                    break;
                    
            }//switch
            System.out.println("Enter your monthly deposit which you will be paying for the next 24 months");
            System.out.print("Amount: ");
            
            MA = (sc3.nextDouble());
            while (MA < 1){
                System.out.println("The minimum deposit amount is not met");
                        System.out.println("Please reenter amount");
                        System.out.print("Amount: ");
                              DA =(sc3.nextDouble());
            }
            MA = MA*convertRate;
            monthlyD.setMonthlyD(MA);
            pw.print("\nMonthly deposit: ");
            pw.printf("%.2f", +monthlyD.getMonthlyD());
            pw.close();
            
            System.out.println("\n");
            Scanner sc4 = new Scanner(info);
            System.out.println("---------------------------------------------------------");
            String str;
            BufferedReader br = new BufferedReader(new FileReader(info));
            
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();
            
            System.out.println("---------------------------------------------------------");
            System.out.println("\n");
            System.out.println("Is this information the way you wanted it?\n");
            System.out.println("1: YES\n2: NO");
            System.out.print("Option: ");
            
            int YN;
            
            YN = sc3.nextInt();
            
            while ((YN) >2 || (YN)< 1){
                
                System.out.println("Invalid input. Please try again");
                System.out.println("1: YES\n2: NO");
                System.out.print("Option: ");
                YN = sc3.nextInt();
                
            }
            switch (YN){
                
                case 1:
                    System.out.println("\n Continuing with tracker\n");
                    break;
                    
                case 2:
                    System.out.println("\n Returning to tracker menu\n");
                    loop = false;
                    break;
                
            }
            int RE = 1;
            while (RE == 1){
            System.out.println("Enter the amount of time in months you want to track the savings amount");
            System.out.println("Months: ");
            
            int M;
            M = sc3.nextInt();
            
            while (M<0){
                System.out.println("Invalid input. Please try again");
                System.out.print("Months: ");
                M = sc3.nextInt();
            }
            interest = interest/12;
            if (M == 0){
                finalV = DA;
                System.out.println("Final amount: "+finalV);
                
            } else if (M == 1){
                
                
                finalV = (DA+MA+(DA + MA)*interest);
                
            } else if (M <= 24){
               double moni;
               moni = (DA+MA+(DA + MA)*interest);
                for (int i = 1; i <= M; i++){
                    moni = (moni + MA +(moni + MA)*interest);
                    finalV = moni;
                
            }
            } else {
                
                double moni;
               moni = (DA+MA+(DA + MA)*interest);
                for (int i = 1; i <= 24; i++){
                    moni = (moni + MA +(moni + MA)*interest);
                }M = M-24;
                for (int j = 1; j <= M; j++){
                   finalV = moni + (moni*interest);
                    
                }
                M = M+24;
                
            }
            
            System.out.print("The final amount of the savings plan after "+M+" months is ");
            System.out.printf("%.2f", finalV);
            
            System.out.println("\nDo you want to retry with a different amount of months?");
            System.out.println("1: YES\n2: NO");
            System.out.print("Option: ");
            int retry;
            retry = sc3.nextInt();
            while (retry < 1 || retry > 2){
                
                System.out.println("Invalid input. Please try again");
                System.out.println("1: YES\n2: NO");
                System.out.print("Option: ");
                retry = sc3.nextInt();
            }
            switch (retry){
                case 1:
                    
                    break;
                case 2:
                    RE = 0;
                    break;
                
            }
            }
            
        } else if (option == 2){
            System.out.println("Exiting tracker");
            loop = false;
            
        } else {
                System.out.println("Invalid input. Please try again");
                System.out.print("Option: ");
                option = sc.nextInt();
        }
        }//while
  
    }
    
    
}
