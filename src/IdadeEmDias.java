import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anos;
        int meses;
        int dias;
        int resultadoanosemdias;
        int resultadomesesemdias;
        int somatotal;
        int menu =0;

        while (menu != 4) {

            System.out.println();
            System.out.println("**Saiba sua idade em dias!!**");
            System.out.println("**Versao Brasileira = Renan Abud**");
            System.out.println("[1] Transforma em dias");
            System.out.println("[2] Sao muitos dias de vida, quero sair daqui!");

            menu = scanner.nextInt();

            switch (menu) {

                case 1:
                System.out.println("Digite a sua idade em anos");
                anos = scanner.nextInt();
                resultadoanosemdias = anos * 365;

                System.out.println("Digite quantos meses");
                meses = scanner.nextInt();
                resultadomesesemdias = meses * 30;

                System.out.println("Digite quantos dias");
                dias = scanner.nextInt();

                somatotal = resultadoanosemdias + resultadomesesemdias + dias;

                System.out.println("Sua idade em dias:" + somatotal);
                System.out.println("Nova Consulta?");
                    break;

                case 2:
                    System.out.println("Volte sempre tiozao ou tiazona!");
                    break;

                default:
                    System.out.println("Insira uma opcao valida por favor");
            }

        }
    }
}
