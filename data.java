public class data {

    String namaMatkul;
    String namaTugas;
    String deadline;

    public  data(String namaMatkul, String namaTugas, String deadline ) {
        this.namaMatkul = namaMatkul;
        this.namaTugas = namaTugas;
        this.deadline = deadline;
        
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Data [namaMatkul=" + namaMatkul + ", namaTugas=" + namaTugas + ", deadline=" + deadline + "]";
    }
    
}