import java.util.Scanner;
public class homework {
    public static void main(String[] args) {

        // pratice prob 1
        Scanner sc = new Scanner(System.in);
        /*
        float [] numb = {0.9f,0.3f,0.2f,2.4f,4.5f};
        float sum = 0.0f;
        for (int i =0; i<numb.length; i++){
            sum += numb[i];
        }
        System.out.println(sum);
        // pp2
        int [] count = {20,45,23,65,76,12,80};
        System.out.println("Enter the number to find in array");
        int user = sc.nextByte();
        boolean a = false;
        for (int i = 0; i<count.length; i++) {
            if (user == count[i]) {
                System.out.println("Yes the number is present at: " + count[i]);
                a = true;
            }
        }
            if (a==false){
                System.out.println("Number is not present in the list!!!!");

        }
*/
            // problem 4
        int [] physics = {23,45,6,89,90};
            int sum1 = 0;
        for (int i: physics) {
            sum1 += i;
        }
        System.out.println(sum1/physics.length);

//        int [][] floor = {{101, 102,103,104},
//                {201,202,203,204}};
//        System.out.println(floor.length);
//        for (int i = 0; i<floor.length;i++){
//            for (int j= 0; j<floor[i].length;j++){
//                System.out.print(" "+floor[i][j]);
//            }
//            System.out.println();
//        }

//        int [][] matrices1 = new int[2][3];
//        int [][] matrices2 = new int[2][3];
//        matrices1 = new int[][]{{2, 3, 4}, {4, 5, 4}};
//        matrices2 = new int[][]{{4,5,2},{1,2,3}};
//        for (int i= 0; i< matrices1.length;i++){
//            for (int j=0; j<matrices1[i].length; j++){
//                matrices1[i][j] = matrices1[i][j]+matrices2[i][j];
//            }
//        }
//       for (int k = 0; k<matrices1.length;k++){
//           for (int j = 0; j<matrices1[k].length; j++){
//               System.out.print(" "+matrices1[k][j]);
//           }
//           System.out.println();
//       }
 // Reverse an array
//        for (int i = physics.length-1; i>0; i--){
//            System.out.print(" "+physics[i]);
//        }
        /*
// write a java program find max element in array
        int max = 0;
        for (int k: physics) {
            if (max < k) {
                max = k;
            }
        }
            System.out.println("The max element is: "+max);
*/
//        prob 8

        boolean isSorted = true;
        for(int i = 0; i<physics.length-1; i++){
           if (physics[i]>physics[i+1]){
               isSorted = false;
               break;
           }
        }
        if (isSorted){
            System.out.println("The given array is sorted");
        } else {
            System.out.println("The given  array is not sorted");
        }
    }
}
