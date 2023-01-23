package class10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {
        int[] numbers={10,13,20,25,45,50};
        //we can t update the element in for each loop because we don t have acces to the index
        for (int x:numbers)
              {if (x%2!=0){
                  x=0;
              }

        }
        System.out.println(numbers[0]);

        }
    }



