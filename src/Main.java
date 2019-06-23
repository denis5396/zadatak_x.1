import java.util.Scanner;
/*
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite pozitivan broj za n = ");
        int n = input.nextInt();
        pocetnik(n);
        System.out.println("");
        System.out.print("Unesite negativan broj za n = ");
        n = input.nextInt();
        pocetnik(n);
    }
    static int pocetnik(int n){
        if(n > 0){
            for(int i = 0; i <= n; i++){
            System.out.print(i + " ");
        }}
        else
            for(int j = 0; j >= n; j--){
                System.out.print(j + " ");
            }

        return n;}
}
*//*
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = input.nextInt();
        System.out.print("Zbir svih brojeva  koji su dijeljivi sa " + 5 + " je " + mahalusha(n));

    }
    static int mahalusha(int n){
        int zbir = 0;
        if(n < 1){
            return -1;
        }
        for(int i = 0; i <= n; i++){
            if(i % 5 == 0){
                zbir += i;
            }
        }
        return zbir;}
}
*//*
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = input.nextInt();
        System.out.print(faktorijel(n));
    }
    static int faktorijel(int n){
        int proizvod = 1;
        for(int i = 1; i <= n; i++){
            proizvod *= i;
        }
        return proizvod;}
}
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = input.nextInt();
        System.out.print("Unesite b: ");
        int b = input.nextInt();
        System.out.print("Unesite c: ");
        int c = input.nextInt();
        System.out.print(pitagora(a, b, c));
    }
    public static boolean pitagora(int a, int b, int c){
        if (c*c == a*a + b*b) {
            return true;
        }
        return false;}
}
*//*
public class Main {
    public static void main(String[] args) {
        System.out.print("Pitagorini brojevi do 25 su: ");
        System.out.println("");
        pitagoraNaAparatima(25);

    }
    static void pitagoraNaAparatima(int n){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                for(int k = 0; k <= n; k++){
                    if(pitagora(i,j,k)&& i < j && j < k){
                        System.out.println( i + " " + j + " " + k);

                    }
                }
            }
        }

    }
    public static boolean pitagora(int a, int b, int c){
        if (c*c == a*a + b*b) {
            return true;
        }
        return false;}
}
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite bazu: ");
        double x = input.nextDouble();
        System.out.print("Unesite eksponent: ");
        int n = input.nextInt();
        System.out.print("Rezultat glasi: ");
        System.out.print(matematicar(x, n));
    }
    static double matematicar(double x, int n){
        double rezultat = 1;
        for(int i = 0; i < n; i++){
             rezultat *= x;

        }
    return rezultat;}
}
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = input.nextInt();
        System.out.print("Suma njegovih cifara iznosi: " + sabirac(n));

    }

    static int sabirac(int n) {
        int suma = 0;
        if (n > 0) {
            do {
                suma += n % 10;
                n /= 10;
            } while (n > 0);

        }
        else
            return -1;

        return suma;}
}
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = input.nextInt();
        System.out.print("Proizvod njegovih cifara iznosi: " + mnozac(n));

    }
    static int mnozac(int n){
        int proizvod = 1;
        if (n > 0) {
            do {
                proizvod *= n % 10;
                n /= 10;
            } while (n > 0);

        }
        else
            return -1;
    return proizvod;}
}
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int nizx[] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1)
            nizx[brEl] = unos;
            brEl++;
            if(unos == -1){
                brEl--;
            }


        }while(unos != -1);



        ispisiNiz(nizx, brEl);
    }


    static void ispisiNiz(int niz[],int brEl) {
        System.out.print("Niz glasi: { ");
        for (int i = 0; i < brEl; i++) {

            System.out.print(niz[i] + " ");
            }
        System.out.print("}");
        System.out.print(" za niz koji ima elemente ");

        for (int j = 0; j < brEl; j++) {
                System.out.print(niz[j]);
                if(j != brEl -1) {
                    System.out.print(",");
                }
                if(j == brEl -1){
                    System.out.print(";");
                }

            }

        }
    }
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Koliko zelite elemenata u nizu ? ");
        int n = input.nextInt();
        ispisiNiz(n);

    }

    static int[] ispisiNiz(int n) {
        Scanner input = new Scanner(System.in);
        int unos;

        int niz[] = new int[n];
        System.out.println("Unesite brojeve: ");
        for (int i = 0; i < n; i++) {
            unos = input.nextInt();
            niz[i] = unos;
        }
        System.out.print("Niz glasi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(niz[i]);
            if (i != n - 1) {
                System.out.print(", ");
            }
            if (i == n - 1) {
                System.out.print(" .");
            }

        }
        return niz;}
}
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int nizx[] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj):");
        do{
            unos = input.nextInt();
            if(unos != -1){
                nizx[brEl] = unos;
                brEl++;
            }
        }while(unos != -1);
        System.out.print("Unesite n: ");
        int n = input.nextInt();
        int noviNiz[] = prepakuj(nizx, n);
        System.out.println("Novi niz glasi: ");
        for(int i = 0; i < noviNiz.length; i++){
            System.out.print(noviNiz[i]);
        }

        }



    static int[] prepakuj(int niz[], int n){
        int nizx[] = new int[n];
        for(int i = 0; i < n; i++){
            nizx[i] = niz[i];
        }

        return nizx;}
}
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int niz [] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
           unos = input.nextInt();
           if(unos != -1){
               niz[brEl] = unos;
               brEl++;
           }

        }while(unos != -1);
        System.out.print("Najmanji broj u nizu je: " + pronadjiNajmanji(niz,brEl));

    }
    static int pronadjiNajmanji(int niz[], int brEl){
        int temp;
        for(int i = 0; i < brEl; i++ ){
            for(int j = i+1; j < brEl; j++){
                if(niz[i] > niz[j]){
                    temp = niz[i];
                    niz[i] = niz[j];
                    niz[j] = temp;
                }
            }
        }
        return niz[0];}
    }
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int niz [] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1){
                niz[brEl] = unos;
                brEl++;
            }

        }while(unos != -1);
        System.out.print("Najveci broj u nizu je: " + pronadjiNajveci(niz,brEl));

    }
    static int pronadjiNajveci(int niz[], int brEl){
        int temp;
        for(int i = 0; i < brEl; i++ ){
            for(int j = i+1; j < brEl; j++){
                if(niz[i] < niz[j]){
                    temp = niz[i];
                    niz[i] = niz[j];
                    niz[j] = temp;
                }
            }
        }
        return niz[0];}
}*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int niz[] = new int[100];
        int n ;
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do {
            unos = input.nextInt();
            if (unos != -1) {
                niz[brEl] = unos;
                brEl++;
            }

        } while (unos != -1);
        System.out.println("Koji broj zelite pomjeriti na kraj niza? ");
        n = input.nextInt();
        int noviNiz[] = izbaciElementIzNiza(niz, brEl, n);
        for(int i = 0; i < brEl ; i++){
            System.out.print(noviNiz[i] + " ");
        }

    }

    static int[] izbaciElementIzNiza(int niz[], int brEl, int n) {
        int temp;
        System.out.print("Niz glasi: ");
        for (int i = 0; i < brEl; i++) {
            for (int j = i + 1; j < brEl; j++) {
                if (niz[i] == n && niz[j] != n) {
                    temp = niz[i];
                    niz[i] = niz[j];
                    niz[j] = temp;
                }
            }

        }
        return niz;}
}
*//*

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int niz [] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1){
                niz[brEl] = unos;
                brEl++;
            }

        }while(unos != -1);
        System.out.print("Prosjek elemenata u nizu je: ");
        System.out.print(prosjekNiza(niz,brEl));

    }
    static int prosjekNiza(int niz[], int brEl){
        int prosjek;
        int suma = 0;
        for(int i = 0; i < brEl; i++){
            suma += niz[i];
        }
    return prosjek = suma/brEl;}
}
 *//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int niz [] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1){
                niz[brEl] = unos;
                brEl++;
            }
        }while(unos != -1);
        int noviNiz[] = svakoDrugi(niz, brEl);
        System.out.print("Svaki drugi broj u nizu je: ");
        for(int i = 0; i < noviNiz.length; i++){
            System.out.print(noviNiz[i]);
            if(i != noviNiz.length -1){
                System.out.print(", ");
            }
            else
                System.out.print(" .");
        }

    }
    static int[] svakoDrugi(int niz[], int brEl){
        int nizx[] = new int[brEl];
        int brEl1 = 0;
        for(int i = 1; i < brEl; i += 2){

            nizx[brEl1] = niz[i];
            brEl1++;

        }
        int noviNIz[] = new int[brEl1];
        for(int i = 0; i < brEl1; i++){
            noviNIz[i] = nizx[i];
        }


    return noviNIz;}
    }
    *//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int niz[] = new int[100];
        int n ;
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do {
            unos = input.nextInt();
            if (unos != -1) {
                niz[brEl] = unos;
                brEl++;
            }

        } while (unos != -1);
        System.out.println("Koji broj zelite pomjeriti na kraj niza? ");
        n = input.nextInt();
        izbaciElementIzNiza(niz, brEl, n);
        for(int i = 0; i < brEl; i++) {
            System.out.print(niz[i] + " ");

        }
    }

    static void izbaciElementIzNiza(int niz[], int brEl, int n) {
        int temp;
        System.out.print("Niz glasi: ");
        for (int i = 0; i < brEl; i++) {
            for (int j = i + 1; j < brEl; j++) {
                if (niz[i] == n && niz[j] != n) {
                    temp = niz[i];
                    niz[i] = niz[j];
                    niz[j] = temp;
                }
            }

        }

        }
}
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int niz [] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1){
                niz[brEl] = unos;
                brEl++;
            }
        }while(unos != -1);
        System.out.print("Unesite broj k, koji ce prikazati svaki k-ti element u nizu: ");
        int k = input.nextInt();
        int noviNiz[] = svakoDrugiNaSteroidima(niz, brEl, k);
        System.out.print("Svaki " + k +"-i" + " broj u nizu je: ");
        for(int i = 0; i < noviNiz.length; i++){
            System.out.print(noviNiz[i]);
            if(i != noviNiz.length -1){
                System.out.print(", ");
            }
            else
                System.out.print(" .");
        }
    }
    static int[] svakoDrugiNaSteroidima(int niz[], int brEl, int k){
        int nizx[] = new int[brEl];
        int brEl1 = 0;

        for(int i = k-1; i < brEl; i += k){

                nizx[brEl1] = niz[i];
                brEl1++;

        }
        int noviNIz[] = new int[brEl1];

        for(int i = 0; i < brEl1; i++){
            noviNIz[i] = nizx[i];
        }

    return noviNIz;}
}
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Do kojeg broja zelite da vam ide niz? ");
        int n = input.nextInt();
        int niz[] = stepenice(n);
        System.out.print("Vas niz glasi: ");
        for(int i = 0; i < niz.length; i++){
            System.out.print(niz[i]);
        }

    }
    static int[] stepenice(int n){
        int niz[] = new int[n];
        int brEl = 0;

        for(int i = 1; i <= n; i++){
            niz[brEl] = i;
            brEl++;
        }
    return niz;}
}
//19. pomjeri lijevo
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int niz [] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1){
                niz[brEl] = unos;
                brEl++;
            }
        }while(unos != -1);
        System.out.println("Novi niz je pomjeren za jedno mjesto u lijevo  glasi: ");
        int noviNiz[] = pomjeriLijevo(niz, brEl);
        for(int i = 0; i < noviNiz.length; i++){
            System.out.print(noviNiz[i]);
            if(i != noviNiz.length -1){
                System.out.print(", ");
            }
            else
                System.out.print(" .");
        }
        }

    static int[] pomjeriLijevo(int niz[], int brEl){
        int nizx[] = new int[brEl];
        int brEl1 = 0;

        for(int i = 0; i < brEl; i++){
            if(niz[i] != niz[0]) {
                nizx[brEl1] = niz[i];
                brEl1++;

            }
        }
        int noviNIz[] = new int[brEl1];

        for(int i = 0; i < brEl1; i++){
            noviNIz[i] = nizx[i];
        }
    return noviNIz;}
