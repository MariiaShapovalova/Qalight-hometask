package mainProject;



import java.util.Scanner;

public class Methods {
   // public int numbers=scanerNumbers();

    public int summNumbers(int number1, int number2) {
        return number1 + number2;
    }


//-------------------------------------------------JavaHomeTask--------------------------------------------------

    /* 1 Написать метод возвращающий факториал заданного числа N
     *@param a
     * return */
    public int countFactorial(int a) {
        int b = 1;
        for (int i = a; i > 1; i--) {
            b = b * (i - 1);
        }
        return b;
    }

    /*2. написать статический метод double getDistance(x1, y1, x2, y2).
    Он должен вычислять расстояние между точками. Посмотреть в учебнике геометрии или в интернете
    *@param x1
    *@param x2
    *@param y1
    *@param y2
     * return */
    public double getDistance(double x1, double y1, double x2, double y2) {
        double distanse=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return distanse;
    }

   /*3. Написать буленовский метод принимающий на вход 3 переменных типа
   int которые обозначают длину стороны для треугольника и возвращает правда или ложь
   (может ли существовать треугольник
   с заданными сторонами) Вспоминаем свойство треугольника ни одна сторона не должна быть
    длиннее суммы  двух других
    *@param a
    *@param b
    *@param c
    * return */
    public boolean triadgleExist(int a, int b, int c) {
        boolean res;
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    /*4. Почитать про вложенный цикл и вывести треугольник из нулей на экран*/
    public void triangleFromZero() {
        int colums = 3;
        int row=1+colums/2;
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
    }


    /*5. Написать программу которая вычисляет индекс массы тела
     *@param height
     *@param weith
     * return */
    public double bodyIndex(double height, double weith) {
        return weith / (height * height);
    }

    /*6  Составить алгоритм определяющий, есть ли среди цифр введенного трехзначного числа — одинаковые.
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
            return have;
        }
    }

    /*7. написать метод высчитывающий сколько литров
    нужно чтобы заполнить бассейн Примает на вход 3 величины глубину длину и ширину бассейна.
    Определить перед решением что принимает на вход и что возвращает
     *@param height
     *@param depth
     *@param widht
     * return */
    public double poolValue(double height, double depth, double widht) {
        return height * depth * widht;
    }

    /*8. При поступлении в вуз абитуриенты, получившие "двойку" на первом экзамене, ко второму не допускаются.
    В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
    Подсчитать, сколько человек не допущено ко второму экзамену.
    *@mass [] marks
    *return*/
    public int isNotPassed(int [] marks){
        int summStudents =0;
        for(int i=0;i<marks.length; i++){
            if(marks[i]<3){
                summStudents++;
            }else{
                System.out.println("All passed");
            }
        }
        return summStudents;
    }

    /*9. У вас есть доллары. Вы хотите обменять их на рубли.
    Есть информация о стоимости купли-продажи в банках города. В городе N банков.
    Составьте программу, определяющую, какой банк выбрать, чтобы выгодно обменять доллары на рубли.*/
    public int curencyExchange(int []mass){
        int bankNumber=0;
        int lenghtMass=mass.length;
        int min=mass[0];
        for (int i = 0; i <lenghtMass; i++) {
           if(mass[i]<min){
                bankNumber=mass[i];
               return bankNumber;
           }
        }
        return bankNumber;
    }


    /*10.Вывести на экран строку S указанное количество раз N
     *@param n
     *@param s */
    public void strindOutput(int n, String s){
         for(int i=0;i<n;i++){
             System.out.println(s);
         }
    }

    /*11. Написать программу нахождения суммы большего и меньшего из 3-х чисел.
     *@param a
     *@param b
     *@param c
     * return*/
    public int summMinMax(int a, int b, int c) {
        int min = a, max = a;
        if ((a < b) && (b > c)) {
            max = b;
        } else if ((c > b) && (c > a)) {
            max = c;
        } else if ((c > b) && (a > b)) {
            min = b;
        } else if ((c < b) && (c < a)) {
            min = c;
        }
        return min + max;
    }

    /*12. Вычислить площадь треугольника
     *@param a
     *@param heightA
     * return*/
    public double triangleSquare(double a, double heightA) {
        return (a * heightA) / 2;
    }

    public double triangleSquare2(double a) {
        return ((Math.pow(a,2) * Math.sqrt(3)))/4;
    }

    /*13 . Вычислить площадь правильного шестиугольника со стороной a,
     используя подпрограмму вычисления площади треугольника
     *@param storona
     * return*/
    public double squareHexagon(int storona){
        double squere;
        squere=6*triangleSquare2(storona);
        return squere;
    }


    /*14. Написать программу вычисления суммы факториалов всех нечетных чисел от 1 до 9
    * return*/
    public long factorialChisel(){
        long summ=1;
        for (int i=0;i<=9;i+=2){
            summ+=countFactorial(i);
        }
        return summ;
    }

    /*15 Написать программу которая возвращает стоимость покупки с учетом дисконта
    Если покупка совершена на сумму до 1000 грн то скидка не положена Если от 1001 грн
    до 2000 скидка 2% от  2001 до 5000 скидка 5% и свыше 5001 скидка 7%
    *@param prise
    * return*/
    public double countDiscont(int prise){
        double countedPrise=0;
        if(prise<=1000){
           countedPrise=prise;
        }else if(prise>1000&&prise<=2000){
            countedPrise=prise+prise*0.02;
        }else if(prise>2000&&prise<=5000){
            countedPrise=prise+prise*0.05;
        }else{
            countedPrise=prise+prise*0.07;
        }

        return countedPrise;
    }



//---------------------------------------------------Level 1-----------------------------------------------
    /*1.Дано два числа. Найти минимальное число из них.*/
    public int minChislo(int a, int b){
        int min;
        if (a<b){
            min=a;
        }else{
            min=b;
        }
        return min;
    }

    /*2.Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.*/
    public int summEcvivalent(int[] mass, int k){
        int summ=0;
        for (int i = 0; i <mass.length; i++) {
            if (mass[i]%k==0) {
                summ+=mass[i];
            }
        }
        return summ;
    }

    /*3.В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.*/
   /* public int [] massZero(int []mass){
        int lenghtMass=mass.length;
        int []zeroIdMass=new int [lenghtMass];
        int id=0;
        for (int i = 0; i < lenghtMass; i++) {
            if(mass[i]==0){
                id=i;
                for (int j = 0; j <lenghtMass; j++) {

                }
            }
        }

        return zeroIdMass;
    }*/

    /*4.Дан целочисленный массив чисел (положительных и отрицательных).
    Выяснить, какое число встречается раньше – положительное или отрицательное.*/
    public boolean firsNegativeOrPositive(int[]mass){
        int lenghtMass=mass.length;
        for (int i = 0; i < lenghtMass; i++) {
           if(mass[i]<0){
             return false;//negative
           }else{
               return true; //positive include 0
           }
        }
        return true;
    }

    /*5.Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.*/
    public boolean sortMassOrNot(int []mass){
        int lenghtMass=mass.length;
        boolean resalt=false;
        for (int i = 0; i <lenghtMass-1 ; i++) {
            if(mass[i]<mass[i+1]){
             resalt=true;
            }
        }
        return resalt;
    }

    /*6.Дан массив чисел. Создать массив из четных чисел этого массива.
    Если таких чисел нет, то вывести сообщение об этом факте. */

    /*7.Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом.
    Подсчитать количество замен.*/
    public int []replaseElements(int []mass,int z){
            int lenghtMass=mass.length;
            int count=0;
            int []zMass=new int[lenghtMass];
            zMass=mass;
        for (int i = 0; i <lenghtMass; i++) {
            if(mass[i]>z){
                zMass[i]=z;
                count++;
            }
        }
        return zMass;
    }

    /*8.Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.*/
    public int[] massCountPositiveNegativeZero(int[]chisla){
           int countPositive=0, countZero=0, countNegative=0;
           int lenghtChisla=chisla.length;
       for (int i = 0; i < lenghtChisla; i++) {
            if(chisla[i]<0){
                countNegative++;
            }else if(chisla[i]==0){
                countZero++;
            }else{
                countPositive++;
            }
       }
       int[] countChisel={countPositive, countZero, countNegative};
      return countChisel;
    }

    /*9. Дан массив чисел. Поменять местами наибольший и наименьший элементы.
     * @mass [] minmax
     * return*/
    /*public int[] changeMinMax(int[]minmax){
            int min=minmax[0], max=minmax[0], massLenght=minmax.length;
            int indexOfMax = 0;
            int indexOfMin = 0;
        int []changedMass;
        changedMass=new int [massLenght];
        changedMass=minmax;

        for (int i = 0; i <massLenght ; i++) {
            if(minmax[i]<min){
              //min=minmax[i];
              indexOfMin=i;
            }
            if(minmax[i]>max){
               // max=minmax[i];
                indexOfMax=i;
            }
        }

        changedMass[indexOfMax]=minmax[indexOfMin]+minmax[indexOfMax];
        changedMass[indexOfMin]=minmax[indexOfMax]-minmax[indexOfMin];
        changedMass[indexOfMax]=minmax[indexOfMax]-minmax[indexOfMin];
        //changedMass[indexOfMax]=minmax[indexOfMax]+minmax[indexOfMin];
        return changedMass;
    }*/

    /*10.Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.*/
    public void termsArray(int[]arr){
        int lenghtArr=arr.length;
        for (int i = 0; i <lenghtArr ; i++) {
            if(arr[i]<= i){
                System.out.println(arr[i]);
            }
        }
    }

    /*11.	Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.*/
    public void termsCalculationMdivL(int[]arr,int m,int l){
        int lenghtArr=arr.length;
        for (int i = 0; i <lenghtArr ; i++) {
            if(arr[i]%m==l){
                System.out.println(arr[i]);
            }
        }
    }

    /*12.	Дан массив чисел.  Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)*/

    /*13.	Дан массив чисел, среди которых имеется один нуль.
    Вывести на печать все числа, включительно до нуля.*/
   /* public int[] printToZero(int[] mass){
        int lenght=mass.length;
        int id=0;
        for (int i = 0; i < lenght; i++) {
            if(mass[i]==0){
                id=i;
            }
        }
        int []newmass= new newmass[id];
            for (int i = 0; i < id; i++) {
                newmass[i]=mass[i];
            }
        return newmass;
    }*/

    /*
14.	Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).*/

    /*15.	Дан массив целых положительных чисел.
    Найти произведение только тех чисел, которые больше заданного числа М.
    Если таких нет, то выдать сообщение об этом.*/
    public void whatModuleIsMore(int[]massToCompare){
    int massLenght=massToCompare.length;
    int positiveVar=1, negativeVar=1;
        for (int i = 0; i < massLenght; i++) {
            if(massToCompare[i]<0){
                negativeVar*=massToCompare[i];
            }else{
                positiveVar*=massToCompare[i];
            }
        }
        if(Math.abs(positiveVar)>Math.abs(negativeVar)){
            System.out.println(positiveVar+" більше по модулю ніж "+negativeVar);
        }else {
        System.out.println(negativeVar+"більше ніж"+positiveVar);
        }
    }

    /*16.	Дан массив положительных и отрицательных чисел.
    Заменить нулями те числа, величина которых по модулю больше максимального числа
    (|a[i]| > max{ a[0], a[1], ..., a[n]})*/

    /*17.	Дан массив чисел с положительными и отрицательными элементы.
    Вычислить произведение отрицательных элементов P1 и произведение положительных элементов Р2.
    Сравнить модуль Р2 с модулем Р1 и указать, какое из произведений по модулю больше.*/

    /*18. Дан массив чисел.
    Среди них есть равные. Найти первый максимальный элемент массива и заменить его нулем.*/

    /*19. Дан массив чисел.
    Образовать новый массив, элементами которого будут элементы исходного, оканчивающиеся на цифру k.*/

private int scanerNumbers(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть 3-значне число");
    return sc.nextInt();
}
}
