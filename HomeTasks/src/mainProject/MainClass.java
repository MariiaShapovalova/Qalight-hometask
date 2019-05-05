package mainProject;

import org.junit.Assert;

import javax.sound.sampled.SourceDataLine;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class  MainClass{

    public static void main(String [] args){

        int a, b, c, n;
        int count=0;
        a=2; b=1; c=5; n=5;
        double height=5;
        double storona=2;
        double x1=1,x2=2,y1=2,y2=2;
        String s="555";
        Methods methods =new Methods();
        //int summ= methods.summNumbers(5,8);
        int[] mass=new int[5];
        int[] marks={1, 6, 9, 4, 2, 3};
        int[] marksT={1, 1, 1, 1, 1, 1};
        int[] mass2={-1, 6, -7, -4, -2, 8};
        int[] mass2CC={-1, 0, -7,-4,-2,8};
        int[] mass2T={-1, 6, -9, -4, -2, 8};
        int[] mass2TT={-1, 6, 0, -4, -2, 8};
        int[] massC={0, -2, -9, 4, 0, 6};
        int[] massCT={0, -2, 6, 4, 0, -9};
        int[] massCTT={-2, 0, 4, 6, -9, 0};
        int[] massCC={2, 2, 2};
        int[] mass22={8, 0};
        int[] mass5={1, 2, 0, 0, 5, 6};
        int[] mass5T={0, 0, 2, 3, 0, 0};
        int[] banks={8, 2, 3, 4, 5, 6};
        int[] banksT={1, 2, 3, 4, 5, 6};
        int[] banksTT={0, 2, 0, 4, 0, 6};
        int[] numbs={11, 26, 31, 46, 56, 62};
        int[] numbsT={11, 0, 31, 0, 0, 0};
        int[]mass3=new int[3];
        int[]mass4=new int[6];
        int[]mass6=new int[6];
        int[]mass7=new int[6];
        int[]mass8=new int[6];
        int[]mass9=new int[6];
        int[]mass10=new int[6];
        int[]mass11=new int[6];
        int[]mass12=new int[6];
        ArrayList massArray=new ArrayList();
        int[]arr={3,5,2};
        int prise=2000;

        //System.out.println(summ);//сумма чисел
        //System.out.println(methods.countFactorial(5));//задача 1 JavaHomeTask
        //System.out.println(methods.getDistance(x1, x2, y1, y2);//задача 2 JavaHomeTask
        //System.out.println(methods.triadgleExist(5,6,7)); //задача 3 JavaHomeTask
        //System.out.println(methods.triangleFromZero(n));//задача 4 JavaHomeTask
        //System.out.println(methods.bodyIndex(60,1.7)); //задача 5 JavaHomeTask
        //System.out.println(methods.equalDigits(methods.numbers);//задача 6 JavaHomeTask
        //System.out.println(methods.poolValue(a,b,c));//задача 7 JavaHomeTask
        //System.out.println(methods.isNotPassed(marks));//задача 8 JavaHomeTask
        //System.out.print(methods.curencyExchange(banks));//задача 9 JavaHomeTask
        //System.out.println(methods.strindOutput(n,s);//задача 10 JavaHomeTask
        //System.out.println(methods.summMinMax(a,b,c));//задача 11 JavaHomeTask
        //System.out.println(methods.triangleSquare(height, storona);//задача 12 JavaHomeTask
        //System.out.println(methods.squareHexagon(c));//задача 13 JavaHomeTask
        //System.out.println(methods.factorialChisel());//задача 14 JavaHomeTask
        //System.out.println(methods.countDiscont(prise));//задача 15 JavaHomeTask

    //---------------------------------------------------Level 1-----------------------------------------------

        //System.out.println(methods.minChislo(a,b));//задача 1
        //System.out.println(methods.summEcvivalent(mass2, b));//задача 2

        /* mass3=methods.massCountPositiveNegativeZero(mass2);
        for (int i = 0; i <mass3.length; i++) {
          System.out.println(mass3[i]+" ");
        }
        methods.whatModuleIsMore(marks);*/

        /* String zero="";
        mInfoTextView = findViewById(R.id.textViewInfo);
        */

        /*mass11=methods.massZero(mass5);//zадача 3
        for (int i = 0; i <mass11.length; i++) {
            if(mass11[i]!=0){
                System.out.println("" + mass11[i]);
         }}*/

        // System.out.println("Оригинал: " + massArray.toString());
        /*massArray=methods.massZero(mass5);
        Object[] mass10=massArray.toArray(new Integer[massArray.size()]);
        for (int i = 0; i <mass10.length; i++) {
            System.out.println("Оригинал: " + mass10[i]);
        }*/

        //System.out.println(methods.firsNegativeOrPositive(mass2));//задача 4
        //System.out.println(methods.sortMassOrNot(mass5));//задача 5
        /*mass10=methods.chetniyMass(mass5);//zадача 6
        for (int i = 0; i <mass10.length; i++) {
            if(mass10[i]!=0){
            System.out.println("" + mass10[i]);
        }}*/

        /*mass6=methods.replaseElements(mass5,b);//задача 7
        for (int i = 0; i <mass6.length ; i++) {
            System.out.println(mass6[i]+" ");
            if(mass6[i]==b){
              count++;
            }
        }
        System.out.println("Кількість замін "+count);*/


        //methods.termsArray(arr);//задача 10
        //methods.termsCalculationMdivL(arr,a,b);//задача 11
        /*mass8=methods.changeNearestElements(mass2);//задача 12
        for (int i = 0; i < mass2.length; i++) {
            System.out.print(mass8[i]+" ");
        }*/
        // System.out.println(methods.maxPlasMin(mass5));//задача 14


        /*mass9=methods.positiveNegativeProizvidenie(mass2);//задача 17
        for (int i = 0; i <2; i++) {
            System.out.print(mass9[i]+" ");
        }*/
       /* mass12=methods.endInKnumbers(numbs,1);//задача 17
        for (int i = 0; i <mass12.length; i++) {
            if(mass12[i]!=0) {
                System.out.print(mass12[i] + " ");
            }
        }*/
        /*methods.printToZero(mass2);
        int div=methods.summNumbers(6,2);//демонстрация обработки исключений
        System.out.println(div);
        methods.whatModuleIsMore(mass2);*/

        /*try{
        methods.divide(5,0);}
        catch (Exception e){
            System.out.println("Failed");
        }
        mass7=methods.changeToZero(mass2);
        for (int i = 0; i <mass7.length; i++) {
            System.out.print(mass7[i]+" ");*/

        //--------------------------------------------------chess-------------------------------------------------------
           /* List chess= new ArrayList();
            chess.add(new King());
            chess.add(new Queen());
            chess.add(new Queen());
            chess.add(new Knight());
            chess.add(new Methods());

            for (Object che: chess) {
                if(che instanceof Chessclass){
                    Chessclass chessF=(Chessclass) che;
                    chessF.draw();
                }
            }*/
            //-------------------------------------cats--------------------------------------------------------
            /*Cats cat=new Cats("Boris", "red",4);
            Cats cat2=new Cats("Stas", "green",4);*/
            /*cat.name="Boris";
            cat2.name="Stasian";
            cat.age=5;
            cat2.age=9;
            cat.pows=5;
            cat2.pows=8;*/
            /*System.out.println(cat.pows);
            System.out.println(cat2.pows);
            System.out.println(cat.name+" Cat");
            System.out.println(cat2.name+" Cat2");
            System.out.println(cat.age);
            System.out.println(cat2.age);
            }*/

       //---------------------------------------------JUnit JavaHomeTask-------------------------------------------------------------
       Assert.assertEquals("Summ not equals actual JavaHomeTask",8,methods.summNumbers(6,2));//задача0
       Assert.assertEquals("Task 0 unit test JavaHomeTask",720,methods.countFactorial(6));//задача1
       Assert.assertEquals("Task 2 unit test JavaHomeTask", 1,methods.getDistance(1,2,2,2),0.01);//задача2
       //Assert.assertFalse("Task 3 unit test JavaHomeTask",methods.triadgleExist(1,2,88));//задача 3
       Assert.assertEquals("Task 5 unit test JavaHomeTask",21.38,methods.bodyIndex(1.73,64),0.01);//задача 5
       //Assert.assertFalse("Task 6 unit test JavaHomeTask",methods.equalDigits(215));//задача 6
       Assert.assertEquals("Task 7 unit test JavaHomeTask",8,methods.poolValue(2,2,2),0.01);//задача 7
       Assert.assertEquals("Task 8 unit test JavaHomeTask",2, methods.isNotPassed(marks));//задача 8
       Assert.assertEquals("Task 9 unit test JavaHomeTask",2,methods.curencyExchange(banks));//задача 9
       Assert.assertEquals("Task 11 unit test JavaHomeTask",4,methods.summMinMax(1,2,3));//задача 11
       Assert.assertEquals("Task 11 unit test JavaHomeTask",4,methods.summMinMax(1,3,2));//задача 11
       Assert.assertEquals("Task 11 unit test JavaHomeTask",4,methods.summMinMax(3,2,1));//задача 11
       Assert.assertEquals("Task 12 unit test JavaHomeTask",-2,methods.triangleSquare3(2, 3, 2),0.001);//задача 12
       Assert.assertEquals("Task 13 unit test JavaHomeTask",93.53,methods.squareHexagon(6),0.001); //задача 13
       Assert.assertEquals("Task 14 unit test JavaHomeTask",41068,methods.factorialChisel());//задача 14
       Assert.assertEquals("Task 15 unit test JavaHomeTask",1000, methods.countDiscont(1000), 0.001);//задача 15
       Assert.assertEquals("Task 15 unit test JavaHomeTask", 1470, methods.countDiscont(1500), 0.001);//задача 15
       Assert.assertEquals("Task 15 unit test JavaHomeTask",2375, methods.countDiscont(2500), 0.001);//задача 15
       Assert.assertEquals("Task 15 unit test JavaHomeTask",5580, methods.countDiscont(6000), 0.001);//задача 15
       //---------------------------------------------JUnit Level 1-------------------------------------------------------------
       Assert.assertEquals("Task 1 unit test Level 1",1,methods.minChislo(1,9));//задача1
       Assert.assertEquals("Task 2 unit test Level 1", 18,methods.summEcvivalent(marks,3));//задача2
       Assert.assertArrayEquals (mass5T, methods.massZero(mass5)); //задача 3
       //Assert.assertFalse("Task 2 unit test Level 1",methods.firsNegativeOrPositive(mass2));//задача 4
       //Assert.assertFalse(methods.sortMassOrNot(banksT));//задача 5
        Assert.assertArrayEquals(banksTT,methods.chetniyMass(banksT));//задача 6
        Assert.assertArrayEquals(marksT,methods.replaseElements(marks,1));//задача 7
        Assert.assertArrayEquals(massCC,methods.massCountPositiveNegativeZero(massC));//задача 8
        Assert.assertArrayEquals(massCT,methods.changeMinMax(massC));//задача 9
        Assert.assertArrayEquals(massCTT,methods.changeNearestElements(massC));//задача 12
        Assert.assertEquals("Task 14 unit test Level 1",-3,methods.maxPlasMin(massC),0.001);
        Assert.assertArrayEquals(mass2TT,methods.changeToZero(mass2T));//задача 16
        Assert.assertArrayEquals(mass22,methods.positiveNegativeProizvidenie(mass2T));//задача 17
        Assert.assertArrayEquals(mass2CC,methods.changedMassToZero(mass2));//задача 18
        Assert.assertArrayEquals(numbsT, methods.endInKnumbers(numbs,1));//задача 19
    }

}