//20. pomjeriDesno
}
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int niz [] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1){
                niz[brEl] = unos;
                brEl++;
            }
        }while(unos != -1);
        System.out.println("Novi niz je pomjeren za jedno mjesto u desno i glasi: ");
        int noviNiz[] = pomjeriDesno(niz, brEl);
        for(int i = 0; i < noviNiz.length; i++){
            System.out.print(noviNiz[i]);
            if(i != noviNiz.length -1){
                System.out.print(", ");
            }
            else
                System.out.print(" .");
        }
    }

    static int[] pomjeriDesno(int niz[], int brEl){
        int nizx[] = new int[brEl];
        int brEl1 = 0;

        for(int i = 0; i < brEl; i++){
            if(niz[i] == niz[0]){
                nizx[brEl1] = niz[i];
                brEl1++;
                brEl--;
            }
            nizx[brEl1] = niz[i];
            brEl1++;
        }


        return  nizx;}
}
//21. ubaciXnaIndex[2]
*//*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int niz [] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1){
                niz[brEl] = unos;
                brEl++;
            }
        }while(unos != -1);
        int x = 99;
        System.out.print("Novi niz na poziciji 3 ima novu vrijednost " + x );
        System.out.println(" , ostali elementi su pomjereni za 1 polozaj desno.");
        int noviNiz[] = ubaci99NaPoziciju(niz, brEl, x);
        for(int i = 0; i < noviNiz.length; i++){
            System.out.print(noviNiz[i]);
            if(i != noviNiz.length -1){
                System.out.print(", ");
            }
            else
                System.out.print(" .");
        }
    }

    static int[] ubaci99NaPoziciju(int niz[], int brEl, int x){
        int nizx[] = new int[brEl + 1];
        int brEl1 = 0;

        for(int i = 0; i < brEl + 1; i++){
            nizx[brEl1] = niz[i];
            brEl1++;
            if(niz[i] == niz[1]){
                nizx[brEl1] = x;
                brEl1++;
                brEl--;
            }

        }
        int noviNIz[] = new int[brEl1];

        for(int i = 0; i < brEl1; i++){
            noviNIz[i] = nizx[i];
        }
        return noviNIz;}
}
*/
//22. izbacivanjeNaAparatima
/*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int brEl1 = 0;
        int niz[] = new int[100];
        int niz1[] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do {
            unos = input.nextInt();
            if (unos != -1) {
                niz[brEl] = unos;
                brEl++;
            }
        } while (unos != -1);
        do {
            unos = input.nextInt();
            if (unos != -1) {
                niz1[brEl1] = unos;
                brEl1++;
            }
        } while (unos != -1);

        int noviNiz[] = izbacivanjeNaAparatima(niz,niz1,brEl,brEl1);
        for(int i = 0; i < brEl; i++) {
            System.out.print(noviNiz[i]);
        }
    }

/*
    static int[] izbacivanjeNaAparatima(int niz[],int niz1[], int brEl, int brEl1){
        int nizx[] = new int[brEl];
        int nizx1[] = new int[brEl1];
        int temp;
        int brElx = 0;

        for(int i = 0; i < brEl; i++){
            nizx[i] = niz[i];
        }
        for(int k = 0; k < brEl1; k++) {
            for (int i = 0; i < brEl; i++) {
                for (int j = i + 1; j < brEl; j++) {
                    if(nizx[i] == niz1[k]){
                        if(nizx[i] < nizx[j]){
                            temp = nizx[i];
                            nizx[i] = nizx[j];
                            nizx[j] = temp;
                        }
                    }
                }
            }
        }

    return nizx;}
*//*
static int[] izbacivanjeNaAparatima(int niz[],int niz1[], int brEl, int brEl1){
    int temp;
    for(int k = 0; k < brEl1; k++){
        for (int i = 0; i < brEl; i++) {
            if (niz[i] == niz1[k]) {
                temp = niz[i];
                for (int j = i; j < brEl; j++) {

                    niz[j] = niz[j + 1];
                    System.out.print(niz[j] + " ");

                }
                niz[brEl-1] = temp;
                brEl--;
                System.out.print(" ");
            }
        }
    }

    return niz;}
}

*//*
//23. unija 2 niza
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int brEl1 = 0;
        int niz[] = new int[100];
        int niz1[] = new int[100];
        System.out.println("Unesite brojeve za prvi niz(-1 za kraj): ");
        do {
            unos = input.nextInt();
            if (unos != -1) {
                niz[brEl] = unos;
                brEl++;
            }
        } while (unos != -1);
        System.out.println("Unesite brojeve za drugi niz(-1 za kraj): ");
        do {
            unos = input.nextInt();
            if (unos != -1) {
                niz1[brEl1] = unos;
                brEl1++;
            }
        } while (unos != -1);

        int noviNiz[] = unija(niz,niz1,brEl,brEl1);
        System.out.println("Unija dva niza glasi: ");
        for(int i = 0; i < noviNiz.length; i++) {
            System.out.print(noviNiz[i]);
            if(i != noviNiz.length-1){
                System.out.print(", ");
            }
            else
                System.out.print(". ");
        }
    }

    static int[] unija(int niz[], int niz1[], int brEl, int brEl1){
        int n1[] = new int[100];
        int n2[] = new int[100];
        int noviNiz[] = new int[100];
        int brElx = 0;
        int i = 0;
        int j = 0;
        int brElx1 = 0;
        int brElx2 = 0;
        int flag = 0;

        for(i = 0; i < (brEl-1); i++){
            for(j = i + 1; j < brEl; j++){
                if(niz[i] == niz[j]){
                    for(int k = j; k < (brEl-1); k++){
                        niz[k] = niz[k+1];
                    }

                    brEl = brEl-1;
                }
            }
        }



        for(i = 0; i < (brEl1-1); i++){
            for(j = i + 1; j < brEl1; j++){
                if(niz1[i] == niz1[j]){
                    for(int k = j; k < (brEl1-1); k++){
                        niz1[k] = niz1[k+1];
                    }
                    brEl1 = brEl1-1;
                }
            }
        }



        for(i = 0; i < brEl; i++){
            noviNiz[i] = niz[i];
        }
        for(i = 0; i < brEl1; i++){
            for(j = 0; j < brEl; j++){
                if(niz1[i] != niz[i]){
                    flag = 1;
                }
                else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1){
                noviNiz[i] = niz1[i];
            }
            brElx++;
        }

        int noviNizx[] = new int[brElx];

        for(i = 0; i < brElx; i++){
            noviNizx[i] = noviNiz[i];
        }

    return noviNizx;}
}
*//*
class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite pozitivan broj: ");
        int n = input.nextInt();
        pocetnik(n);
        System.out.println("");
        System.out.print("Unesite negativan broj: ");
        n = input.nextInt();
        pocetnik(n);

    }
    static void pocetnik(int n) {
        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                System.out.print(i + " ");
            }
        }
        else
            for (int i = 0; i >= n; i--) {
                System.out.print(i + " ");
            }
    }
}*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite n:");
        int n = input.nextInt();
        System.out.print("Zbir svih brojeva  koji su dijeljivi sa " + 5 + " je " + mahalusha(n));
    }
    static int mahalusha(int n){
        int suma = 0;
        if(n < 1){
            return -1;
        }
        for(int i = 0; i <= n; i++){
            if(i % 5 == 0){
                suma += i;
            }
        }
    return suma;}
}
*//*
class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite n:");
    int n = input.nextInt();
    System.out.print(faktorijel(n));
    }
    static int faktorijel(int n){
        int rezultat = 1;
        for(int i = 1; i <= n; i++){
            rezultat *= i;
        }

    return rezultat;}
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite n:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.print(pitagora(a,b,c));
    }
    static boolean pitagora(int a, int b, int c){

                    if(c*c == a*a + b*b){
                        return true;
                    }return false;}
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite n:");
        pitagoraNaAparatima(25);
    }

    static void pitagoraNaAparatima(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    if (pitagora(i, j, k) && i < j && j < k) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }

    static boolean pitagora(int a, int b, int c) {

        if (c * c == a * a + b * b) {
            return true;
        }
        return false;
    }
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite x:");
        double x = input.nextDouble();
        System.out.print("Unesite n:");
        int n = input.nextInt();
        System.out.print(matematicar(x,n));
    }
    static double matematicar(double x, int n){
        double rezultat = 1;
        for(int i = 0; i < n; i++){
            rezultat *= x;
        }
    return  rezultat;}
}
*//*
class Main {
    public static void main(String[] args) {
        System.out.print(sabirac(25));
    }
    static int sabirac(int n){
        int zbir = 0;

        for(int i = 0; i <= n; i++){
            zbir += n % 10;
            n /=  10;

        }
    return zbir;}
}
*//*
class Main {
    public static void main(String[] args) {
    System.out.print(mnozac(-2));
    }
    static int mnozac(int n){
        int proizvod = 1;
        if(n > 0){
            do{
                proizvod *= n%10;
                n /= 10;
            }while(n > 0);
        }
        else return -1;
    return proizvod;}
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int nizx[] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1)
                nizx[brEl] = unos;
                brEl++;
            if(unos == -1){
                brEl--;
            }

        }while(unos != -1);

        ispisiNiz(nizx,brEl);
    }
    static void ispisiNiz(int niz[], int brEl){
        System.out.print("Niz glasi: {");
        for(int i = 0; i < brEl; i++){
            System.out.print(niz[i]);
            if(i != brEl-1){
                System.out.print(", ");
            }
            else
                System.out.print(".");
        }
        System.out.print("}");
        System.out.print(" za niz koji ima elemente: ");
        for(int i = 0; i < brEl; i++){
            System.out.print(niz[i]);
            if(i != brEl-1){
                System.out.print(", ");
            }
            else
                System.out.print(".");
        }
    }
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int nizx[] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1)
                nizx[brEl] = unos;
            brEl++;
            if(unos == -1){
                brEl--;
            }

        }while(unos != -1);

        int noviNiz[] = prepakuj(nizx,brEl,3);
        for(int i = 0; i < noviNiz.length; i++){
            System.out.print(noviNiz[i] + " ");
        }

    }
    static int [] prepakuj(int niz[], int brEl, int n){
        int noviNiz[] = new int[n];
        int brEl1 = 0;
        for(int i = 0; i < n; i++){
            noviNiz[brEl1] = niz[i];
            brEl1++;
        }
    return noviNiz;}
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int niz[] = unesiNiz(n);
        for(int i = 0; i < niz.length; i++){
            System.out.print(niz[i]);
        }

    }
    static int[] unesiNiz(int n){
        Scanner input = new Scanner(System.in);
        int niz[] = new int[n];

        for(int i = 0; i < n; i++){
            niz[i] = input.nextInt();
        }

    return niz;}
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int nizx[] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1)
                nizx[brEl] = unos;
            brEl++;
            if(unos == -1){
                brEl--;
            }

        }while(unos != -1);

        System.out.print(pronadjiNajmanji(nizx,brEl));
    }
    static int pronadjiNajmanji(int niz[], int brEl){
        int temp;

        for(int i = 0; i < brEl; i++){
            for(int j = i + 1; j < brEl; j++){
                if(niz[i] > niz[j]){
                    temp = niz[i];
                    niz[i] = niz[j];
                    niz[j] = temp;
                }
            }
        }
    return niz[0];}
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int nizx[] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1)
                nizx[brEl] = unos;
            brEl++;
            if(unos == -1){
                brEl--;
            }

        }while(unos != -1);

        System.out.print(pronadjiNajveci(nizx,brEl));
    }
    static int pronadjiNajveci(int niz[], int brEl){
        int temp;

        for(int i = 0; i < brEl; i++){
            for(int j = i + 1; j < brEl; j++){
                if(niz[i] < niz[j]){
                    temp = niz[i];
                    niz[i] = niz[j];
                    niz[j] = temp;
                }
            }
        }
        return niz[0];}
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int nizx[] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1)
                nizx[brEl] = unos;
            brEl++;
            if(unos == -1){
                brEl--;
            }

        }while(unos != -1);

        int noviNiz[] = izbaciElement(nizx, brEl, 25);
        for(int i = 0; i < noviNiz.length; i++){
            System.out.print(noviNiz[i]);
        }
    }
    static int[] izbaciElement(int niz[], int brEl, int n){
        int noviNiz[] = new int[brEl];
        int brEl1 = 0;
        for(int i = 0; i < brEl; i++){
            if(niz[i] != n){
                noviNiz[brEl1] = niz[i];
                brEl1++;

            }

            }
    return noviNiz;}
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int nizx[] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1)
                nizx[brEl] = unos;
            brEl++;
            if(unos == -1){
                brEl--;
            }

        }while(unos != -1);

        System.out.print(prosjek(nizx, brEl));
    }
    static double prosjek(int niz[], int brEl){
        double rezultat;
        int zbir = 0;

        for(int i = 0; i < brEl; i++){
            zbir += niz[i];

        }
        rezultat = zbir/brEl;

    return rezultat;}
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int nizx[] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1)
                nizx[brEl] = unos;
            brEl++;
            if(unos == -1){
                brEl--;
            }

        }while(unos != -1);

        int noviNiz[] = svakoDrugi(nizx, brEl, 2);
        for(int i = 0; i < noviNiz.length; i++){
            System.out.print(noviNiz[i]);
        }
    }
    static int[] svakoDrugi(int niz[], int brEl, int n){
        int noviNiz[] = new int[brEl];
        int brEl1 = 0;
        for(int i = n-1; i < brEl; i += n){
            noviNiz[brEl1] = niz[i];
            brEl1++;
        }
        return  noviNiz;}
}
*//*
class Main {
    public static void main(String[] args) {
    int niz[] = stepenice(5);
    for(int i = 0; i < niz.length; i++){
        System.out.print(niz[i]);
    }
    }
    static int[] stepenice(int n){
        int niz[] = new int[n];
        int niz1[] = new int[n];
        int brEl1 = 0;
        for(int i = 0; i <= n; i++){
            if(i != 0) {
                niz[brEl1] = i;
                brEl1++;
            }
        }

    return niz;}

}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int nizx[] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1)
                nizx[brEl] = unos;
            brEl++;
            if(unos == -1){
                brEl--;
            }

        }while(unos != -1);

        int noviNiz[] = pomjeriLijevo(nizx, brEl);
        for(int i = 0; i < noviNiz.length; i++){
            System.out.print(noviNiz[i]);
        }

    }

    static int[] pomjeriLijevo(int niz[], int brEl){
        int noviNiz[] = new int[brEl];
        int temp;
        int brEl1 = 0;

        for(int i = 0; i <= brEl; i++){
            if(i != 0){
                noviNiz[brEl1] = niz[i];
                brEl1++;
            }
        }
    return noviNiz;}
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int nizx[] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1)
                nizx[brEl] = unos;
            brEl++;
            if(unos == -1){
                brEl--;
            }

        }while(unos != -1);

        int noviNiz[] = pomjeriDesno(nizx, brEl);
        for(int i = 0; i < noviNiz.length; i++){
            System.out.print(noviNiz[i]);
        }
    }
    static int[] pomjeriDesno(int niz[], int brEl){
        int noviNiz[] = new int[brEl];
        int temp;
        int brEl1 = 0;

        for(int i = 0; i < brEl; i++){
            if(i == 0){
                noviNiz[brEl1] = niz[i];
                brEl1++;
                brEl--;
            }
            noviNiz[brEl1] = niz[i];
            brEl1++;
        }
    return noviNiz;}
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int brEl = 0;
        int nizx[] = new int[100];
        System.out.println("Unesite brojeve (-1 za kraj): ");
        do{
            unos = input.nextInt();
            if(unos != -1)
                nizx[brEl] = unos;
            brEl++;
            if(unos == -1){
                brEl--;
            }

        }while(unos != -1);

        int noviNiz[] = ubaciX(nizx, brEl, 99);
        for(int i = 0; i < noviNiz.length; i++){
            System.out.print(noviNiz[i]);
        }
    }
    static int[] ubaciX(int niz[], int brEl, int n){
        int noviNiz[] = new int[brEl+1];
        int brEl1 = 0;
        for(int i = 0; i < brEl+1; i++){
            if(i == 2){
                noviNiz[brEl1] = n;
                brEl1++;
                brEl--;

            }
                noviNiz[brEl1] = niz[i];
                brEl1++;

        }
        int noviNIzx[] = new int[brEl1];
        for(int i = 0; i < brEl1; i++){
            noviNIzx[i] = noviNiz[i];
        }

    return noviNIzx;}
}
*//*
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int unos;
        int niz[] = new int[100];
        int niz1[] = new int[100];
        int brEl = 0;
        int brEl1 = 0;
        do{
            unos = input.nextInt();
            if(unos !=-1){
                niz[brEl] = unos;
                brEl++;
            }

        }while(unos != -1);
        do{
            unos = input.nextInt();
            if(unos !=-1){
                niz1[brEl1] = unos;
                brEl1++;
            }

        }while(unos != -1);

        int noviNiz[] = izbacivanjeNaAparatima(niz,niz1,brEl,brEl1);
        for(int i = 0; i < brEl; i++){
            System.out.print(noviNiz[i]);
        }

    }
    static int[] izbacivanjeNaAparatima(int niz[], int niz1[], int brEl, int brEl1){

        int temp;

        for(int j = 0; j < brEl1; j++){
            for(int i = 0; i < brEl; i++){
                if(niz[i] == niz1[j]){
                    temp = niz[i];
                    for(int k = i; k < brEl; k++){
                        niz[k] = niz[k + 1];
                    }
                    niz[brEl-1] = temp;
                    brEl--;
                }
            }
        }


    return niz;}
}
*//*
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unos;
        int niz[] = new int[100];
        int niz1[] = new int[100];
        int brEl = 0;
        int brEl1 = 0;
        do {
            unos = input.nextInt();
            if (unos != -1) {
                niz[brEl] = unos;
                brEl++;
            }

        } while (unos != -1);
        do {
            unos = input.nextInt();
            if (unos != -1) {
                niz1[brEl1] = unos;
                brEl1++;
            }

        } while (unos != -1);
        int noviNiz[] = new int[brEl + brEl1];
        int brElx = 0;

        for (int i = 0; i < (brEl-1); i++) {
            for (int j = i + 1; j < brEl; j++) {
                if (niz[i] == niz[j]) {
                    for (int k = j ; k < (brEl-1); k++){
                        niz[k] = niz[k + 1];
                    }
                    brEl--;
                }
            }
        }


        for (int i = 0; i < (brEl1-1); i++) {
            for (int j = i + 1; j < brEl1; j++) {
                if (niz1[i] == niz1[j]) {
                    for (int k = j ; k < (brEl1-1); k++){
                        niz1[k] = niz1[k + 1];
                    }
                    brEl1--;
                }
            }
        }
        int temp;

        for(int i = 0; i < brEl; i++){
            for(int j = 0; j < brEl1; j++){
                if(niz[i] == niz1[j]){
                    for(int k = i; k < brEl; k++){
                        niz[k] = niz[k];
                    }
                }
                else if(niz[i] != niz1[j]){
                    for(int m = i; m < brEl; m++){
                        niz[m] = niz[m];
                    }
                }
            }
        }
        for(int j = 0; j < brEl1; j++){
            System.out.print(niz[j]);
        }

    }
}

        //int noviNiz[] = unija(niz, niz1, brEl, brEl1);

   /*
    static void unija(int niz[], int niz1[], int brEl, int brEl1){
        int noviNiz[] = new int[brEl + brEl1];
        int brElx = 0;

        for(int i = 0; i < brEl; i++){
            for(int j = i+1; j < brEl; j++){
                if(niz[i] != niz[j]){
                    noviNiz[brElx] = niz[i];
                    brElx++;
                }
            }
        }
        for(int i = 0; i < brElx; i++){
            System.out.print(noviNiz[i]);
        }

        }

}
*/
