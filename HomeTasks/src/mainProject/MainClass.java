package mainProject;

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
        int summ= methods.summNumbers(5,8);
        int[] mass=new int[5];
        int[] marks={1, 6, 9, 4, 2, 3};
        int[] mass2={1, 6, 7, -4, 0, 8};
        int[] mass5={1, 2, 3, 4, 5, 6};
        int [] banks={1, 2, 3, 4, 5, 6};
        int[]mass3=new int[3];
        int[]mass4=new int[6];
        int[]mass6=new int[6];
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

        //System.out.println(methods.firsNegativeOrPositive(mass2));//задача 4
        //System.out.println(methods.sortMassOrNot(mass5));//задача 5

        /*mass6=methods.replaseElements(mass5,b);//задача 7
        for (int i = 0; i <mass6.length ; i++) {
            System.out.println(mass6[i]+" ");
            if(mass6[i]==b){
              count++;
            }
        }
        System.out.println("Кількість замін "+count);*/
        //methods.termsArray(arr);//задача 10
        methods.termsCalculationMdivL(arr,a,b);//задача 11
    }

}
