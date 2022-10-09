public class operator {
    public static void main(String[] args) {
        /*int x = 5;
        x = x + 2;
        int y = 4;

        System.out.println(x/y);  //uwaga wynik całkowity bo oprandy w int całkowite
        System.out.println(x / (double)y); // rzutowanie inta na double, jedn z argumentów bedzie zmiennoprzecinkową
        System.out.println(3/2.); // wystarczy dodać kropke

        System.out.println(5 % 2); // reszta z dzielnia

        int a = 5;
        int b = -a;
        System.out.println(a);
        System.out.println(b);*/

        /*------
        int x, y ,z;

        x=42;
        y=x++; // y=42 , x =43
        z=++x; //x = 44, z= 44
        System.out.println(y);
        System.out.println(z);

        int a = 0;
        int b;

        b = a++ + a++;  //(0) + (1)  b = 1;  a = 2
        System.out.println("a= " + a);
        System.out.println("b= " +b);*/

        /*int z = 0;
        z = z++;  // przed wykonaniem z zostało przypisane obecne
        System.out.println("z =" + z);*/

        //------------//

    /*    int x = 7;
        int y = 7;
        int z = 7;*/

        /*int x, y, z;
        x=y=z=7;
        x += 2; //x=x+2*/


        //Operatory relacji
        // negacja !
        // iloczyn logiczny &&
        // suma logiczna ||
        //równoważność ==
        //alternatywa rozłączna XOR != czyli różne


        //&& i || to operatory warunkowe w przeciwieństwie do & i |
        int x = 0;
        int y = 5;
        boolean test = (x < 0) && (y++ > 3); // gdy x = 0 (y++>5) nie zostanie wykonany bo nie ma sensu
        System.out.println(test);
        System.out.println(y);

        int age = 33;
        boolean test2 = !(age < 25); //najpierw wychdzi false ale potem negujemy false i otrzymujemy true
        System.out.println(test2);





    }
}
