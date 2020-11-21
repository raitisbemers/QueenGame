import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Spēle \"8 DĀMAS\"");
        System.out.println("Noteikumi: ievadiet katrā no 8 rindām vienu DĀMAS simbolu \"Q\"\n tā, lai neatkārtojas kollonā uz leju un diognālē pa labi un kreisi!");
        System.out.println();
        System.out.println("Norādiet, kur būs DĀMA 1. rindā: [1][2][3][4][5][6][7][8]?");
        Scanner scan = new Scanner(System.in);
        int dama = scan.nextInt();
        int[] vairakasRindas = new int[8];
        System.out.print("1. rinda: ");
        for (int rin = 0; rin < 8; rin++) {
            vairakasRindas[rin] = rin + 1;
            if (dama == vairakasRindas[rin]) {
                System.out.print("[Q]");
            } else if (dama == 0 || dama > 8) {
                System.out.println("ir kļūda!");
                System.exit(0);
            } else {
                System.out.print("[x]");
            }
        }
        System.out.println();

        System.out.println("Norādiet, kur būs DĀMA 2. rindā: [1][2][3][4][5][6][7][8]?");
        int dama2 = scan.nextInt();
        System.out.print("2. rinda: ");
        for (int rin = 0; rin < 8; rin++) {
            vairakasRindas[rin] = rin + 1;
            if (dama2 == dama || dama2 == dama + 1 || dama2 == dama - 1) {
                System.out.println("Tur nevar būt dāma! Spēles beigas!");
                System.exit(0);
            } else if (dama2 == vairakasRindas[rin]) {
                System.out.print("[Q]");
            } else if (dama2 == 0 || dama2 > 8) {
                System.out.println("ir kļūda! Spēles beigas!");
                System.exit(0);
            } else {
                System.out.print("[x]");
            }
        }
        System.out.println();

        System.out.println("Norādiet, kur būs DĀMA 3. rindā: [1][2][3][4][5][6][7][8]?");
        int dama3 = scan.nextInt();
        System.out.print("3. rinda: ");
        for (int rin = 0; rin < 8; rin++) {
            vairakasRindas[rin] = rin + 1;
            if (dama3 == dama || dama3 == dama + 2 || dama3 == dama - 2 ||
                    dama3 == dama2 || dama3 == dama2 + 1 || dama3 == dama2 - 1) {
                System.out.println("Tur nevar būt dāma! Spēles beigas!");
                System.exit(0);
            } else if (dama3 == vairakasRindas[rin]) {
                System.out.print("[Q]");
            } else if (dama3 == 0 || dama3 > 8) {
                System.out.println("ir kļūda! Spēles beigas!");
                System.exit(0);
            } else {
                System.out.print("[x]");
            }
        }
        System.out.println();

        System.out.println("Norādiet, kur būs DĀMA 4. rindā: [1][2][3][4][5][6][7][8]?");
        int dama4 = scan.nextInt();
        System.out.print("4. rinda: ");
        for (int rin = 0; rin < 8; rin++) {
            vairakasRindas[rin] = rin + 1;
            if (dama4 == dama || dama4 == dama + 3 || dama4 == dama - 3 ||
                    dama4 == dama2 || dama4 == dama2 + 2 || dama2 == dama2 - 2 ||
                    dama4 == dama3 || dama4 == dama3 + 1 || dama4 == dama3 - 1) {
                System.out.println("Tur nevar būt dāma! Spēles beigas!");
                System.exit(0);
            } else if (dama4 == vairakasRindas[rin]) {
                System.out.print("[Q]");
            } else if (dama4 == 0 || dama4 > 8) {
                System.out.println("ir kļūda! Spēles beigas!");
                System.exit(0);
            } else {
                System.out.print("[x]");
            }
        }
        System.out.println();

        System.out.println("Norādiet, kur būs DĀMA 5. rindā: [1][2][3][4][5][6][7][8]?");
        int dama5 = scan.nextInt();
        System.out.print("5. rinda: ");
        for (int rin = 0; rin < 8; rin++) {
            vairakasRindas[rin] = rin + 1;
            if (dama5 == dama || dama5 == dama + 4 || dama5 == dama - 4 ||
                    dama5 == dama2 || dama5 == dama2 + 3 || dama5 == dama2 - 3 ||
                    dama5 == dama3 || dama5 == dama3 + 2 || dama5 == dama3 - 2 ||
                    dama5 == dama4 || dama5 == dama4 + 1 || dama5 == dama4 - 1) {
                System.out.println("Tur nevar būt dāma! Spēles beigas!");
                System.exit(0);
            } else if (dama5 == vairakasRindas[rin]) {
                System.out.print("[Q]");
            } else if (dama5 == 0 || dama5 > 8) {
                System.out.println("ir kļūda! Spēles beigas!");
                System.exit(0);
            } else {
                System.out.print("[x]");
            }
        }
        System.out.println();

        System.out.println("Norādiet, kur būs DĀMA 6. rindā: [1][2][3][4][5][6][7][8]?");
        int dama6 = scan.nextInt();
        System.out.print("6. rinda: ");
        for (int rin = 0; rin < 8; rin++) {
            vairakasRindas[rin] = rin + 1;
            if (dama6 == dama || dama6 == dama + 5 || dama6 == dama - 5 ||
                    dama6 == dama2 || dama6 == dama2 + 4 || dama6 == dama2 - 4 ||
                    dama6 == dama3 || dama6 == dama3 + 3 || dama6 == dama3 - 3 ||
                    dama6 == dama4 || dama6 == dama4 + 2 || dama6 == dama4 - 2 ||
                    dama6 == dama5 || dama6 == dama5 + 1 || dama6 == dama5 - 1) {
                System.out.println("Tur nevar būt dāma! Spēles beigas!");
                System.exit(0);
            } else if (dama6 == vairakasRindas[rin]) {
                System.out.print("[Q]");
            } else if (dama6 == 0 || dama6 > 8) {
                System.out.println("ir kļūda! Spēles beigas!");
                System.exit(0);
            } else {
                System.out.print("[x]");
            }
        }
        System.out.println();

        System.out.println("Norādiet, kur būs DĀMA 7. rindā: [1][2][3][4][5][6][7][8]?");
        int dama7 = scan.nextInt();
        System.out.print("7. rinda: ");
        for (int rin = 0; rin < 8; rin++) {
            vairakasRindas[rin] = rin + 1;
            if (dama7 == dama || dama7 == dama + 6 || dama7 == dama - 6 ||
                    dama7 == dama2 || dama7 == dama2 + 5 || dama7 == dama2 - 5 ||
                    dama7 == dama3 || dama7 == dama3 + 4 || dama7 == dama3 - 4 ||
                    dama7 == dama4 || dama7 == dama4 + 3 || dama7 == dama4 - 3 ||
                    dama7 == dama5 || dama7 == dama5 + 2 || dama7 == dama5 - 2 ||
                    dama7 == dama6 || dama7 == dama6 + 1 || dama7 == dama6 - 1) {
                System.out.println("Tur nevar būt dāma! Spēles beigas!");
                System.exit(0);
            } else if (dama7 == vairakasRindas[rin]) {
                System.out.print("[Q]");
            } else if (dama7 == 0 || dama7 > 8) {
                System.out.println("ir kļūda! Spēles beigas!");
                System.exit(0);
            } else {
                System.out.print("[x]");
            }
        }
        System.out.println();

        System.out.println("Norādiet, kur būs DĀMA 8. rindā: [1][2][3][4][5][6][7][8]?");
        int dama8 = scan.nextInt();
        System.out.print("8. rinda: ");
        for (int rin = 0; rin < 8; rin++) {
            vairakasRindas[rin] = rin + 1;
            if (dama8 == dama || dama8 == dama + 7 || dama8 == dama - 7 ||
                    dama8 == dama2 || dama8 == dama2 + 6 || dama8 == dama2 - 6 ||
                    dama8 == dama3 || dama8 == dama3 + 5 || dama8 == dama3 - 5 ||
                    dama8 == dama4 || dama8 == dama4 + 4 || dama8 == dama4 - 4 ||
                    dama8 == dama5 || dama8 == dama5 + 3 || dama8 == dama5 - 3 ||
                    dama8 == dama6 || dama8 == dama6 + 2 || dama8 == dama6 - 2 ||
                    dama8 == dama7 || dama8 == dama7 + 1 || dama8 == dama7 - 1) {
                System.out.println("Tur nevar būt dāma! Spēles beigas!");
                System.exit(0);
            } else if (dama8 == vairakasRindas[rin]) {
                System.out.print("[Q]");
            } else if (dama8 == 0 || dama8 > 8) {
                System.out.println("ir kļūda! Spēles beigas!");
                System.exit(0);
            } else {
                System.out.print("[x]");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("UZVARA! Jūs pareizi atzīmējāt DĀMAS katrā rindā!");

        rezultats(dama, vairakasRindas, dama2, dama3, dama4);
        System.out.println();
        rezultats(dama5, vairakasRindas, dama6, dama7, dama8);
    }

    private static void rezultats(int dama, int[] vairakasRindas, int dama2, int dama3, int dama4) {
        for (int rin = 0; rin < 8; rin++) {
            if (dama == vairakasRindas[rin]) {
                System.out.print("[Q]");
            } else {
                System.out.print("[x]");
            }
        }
        System.out.println();
        for (int rin = 0; rin < 8; rin++) {
            if (dama2 == vairakasRindas[rin]) {
                System.out.print("[Q]");
            } else {
                System.out.print("[x]");
            }
        }
        System.out.println();
        for (int rin = 0; rin < 8; rin++) {
            if (dama3 == vairakasRindas[rin]) {
                System.out.print("[Q]");
            } else {
                System.out.print("[x]");
            }
        }
        System.out.println();
        for (int rin = 0; rin < 8; rin++) {
            if (dama4 == vairakasRindas[rin]) {
                System.out.print("[Q]");
            } else {
                System.out.print("[x]");
            }
        }
    }
}
