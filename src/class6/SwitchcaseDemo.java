package class6;

public class SwitchcaseDemo {
    public static void main(String[] args) {
      String country="USA";
        System.out.println(country.toLowerCase());
      switch (country.toLowerCase()){
          case "usa":
              System.out.println("Burgers");
              break;
          case "italy":
              System.out.println("pasta");
              break;
          case "morocco":
              System.out.println("couskouss");
              break;
          default:
              System.out.println("Wrong country");

      }

    }
}
