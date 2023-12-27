package OOP.advanced.Day4;

public class ParentCat {
    private String breed;
    ParentCat(){}
    ParentCat(String breed){
    this.breed=breed;
    }
    public void eat(){
        System.out.println("냠냠");
    }

    public String getBreed() {
        return breed;
    }
}
