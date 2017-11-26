package java_project;


public class Info {
    
    private String name;
    private String date;
    private String planName;
    private double initialD;
    private double monthlyD;
    
    public Info(){ 
    }
    
    public Info(String name, String date, String planName, double initialD, double monthlyD){
        this.name = name;
        this.date = date;
        this.planName = planName;
        this.initialD = initialD;
        this.monthlyD = monthlyD;
        
        
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getPlanName(){
        return planName;
    }
    public void setPlanName(String planName){
        this.planName = planName;
    }
    public double getInitialD(){
        return initialD;
    }
    public void setInitialD(double initialD){
        this.initialD = initialD;
    }
    public double getMonthlyD(){
        return monthlyD;
    }
    public void setMonthlyD(double monthlyD){
        this.monthlyD = monthlyD;
    }
}
