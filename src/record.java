public abstract class record {
    public void save(){
        this.validate();
        this.beforeSave();
        //save to data base
    }
    public abstract void validate();
    public abstract void beforeSave();

}
