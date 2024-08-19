public class Main {
    public static void main(String[] args) {
        //Declaração das variaveis e manipulação
        int idade2;
        double altura2;
        int idade1 = 17;
        double altura1= 1.93;
        String nome = "Gabriel";
        boolean estudante = true;
        idade2 = idade1+idade1;
        altura2 = altura1*2;
        //Exibição dos resultados
        System.out.println("Olá, "+nome);
        System.out.println("A idade informada: "+idade1+"; a altura informada: "+altura1+"; o nome informado: "+nome+"; 'true' para estudante e 'false' caso contrario: "+estudante);
        System.out.println("A soma da idade com ela mesma: "+idade2+"; a multiplicação da altura por 2: "+altura2);

    }
}