/**
 * Java.Level1.Lesson2
 *
 * @author Ilya Anufriev
 * @version 16 Aug, 2018
 */
import java.util.Arrays;
class HomeWork_Lesson2_Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");//Тест 1 метода
        int[] arrTest= {1,0,1,0,1,1,0};
        getArrayOneToNull(arrTest);

        System.out.println("Task 2");//Тест 2 метода
        arrTest=new int[8];
        arrTest=getArrayInceaseToThree(arrTest);
        System.out.println(Arrays.toString(arrTest));

        System.out.println("Task 3");//Тест 3 Метода
        arrTest=new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrTest=getArrayLowerSixIcreaseInTwice(arrTest);
        System.out.println(Arrays.toString(arrTest));

        System.out.println("Task 4");//Тест 4 Метода
        int[][] squareArray=new int[5][5];
        squareArray=getSquareArrayDiagonals(squareArray);
        for(int i=0;i<squareArray.length;i++)
            System.out.println(Arrays.toString(squareArray[i]));

        System.out.println("Task 5");//Тест 5 Метода
        arrTest= new int[8];
        arrTest= getArrayInceaseToThree(arrTest);
        System.out.println(Arrays.toString(arrTest));
        System.out.println(Arrays.toString(getMinAndMax(arrTest)));

        System.out.println("Task 6");//Тест 6 Метода
        arrTest=new int[]{2,1,1,2,1};
        System.out.println(isBalance(arrTest));
        }


    //Задание 1.
    static void getArrayOneToNull(int array[]){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" : ");
            if (array[i]==1) array[i]=0; else array[i]=1;
            System.out.println(array[i]);
        }
    }

    //Задание 2.
    static int[] getArrayInceaseToThree(int[] array){
        for (int i=0;i<array.length;i++)array[i]=i*3;
        return array;
    }

    //Задание 3
    static int[] getArrayLowerSixIcreaseInTwice(int array[]){
        for (int i = 0; i < array.length; i++) if (array[i]<6) array[i]=array[i]*2;
        return array;
    }

    //Задание 4
    static  int[][] getSquareArrayDiagonals(int array[][]){
        for(int i =0;i<array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                if (j == i || j == (array[i].length - i - 1)){
                    array[j][i] = 1;
                }
                else array[j][i] = 0;
            }
        }
        return array ;
    }

    //Задание 5
    static int[] getMinAndMax(int array[]){
        int min=0;
        int max=0;
        for (int i=0;i<array.length;i++){
            if (min>array[i])min=array[i];
            if (max<array[i])max=array[i];
        }
        int[] result=new int[]{min,max};
        return result;
    }
    //Задание 6
    static boolean isBalance(int array[]){
        int sumArrayAll=0;
        boolean result;
        result=false;
        for(int i=0;i<array.length;i++)
            sumArrayAll=sumArrayAll+array[i];
        for (int i=0; i<array.length;i++){
            int sumArrayHalf=0;
            for(int j=0;j<array.length;j++){
                sumArrayHalf=sumArrayHalf+array[j];
                if (sumArrayHalf==(sumArrayAll-sumArrayHalf)){
                    result=true;
                    break;
                }
            }
        }
        return result;
    }
}