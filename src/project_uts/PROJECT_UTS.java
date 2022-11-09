//Nama  : Dimas Restu Putra
//NIM   : 21040114
//Kelas : 3F
package project_uts;
import project_uts.DESAIN.Biodata;

public class PROJECT_UTS {

    public static void main(String[] args) {
        Biodata data = new Biodata();
        data.setNama("Dimas Restu Putra");
        data.setKls("3F");
        data.setJurusan("D3 Teknik Komputer");
        System.out.println("Nama    : " + data.getNama() );
        System.out.println("Kelas   : " + data.getKls() );
        System.out.println("Jurusan : " + data.getJurusan() );
    }
    
}
