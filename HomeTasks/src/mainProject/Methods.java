package mainProject;



import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;


public class Methods {
    Logger log = Logger.getLogger(Methods.class.getName());

   // public int numbers=scanerNumbers();

    public int summNumbers(int number1, int number2) {
        int div;

        try{
          div=number1+number2;
          log.info("Success");
        }

        catch (ArithmeticException ex){
            div=-1;
            ex.printStackTrace();
            log.warn("Fail");

        }

        catch (Exception ex){
           div=-1;
            System.out.println("Fail");
        }
        finally {
            System.out.println("Finally");
        }
        return div;
    }

    public int divide(int a, int b)throws Exception{
        return a/b;
    }


//-------------------------------------------------JavaHomeTask--------------------------------------------------

    /**1 Написать метод возвращающий факториал заданного числа N
     *@param a
     * return */
    public int countFactorial(int a) {
        int b = 1;
        try{
            for (int i = 1; i <=a; i++) {
                b =b* i;
            }log.info("Factorial counted");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Error");
        }
        return b;
    }

    /**2. написать статический метод double getDistance(x1, y1, x2, y2).
    Он должен вычислять расстояние между точками. Посмотреть в учебнике геометрии или в интернете
    *@param x1
    *@param x2
    *@param y1
    *@param y2
     * return */
    public double getDistance(double x1, double y1, double x2, double y2) {
        double distanse=0;
        try {
            distanse = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            log.info("Distanse points");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Error");
        }
        return distanse;
    }

