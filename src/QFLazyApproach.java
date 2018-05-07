public class QFLazyApproach {
    private int[] id;

    public QFLazyApproach(int N){
        id = new int[N];
        for (int i=0;i<N;i++){
            id[i] = i;
        }
    }

    public int root(int i){
        while(i!=id[i]){
            i=id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return root(p)==root(q);
    }

    public void union(int p, int q){
        int rootP = root(p);
        int rootQ = root(q);
        id[p] = rootQ;


    }


    public void printSelf(){
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i]);
        }
        System.out.println();
    }

}
