package week2;

import entities.VersionControl;

public class W2E1 extends VersionControl {

    static void main() {
        W2E1 solver = new W2E1();
        IO.println(solver.firstBadVersion(2126753390));
    }

    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        int aux;

        while (true) {
            aux = l + (r - l) / 2;

            if (!isBadVersion(aux)) {
                l = aux + 1;
                continue;
            }

            if (aux == 1 || !isBadVersion(aux - 1)) {
                return aux;
            }

            r = aux - 1;
        }
    }
}
