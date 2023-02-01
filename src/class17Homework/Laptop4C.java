package class17Homework;

public class Laptop4C {
   // 3) Write a java class that have 4 constructors with 4 different access levels of constructors
    // (private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
    // 2 - from outside the class; 3 - from different class inside different package  and observe result.
   String Brand;
    int HardDiskSize,RamMemory;
    String Color;
    double ScreenSize;

    public Laptop4C(String lBrand,String lColor,int lHardDiskSize,int lRamMemory,double lScreenSize){
        Brand=lBrand;
        Color=lColor;
        HardDiskSize=lHardDiskSize;
        RamMemory=lRamMemory;
        ScreenSize=lScreenSize;
    }
    private Laptop4C(String lBrand,String lColor,int lHardDiskSize,double lScreenSize) {
        Brand=lBrand;
        Color=lColor;
        HardDiskSize=lHardDiskSize;
        ScreenSize=lScreenSize;
    }

    Laptop4C(String lBrand,String lColor,double lScreenSize) {
        Brand=lBrand;
        Color=lColor;
        ScreenSize=lScreenSize;
    }

    protected Laptop4C(String lBrand,String lColor) {
        Brand=lBrand;
        Color=lColor;
    }
    public void LaptopInfo(){
        System.out.println("Brand: "+Brand+" Color: "+Color+" Hard Disk Size: "+HardDiskSize+" Screen Size: "+ScreenSize+" Ram Memory: "+RamMemory);
    }

    public static void main(String[] args) {
        Laptop4C laptop=new Laptop4C("HP","Black",500,16,17.3);
        laptop.LaptopInfo();
    }

}
