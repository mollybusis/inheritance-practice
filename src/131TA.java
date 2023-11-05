class 131TA extends Human{
    public bool hasSocialLife;
    public bool hasRizz;
    public bool knowsInheritance;
    public bool smells;


    public 131TA(String name, int age, bool hasJob, String lastName, String homeTown, bool knowsInheritance, bool smells){
        this.hasSocialLife = false;
        this.hasRizz = false;
        this.smells = smells;
        this.knowsInheritance = knowsInheritance;
        super(name, age, hasJob, lastName, homeTown);
    }

    public learnInheritance(){
        this.knowsInheritance = true;
    }

    public takeShower(){
        this.smells = false;
    }
}