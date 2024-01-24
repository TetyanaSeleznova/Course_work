package company;
public class infa {

    public String eng;
    public String rus;
    public String discribesRus;
    public String discribesEng;
    public infa (String eng, String rus, String discribesRus, String discribesEng){
        this.eng = eng;
        this.rus = rus;
        this.discribesRus = discribesRus;
        this.discribesEng = discribesEng;
    }

    public void print_all_infa () {
        System.out.println("English: " + eng  );
    }

    public void print_all_reversoinfo() {
        System.out.println("Russian: " + rus );
    }

    public void print_all_discribesRus () {
        System.out.println("Значение фразеологизма: " + discribesRus);
    }
    public void print_all_discribesEng () {
        System.out.println("Значение фразеологизма: " + discribesEng);
    }
}

