class Human extends Animal{
    protected bool hasJob;
    protected String lastName;
    protected String homeTown;

    public Human(String name, int age, bool hasJob, String lastName, String homeTown){
        this.hasJob = hasJob;
        this.lastName = lastName;
        this. homeTown = homeTown;
        super(name, age);
    }
}