   /**3. Написать буленовский метод принимающий на вход 3 переменных типа
   int которые обозначают длину стороны для треугольника и возвращает правда или ложь
   (может ли существовать треугольник
   с заданными сторонами) Вспоминаем свойство треугольника ни одна сторона не должна быть
    длиннее суммы  двух других
    *@param a
    *@param b
    *@param c
    * return */
    public boolean triadgleExist(double a, double b, double c) {
        boolean res=false;
        try{
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            res = true;
        } else {
            res = false;
        }log.info("Triangle exist");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Error");
        }
        return res;
    }

    /**4. Почитать про вложенный цикл и вывести треугольник из нулей на экран*/
    public void triangleFromZero() {
        int colums = 3;
        int row;
        try{
            row=1+colums/2;
            for (int i = 1; i <= row; i++) {
                int spases=(colums-i*2)/2;
                for (int j = 0; j <colums; j++){
                    if(j<spases||colums-j<=spases){
                        System.out.print(" ");
                    }else{
                        System.out.print('0');
                    }
                }
            }
                System.out.println();
                log.info("Triangle from zero created");
        }catch(Exception ex){
            ex.printStackTrace();
            log.error("Error");
        }
    }


    /**5. Написать программу которая вычисляет индекс массы тела
     *@param height
     *@param weith
     * return */
    public double bodyIndex(double height, double weith) {
        return weith / (height * height);
    }

    /**6  Составить алгоритм определяющий, есть ли среди цифр введенного трехзначного числа — одинаковые.
     Число вводится с клавиатуры.
     Кто не нагуглит как вводить с клавиатуры можно просто принимать int на вход и определять
     есть ли в нем одинаковые цифры Использовать изученные операторы Метод буленовский возвращает
     правда или ложь
     *@param threeDigNum
     *return*/
    public boolean equalDigits(int threeDigNum){
        int e, b, c, d;
        int num= scanerNumbers();
        boolean have = false;
        try{
            if(num<100&&num>999){
                System.out.println("Число не трьозначне");
            return have;
             }
            else{
                 System.out.println("Число трьозначне");
                 b=num/100;
                 c=num%100;
                 d=c/10;
                 e=c%10;
                 }
            if (d==b||d==e||b==e){
                System.out.println("Цифри одинакові є, хоч 2");
                have = true;
                return have;
            }   else{
                System.out.println("Повторяючих цифр нема!");
                have=false;
        }log.info("Calculated equel digits");
        }catch(Exception ex){
             ex.printStackTrace();
             log.error("Error");
            }
            return have;
    }
    /**7. написать метод высчитывающий сколько литров
    нужно чтобы заполнить бассейн Примает на вход 3 величины глубину длину и ширину бассейна.
    Определить перед решением что принимает на вход и что возвращает
     *@param height
     *@param depth
     *@param widht
     * return */
    public double poolValue(double height, double depth, double widht) {
        return height * depth * widht;
    }

    /**8. При поступлении в вуз абитуриенты, получившие "двойку" на первом экзамене, ко второму не допускаются.
    В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
    Подсчитать, сколько человек не допущено ко второму экзамену.
    *@mass [] marks
    *return*/
    public int isNotPassed(int [] marks){
        int summStudents =0;
        try{
            for(int i=0;i<marks.length; i++){
                if(marks[i]<3){
                    summStudents++;
                }else{
                    System.out.println("All passed");
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Error");
        }
        return summStudents;
    }

    /**9. У вас есть доллары. Вы хотите обменять их на рубли.
    Есть информация о стоимости купли-продажи в банках города. В городе N банков.
    Составьте программу, определяющую, какой банк выбрать, чтобы выгодно обменять доллары на рубли.*/
    public int curencyExchange(int []mass){
        int bankNumber=1;
        int lenghtMass=mass.length;
        int min=mass[0];
        try{
            for (int i = 0; i <lenghtMass; i++) {
                if(mass[i]<min){
                    bankNumber=mass[i];
                    return bankNumber;
                }
            }log.info("Best bank chosen");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Error happends");
        }
        return bankNumber;
    }


    /**10.Вывести на экран строку S указанное количество раз N
     *@param n
     *@param s */
    public void strindOutput(int n, String s){
         try{for(int i=0;i<n;i++) {
             System.out.println(s);
         }log.info("S string printing");
         }catch (Exception ex){
            ex.printStackTrace();
            log.error("Error happengs");
         }
    }

    /**11. Написать программу нахождения суммы большего и меньшего из 3-х чисел.
     *@param a
     *@param b
     *@param c
     * return*/
    public int summMinMax(int a, int b, int c) {
        int min = a, max = a;
        try{
        if ((a < b) && (b > c)) {
            max = b;
        } else if ((c > b) && (c > a)) {
            max = c;
        } else if ((c > b) && (a > b)) {
            min = b;
        } else if ((c < b) && (c < a)) {
            min = c;
        }log.info("Summ calculating");
        }catch (Exception ex){
          ex.printStackTrace();
          log.error("Error happend");
        }
        return min + max;
    }

    /**12. Вычислить площадь треугольника
     *@param a
     *@param heightA
     * return*/
    public double triangleSquare(double a, double heightA) {
        return (a * heightA) / 2;
    }

    public double triangleSquare2(double a) {
        return ((Math.pow(a,2) * Math.sqrt(3)))/4;
    }

    public double triangleSquare3(double a,double b,double c) {
        if(triadgleExist(a,b,c)){
            System.out.println("Triangle isn't exsist");
            return -2;
        }
        double s=-1;
        double p=0;
        try{
            p = (a + b + c) / 2;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            log.info("Cool!!!");}
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Fail!!!");
        }
        return s;
    }

    /**13 . Вычислить площадь правильного шестиугольника со стороной a,
     используя подпрограмму вычисления площади треугольника
     *@param storona
     * return*/
    public double squareHexagon(int storona){
        double squere=-1;
        try{squere=6*triangleSquare2(storona);
            log.info("Hexigon calculated");}
        catch (Exception ex){
            ex.printStackTrace();
            log.error("Calculating fail");
        }
        return squere;
    }


    /**14. Написать программу вычисления суммы факториалов всех нечетных чисел от 1 до 9
    * return*/
    public long factorialChisel(){
        long summ=1;
        try{
            for (int i=0;i<=9;i+=2){
                summ+=countFactorial(i);
            }
            log.info("Summ factorial calculated");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Calculating fail");
        }
        return summ;
    }

    /**15 Написать программу которая возвращает стоимость покупки с учетом дисконта
    Если покупка совершена на сумму до 1000 грн то скидка не положена Если от 1001 грн
    до 2000 скидка 2% от  2001 до 5000 скидка 5% и свыше 5001 скидка 7%
    *@param prise
    * return*/
    public double countDiscont(int prise){
        double countedPrise=0;
       try {
           if (prise <= 1000) {
               countedPrise = prise;
           } else if (prise > 1000 && prise <= 2000) {
               countedPrise = prise - prise * 0.02;
           } else if (prise > 2000 && prise <= 5000) {
               countedPrise = prise - prise * 0.05;
           } else {
               countedPrise = prise - prise * 0.07;
           }
           log.info("Discont calculated");
       }catch (Exception ex){
          ex.printStackTrace();
          log.error("Calculating fail");
       }
        return countedPrise;
    }

//---------------------------------------------------Level 1-----------------------------------------------
    /**1.Дано два числа. Найти минимальное число из них.
     * @param a
     * @param b
     * */
    public int minChislo(int a, int b){
        int min=0;
        try{
            if (a<b){
                min=a;
            }else{
                min=b;
            }
            log.info("Min chislo finded");
        }catch(Exception ex){
            ex.printStackTrace();
            log.error("Finding fail");
        }
        return min;
    }

    /**2.Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
     * @param mass
     * @param k
     * */
    public int summEcvivalent(int[] mass, int k){
        int summ=0;
        try{
            for (int i = 0; i <mass.length; i++) {
                if ((mass[i]%k)==0) {
                    summ+=mass[i];
                }
            }log.info("Summ calculated");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Fail calculating summ");
        }
        return summ;
    }

    /**3.В целочисленном массиве есть нулевые элементы. Создать массив из номеров
     *  этих элементов.
     * @param mass
     * */
    public int[] massZero(int []mass){
        int lenghtMass=mass.length;
        int[]massResalt=new int[lenghtMass];
        try{for (int i = 0; i < lenghtMass; i++) {
            if(mass[i]==0){
                massResalt[i]=i;
            }
        }}catch (Exception ex){
            ex.printStackTrace();
            log.error("Fail finding zero");
        }
        return massResalt;
    }

    /**4.Дан целочисленный массив чисел (положительных и отрицательных).
     Выяснить, какое число встречается раньше – положительное или отрицательное.
     * @param mass
     * */
    public boolean firsNegativeOrPositive(int[]mass){
        int lenghtMass=mass.length;
        try{
            for (int i = 0; i < lenghtMass; i++) {
                if(mass[i]<0){
                    return false;//negative
                }else{
                    return true; //positive include 0
                }
            }log.info("First negative or positive is finded");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Fail finding");
        }
        return true;
    }

    /**5.Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.
     * @param mass
     * */
    public boolean sortMassOrNot(int []mass){
        int lenghtMass=mass.length;
        boolean resalt=false;
        try{
            for (int i = 0; i <lenghtMass-1 ; i++) {
                if(mass[i]<mass[i+1]){
                    resalt=true;
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Fail in cheking sorting");
        }
        return resalt;
    }

    /**6.Дан массив чисел. Создать массив из четных чисел этого массива.
         Если таких чисел нет, то вывести сообщение об этом факте.
     * @param mass
     * */
    public int[] chetniyMass(int [] mass){
        int lenghtMass=mass.length;
        int count=0;
        int []massNew=new int[lenghtMass];
        try{
            for (int i = 0; i <lenghtMass ; i++) {
                if(mass[i]%2==0){
                    massNew[i]=mass[i];
                }else{
                    System.out.println("Чисел нет");
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Fail calculating chetnih chisel");
        }
        return massNew;
    }

    /**7.Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом.
     Подсчитать количество замен.
     * @param mass
     * @param z
     *  */
    public int []replaseElements(int []mass,int z){
            int lenghtMass=mass.length;
            int count=0;
            int []zMass=new int[lenghtMass];
            zMass=mass;
        try{
            for (int i = 0; i <lenghtMass; i++) {
                if(mass[i]>z){
                    zMass[i]=z;
                    count++;
                }
            }log.info("Elements changed");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Fail changing elements");
        }
        return zMass;
    }

    /**8.Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
     * @param chisla
     * */
    public int[] massCountPositiveNegativeZero(int[]chisla){
           int countPositive=0, countZero=0, countNegative=0;
           int lenghtChisla=chisla.length;
       try{
           for (int i = 0; i < lenghtChisla; i++) {
               if(chisla[i]<0){
                   countNegative++;
               }else if(chisla[i]==0){
                   countZero++;
               }else{
                   countPositive++;
               }
           }log.info("massCountPositiveNegativeZero counted");
       }catch (Exception ex){
            ex.printStackTrace();
            log.error("massCountPositiveNegativeZero failed");
       }
       int[] countChisel={countPositive, countZero, countNegative};
      return countChisel;
    }

    /**9. Дан массив чисел. Поменять местами наибольший и наименьший элементы.
     * @param minmax
     * return*/
    public int[] changeMinMax(int[]minmax){
            int min=minmax[0], max=minmax[0], massLenght=minmax.length;
            int indexOfMax = 0;
            int indexOfMin = 0;
        try{
            for (int i = 0; i <massLenght ; i++) {
                if(minmax[i]<min){
                    min=minmax[i];
                    indexOfMin=i;
                }
                if(minmax[i]>max){
                    max=minmax[i];
                    indexOfMax=i;
                }
            }
            minmax[indexOfMin] = max;
            minmax[indexOfMax] = min;
          //  for (int i = 0; i < massLenght; i++) {
            //System.out.println("i=" + i + " a[" + i + "]=" + minmax[i]);
        //}
        log.info("changed min max happends");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Fail");
        }return minmax;
    }

    /**10.Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.
     * @param arr
     * */
    public void termsArray(int[]arr){
        int lenghtArr=arr.length;
        try{
            for (int i = 0; i <lenghtArr ; i++) {
                if(arr[i]<= i){
                    System.out.println(arr[i]);
                }
            }log.info("Chisla printed");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Fail printing");
        }
    }

    /**11.	Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.
     * @param arr
     * @param l
     * @param m s
     * */
    public void termsCalculationMdivL(int[]arr,int m,int l){
        int lenghtArr=arr.length;
        try{
            for (int i = 0; i <lenghtArr ; i++) {
                if(arr[i]%m==l){
                    System.out.println(arr[i]);
                }
            }log.info("Chisla printed");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Error");
        }
    }

    /**12.	Дан массив чисел.  Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
     * @param mass
     * */
    public int [] changeNearestElements(int []mass){
        int a=0,b=0;
        int lenghtMass=mass.length;
        int  []changedMass=new int[lenghtMass];
        try{
            for (int i = 0; i <lenghtMass; i++) {
                a=mass[i];
                b=mass[i+1];
                changedMass[i]=b;
                changedMass[i+1]=a;
                i++;
            }log.info("Elements changed");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Error");
        }
        return changedMass;
    }

    /**13.	Дан массив чисел, среди которых имеется один нуль.
     Вывести на печать все числа, включительно до нуля.
     * @param mass
     * */
    public void printToZero(int[] mass){
        int lenght=mass.length;
        int id=0;
        try {
            for (int i = 0; i < lenght; i++) {
                if (mass[i] == 0) {
                    id = i;
                    System.out.println(mass[i] + " ");
                }
            }
            for (int i = 0; i <= id; i++) {
                System.out.println(mass[i] + " ");
            }log.info(" printToZero mass printed");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Error");
        }
    }

    /**14.	Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к])
     * + min(а[1], а[3], …, а[2к-1]).
     * @param mass
    */
    public int[] massParnih(int[]mass){
        int lenghtMass=mass.length;
        int [] massPar=new int[lenghtMass];
        try{
            for (int i = 0; i < lenghtMass; i++) {
                if((mass[i]%2)==0){
                    massPar[i]=mass[i];
                }
            }log.info("Mass parnih calculated ");
        }catch(Exception ex){
            ex.printStackTrace();
            log.error("Error");
        }
        return massPar;
    }
    public int[] massNeparnih(int[]mass){
        int lenghtMass=mass.length;
        int [] massNepar=new int[lenghtMass];
        try{
            for (int i = 0; i < lenghtMass; i++) {
                if((mass[i]%2)!=0){
                    massNepar[i]=mass[i];
                }
            }log.info("Mass neparnih calculated ");
        }catch(Exception ex){
            ex.printStackTrace();
            log.error("Error");
        }
        return massNepar;
    }

    public int maxPlasMin(int [] mass){
        int lenghtMass=mass.length;
        int max=mass[0],min=mass[0],res=0;
        int [] massNepar=new int[lenghtMass];
        int [] massPar=new int[lenghtMass];
        massPar=massParnih(mass);
        massNepar=massNeparnih(mass);
        try{
            for (int i = 0; i <lenghtMass ; i++) {
                if(massNepar[i]<min){
                    min=massNepar[i];
                }
                if(massPar[i]>max) {
                    max = massPar[i];
                }
            }
            res=max+min;
            log.info("Ok");
        }catch(Exception ex){
            ex.printStackTrace();
            log.error("Error");
        }
        return res;
    }


    /**15.	Дан массив целых положительных чисел.
     Найти произведение только тех чисел, которые больше заданного числа М. Если таких нет, то выдать сообщение об этом.
     * @param massToCompare
     * */
    public void whatModuleIsMore(int[]massToCompare){
    int massLenght=massToCompare.length;
    int positiveVar=1, negativeVar=1;
        try {
            for (int i = 0; i < massLenght; i++) {
                if (massToCompare[i] < 0) {
                    negativeVar *= massToCompare[i];
                } else {
                    positiveVar *= massToCompare[i];
                }
            }
            if (Math.abs(positiveVar) > Math.abs(negativeVar)) {
                System.out.println(positiveVar + " більше по модулю ніж " + negativeVar);
            } else {
                System.out.println(negativeVar + "більше ніж" + positiveVar);
            }log.info("whatModuleIsMore ok");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Error whatModuleIsMore");
        }
    }

    /**16.	Дан массив положительных и отрицательных чисел.
    Заменить нулями те числа, величина которых по модулю больше максимального числа
    (|a[i]| > max{ a[0], a[1], ..., a[n]})
     * @param mass
     * */
    public int[] changeToZero(int[]mass){
        int lenghtMass=mass.length;
        int max=mass[0];
        try{
            for (int i = 0; i < lenghtMass; i++) {
                if(mass[i]>max){
                    max=mass[i];
                }
            }
            for (int i = 0; i < lenghtMass; i++) {
            if(Math.abs(mass[i])>max){
                mass[i]=0;
            }log.info("changeToZero ok");
        }}catch (Exception ex){
            ex.printStackTrace();
            log.error("changeToZero fail");
        }
        return mass;
    }

    /**17.	Дан массив чисел с положительными и отрицательными элементы.
    Вычислить произведение отрицательных элементов P1 и произведение положительных
     элементов Р2.
    Сравнить модуль Р2 с модулем Р1 и указать, какое из произведений по модулю больше.
     * @param mass
     * */
    public int[] positiveNegativeProizvidenie(int []mass){
        int lenghtMass=mass.length;
        int positiveElements=1;
        int negativeElements=1;
        int[] mass1={0,0};
        try {
            for (int i = 0; i < lenghtMass; i++) {
                if (mass[i] < 0) {
                    negativeElements *= mass[i];
                } else {
                    positiveElements *= mass[i];
                }
            }
            int absNegativeElements = Math.abs(negativeElements);
            int absPositiveElements = Math.abs(positiveElements);
            if (absNegativeElements > absPositiveElements) {
                System.out.println("Добуток негативних елементів масива по модулю більше");
            } else if (absNegativeElements == absPositiveElements) {
                System.out.println("Добутки позитивних елементів масива та негативних елементів масива по модулю рівні");
            } else {
                System.out.println("Добуток позитивних елементів масива по модулю більше");
            }
            mass1[0] = absNegativeElements;
            mass1[1]=absPositiveElements;
            log.info("Добутки порівняно");
        }catch (Exception ex) {
            ex.printStackTrace();
            log.error("Error calculating");

        }
        return mass1;
    }

    /**18. Дан массив чисел.
    Среди них есть равные. Найти первый максимальный элемент массива и заменить его нулем.*
     *@param mass
     * */
    public int[] changedMassToZero(int [] mass) {
        int max = mass[0], massLenght = mass.length;
        int indexOfMax = 0;
        try {
            for (int i = 0; i < massLenght; i++) {
                if (mass[i] > max) {
                    max = mass[i];
                    indexOfMax = i;
                    mass[indexOfMax] = 0;
                    return mass;
                }
            }
            log.info("changed min max happends");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Fail");
        }
        return mass;
    }

    /**19. Дан массив чисел.
    Образовать новый массив, элементами которого будут элементы исходного,
    оканчивающиеся на цифру k.*/
    public int[] endInKnumbers(int[]mass,int k){
        int lenghtMass=mass.length;
        int [] newMass=new int[lenghtMass];
        try {
            for (int i = 0; i < lenghtMass; i++) {
              if(mass[i]%10==k){
                  newMass[i]=mass[i];
              }
            }
            log.info("Task 19 ok");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Task 19 error");
        }
      return newMass;
    }

private int scanerNumbers(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть 3-значне число");
    return sc.nextInt();
}
}
