
public class Main {
    public static void main(String [] args){
        QueryGen qg = new QueryGen();
        System.out.println("Ejecutando query 1");
        qg.executeQuery(qg.query1());

        System.out.println("Ejecutando query 2");
        qg.executeQuery(qg.query2());

        System.out.println("Ejecutando query 3");
        qg.executeQuery(qg.query3());

        System.out.println("Ejecutando query 4");
        qg.executeQuery(qg.query4());

        System.out.println("Ejecutando query 5");
        qg.executeQuery(qg.query5());

        System.out.println("Ejecutando query 6");
        qg.executeQuery(qg.query6());

        System.out.println("Ejecutando query 7");
        qg.executeQuery(qg.query7());

        System.out.println("Fin");
    }


}
