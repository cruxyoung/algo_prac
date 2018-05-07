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
//            path compression: make node point to its grandparent
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
//        get the root of input node
        int rootP = root(p);
        int rootQ = root(q);

//        connect small tree to a bigger tree
        if (siz[p] < siz[q]) {
//            assign the root of bigger tree to small tree
            id[p] = rootQ;
            siz[q] += siz[p];

        } else {
//            conversely
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




