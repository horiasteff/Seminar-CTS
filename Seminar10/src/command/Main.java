package command;

public class Main {
    public static void main(String[] args) {
        OperatiuneBancara op1 = new AlimentareCont("contul meu",500);
        OperatiuneBancara op2 = new AlimentareCont("contul prietenului", 200);
        OperatiuneBancara op3 = new AlimentareCont("contul parintilor", 250);

        ServerOperatiuniBancare server = new ServerOperatiuniBancare();
        server.inregistreazaOperatiune(op1);
        server.inregistreazaOperatiune(op2);
        server.inregistreazaOperatiune(op3);
    }
}
