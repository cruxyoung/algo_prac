public class QFWeighted {

    private int[] id;
    private int[] siz;

    public QFWeighted(int N) {
        id = new int[N];
        siz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            siz[i] = 1;
        }
    }

    public int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
//            id[p] = rootQ;
        if (siz[p] < siz[q]) {
            id[p] = rootQ;
            siz[q] += siz[p];

        } else {
            id[q] = rootP;
            siz[p] += siz[q];
        }

    }


    public void printSelf() {
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i]);
        }
        System.out.println();
    }

}




